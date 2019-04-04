package com.ejar.domain.bean.common;

import com.ejar.domain.enums.ResponseStatus;

import java.io.Serializable;

public class BaseResponse<T> implements Serializable {

    private static final long serialVersionUID = 6786042125997164602L;

    protected ResponseStatus status = ResponseStatus.SUCCESS;

    private String errorCode;

    private String errorMsg;

    protected T data;

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /**
     * 返回错误
     *
     * @param err 错误信息
     * @return BaseResponse<T>
     */
    public BaseResponse error(String err) {
        setStatus(ResponseStatus.ERROR);
        setErrorMsg(err);
        return this;
    }

    public static BaseResponse error(String errCode, String errMsg) {
        BaseResponse response = new BaseResponse();
        response.setStatus(ResponseStatus.ERROR);
        response.setErrorCode(errCode);
        response.setErrorMsg(errMsg);
        return response;
    }

    public static <T> BaseResponse<T> success(T t) {
        BaseResponse<T> response = new BaseResponse<T>();
        response.setData(t);
        return response;
    }
}
