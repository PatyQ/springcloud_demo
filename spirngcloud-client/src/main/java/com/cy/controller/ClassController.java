package com.cy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("cls")//@restController就是所有加@responseBody
@RestController//对外提供页面,本身没有服务就用restController
public class ClassController {

    @Value("${server.port}")
    private Integer port;

    @RequestMapping("querycls")
    public String queryCls(Integer cid){
//        System.out.println();
        //提供者,模仿查询数据库的操作
        switch (cid){
            case 1 :
                return "一年一班"+port;
            case 2 :
                return "二年二班"+port;
            default:
                return "空空如也"+port;
        }
    }

}
