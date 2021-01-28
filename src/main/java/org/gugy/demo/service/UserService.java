package org.gugy.demo.service;

import org.gugy.demo.entity.query.UserQuery;
import org.gugy.demo.entity.vo.UserVO;

import java.util.List;

/**
 * @author 辜光宇
 * 2021/1/28 14:35
 */
public interface UserService {

    /**
     * 获取所有用户列表
     * @param query 查询参数
     * @return 用户列表
     */
    List<UserVO> getAllUser(UserQuery query);

    /**
     * 修改用户信息
     * @param userVO 接收
     */
    void update(UserVO userVO);
}
