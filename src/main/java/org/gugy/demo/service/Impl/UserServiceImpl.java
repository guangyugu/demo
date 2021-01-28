package org.gugy.demo.service.Impl;

import com.github.pagehelper.PageHelper;
import org.gugy.demo.entity.User;
import org.gugy.demo.entity.query.UserQuery;
import org.gugy.demo.entity.vo.UserVO;
import org.gugy.demo.mapper.UserMapper;
import org.gugy.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 辜光宇
 * 2021/1/28 14:42
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<UserVO> getAllUser(UserQuery query) {
        PageHelper.startPage(query.getPage(), query.getPageSize());
        return userMapper.getAllUser(query.getUserName(), query.getPhoneNum());
    }

    @Override
    public void update(UserVO userVO) {
        User user = new User();
        userVO.putIntoEntity(user);
        userMapper.updateByPrimaryKeySelective(user);
    }
}
