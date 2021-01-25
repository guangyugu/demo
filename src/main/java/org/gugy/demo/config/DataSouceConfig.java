package org.gugy.demo.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author 辜光宇
 * 2021/1/25 15:21
 */
@Data
public class DataSouceConfig {

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;
}
