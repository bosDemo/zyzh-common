package com.zyzh.zz.base.params;

import java.io.Serializable;

/**
 * @author LPH
 * @Title: Params
 * @ProjectName maidong_platform
 * @Description: TODO
 * @date 2018/11/9 000911:08
 */

public class Params implements Serializable {

    private static final long serialVersionUID = 1L;

    //成功失败状态
    private int status;
    //成功失败信息
    private String msg;
    //业务返回码
    private String returnCode;
    //业务返回信息
    private String returnMsg;


    public Params() {
        super();
    }

    public Params(int status) {
        super();
        this.status = status;
    }

    public Params(int status, String msg) {
        super();
        this.status = status;
        this.msg = msg;
    }



    public Params(int status, String msg, String returnCode,String returnMsg) {
        super();
        this.status = status;
        this.msg = msg;
        this.returnCode = returnCode;
        this.returnMsg=returnMsg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }




}
