package com.zhouzz.util;

public class SnowflakeIdGenerator {

    // 起始时间戳（一般设置为某个时间，例如 2020 年 1 月 1 日）
    private static final long START_TIMESTAMP = 1577836800000L;

    // 各个部分的位数
    private static final long MACHINE_ID_BITS = 5L;  // 机器 ID 5 位
    private static final long DATA_CENTER_ID_BITS = 5L;  // 数据中心 ID 5 位
    private static final long SEQUENCE_BITS = 12L;  // 序列号 12 位

    // 最大值
    private static final long MAX_MACHINE_ID = ~(-1L << MACHINE_ID_BITS);  // 最大机器 ID (31)
    private static final long MAX_DATA_CENTER_ID = ~(-1L << DATA_CENTER_ID_BITS);  // 最大数据中心 ID (31)
    private static final long MAX_SEQUENCE = ~(-1L << SEQUENCE_BITS);  // 最大序列号 (4095)

    // 偏移量
    private static final long MACHINE_ID_SHIFT = SEQUENCE_BITS;
    private static final long DATA_CENTER_ID_SHIFT = SEQUENCE_BITS + MACHINE_ID_BITS;
    private static final long TIMESTAMP_SHIFT = SEQUENCE_BITS + MACHINE_ID_BITS + DATA_CENTER_ID_BITS;
    private static final long SEQUENCE_MASK = ~(-1L << SEQUENCE_BITS);

    private long lastTimestamp = -1L;
    private long sequence = 0L;
    private long machineId;
    private long dataCenterId;

    // 构造方法
    public SnowflakeIdGenerator(long machineId, long dataCenterId) {
        if (machineId > MAX_MACHINE_ID || machineId < 0) {
            throw new IllegalArgumentException("Machine ID can't be greater than " + MAX_MACHINE_ID + " or less than 0");
        }
        if (dataCenterId > MAX_DATA_CENTER_ID || dataCenterId < 0) {
            throw new IllegalArgumentException("DataCenter ID can't be greater than " + MAX_DATA_CENTER_ID + " or less than 0");
        }
        this.machineId = machineId;
        this.dataCenterId = dataCenterId;
    }

    // 获取下一个唯一 ID
    public synchronized long nextId() {
        long timestamp = System.currentTimeMillis();

        // 如果当前时间戳小于上次生成的时间戳，说明系统时钟回退，抛出异常
        if (timestamp < lastTimestamp) {
            throw new RuntimeException("Clock moved backwards. Refusing to generate id for " + (lastTimestamp - timestamp) + " milliseconds");
        }

        // 如果是同一毫秒生成的 ID，序列号自增
        if (timestamp == lastTimestamp) {
            sequence = (sequence + 1) & SEQUENCE_MASK;
            if (sequence == 0) {
                timestamp = waitNextMillis(lastTimestamp);  // 等待下一毫秒
            }
        } else {
            sequence = 0;  // 不同的毫秒，重新初始化序列号
        }

        lastTimestamp = timestamp;

        // 拼接成雪花 ID
        return ((timestamp - START_TIMESTAMP) << TIMESTAMP_SHIFT) |
                (dataCenterId << DATA_CENTER_ID_SHIFT) |
                (machineId << MACHINE_ID_SHIFT) |
                sequence;
    }

    // 等待下一毫秒
    private long waitNextMillis(long lastTimestamp) {
        long timestamp = System.currentTimeMillis();
        while (timestamp <= lastTimestamp) {
            timestamp = System.currentTimeMillis();
        }
        return timestamp;
    }

    // 获取当前时间戳
    public long currentTimestamp() {
        return System.currentTimeMillis();
    }
}
