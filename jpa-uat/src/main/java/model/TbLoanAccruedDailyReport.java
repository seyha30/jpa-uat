package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TB_LOAN_ACCRUED_DAILY_REPORT database table.
 * 
 */
@Entity
@Table(name="TB_LOAN_ACCRUED_DAILY_REPORT")
@NamedQuery(name="TbLoanAccruedDailyReport.findAll", query="SELECT t FROM TbLoanAccruedDailyReport t")
public class TbLoanAccruedDailyReport implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCOUNT_NO")
	private String accountNo;

	@Column(name="ACCRUED_INT_PAYABLE")
	private BigDecimal accruedIntPayable;

	@Column(name="ACCUMULATE_BALANCE")
	private BigDecimal accumulateBalance;

	@Column(name="CURRENT_BAL")
	private BigDecimal currentBal;

	@Column(name="CUSTOMER_NAME")
	private String customerName;

	@Column(name="INT_RATE")
	private BigDecimal intRate;

	private Object maturity;

	@Column(name="PREVIOUS_BALANCE")
	private BigDecimal previousBalance;

	@Column(name="PRINCIPAL_AMT")
	private BigDecimal principalAmt;

	@Column(name="REFERENT_NO")
	private String referentNo;

	@Column(name="START_DATE")
	private Object startDate;

	private String status;

	public TbLoanAccruedDailyReport() {
	}

	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public BigDecimal getAccruedIntPayable() {
		return this.accruedIntPayable;
	}

	public void setAccruedIntPayable(BigDecimal accruedIntPayable) {
		this.accruedIntPayable = accruedIntPayable;
	}

	public BigDecimal getAccumulateBalance() {
		return this.accumulateBalance;
	}

	public void setAccumulateBalance(BigDecimal accumulateBalance) {
		this.accumulateBalance = accumulateBalance;
	}

	public BigDecimal getCurrentBal() {
		return this.currentBal;
	}

	public void setCurrentBal(BigDecimal currentBal) {
		this.currentBal = currentBal;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public BigDecimal getIntRate() {
		return this.intRate;
	}

	public void setIntRate(BigDecimal intRate) {
		this.intRate = intRate;
	}

	public Object getMaturity() {
		return this.maturity;
	}

	public void setMaturity(Object maturity) {
		this.maturity = maturity;
	}

	public BigDecimal getPreviousBalance() {
		return this.previousBalance;
	}

	public void setPreviousBalance(BigDecimal previousBalance) {
		this.previousBalance = previousBalance;
	}

	public BigDecimal getPrincipalAmt() {
		return this.principalAmt;
	}

	public void setPrincipalAmt(BigDecimal principalAmt) {
		this.principalAmt = principalAmt;
	}

	public String getReferentNo() {
		return this.referentNo;
	}

	public void setReferentNo(String referentNo) {
		this.referentNo = referentNo;
	}

	public Object getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Object startDate) {
		this.startDate = startDate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}