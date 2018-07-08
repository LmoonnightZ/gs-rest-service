package com.lychee.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.lychee.entity.User;
import com.lychee.entity.UserDTO;
import com.lychee.service.IUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Author:ChenLizhen
 * CreateDate:2018/6/23
 * Description:
 */
@RestController
@RequestMapping(value="/lychee/user")
public class UserController {

    @Resource
    private IUserService userService;

    @ApiOperation(value="获取用户列表", notes="")
    @RequestMapping(value="/",method= RequestMethod.GET)
    public List<User> getUserList() {
        List list =  userService.getUserList();
        return list;
    }



    @ApiOperation(value="获取用户", notes="")
    @RequestMapping(value="/getUser",method= RequestMethod.GET)
    public Page<User> getUser(Page<User> page, UserDTO userDTO) {
        return  userService.getUser(page,userDTO);
    }
}
