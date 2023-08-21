package com.room.studyroom.service;



import com.room.studyroom.controller.LoginModel;
import com.room.studyroom.model.UserInfo;

import java.util.Map;


public interface UserInfoService {
    /**
      分页查询用户数据列表
    */
    public Map<String, Object> getDataList(UserInfo queryModel, Integer page,
                                           Integer pageSize, LoginModel login);

    /**
      封装用户为前台展示的数据形式
    */
    public Map<String, Object> getUserInfoModel(UserInfo model, LoginModel login);

    /**
    * 删除数据
    */
    public void delete(Integer id);

    /**
      新增
    */
    public String add(UserInfo model, LoginModel login);

    /**
      修改
    */
    public String update(UserInfo model, LoginModel login);

    /**
      修改
    */
    public String update2(UserInfo model, LoginModel login);
}

