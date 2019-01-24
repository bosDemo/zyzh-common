package com.zyzh.zz.utils.StringUtils;

import java.util.Random;

/**
 * @author LPH
 * @Title: StringUtils
 * @ProjectName tripartite_system
 * @Description: TODO
 * @date 2018/11/6 000611:06
 */

public class StringUtils {

    /**
     *
     * 功能：<br/>
     * 生成随机字符串
     *
     * @author LPH
     */
    public static String generateRandomCode(int verifySize, String sources) {
        if (isBlank(sources)) {
            sources = "23456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        }
        Random random = new Random();
        int codesLen = sources.length();
        StringBuilder randomCode = new StringBuilder(verifySize);
        for (int i = 0; i < verifySize; i++) {
            randomCode.append(sources.charAt(random.nextInt(codesLen - 1)));
        }
        return randomCode.toString();
    }

    /**
     *  字符串是否为空
     * @param str
     * @return
     */
    public static boolean isBlank(String str) {
        return str == null || str.trim().length() == 0;
    }

}
