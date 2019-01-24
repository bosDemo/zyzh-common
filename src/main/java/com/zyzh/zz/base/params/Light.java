package com.zyzh.zz.base.params;

/**
 * @author LPH
 * @Title: Light
 * @ProjectName maidong_platform
 * @Description: TODO
 * @date 2018/11/9 000911:17
 */

public class Light {

    private String price;
    private String num;
    private String isDelete;

    public Light(String price, String num, String isDelete) {
        this.price = price;
        this.num = num;
        this.isDelete = isDelete;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }
}