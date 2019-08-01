package com.main.hyj.demo.mvc.action;

import com.main.hyj.demo.mvc.service.IDemoService;
import com.main.hyj.springmvc.annotation.HyjAutowired;
import com.main.hyj.springmvc.annotation.HyjController;
import com.main.hyj.springmvc.annotation.HyjRequestMapping;
import com.main.hyj.springmvc.annotation.HyjRequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@HyjController
@HyjRequestMapping("/demo")
public class DemoAction {

    @HyjAutowired
    private IDemoService iDemoService;


    @HyjRequestMapping("/query")
    public void query(HttpServletRequest req, HttpServletResponse resp,
                      @HyjRequestParam("name") String name){
        String result = iDemoService.get(name);
        try {
            resp.getWriter().write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @HyjRequestMapping("/add")
    public void add(HttpServletRequest req, HttpServletResponse resp,
                    @HyjRequestParam("a") Integer a, @HyjRequestParam("b") Integer b){
        try {
            resp.getWriter().write(a + "+" + b + "=" + (a + b));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @HyjRequestMapping("/remove")
    public void remove(HttpServletRequest req,HttpServletResponse resp,
                       @HyjRequestParam("id") Integer id){
    }

}
