package com.ouyang.service.impl;

import com.ouyang.mapper.UsersMapper;
import com.ouyang.pojo.Users;
import com.ouyang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper usersMapper;

    @Transactional
    public void addUser(Users users) {
        usersMapper.insertUsers(users);
    }
}
