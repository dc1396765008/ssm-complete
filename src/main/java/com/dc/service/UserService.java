package com.dc.service;

import com.dc.bean.UserBean;

import java.util.List;

public interface UserService {
    public int add(UserBean userBean);

    public int deleteById(int id);

    public int update(UserBean userBean);

    public UserBean queryById(int id);

    public List<UserBean> queryAll();
}
