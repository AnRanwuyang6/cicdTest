package com.bingo.lizk.zkci.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文件名
 * Created at 2020/10/30
 * Created by lizongke
 * Copyright (C) 2020 SAIC VOLKSWAGEN, All rights reserved.
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/jekins")
    public String jekins(){
        return "Hello word Jekins";
    }
}
