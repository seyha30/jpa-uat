package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CHQ_INFO database table.
 * 
 */
@Entity
@Table(name="CHQ_INFO")
@NamedQuery(name="ChqInfo.findAll", query="SELECT c FROM ChqInfo c")
public class ChqInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="BA_CODE")
	private BigDecimal baCode;

	@Column(name="BRANCH_ID")
	private BigDecimal branchId;

	@Column(name="CHQ_FROM")
	private BigDecimal chqFrom;

	@Column(name="CHQ_NO")
	private BigDecimal chqNo;

	@Column(name="CHQ_TO")
	private BigDecimal chqTo;

	private BigDecimal chs;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	private BigDecimal custacctid;

	public ChqInfo() {
	}

	public BigDecimal getBaCode() {
		return this.baCode;
	}

	public void setBaCode(BigDecimal baCode) {
		this.baCode = baCode;
	}

	public BigDecimal getBranchId() {
		return this.branchId;
	}

	public void setBranchId(BigDecimal branchId) {
		this.branchId = branchId;
	}

	public BigDecimal getChqFrom() {
		return this.chqFrom;
	}

	public void setChqFrom(BigDecimal chqFrom) {
		this.chqFrom = chqFrom;
	}

	public BigDecimal getChqNo() {
		return this.chqNo;
	}

	public void setChqNo(BigDecimal chqNo) {
		this.chqNo = chqNo;
	}

	public BigDecimal getChqTo() {
		return this.chqTo;
	}

	public void setChqTo(BigDecimal chqTo) {
		this.chqTo = chqTo;
	}

	public BigDecimal getChs() {
		return this.chs;
	}

	public void setChs(BigDecimal chs) {
		this.chs = chs;
	}

	public BigDecimal getCurrId() {
		return this.currId;
	}

	public void setCurrId(BigDecimal currId) {
		this.currId = currId;
	}

	public BigDecimal getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(BigDecimal custacctid) {
		this.custacctid = custacctid;
	}

}