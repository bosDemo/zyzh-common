package com.zyzh.zz.base.controller;

import com.alibaba.fastjson.JSON;
import com.zyzh.zz.base.params.*;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author LPH
 * @Title: BaseController
 * @ProjectName maidong_platform
 * @Description: TODO
 * @date 2018/11/9 000911:06
 */

public class BaseController {

    private static Logger log = Logger.getLogger(BaseController.class);

    private String toJSONString(ReVo reVo){
        String responseStr = JSON.toJSONString(reVo);
        log.info(responseStr);
        return responseStr;
    }

    protected String ERROR(String returnCode){
        Params params=new Params(StatusType.ERROR.getCode(),StatusType.ERROR.getName(),returnCode,ReturnCodeType.getNameByCode(returnCode));
        ReVo reVo=new ReVo(params);
        return toJSONString(reVo);
    }

    protected String ERROR(String returnCode,String returnMsg){
        Params params=new Params(StatusType.ERROR.getCode(),StatusType.ERROR.getName(),returnCode,returnMsg);
        ReVo reVo=new ReVo(params);
        return toJSONString(reVo);
    }

    protected String SUCCESS(String returnCode){
        Params params=new Params(StatusType.SUCCESS.getCode(),StatusType.SUCCESS.getName(),returnCode,ReturnCodeType.getNameByCode(returnCode));
        ReVo reVo=new ReVo(params);
        return toJSONString(reVo);
    }

    protected String SUCCESS(String returnCode,Object data){
        Params params=new Params(StatusType.SUCCESS.getCode(),StatusType.SUCCESS.getName(),returnCode, ReturnCodeType.getNameByCode(returnCode));
        ReVo reVo=new ReVo(params);
        reVo.setData(data);
        return toJSONString(reVo);
    }

    protected String SUCCESS(String returnCode,Object rows,int total){
        Params params=new Params(StatusType.SUCCESS.getCode(),StatusType.SUCCESS.getName(),returnCode,ReturnCodeType.getNameByCode(returnCode));
        ReVo reVo=new ReVo(params);
        reVo.setRows(rows);
        reVo.setTotal(total);
        return toJSONString(reVo);
    }
    protected String SUCCESS(Object rows,int total){
        Params params=new Params(StatusType.SUCCESS.getCode(),StatusType.SUCCESS.getName());
        ReVo reVo=new ReVo(params);
        reVo.setRows(rows);
        reVo.setTotal(total);
        return toJSONString(reVo);
    }


    public static void main(String[] args){

        Light l=new Light("12","10","1");
        Light l1=new Light("13","11","0");
        Light l2=new Light("14","12","1");

        List<Light> r_list=new ArrayList<>();
        r_list.add(l);
        r_list.add(l1);
        r_list.add(l2);

        BaseController bc=new BaseController();

        //无数据返回。仅状态
        System.out.println(bc.SUCCESS(ReturnCodeType.BASE_SUCCESS.getCode()));
        //成功数组
        System.out.println(bc.SUCCESS(r_list,r_list.size()));
        //成功单个对象。自定义信息demo
        System.out.println(bc.SUCCESS(ReturnCodeType.CUSTOMER_QUERY_SUCCESS.getCode(),l1));
        //成功数组。自定义信息demo
        System.out.println(bc.SUCCESS(ReturnCodeType.CUSTOMER_QUERY_SUCCESS.getCode(),r_list,r_list.size()));
        //失败
        System.out.println(bc.ERROR(ReturnCodeType.BASE_ERROR.getCode()));
        //失败 自定义信息
        System.out.println(bc.ERROR(ReturnCodeType.CUSTOMER_QUERY_ERROR.getCode(),ReturnCodeType.CUSTOMER_QUERY_ERROR.getName()));

    }
}
