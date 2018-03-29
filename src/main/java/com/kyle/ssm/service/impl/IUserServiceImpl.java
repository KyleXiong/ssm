package com.kyle.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kyle.ssm.dao.UserMapper;
import com.kyle.ssm.domain.User;
import com.kyle.ssm.service.IUserService;

@Service("userService")
public class IUserServiceImpl implements IUserService {
    
    @Resource
    private UserMapper mapper;
    
    @Override
    public User getUserById(int id) {
        return mapper.selectByPrimaryKey(id);
    }

}
