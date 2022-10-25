package com.yuqn.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
/**
 * @author: yuqn
 * @Description:
 * 打印日志
 * @date: 2022/10/25 20:05
 */
public class TestController {
    @RequestMapping("/log")
    public String test() {
        for (int i = 1; i < 100; i++){
        log.info("info日志");
        log.warn("warn日志");
        log.error("error日志");}
        return "测试日志";
    }
}
