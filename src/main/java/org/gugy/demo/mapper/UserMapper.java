package org.gugy.demo.mapper;

import org.apache.ibatis.annotations.Param;
import org.gugy.demo.entity.User;
import org.gugy.demo.entity.vo.UserVO;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<User> {

    /**
     * 查询列表
     * @param userName 用户名称
     * @param phoneNum 电话号码
     * @return 列表
     */
    List<UserVO> getAllUser(@Param("userName") String userName,
                            @Param("phoneNum") String phoneNum);
}