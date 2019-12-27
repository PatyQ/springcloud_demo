package com.cy.servier;

import org.springframework.stereotype.Component;

@Component
public class StuServerImpl implements IStuServers{

    @Override
    public String selClasses(Integer cid) {
        return "访问降级方法";
    }
}
