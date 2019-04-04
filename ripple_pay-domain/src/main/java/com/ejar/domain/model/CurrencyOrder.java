package com.ejar.domain.model;

import java.io.Serializable;
import java.util.Date;

public class CurrencyOrder implements Serializable {
    private Long id;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    private Integer version;

    private Byte delFlag;

    private Long orderId;

    private Long userId;

    private Long buyerId;

    private Long sellerId;

    private Long unitPrice;

    private Long currencyNumber;

    private Long totalPrice;

    private Long presentCurrencyNumber;

    private Long presentTotalPrice;

    private Long pOrderId;

    private Integer mainTradeStatus;

    private Integer childTradeStatus;

    private Integer orderType;

    private String tradeRate;

    private Long tradeNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Byte getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public Long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Long getCurrencyNumber() {
        return currencyNumber;
    }

    public void setCurrencyNumber(Long currencyNumber) {
        this.currencyNumber = currencyNumber;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Long getPresentCurrencyNumber() {
        return presentCurrencyNumber;
    }

    public void setPresentCurrencyNumber(Long presentCurrencyNumber) {
        this.presentCurrencyNumber = presentCurrencyNumber;
    }

    public Long getPresentTotalPrice() {
        return presentTotalPrice;
    }

    public void setPresentTotalPrice(Long presentTotalPrice) {
        this.presentTotalPrice = presentTotalPrice;
    }

    public Long getpOrderId() {
        return pOrderId;
    }

    public void setpOrderId(Long pOrderId) {
        this.pOrderId = pOrderId;
    }

    public Integer getMainTradeStatus() {
        return mainTradeStatus;
    }

    public void setMainTradeStatus(Integer mainTradeStatus) {
        this.mainTradeStatus = mainTradeStatus;
    }

    public Integer getChildTradeStatus() {
        return childTradeStatus;
    }

    public void setChildTradeStatus(Integer childTradeStatus) {
        this.childTradeStatus = childTradeStatus;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public String getTradeRate() {
        return tradeRate;
    }

    public void setTradeRate(String tradeRate) {
        this.tradeRate = tradeRate == null ? null : tradeRate.trim();
    }

    public Long getTradeNumber() {
        return tradeNumber;
    }

    public void setTradeNumber(Long tradeNumber) {
        this.tradeNumber = tradeNumber;
    }
}