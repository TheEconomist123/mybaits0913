package com.zhouzz.service;

import org.springframework.stereotype.Service;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-11-05 16:41
 * @desc
 */
@Service
public interface AsyncService {

    void  processInBackground() ;
}
