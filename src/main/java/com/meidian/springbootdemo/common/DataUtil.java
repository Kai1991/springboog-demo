package com.meidian.springbootdemo.common;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {

    public static String getCurrentTime(){
        Long timest = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(timest);
        String res = simpleDateFormat.format(date);
        return res;
    }
}
