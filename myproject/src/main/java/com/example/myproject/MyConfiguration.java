package com.example.myproject;
/**
 * @author zhangkehua 2017年12月21日 上午9:19:01
 * @since 1.8
 */
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.autoconfigure.jdbc.*;
import org.springframework.context.annotation.*;

@Configuration
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class })
public class MyConfiguration {
}
