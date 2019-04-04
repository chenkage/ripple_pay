package com.ejar.domain.bean.common;

import java.io.Serializable;
import java.util.List;


public class BaseRequest<T> implements Serializable {
    private static final long serialVersionUID = 6786042125997164601L;

    /**
     * 当前第几页，默认1页
     */
    protected int pageNo = 1;

    /**
     * 每页显示条数，默认10条
     */
    protected int rows = 10;

    /**
     * 查询起始下标，默认0开始
     */
    protected int beginIndex;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 数据权限
     */
    private List<String> authCitys;

    /**
     * 有效天数
     */
    private int authDays;

    public int getAuthDays() {
        return authDays;
    }

    public void setAuthDays(int authDays) {
        this.authDays = authDays;
    }

    private T data;

    public List<String> getAuthCitys() {
        return authCitys;
    }

    public void setAuthCitys(List<String> authCitys) {
        this.authCitys = authCitys;
    }

    public int getBeginIndex() {
        return (this.pageNo - 1) * this.rows;
    }

    public void setBeginIndex(int beginIndex) {
        this.beginIndex = beginIndex;
    }

    public BaseRequest(Long userId) {
        this.userId = userId;
    }

    public BaseRequest(T data) {
        this.data = data;
    }

    public BaseRequest() {
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
