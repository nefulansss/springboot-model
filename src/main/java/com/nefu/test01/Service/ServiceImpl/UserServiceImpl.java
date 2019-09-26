package com.nefu.test01.Service.ServiceImpl;

import com.nefu.test01.Service.UserService;
import com.nefu.test01.mapper.UserMapper;
import com.nefu.test01.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;



    @Override
    public boolean insertUser(User user) {
        return userMapper.insertUser(user);
    }
}
