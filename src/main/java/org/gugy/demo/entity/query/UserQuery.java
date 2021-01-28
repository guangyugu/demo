package org.gugy.demo.entity.query;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author 辜光宇
 * 2021/1/28 14:50
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserQuery extends PageQuery{

    /**
     * 用户名
     */
    private String userName;

    /**
     * 电话号码
     */
    private String phoneNum;

}
