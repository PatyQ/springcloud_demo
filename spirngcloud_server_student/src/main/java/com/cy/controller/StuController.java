package com.cy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

//一个消费者--接收用户请求
@RestController
@RequestMapping("stu")
public class StuController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("selStu")
    public String stuSelect(Integer sid){

        String name;
        Integer cid;

        switch (sid){
            case 1:
                name = "小美";
                cid = 1;
                break;
            case 2:
                name = "李华";
                cid = 2;
                break;
            default:
                name = "空空如也";
                cid = 3;
                break;
        }
        String resutl = restTemplate.getForObject("http://SPRING-CLIENT/cls/querycls?cid=" + cid,String.class);

        return "姓名:"+name+",班级"+resutl;
    }

}
