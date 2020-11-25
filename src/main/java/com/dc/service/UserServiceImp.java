package com.dc.service;

import com.dc.bean.UserBean;
import com.dc.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserServiceImp implements UserService {
    //    userDao
    @Autowired
    public UserDao userDao;

    public UserServiceImp() {

    }

    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public int add(UserBean userBean) {
        return userDao.add(userBean);
    }

    public int deleteById(int id) {
        return userDao.deleteById(id);
    }

    public int update(UserBean userBean) {
        return userDao.update(userBean);
    }

    public UserBean queryById(int id) {
        return userDao.queryById(id);
    }

    public List<UserBean> queryAll() {
        System.out.println(userDao);
        return userDao.queryAll();
    }
}
