package com.sqli.techtuesday.boot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/filters")
public class FilterExampleController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/header")
    public void header() {
        logger.debug("/api/filters/header has been called");
    }

    @RequestMapping("/secured")
    public Authentication secured() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        logger.debug("/api/filters/secured has been called by: {}", authentication);
        return authentication;
    }
}