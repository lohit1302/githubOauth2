package com.github.demo.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class DataController {

    @GetMapping("/success")
    public String successLogin() {
        return "Hello World";
    }

    @GetMapping("/logout")
    public String invalidateUser(HttpServletRequest request) {
        request.getSession().invalidate();
        SecurityContextHolder.getContext().setAuthentication(null);
        return "LogOut Successfully";
    }
}
