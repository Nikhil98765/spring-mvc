package com.example.config;

import com.example.dao.EmployeeDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

import javax.sql.DataSource;
import java.sql.SQLException;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.example")
public class WebConfig {

    private String PREFIX = "/WEB-INF/pages/";
    private String SUFFIX = ".jsp";


    @Bean
    InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();

        resolver.setPrefix(PREFIX);
        resolver.setSuffix(SUFFIX);

        return resolver;

    }

    @Bean
    DriverManagerDataSource getDataSource() throws SQLException {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/demo?autoReconnect=true&useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("Nikhil1234$");

        return dataSource;
    }

    @Bean
    public EmployeeDao getEmployeeDAO() throws SQLException {
        return new EmployeeDao(getDataSource());
    }



}
