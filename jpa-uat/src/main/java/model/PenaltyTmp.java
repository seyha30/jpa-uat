package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the PENALTY_TMP database table.
 * 
 */
@Entity
@Table(name="PENALTY_TMP")
@NamedQuery(name="PenaltyTmp.findAll", query="SELECT p FROM PenaltyTmp p")
public class PenaltyTmp implements Serializable {
	private static final long serialVersionUID = 1L;

	private String deleted;

	@Column(name="F_DATE")
	private Object fDate;

	@Column(name="INST_NO")
	private BigDecimal instNo;

	@Column(name="LOAN_FAC_ID")
	private BigDecimal loanFacId;

	@Column(name="NO_DAY")
	private BigDecimal noDay;

	@Column(name="P_ID")
	private BigDecimal pId;

	@Column(name="PAID_PENALTY")
	private BigDecimal paidPenalty;

	private String pori;

	@Column(name="REPAY_PENALTY")
	private BigDecimal repayPenalty;

	@Column(name="T_DATE")
	private Object tDate;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	public PenaltyTmp() {
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public Object getFDate() {
		return this.fDate;
	}

	public void setFDate(Object fDate) {
		this.fDate = fDate;
	}

	public BigDecimal getInstNo() {
		return this.instNo;
	}

	public void setInstNo(BigDecimal instNo) {
		this.instNo = instNo;
	}

	public BigDecimal getLoanFacId() {
		return this.loanFacId;
	}

	public void setLoanFacId(BigDecimal loanFacId) {
		this.loanFacId = loanFacId;
	}

	public BigDecimal getNoDay() {
		return this.noDay;
	}

	public void setNoDay(BigDecimal noDay) {
		this.noDay = noDay;
	}

	public BigDecimal getPId() {
		return this.pId;
	}

	public void setPId(BigDecimal pId) {
		this.pId = pId;
	}

	public BigDecimal getPaidPenalty() {
		return this.paidPenalty;
	}

	public void setPaidPenalty(BigDecimal paidPenalty) {
		this.paidPenalty = paidPenalty;
	}

	public String getPori() {
		return this.pori;
	}

	public void setPori(String pori) {
		this.pori = pori;
	}

	public BigDecimal getRepayPenalty() {
		return this.repayPenalty;
	}

	public void setRepayPenalty(BigDecimal repayPenalty) {
		this.repayPenalty = repayPenalty;
	}

	public Object getTDate() {
		return this.tDate;
	}

	public void setTDate(Object tDate) {
		this.tDate = tDate;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

}