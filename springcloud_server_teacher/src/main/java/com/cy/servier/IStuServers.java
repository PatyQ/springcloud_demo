package com.cy.servier;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "spring-client",fallback = StuServerImpl.class)
public interface IStuServers {

    @RequestMapping("cls/querycls")
    String selClasses(@RequestParam("cid") Integer cid);

}
