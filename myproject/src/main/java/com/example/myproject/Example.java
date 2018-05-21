package com.example.myproject;


/**
 * @author zhangkehua 2017年12月20日 下午1:41:36
 * @since
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello World! Sanen_Zhang";
    }
    
    
    public static void main(String[] args) throws  Exception {
        System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(Example.class, args);
    }
}
