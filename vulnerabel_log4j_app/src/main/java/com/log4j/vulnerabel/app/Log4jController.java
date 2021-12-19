package com.log4j.vulnerabel.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Log4jController {

    public static final Logger logger = LogManager.getLogger(Log4jController.class);


    @GetMapping(value = "/hello")
    public String hello(@RequestHeader("Accept-version") String version) {
        logger.info("Received version " + version);

        return "Hello";
    }
}
