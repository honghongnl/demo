package com.lh.demo.config;

import com.lh.demo.common.CrossOriginFilter;
import com.lh.demo.common.CrossOriginFilter2;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonConfiguration {


    /**
     * 配置过滤器1
     * @return
     */
    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        //配置过滤器
        registrationBean.setFilter(new CrossOriginFilter());
        //拦截的url
        registrationBean.addUrlPatterns("/*");
        //配置初始值
        registrationBean.addInitParameter("paramName", "paramValue");
        //(暂时不知道有啥用)
        registrationBean.setName("sessionFilter");
        //order的数值越小 则优先级越高
        registrationBean.setOrder(Integer.MAX_VALUE);
        return registrationBean;
    }
    /**
     * 配置过滤器2
     * @return
     */
    @Bean
    public FilterRegistrationBean filterRegistrationBean2(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        //配置过滤器
        registrationBean.setFilter(new CrossOriginFilter2());
        //拦截的url
        registrationBean.addUrlPatterns("/*");
        //配置初始值
        registrationBean.addInitParameter("aaaa", "ccc");
        //(暂时不知道有啥用)
        registrationBean.setName("asafsd");
        //order的数值越小 则优先级越高
        registrationBean.setOrder(10);
        return registrationBean;
    }
}
