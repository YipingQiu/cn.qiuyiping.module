package cn.qiuyiping.module.area.impl;

import cn.qiuyiping.module.area.AreaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AreaServiceImpl implements AreaService {

    public static Logger logger = LoggerFactory.getLogger(AreaServiceImpl.class);

    public void addArea() {
        logger.info("area add success!");
    }
}
