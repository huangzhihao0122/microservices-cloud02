package com.xh.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfig {
    @Bean
    /*
     * @LoadBalanced 开启Ribbon客户端负载均衡，以使用LoadBalancerClient来配置它,
     * 简而言之，就是RestTemplate发起一个请求，这个请求被LoadBalancerInterceptor给拦截了，
     * 拦截后将请求的地址中的服务逻辑名转为具体的服务地址，然后继续执行请求
     */
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        RestTemplate restTemplate=new RestTemplate();
        return  restTemplate;
    }
}
