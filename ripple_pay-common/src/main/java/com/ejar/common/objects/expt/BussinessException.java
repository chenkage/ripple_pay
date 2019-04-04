package com.ejar.common.objects.expt;

public class BussinessException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private String code;
    private String msg;

    public BussinessException() {
        super("业务校验异常");
    }

    public BussinessException(String msg, Throwable cause) {
        super(msg, cause);
        this.msg = msg;
    }

    public BussinessException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public BussinessException(Throwable cause) {
        super(cause);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}