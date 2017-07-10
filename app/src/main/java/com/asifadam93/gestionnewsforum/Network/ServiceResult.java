package com.asifadam93.gestionnewsforum.Network;

/**
 * Created by Asifadam93 on 10/07/2017.
 */

public class ServiceResult<T> {

    private T data;
    private String errorMsg;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
