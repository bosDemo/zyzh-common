package com.zyzh.zz.utils.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author LPH
 *
 * 日期工具类
 *
 */
public class DateUtils {


    /**
     * 获取当前日期
     * @return
     */
    public static String getCurrentTimeStr(){
        SimpleDateFormat df=new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        return df.format(new Date());
    }
}
