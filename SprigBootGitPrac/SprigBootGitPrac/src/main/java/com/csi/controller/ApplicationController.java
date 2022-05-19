package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @GetMapping
    public String hello(){
        return"Welcome to CSI";
    }
    @GetMapping("/address")
    public String address(){
        return"PUNE";
    }

}
