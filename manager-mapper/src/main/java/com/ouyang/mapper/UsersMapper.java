package com.ouyang.mapper;

import com.ouyang.pojo.Users;

import java.util.List;

public interface UsersMapper {
    int insertUsers(Users users);

    List<Users> selectAllUsers();
}
