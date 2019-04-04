package com.ejar.domain.bean.order;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class OrderInfoBean implements Serializable {
	
	private List<Long> orderIds;
	
	private String createdBy;
	private String updatedBy;
	
	private int pageNumber;
	
	private int pageSize;
	
	private Long id;
	
	/**
	 * 所属城市
	 */
	private String cityCode;
	
	private String cityName;
	
	/**
	 * 用车时间
	 */
	private Date usedCarTime;
	
	private Long usedCarDate;
	
	private Long usedCarTimeStartTime;
	
	private Long usedCarTimeEndTime;
	
	/**
	 * 预估价格
	 */
	private Long predictAmount;
	
	/**
	 * 司机id
	 */
	private Long driverId;
	
	private String driverName;
	
	private String drvierBelongCompany;
	
	/**
	 * 车辆id
	 */
	private Long carId;
	
	private String licensePlateNo;
	
	private Long carType;
	
	private String carTypeDesc;
	
	private String carBelongCompany;
	
	/**
	 * 出发地点
	 */
	private String fromAddress;
	
	/**
	 * 到达地点
	 */
	private String toAddress;
	
	public int getPageNumber() {
		return pageNumber;
	}
	
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	
	public int getPageSize() {
		return pageSize;
	}
	
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCityCode() {
		return cityCode;
	}
	
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	
	public String getCityName() {
		return cityName;
	}
	
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public Date getUsedCarTime() {
		return usedCarTime;
	}
	
	public void setUsedCarTime(Date usedCarTime) {
		this.usedCarTime = usedCarTime;
	}
	
	public Long getUsedCarTimeStartTime() {
		return usedCarTimeStartTime;
	}
	
	public void setUsedCarTimeStartTime(Long usedCarTimeStartTime) {
		this.usedCarTimeStartTime = usedCarTimeStartTime;
	}
	
	public Long getUsedCarTimeEndTime() {
		return usedCarTimeEndTime;
	}
	
	public void setUsedCarTimeEndTime(Long usedCarTimeEndTime) {
		this.usedCarTimeEndTime = usedCarTimeEndTime;
	}
	
	public Long getPredictAmount() {
		return predictAmount;
	}
	
	public void setPredictAmount(Long predictAmount) {
		this.predictAmount = predictAmount;
	}
	
	public Long getDriverId() {
		return driverId;
	}
	
	public void setDriverId(Long driverId) {
		this.driverId = driverId;
	}
	
	public String getDriverName() {
		return driverName;
	}
	
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	
	public String getDrvierBelongCompany() {
		return drvierBelongCompany;
	}
	
	public void setDrvierBelongCompany(String drvierBelongCompany) {
		this.drvierBelongCompany = drvierBelongCompany;
	}
	
	public Long getCarId() {
		return carId;
	}
	
	public void setCarId(Long carId) {
		this.carId = carId;
	}
	
	public String getLicensePlateNo() {
		return licensePlateNo;
	}
	
	public void setLicensePlateNo(String licensePlateNo) {
		this.licensePlateNo = licensePlateNo;
	}
	
	public Long getCarType() {
		return carType;
	}
	
	public void setCarType(Long carType) {
		this.carType = carType;
	}
	
	public String getCarTypeDesc() {
		return carTypeDesc;
	}
	
	public void setCarTypeDesc(String carTypeDesc) {
		this.carTypeDesc = carTypeDesc;
	}
	
	public String getCarBelongCompany() {
		return carBelongCompany;
	}
	
	public void setCarBelongCompany(String carBelongCompany) {
		this.carBelongCompany = carBelongCompany;
	}
	
	public String getFromAddress() {
		return fromAddress;
	}
	
	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}
	
	public String getToAddress() {
		return toAddress;
	}
	
	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}
	
	public Long getUsedCarDate() {
		return usedCarDate;
	}
	
	public void setUsedCarDate(Long usedCarDate) {
		this.usedCarDate = usedCarDate;
	}
	
	public String getCreatedBy() {
		return createdBy;
	}
	
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	public String getUpdatedBy() {
		return updatedBy;
	}
	
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	public List<Long> getOrderIds() {
		return orderIds;
	}
	
	public void setOrderIds(List<Long> orderIds) {
		this.orderIds = orderIds;
	}
	
	@Override
	public String toString() {
		return "OrderInfoBean{" +
				"orderIds=" + orderIds +
				", createdBy='" + createdBy + '\'' +
				", updatedBy='" + updatedBy + '\'' +
				", pageNumber=" + pageNumber +
				", pageSize=" + pageSize +
				", id=" + id +
				", cityCode='" + cityCode + '\'' +
				", cityName='" + cityName + '\'' +
				", usedCarTime=" + usedCarTime +
				", usedCarDate=" + usedCarDate +
				", usedCarTimeStartTime=" + usedCarTimeStartTime +
				", usedCarTimeEndTime=" + usedCarTimeEndTime +
				", predictAmount=" + predictAmount +
				", driverId=" + driverId +
				", driverName='" + driverName + '\'' +
				", drvierBelongCompany='" + drvierBelongCompany + '\'' +
				", carId=" + carId +
				", licensePlateNo='" + licensePlateNo + '\'' +
				", carType=" + carType +
				", carTypeDesc='" + carTypeDesc + '\'' +
				", carBelongCompany='" + carBelongCompany + '\'' +
				", fromAddress='" + fromAddress + '\'' +
				", toAddress='" + toAddress + '\'' +
				'}';
	}
}
