package com.example.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
    private static Logger logger = LoggerFactory.getLogger(LogApplication.class);  //1
    HelloDTO helloDAO = new HelloDTO();
    @GetMapping("/")
    public HelloDTO Hello(){
        logger.info("유저가 접속했습니다");
        return helloDAO;
    }
}
