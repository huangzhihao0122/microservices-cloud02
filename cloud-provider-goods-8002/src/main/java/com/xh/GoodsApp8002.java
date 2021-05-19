package com.xh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 启动类
 */
@SpringBootApplication
@EnableDiscoveryClient //开启注册中心注解，让注册中心发现并扫描该服务
public class GoodsApp8002 {
    public static void main(String[] args) {
        SpringApplication.run(GoodsApp8002.class,args);
    }
}
