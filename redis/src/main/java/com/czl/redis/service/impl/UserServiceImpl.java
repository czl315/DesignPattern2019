package com.czl.redis.service.impl;

import com.czl.redis.entity.User;
import com.czl.redis.mapper.UserMapper;
import com.czl.redis.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getUserList(String name, int page, int limit) {
        return userMapper.getUserList(name, page, limit);
    }

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }


    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    public List<User> getUserByAccount(String account) {
        return userMapper.getUserByAccount(account);
    }

    @Override
    public int add(User user) {
        return userMapper.add(user);
    }

    @Override
    public int update(User user) {
        return userMapper.update(user);
    }

    @Override
    public int delete(Integer id) {
        return userMapper.delete(id);
    }

    @Override
    public int getUserCount() {
        return userMapper.getUserCount();

    }
}