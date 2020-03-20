package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.example")
public class WebConfig {

//    private String PREFIX = "/WEB-INF/pages/";
//    private String SUFFIX = ".jsp";
//
//
//    @Bean
//    public ViewResolver viewResolver(){
//        UrlBasedViewResolver resolver = new InternalResourceViewResolver();
//
//        resolver.setPrefix(PREFIX);
//        resolver.setSuffix(SUFFIX);
//
//        return resolver;
//
//    }

}
