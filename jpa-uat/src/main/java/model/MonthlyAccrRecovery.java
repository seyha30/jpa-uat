package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the MONTHLY_ACCR_RECOVERY database table.
 * 
 */
@Entity
@Table(name="MONTHLY_ACCR_RECOVERY")
@NamedQuery(name="MonthlyAccrRecovery.findAll", query="SELECT m FROM MonthlyAccrRecovery m")
public class MonthlyAccrRecovery implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCOUNT_NO")
	private String accountNo;

	@Column(name="ACCR_POST_TEMP")
	private BigDecimal accrPostTemp;

	@Column(name="ACCRUED_INT_PAYABLE")
	private BigDecimal accruedIntPayable;

	@Column(name="ACCUMULATE_BAL")
	private BigDecimal accumulateBal;

	@Column(name="C_BAL_STATUS")
	private String cBalStatus;

	@Column(name="CURRENT_BAL")
	private BigDecimal currentBal;

	@Column(name="CUST_DISBURSEMENT")
	private String custDisbursement;

	@Column(name="CUSTOMER_NAME")
	private String customerName;

	@Column(name="DATE_DONE")
	private String dateDone;

	private String description;

	@Column(name="INT_RATE")
	private BigDecimal intRate;

	@Column(name="LAST_PAYMENT_DATE")
	private String lastPaymentDate;

	@Column(name="LOAN_STATUS")
	private BigDecimal loanStatus;

	@Column(name="MATURITY_DATE")
	private String maturityDate;

	@Column(name="PREV_POST_BAL")
	private BigDecimal prevPostBal;

	@Column(name="PREVIOUS_BAL")
	private BigDecimal previousBal;

	@Column(name="PRINCIPAL_AMT")
	private BigDecimal principalAmt;

	@Column(name="REF_NO")
	private String refNo;

	@Column(name="START_DATE")
	private String startDate;

	private String status;

	@Column(name="TRANX_AMT")
	private BigDecimal tranxAmt;

	private String yorm;

	public MonthlyAccrRecovery() {
	}

	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public BigDecimal getAccrPostTemp() {
		return this.accrPostTemp;
	}

	public void setAccrPostTemp(BigDecimal accrPostTemp) {
		this.accrPostTemp = accrPostTemp;
	}

	public BigDecimal getAccruedIntPayable() {
		return this.accruedIntPayable;
	}

	public void setAccruedIntPayable(BigDecimal accruedIntPayable) {
		this.accruedIntPayable = accruedIntPayable;
	}

	public BigDecimal getAccumulateBal() {
		return this.accumulateBal;
	}

	public void setAccumulateBal(BigDecimal accumulateBal) {
		this.accumulateBal = accumulateBal;
	}

	public String getCBalStatus() {
		return this.cBalStatus;
	}

	public void setCBalStatus(String cBalStatus) {
		this.cBalStatus = cBalStatus;
	}

	public BigDecimal getCurrentBal() {
		return this.currentBal;
	}

	public void setCurrentBal(BigDecimal currentBal) {
		this.currentBal = currentBal;
	}

	public String getCustDisbursement() {
		return this.custDisbursement;
	}

	public void setCustDisbursement(String custDisbursement) {
		this.custDisbursement = custDisbursement;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(String dateDone) {
		this.dateDone = dateDone;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getIntRate() {
		return this.intRate;
	}

	public void setIntRate(BigDecimal intRate) {
		this.intRate = intRate;
	}

	public String getLastPaymentDate() {
		return this.lastPaymentDate;
	}

	public void setLastPaymentDate(String lastPaymentDate) {
		this.lastPaymentDate = lastPaymentDate;
	}

	public BigDecimal getLoanStatus() {
		return this.loanStatus;
	}

	public void setLoanStatus(BigDecimal loanStatus) {
		this.loanStatus = loanStatus;
	}

	public String getMaturityDate() {
		return this.maturityDate;
	}

	public void setMaturityDate(String maturityDate) {
		this.maturityDate = maturityDate;
	}

	public BigDecimal getPrevPostBal() {
		return this.prevPostBal;
	}

	public void setPrevPostBal(BigDecimal prevPostBal) {
		this.prevPostBal = prevPostBal;
	}

	public BigDecimal getPreviousBal() {
		return this.previousBal;
	}

	public void setPreviousBal(BigDecimal previousBal) {
		this.previousBal = previousBal;
	}

	public BigDecimal getPrincipalAmt() {
		return this.principalAmt;
	}

	public void setPrincipalAmt(BigDecimal principalAmt) {
		this.principalAmt = principalAmt;
	}

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getTranxAmt() {
		return this.tranxAmt;
	}

	public void setTranxAmt(BigDecimal tranxAmt) {
		this.tranxAmt = tranxAmt;
	}

	public String getYorm() {
		return this.yorm;
	}

	public void setYorm(String yorm) {
		this.yorm = yorm;
	}

}