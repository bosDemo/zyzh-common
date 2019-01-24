package com.zyzh.zz.base.params;

/**
 * @author LPH
 * @Title: ReturnCodeType
 * @ProjectName maidong_platform
 * @Description: TODO
 * @date 2018/11/9 000911:12
 */

public enum  ReturnCodeType {

    /**
     * 需要规定每个系统允许使用的状态码范围。  避免后期乱套
     */
    BASE_SUCCESS("ZYZH-10001", "成功"),
    BASE_ERROR("ZYZH-10002", "失败"),
    CUSTOMER_QUERY_SUCCESS("ZYZH-10003", "查询客户成功"),
    CUSTOMER_QUERY_ERROR("ZYZH-10004", "查询失败了啊啊啊啊 啊");


    private String code;

    /** 显示产品名称 */
    private String name;

    ReturnCodeType(String code, String name){
        this.code = code;
        this.name = name;
    }


    public static String getNameByCode (String code){
        for (ReturnCodeType enuma : ReturnCodeType.values()){
            if (enuma.getCode().equals(code)){
                return enuma.getName();
            }
        }
        return "未知枚举项";
    }


    public String getCode() {
        return code;
    }


    public void setCode(String code) {
        this.code = code;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
}
