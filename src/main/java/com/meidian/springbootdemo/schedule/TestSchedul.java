package com.meidian.springbootdemo.schedule;

import com.meidian.springbootdemo.common.DataUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestSchedul {

    private static final Logger logger = LoggerFactory.getLogger(TestSchedul.class);

    @Scheduled(cron = "0 0/1 * * * ? ")
    public void testSchedul(){
        logger.info(DataUtil.getCurrentTime());
    }
}
