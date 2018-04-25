package com.hand.mybatis.mapper;

import com.hand.mybatis.dto.User;

import java.util.List;

/**
 * Created by XIAOHAI on 2017/8/9.
 */

public interface UserMapper {

    public int insertUser(User user) throws Exception;

    public int updateUser (User user,int id) throws Exception;

    public int deleteUser(int id) throws Exception;

    public User selectUserById(int id) throws Exception;

    public List<User> selectAllUser() throws Exception;
}

