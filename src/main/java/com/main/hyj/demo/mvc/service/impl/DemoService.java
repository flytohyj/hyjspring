package com.main.hyj.demo.mvc.service.impl;

import com.main.hyj.demo.mvc.service.IDemoService;
import com.main.hyj.springmvc.annotation.HyjService;

@HyjService
public class DemoService implements IDemoService {
    public String get(String name) {
        return "My name is "+ name;
    }
}
