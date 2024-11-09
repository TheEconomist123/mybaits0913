package com.zhouzz.service.impl;

import com.zhouzz.service.AsyncService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-11-05 16:42
 * @desc
 */
@Service
public class AsyncServiceImpl  implements AsyncService {


    @Override
    @Async
    public void processInBackground() {

        try {
            System.out.println("Async task start!" + LocalDateTime.now());
            // 模拟耗时操作
            Thread.sleep(5000);
            System.out.println("Async task completed!" + LocalDateTime.now());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
