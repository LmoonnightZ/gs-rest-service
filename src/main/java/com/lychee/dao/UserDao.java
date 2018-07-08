package com.lychee.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.lychee.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author:ChenLizhen
 * CreateDate:2018/6/24
 * Description:
 */
@Mapper
public interface UserDao extends BaseMapper<User>{

    /**
     * 查询用户列表
     * @return
     */
    List<User> queryUserList();

    List<User> selectListSql(Page<User> page, EntityWrapper<User> entityWrapper);


}
