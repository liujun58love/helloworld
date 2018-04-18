package com.liujun.dao;

import com.liujun.po.User;

/**
 * Created by Administrator on 2018-04-18.
 */
public interface UserDao {

    public void insertUser(User user);

    public void updateUser(User user);

    public void deleteUser(Integer id);

    public void selectUserById(Integer id);
}
