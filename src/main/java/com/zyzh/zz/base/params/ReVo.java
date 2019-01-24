package com.zyzh.zz.base.params;

import java.io.Serializable;

/**
 * @author LPH
 * @Title: Revo
 * @ProjectName maidong_platform
 * @Description: TODO
 * @date 2018/11/9 000911:14
 */

public class ReVo implements Serializable {


    private static final long serialVersionUID = 1L;

    private Params params;

    //单条查询数据
    private Object data;
    //分页数据
    private Object rows;
    // 总共条数
    private int total;

    public ReVo(Params params) {
        super();
        this.params = params;
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getRows() {
        return rows;
    }

    public void setRows(Object rows) {
        this.rows = rows;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
