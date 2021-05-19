package com.xh.service;

import com.xh.pojo.Goods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "cloud-provider-goods",path = "/goods")
public interface GoodsClientService {
    @RequestMapping("/getGoods")
    public Goods getGoods(@RequestParam(value = "id",required = true) String id);
}
