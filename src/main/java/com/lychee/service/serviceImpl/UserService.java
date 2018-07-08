package com.lychee.service.serviceImpl;

import com.baomidou.framework.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.lychee.dao.UserDao;
import com.lychee.entity.User;
import com.lychee.entity.UserDTO;
import com.lychee.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author:ChenLizhen
 * CreateDate:2018/6/24
 * Description:
 */

@Service
public class UserService extends ServiceImpl<UserDao, User> implements IUserService  {

    @Autowired
    private UserDao userDao;


    public List<User> getUserList(){
        return userDao.queryUserList();
    }


    public Page<User> getUser(Page<User> page, UserDTO userDTO) {
        User user= new User();
        BeanUtils.copyProperties(page,user);
        EntityWrapper<User> entityWrapper = new  EntityWrapper(user);
        entityWrapper.orderBy(page.getOrderByField(), page.isAsc());
        page.setRecords(userDao.selectListSql(page, entityWrapper));
        return page;
    }



}
