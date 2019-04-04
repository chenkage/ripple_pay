package com.ejar.domain.bean.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Page<T> implements Serializable {
    private static final long serialVersionUID = 5246627934455392469L;
    /**
     * 每页默认10条数据
     */
    protected int pageSize = 10;
    /**
     * 当前页
     */
    protected int pageNo = 1;
    /**
     * 总页数
     */
    protected int totalPage = 0;
    /**
     * 总数据数
     */
    protected long total = 0;
    /**
     * 数据
     */
    private List<T> rows;

    /**
     * 表头
     */
    private Object header;

    public Page() {
    }

    public Page(long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
        this.totalPage = (int) ((total % pageSize == 0) ? (total / pageSize) : (total / pageSize + 1));
    }

    public Page(long total, int pageNo, int pageSize, List<T> list) {
        this.total = total;
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.rows = list;
        this.totalPage = (int) ((total % pageSize == 0) ? (total / pageSize) : (total / pageSize + 1));
    }

    public Page(Object header, long total, int pageNo, int pageSize, List<T> list) {
        this.header = header;
        this.total = total;
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.rows = list;
        this.totalPage = (int) ((total % pageSize == 0) ? (total / pageSize) : (total / pageSize + 1));
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getRows() {
        if (rows != null && rows.size() > 0) {
            return rows;
        } else {
            return new ArrayList<T>();
        }
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Object getHeader() {
        return header;
    }

    public void setHeader(Object header) {
        this.header = header;
    }
}
