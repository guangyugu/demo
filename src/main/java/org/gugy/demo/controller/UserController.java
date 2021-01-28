package org.gugy.demo.controller;

import org.gugy.demo.entity.query.UserQuery;
import org.gugy.demo.entity.vo.UserVO;
import org.gugy.demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 辜光宇
 * 2021/1/28 14:34
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/getList")
    public List<UserVO> getAllUser(UserQuery query) {
        return userService.getAllUser(query);
    }

    @PostMapping("/update")
    public void update(UserVO userVO){
        userService.update(userVO);
    }
}
