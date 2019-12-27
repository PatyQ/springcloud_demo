package com.cy.springcloud_server_teacher;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DashboardServletConfig {
    @Bean
    public ServletRegistrationBean getDashboardServlet(){

        HystrixMetricsStreamServlet servlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean bean = new ServletRegistrationBean(servlet);
        bean.setLoadOnStartup(1);
        bean.setServlet(servlet);
        bean.addUrlMappings("/hystrix.stream");
        bean.setName("hystrix");
        return bean;
    }

}
