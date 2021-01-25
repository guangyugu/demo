package org.gugy.demo.controller;

import org.gugy.demo.config.DataSouceConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 辜光宇
 * 2021/1/25 15:24
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private DataSouceConfig dataSouceConfig;

    @GetMapping("/getData")
    public DataSouceConfig getDataSource() {
        DataSouceConfig dataSouceConfig1 = new DataSouceConfig();
        dataSouceConfig1.setUrl(dataSouceConfig.getUrl());
        dataSouceConfig1.setUsername(dataSouceConfig.getUsername());
        dataSouceConfig1.setPassword(dataSouceConfig.getPassword());
        return dataSouceConfig1;
    }
}
