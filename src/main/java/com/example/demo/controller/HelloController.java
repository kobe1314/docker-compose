package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Kobe
 * @date: 2021/4/17 上午9:57
 * @version: v1.0
 */
@RestController
public class HelloController {

    @Autowired
    RedisTemplate redisTemplate;

    @GetMapping("/hello")
    public String hello() {
        Long views = redisTemplate.opsForValue().increment("views");
        return "hello,kobe gor. views:" + views;
    }
}
