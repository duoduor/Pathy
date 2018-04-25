package com.hand.mybatis.service;

import com.hand.mybatis.dto.User;
import com.hand.mybatis.mapper.UserMapper;
import com.hand.mybatis.tools.DBTools;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by XIAOHAI on 2017/8/9.
 */
public class UserService {
    public void insertUser() throws Exception {
        SqlSession session = DBTools.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = new User("咖啡", "1314520", 7000.0);
        try {
            mapper.insertUser(user);
            System.out.println(user.toString());
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }
    }

    public void deleteUser() throws Exception {
        SqlSession session=DBTools.getSession();
        UserMapper mapper=session.getMapper(UserMapper.class);
        try {
            mapper.deleteUser(1);
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }
    }

    public void selectUserById() throws Exception {
        SqlSession session=DBTools.getSession();
        UserMapper mapper=session.getMapper(UserMapper.class);
        try {
            User user= mapper.selectUserById(2);
            System.out.print("=============================="+user.getName());
            System.out.println(user.toString());
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }
    }

    public void selectAllUser() throws Exception {
        SqlSession session=DBTools.getSession();
        UserMapper mapper=session.getMapper(UserMapper.class);
        try {
            List<User> user = mapper.selectAllUser();
            System.out.println(user);
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }
    }
}
