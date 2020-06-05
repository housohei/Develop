package com.bao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class ControlUserInfo {
    @GetMapping(value = "/api/user/getUserName")
    public String getUserName(HttpServletRequest request) throws ParseException {
        String userName = "Joy20200605-001! The time is:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        return userName;
    }
}
