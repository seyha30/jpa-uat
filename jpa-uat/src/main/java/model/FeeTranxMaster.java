package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FEE_TRANX_MASTER database table.
 * 
 */
@Entity
@Table(name="FEE_TRANX_MASTER")
@NamedQuery(name="FeeTranxMaster.findAll", query="SELECT f FROM FeeTranxMaster f")
public class FeeTranxMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal amount;

	@Column(name="CUST_ACCT_NO")
	private String custAcctNo;

	@Column(name="DATE_ADDED")
	private Object dateAdded;

	@Column(name="DATE_POSTED")
	private Object datePosted;

	@Column(name="FEE_AMOUNT")
	private BigDecimal feeAmount;

	@Column(name="FEE_TRANX_SEQ_ID")
	private BigDecimal feeTranxSeqId;

	@Column(name="HOST_TRANX_ID")
	private BigDecimal hostTranxId;

	private String status;

	@Column(name="STATUS_DESC")
	private String statusDesc;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	public FeeTranxMaster() {
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCustAcctNo() {
		return this.custAcctNo;
	}

	public void setCustAcctNo(String custAcctNo) {
		this.custAcctNo = custAcctNo;
	}

	public Object getDateAdded() {
		return this.dateAdded;
	}

	public void setDateAdded(Object dateAdded) {
		this.dateAdded = dateAdded;
	}

	public Object getDatePosted() {
		return this.datePosted;
	}

	public void setDatePosted(Object datePosted) {
		this.datePosted = datePosted;
	}

	public BigDecimal getFeeAmount() {
		return this.feeAmount;
	}

	public void setFeeAmount(BigDecimal feeAmount) {
		this.feeAmount = feeAmount;
	}

	public BigDecimal getFeeTranxSeqId() {
		return this.feeTranxSeqId;
	}

	public void setFeeTranxSeqId(BigDecimal feeTranxSeqId) {
		this.feeTranxSeqId = feeTranxSeqId;
	}

	public BigDecimal getHostTranxId() {
		return this.hostTranxId;
	}

	public void setHostTranxId(BigDecimal hostTranxId) {
		this.hostTranxId = hostTranxId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusDesc() {
		return this.statusDesc;
	}

	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

}