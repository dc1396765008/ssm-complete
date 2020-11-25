package com.dc.dao;

import com.dc.bean.UserBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserDao {
    //增加一个
    int add(UserBean userBean);

    //根据id删除一个
    int deleteById(int id);

    //更新
    int update(UserBean userBean);

    //根据id查询,返回一个B
    UserBean queryById(int id);

    //查询全部,返回list集合
    List<UserBean> queryAll();
}
