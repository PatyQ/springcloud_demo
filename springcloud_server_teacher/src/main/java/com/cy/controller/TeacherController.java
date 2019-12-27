package com.cy.controller;

import com.cy.servier.IStuServers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tea")
public class TeacherController {

    @Autowired
    private IStuServers stuServers;

    @RequestMapping("selCname")
    public String queryClassName(){

        String s = stuServers.selClasses(3);

        return s;
    }

}
