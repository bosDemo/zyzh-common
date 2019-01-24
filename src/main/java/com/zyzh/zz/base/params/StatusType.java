package com.zyzh.zz.base.params;

/**
 * @author LPH
 * @Title: StatusType
 * @ProjectName maidong_platform
 * @Description: TODO
 * @date 2018/11/9 000911:11
 */

public enum  StatusType {
    SUCCESS(1, "成功"),
    ERROR(-1, "失败");
    /**
     * code
     */
    private int code;

    /** name */
    private String name;

    StatusType(int code, String name){
        this.code = code;
        this.name = name;
    }

    public static String getNameByCode (int code){
        for (StatusType enuma : StatusType.values()){
            if (enuma.getCode() == code){
                return enuma.getName();
            }
        }
        return "未知枚举项";
    }


    public int getCode() {
        return code;
    }


    public void setCode(int code) {
        this.code = code;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public static void main(String args[]) {
        System.out.println(StatusType.SUCCESS);
        System.out.println(StatusType.SUCCESS.getCode());
        System.out.println(StatusType.SUCCESS.getName());

    }

}
