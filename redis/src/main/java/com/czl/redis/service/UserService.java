package com.czl.redis.service;



import com.czl.redis.entity.User;

import java.util.List;

public interface UserService {

    public List<User> getUserList(String name, int page, int limit);

    public List<User> getAllUser();

    User getUserById(Integer id);

    public List<User> getUserByAccount(String account);

    public int add(User user);

    public int update(User user);

    public int delete(Integer id);

    int getUserCount();
}
