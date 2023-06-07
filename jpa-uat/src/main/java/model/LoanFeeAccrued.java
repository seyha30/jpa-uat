package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the LOAN_FEE_ACCRUED database table.
 * 
 */
@Entity
@Table(name="LOAN_FEE_ACCRUED")
@NamedQuery(name="LoanFeeAccrued.findAll", query="SELECT l FROM LoanFeeAccrued l")
public class LoanFeeAccrued implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal amount;

	private BigDecimal bal;

	@Column(name="LAST_DATE")
	private Object lastDate;

	@Column(name="LOAN_AFR_ID")
	private BigDecimal loanAfrId;

	@Column(name="LOAN_FAC_ID")
	private BigDecimal loanFacId;

	private BigDecimal prebal;

	private String settled;

	private String status;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	public LoanFeeAccrued() {
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getBal() {
		return this.bal;
	}

	public void setBal(BigDecimal bal) {
		this.bal = bal;
	}

	public Object getLastDate() {
		return this.lastDate;
	}

	public void setLastDate(Object lastDate) {
		this.lastDate = lastDate;
	}

	public BigDecimal getLoanAfrId() {
		return this.loanAfrId;
	}

	public void setLoanAfrId(BigDecimal loanAfrId) {
		this.loanAfrId = loanAfrId;
	}

	public BigDecimal getLoanFacId() {
		return this.loanFacId;
	}

	public void setLoanFacId(BigDecimal loanFacId) {
		this.loanFacId = loanFacId;
	}

	public BigDecimal getPrebal() {
		return this.prebal;
	}

	public void setPrebal(BigDecimal prebal) {
		this.prebal = prebal;
	}

	public String getSettled() {
		return this.settled;
	}

	public void setSettled(String settled) {
		this.settled = settled;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

}