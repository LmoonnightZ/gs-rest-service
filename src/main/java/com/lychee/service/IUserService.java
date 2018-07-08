package com.lychee.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.lychee.entity.User;
import com.lychee.entity.UserDTO;

import java.util.List;

/**
 * Author:ChenLizhen
 * CreateDate:2018/6/24
 * Description:
 */

public interface IUserService {

    /**
     * 获取所有用户
     * @return
     */
    List<User> getUserList();

    Page<User> getUser(Page<User> page, UserDTO userDTO);

}
