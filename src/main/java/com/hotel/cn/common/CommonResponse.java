package com.hotel.cn.common;

import lombok.Data;

/**
 * @author PVer
 */
@Data
public class CommonResponse<T> {
    private Integer totalNumber;
    private boolean flag;
    private T data;
    private String errorMsg;

    public CommonResponse (boolean flag, String errorMsg) {
        this.flag = flag;
        this.errorMsg = errorMsg;
    }

    public CommonResponse (boolean flag, T data, Integer totalNumber) {
        this.flag = flag;
        this.data = data;
        this.totalNumber = totalNumber;
    }


    public CommonResponse (Integer totalNumber, boolean flag, T data) {
        this.totalNumber = totalNumber;
        this.flag = flag;
        this.data = data;
    }


}
