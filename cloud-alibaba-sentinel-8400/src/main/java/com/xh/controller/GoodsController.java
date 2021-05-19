package com.xh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsController {
    @RequestMapping("/getGoodsAll")
    public String getGoodsAll(){
        return "返回所有商品信息...";
    }
}
