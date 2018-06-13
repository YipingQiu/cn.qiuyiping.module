package cn.qiuyiping.module.user.impl;

import cn.qiuyiping.module.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    public static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public void addUser() {
        logger.info("user add success!");
    }
}
