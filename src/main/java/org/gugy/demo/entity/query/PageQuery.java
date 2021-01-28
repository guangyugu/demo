package org.gugy.demo.entity.query;

import lombok.Data;

/**
 * @author 辜光宇
 * 2021/1/28 14:49
 */
@Data
public class PageQuery {

    /**
     * 页数
     */
    private Integer page;

    /**
     * 分页大小
     */
    private Integer pageSize;


}
