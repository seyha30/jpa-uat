package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the LOAN_TRANX database table.
 * 
 */
@Entity
@Table(name="LOAN_TRANX")
@NamedQuery(name="LoanTranx.findAll", query="SELECT l FROM LoanTranx l")
public class LoanTranx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ADD_TRANX_ID")
	private BigDecimal addTranxId;

	@Column(name="DATE_DONE")
	private Object dateDone;

	@Column(name="DONE_BY")
	private String doneBy;

	@Column(name="FROM_CUSTACCTID")
	private BigDecimal fromCustacctid;

	private BigDecimal interest;

	@Column(name="INTEREST_TRANX_ID")
	private BigDecimal interestTranxId;

	@Column(name="LOAN_FAC_ID")
	private BigDecimal loanFacId;

	@Column(name="LOAN_TRANX_ID")
	private BigDecimal loanTranxId;

	@Column(name="PAYMENT_MODE")
	private String paymentMode;

	private BigDecimal principal;

	@Column(name="PRINCIPAL_TRANX_ID")
	private BigDecimal principalTranxId;

	public LoanTranx() {
	}

	public BigDecimal getAddTranxId() {
		return this.addTranxId;
	}

	public void setAddTranxId(BigDecimal addTranxId) {
		this.addTranxId = addTranxId;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public String getDoneBy() {
		return this.doneBy;
	}

	public void setDoneBy(String doneBy) {
		this.doneBy = doneBy;
	}

	public BigDecimal getFromCustacctid() {
		return this.fromCustacctid;
	}

	public void setFromCustacctid(BigDecimal fromCustacctid) {
		this.fromCustacctid = fromCustacctid;
	}

	public BigDecimal getInterest() {
		return this.interest;
	}

	public void setInterest(BigDecimal interest) {
		this.interest = interest;
	}

	public BigDecimal getInterestTranxId() {
		return this.interestTranxId;
	}

	public void setInterestTranxId(BigDecimal interestTranxId) {
		this.interestTranxId = interestTranxId;
	}

	public BigDecimal getLoanFacId() {
		return this.loanFacId;
	}

	public void setLoanFacId(BigDecimal loanFacId) {
		this.loanFacId = loanFacId;
	}

	public BigDecimal getLoanTranxId() {
		return this.loanTranxId;
	}

	public void setLoanTranxId(BigDecimal loanTranxId) {
		this.loanTranxId = loanTranxId;
	}

	public String getPaymentMode() {
		return this.paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public BigDecimal getPrincipal() {
		return this.principal;
	}

	public void setPrincipal(BigDecimal principal) {
		this.principal = principal;
	}

	public BigDecimal getPrincipalTranxId() {
		return this.principalTranxId;
	}

	public void setPrincipalTranxId(BigDecimal principalTranxId) {
		this.principalTranxId = principalTranxId;
	}

}