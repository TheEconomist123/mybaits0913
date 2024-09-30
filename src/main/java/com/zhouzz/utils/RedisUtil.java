package com.zhouzz.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Component
public class RedisUtil {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    /**
     * 设置键值
     * @param key 键
     * @param value 值
     */
    public void set(String key, Object value) {
        ValueOperations<String, Object> operations = redisTemplate.opsForValue();
        operations.set(key, value);
    }

    /**
     * 设置带过期时间的键值
     * @param key 键
     * @param value 值
     * @param timeout 过期时间
     * @param timeUnit 时间单位
     */
    public void set(String key, Object value, long timeout, TimeUnit timeUnit) {
        ValueOperations<String, Object> operations = redisTemplate.opsForValue();
        operations.set(key, value, timeout, timeUnit);
    }

    /**
     * 获取值
     * @param key 键
     * @return 值
     */
    public Object get(String key) {
        ValueOperations<String, Object> operations = redisTemplate.opsForValue();
        return operations.get(key);
    }

    /**
     * 删除键
     * @param key 键
     * @return 是否删除成功
     */
    public boolean delete(String key) {
        return redisTemplate.delete(key);
    }

    /**
     * 判断键是否存在
     * @param key 键
     * @return 是否存在
     */
    public boolean hasKey(String key) {
        return redisTemplate.hasKey(key);
    }

    // 存储 List 到 Redis
    public void setList(String key, List<?> list) {
        redisTemplate.opsForValue().set(key, list);
    }

    // 获取 List 从 Redis
    public List<?> getList(String key) {
        return (List<?>) redisTemplate.opsForValue().get(key);
    }

    // 可选：设置带过期时间的 List
    public void setListWithExpire(String key, List<?> list, long timeout, TimeUnit timeUnit) {
        redisTemplate.opsForValue().set(key, list, timeout, timeUnit);
    }
}
