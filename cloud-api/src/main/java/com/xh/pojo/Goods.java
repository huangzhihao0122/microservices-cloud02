package com.xh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Goods {
    private String id;
    private String name;
    private Double price;
    private String serverInfo; //服务信息
    private String dbName; //数据库名称
}
