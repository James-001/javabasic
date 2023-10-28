package com.example.elastic.jihe;

import java.util.Date;

/**
 * 操作明细dto
 * @author yto
 *
 */
public class OpDetail {
	
	/**
	 * 运单号
	 */
	private String waybillNo;
	
	/**
	 * 快递公司编码
	 */
	private String logisticsCode;
	
	/**
	 * 快递公司名称
	 */
	private String logisticsName;
	
	/**
	 * 操作时间
	 */
	private Date createTime;
	
	/**
	 * 网点编码
	 */
	private String orgCode;
	
	/**
	 * 驿站编码
	 */
	private String stationCode;
	
	/**
	 * 驿站名称
	 */
	private String stationName;
	
	/**
	 * 操作编码
	 */
	private String operateCode;
	
	/**
	 * 操作名称
	 */
	private String operateName;
	
	/**
	 * 操作人编码
	 */
	private String opUserCode;
	
	/**
	 * 操作人名称
	 */
	private String opUserName;
	
	/**
	 * 客户渠道编码
	 */
	private String customerCode;
	
	/**
	 * 客户渠道名称
	 */
	private String customerName;

	public String getWaybillNo() {
		return waybillNo;
	}

	public void setWaybillNo(String waybillNo) {
		this.waybillNo = waybillNo;
	}

	public String getLogisticsCode() {
		return logisticsCode;
	}

	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getLogisticsName() {
		return logisticsName;
	}

	public void setLogisticsName(String logisticsName) {
		this.logisticsName = logisticsName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getStationCode() {
		return stationCode;
	}

	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getOperateCode() {
		return operateCode;
	}

	public void setOperateCode(String operateCode) {
		this.operateCode = operateCode;
	}

	public String getOperateName() {
		return operateName;
	}

	public void setOperateName(String operateName) {
		this.operateName = operateName;
	}

	public String getOpUserCode() {
		return opUserCode;
	}

	public void setOpUserCode(String opUserCode) {
		this.opUserCode = opUserCode;
	}

	public String getOpUserName() {
		return opUserName;
	}

	public void setOpUserName(String opUserName) {
		this.opUserName = opUserName;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
}

