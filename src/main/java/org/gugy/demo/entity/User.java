package org.gugy.demo.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user")
public class User {
    /**
     * 主键id
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
     * 密码
     */
    private String password;

    /**
     * 联系电话
     */
    @Column(name = "phone_number")
    private Integer phoneNumber;

    /**
     * 身份证号
     */
    @Column(name = "id_card_number")
    private String idCardNumber;

    /**
     * 地址
     */
    private String address;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

    /**
     * 创建人
     */
    @Column(name = "create_user")
    private Long createUser;

    /**
     * 修改人
     */
    @Column(name = "modify_user")
    private Long modifyUser;

    /**
     * 删除标识，1是，0否
     */
    private Boolean removed;

    /**
     * 启用标识，1是，0否
     */
    private Boolean enabled;

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户姓名
     *
     * @return user_name - 用户姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户姓名
     *
     * @param userName 用户姓名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取用户账号
     *
     * @return user_account - 用户账号
     */
    public String getUserAccount() {
        return userAccount;
    }

    /**
     * 设置用户账号
     *
     * @param userAccount 用户账号
     */
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取联系电话
     *
     * @return phone_number - 联系电话
     */
    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置联系电话
     *
     * @param phoneNumber 联系电话
     */
    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * 获取身份证号
     *
     * @return id_card_number - 身份证号
     */
    public String getIdCardNumber() {
        return idCardNumber;
    }

    /**
     * 设置身份证号
     *
     * @param idCardNumber 身份证号
     */
    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间
     *
     * @return modify_time - 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置修改时间
     *
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 获取创建人
     *
     * @return create_user - 创建人
     */
    public Long getCreateUser() {
        return createUser;
    }

    /**
     * 设置创建人
     *
     * @param createUser 创建人
     */
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取修改人
     *
     * @return modify_user - 修改人
     */
    public Long getModifyUser() {
        return modifyUser;
    }

    /**
     * 设置修改人
     *
     * @param modifyUser 修改人
     */
    public void setModifyUser(Long modifyUser) {
        this.modifyUser = modifyUser;
    }

    /**
     * 获取删除标识，1是，0否
     *
     * @return removed - 删除标识，1是，0否
     */
    public Boolean getRemoved() {
        return removed;
    }

    /**
     * 设置删除标识，1是，0否
     *
     * @param removed 删除标识，1是，0否
     */
    public void setRemoved(Boolean removed) {
        this.removed = removed;
    }

    /**
     * 获取启用标识，1是，0否
     *
     * @return enabled - 启用标识，1是，0否
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * 设置启用标识，1是，0否
     *
     * @param enabled 启用标识，1是，0否
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}