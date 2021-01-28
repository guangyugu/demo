package org.gugy.demo.entity.vo;

import lombok.Data;
import org.gugy.demo.entity.User;

import javax.persistence.Column;

/**
 * @author 辜光宇
 * 2021/1/28 14:45
 */
@Data
public class UserVO {

    /**
     * 主键id
     */
    private Long id;

    /**
     * 用户姓名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 用户账号
     */
    @Column(name = "user_account")
    private String userAccount;


    /**
     * 联系电话
     */
    @Column(name = "phone_number")
    private Integer phoneNumber;


    /**
     * 地址
     */
    private String address;

    /**
     * 启用标识，1是，0否
     */
    private Boolean enabled;

    public void putIntoEntity(User user){
        user.setId(this.id);
        user.setUserName(this.userName);
        user.setUserAccount(this.userAccount);
        user.setAddress(this.address);
        user.setEnabled(this.enabled);
        user.setPhoneNumber(this.phoneNumber);
    }
}
