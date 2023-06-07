package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CLVW_LOAN_BY_CREDIT_OFFICER database table.
 * 
 */
@Entity
@Table(name="CLVW_LOAN_BY_CREDIT_OFFICER")
@NamedQuery(name="ClvwLoanByCreditOfficer.findAll", query="SELECT c FROM ClvwLoanByCreditOfficer c")
public class ClvwLoanByCreditOfficer implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal aging;

	private String ccy;

	@Column(name="CO_ID")
	private String coId;

	@Column(name="CREDIT_OFFICER")
	private String creditOfficer;

	@Column(name="FEE_PAID")
	private BigDecimal feePaid;

	@Column(name="FIX_RATE")
	private BigDecimal fixRate;

	@Column(name="INT_PAID")
	private BigDecimal intPaid;

	@Column(name="LOAN_FAC_REF_NO")
	private String loanFacRefNo;

	@Column(name="LOAN_STATUS")
	private String loanStatus;

	@Column(name="MID_RATE")
	private BigDecimal midRate;

	private BigDecimal outstanding;

	@Column(name="OVERDUE_AMT")
	private BigDecimal overdueAmt;

	@Column(name="PAID_AMT")
	private BigDecimal paidAmt;

	@Column(name="PEN_PAID")
	private BigDecimal penPaid;

	@Column(name="PRIN_PAID")
	private BigDecimal prinPaid;

	@Column(name="ROW_NO")
	private BigDecimal rowNo;

	@Column(name="UP_FRONT_FEE")
	private BigDecimal upFrontFee;

	public ClvwLoanByCreditOfficer() {
	}

	public BigDecimal getAging() {
		return this.aging;
	}

	public void setAging(BigDecimal aging) {
		this.aging = aging;
	}

	public String getCcy() {
		return this.ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public String getCoId() {
		return this.coId;
	}

	public void setCoId(String coId) {
		this.coId = coId;
	}

	public String getCreditOfficer() {
		return this.creditOfficer;
	}

	public void setCreditOfficer(String creditOfficer) {
		this.creditOfficer = creditOfficer;
	}

	public BigDecimal getFeePaid() {
		return this.feePaid;
	}

	public void setFeePaid(BigDecimal feePaid) {
		this.feePaid = feePaid;
	}

	public BigDecimal getFixRate() {
		return this.fixRate;
	}

	public void setFixRate(BigDecimal fixRate) {
		this.fixRate = fixRate;
	}

	public BigDecimal getIntPaid() {
		return this.intPaid;
	}

	public void setIntPaid(BigDecimal intPaid) {
		this.intPaid = intPaid;
	}

	public String getLoanFacRefNo() {
		return this.loanFacRefNo;
	}

	public void setLoanFacRefNo(String loanFacRefNo) {
		this.loanFacRefNo = loanFacRefNo;
	}

	public String getLoanStatus() {
		return this.loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	public BigDecimal getMidRate() {
		return this.midRate;
	}

	public void setMidRate(BigDecimal midRate) {
		this.midRate = midRate;
	}

	public BigDecimal getOutstanding() {
		return this.outstanding;
	}

	public void setOutstanding(BigDecimal outstanding) {
		this.outstanding = outstanding;
	}

	public BigDecimal getOverdueAmt() {
		return this.overdueAmt;
	}

	public void setOverdueAmt(BigDecimal overdueAmt) {
		this.overdueAmt = overdueAmt;
	}

	public BigDecimal getPaidAmt() {
		return this.paidAmt;
	}

	public void setPaidAmt(BigDecimal paidAmt) {
		this.paidAmt = paidAmt;
	}

	public BigDecimal getPenPaid() {
		return this.penPaid;
	}

	public void setPenPaid(BigDecimal penPaid) {
		this.penPaid = penPaid;
	}

	public BigDecimal getPrinPaid() {
		return this.prinPaid;
	}

	public void setPrinPaid(BigDecimal prinPaid) {
		this.prinPaid = prinPaid;
	}

	public BigDecimal getRowNo() {
		return this.rowNo;
	}

	public void setRowNo(BigDecimal rowNo) {
		this.rowNo = rowNo;
	}

	public BigDecimal getUpFrontFee() {
		return this.upFrontFee;
	}

	public void setUpFrontFee(BigDecimal upFrontFee) {
		this.upFrontFee = upFrontFee;
	}

}