package com.xh.controller;

import com.xh.pojo.Goods;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Value("${spring.application.name}")
    String serverName;
    @Value("${server.port}")
    String port;

    @RequestMapping("/getGoods")
    public Goods getGoods(String id){
        Goods goods=new Goods("1001","小黄",9.9,serverName+":"+port,"goodsDB1");
        return goods;
    }
}
