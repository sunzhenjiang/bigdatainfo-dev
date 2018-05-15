package com.jinyinmao.info.model;

import java.io.Serializable;
import java.util.Date;


public class LogEntitys implements Serializable{
	
	private String MId;

	private Integer operation;

	private String purchase;

	private String redeem;

	private String subPurchase;

	private Long CAmount;

	private Long BMoney;

	private Long cancelAmount;

	private Integer cancelType;

	private Integer cancelUAssetRatioType;

	private String tempUAssetRatioId;

	private String UAssetRatioId;

	private Long surplusMoney;

	private Long debtAmount;

	private String batchBookOrderId;

	private String batchId;

	private String debtAssignLineOrderId;

	private String redeemLineOrderId;

	private Integer transactionType;

	private String unMatchBackLineOrderId;

	private Long beforeAssetMatchedAmount;

	private Long beforeAssetRemainningAmount;

	private Long beforeOrderMatchedAmount;

	private Long beforeOrderRemainingAmount;

	private Integer deptMatchType;

	private String orderIdFromBatchRedeem;

	private Long redeemAmount;

	private Integer redeemType;

	private String direction;

	private Date c_Date;

	private Date ins_Date;

	public String getMId() {
		return MId;
	}

	public void setMId(String mId) {
		MId = mId;
	}

	public Integer getOperation() {
		return operation;
	}

	public void setOperation(Integer operation) {
		this.operation = operation;
	}

	public String getPurchase() {
		return purchase;
	}

	public void setPurchase(String purchase) {
		this.purchase = purchase;
	}

	public String getRedeem() {
		return redeem;
	}

	public void setRedeem(String redeem) {
		this.redeem = redeem;
	}

	public String getSubPurchase() {
		return subPurchase;
	}

	public void setSubPurchase(String subPurchase) {
		this.subPurchase = subPurchase;
	}

	public Long getCAmount() {
		return CAmount;
	}

	public void setCAmount(Long cAmount) {
		CAmount = cAmount;
	}

	public Long getBMoney() {
		return BMoney;
	}

	public void setBMoney(Long bMoney) {
		BMoney = bMoney;
	}

	public Long getCancelAmount() {
		return cancelAmount;
	}

	public void setCancelAmount(Long cancelAmount) {
		this.cancelAmount = cancelAmount;
	}

	public Integer getCancelType() {
		return cancelType;
	}

	public void setCancelType(Integer cancelType) {
		this.cancelType = cancelType;
	}

	public Integer getCancelUAssetRatioType() {
		return cancelUAssetRatioType;
	}

	public void setCancelUAssetRatioType(Integer cancelUAssetRatioType) {
		this.cancelUAssetRatioType = cancelUAssetRatioType;
	}

	public String getTempUAssetRatioId() {
		return tempUAssetRatioId;
	}

	public void setTempUAssetRatioId(String tempUAssetRatioId) {
		this.tempUAssetRatioId = tempUAssetRatioId;
	}

	public String getUAssetRatioId() {
		return UAssetRatioId;
	}

	public void setUAssetRatioId(String uAssetRatioId) {
		UAssetRatioId = uAssetRatioId;
	}

	public Long getSurplusMoney() {
		return surplusMoney;
	}

	public void setSurplusMoney(Long surplusMoney) {
		this.surplusMoney = surplusMoney;
	}

	public Long getDebtAmount() {
		return debtAmount;
	}

	public void setDebtAmount(Long debtAmount) {
		this.debtAmount = debtAmount;
	}

	public String getBatchBookOrderId() {
		return batchBookOrderId;
	}

	public void setBatchBookOrderId(String batchBookOrderId) {
		this.batchBookOrderId = batchBookOrderId;
	}

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getDebtAssignLineOrderId() {
		return debtAssignLineOrderId;
	}

	public void setDebtAssignLineOrderId(String debtAssignLineOrderId) {
		this.debtAssignLineOrderId = debtAssignLineOrderId;
	}

	public String getRedeemLineOrderId() {
		return redeemLineOrderId;
	}

	public void setRedeemLineOrderId(String redeemLineOrderId) {
		this.redeemLineOrderId = redeemLineOrderId;
	}

	public Integer getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(Integer transactionType) {
		this.transactionType = transactionType;
	}

	public String getUnMatchBackLineOrderId() {
		return unMatchBackLineOrderId;
	}

	public void setUnMatchBackLineOrderId(String unMatchBackLineOrderId) {
		this.unMatchBackLineOrderId = unMatchBackLineOrderId;
	}

	public Long getBeforeAssetMatchedAmount() {
		return beforeAssetMatchedAmount;
	}

	public void setBeforeAssetMatchedAmount(Long beforeAssetMatchedAmount) {
		this.beforeAssetMatchedAmount = beforeAssetMatchedAmount;
	}

	public Long getBeforeAssetRemainningAmount() {
		return beforeAssetRemainningAmount;
	}

	public void setBeforeAssetRemainningAmount(Long beforeAssetRemainningAmount) {
		this.beforeAssetRemainningAmount = beforeAssetRemainningAmount;
	}

	public Long getBeforeOrderMatchedAmount() {
		return beforeOrderMatchedAmount;
	}

	public void setBeforeOrderMatchedAmount(Long beforeOrderMatchedAmount) {
		this.beforeOrderMatchedAmount = beforeOrderMatchedAmount;
	}

	public Long getBeforeOrderRemainingAmount() {
		return beforeOrderRemainingAmount;
	}

	public void setBeforeOrderRemainingAmount(Long beforeOrderRemainingAmount) {
		this.beforeOrderRemainingAmount = beforeOrderRemainingAmount;
	}

	public Integer getDeptMatchType() {
		return deptMatchType;
	}

	public void setDeptMatchType(Integer deptMatchType) {
		this.deptMatchType = deptMatchType;
	}

	public String getOrderIdFromBatchRedeem() {
		return orderIdFromBatchRedeem;
	}

	public void setOrderIdFromBatchRedeem(String orderIdFromBatchRedeem) {
		this.orderIdFromBatchRedeem = orderIdFromBatchRedeem;
	}

	public Long getRedeemAmount() {
		return redeemAmount;
	}

	public void setRedeemAmount(Long redeemAmount) {
		this.redeemAmount = redeemAmount;
	}

	public Integer getRedeemType() {
		return redeemType;
	}

	public void setRedeemType(Integer redeemType) {
		this.redeemType = redeemType;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public Date getC_Date() {
		return c_Date;
	}

	public void setC_Date(Date c_Date) {
		this.c_Date = c_Date;
	}

	public Date getIns_Date() {
		return ins_Date;
	}

	public void setIns_Date(Date ins_Date) {
		this.ins_Date = ins_Date;
	}
}
