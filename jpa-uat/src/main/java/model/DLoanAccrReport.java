package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the D_LOAN_ACCR_REPORT database table.
 * 
 */
@Entity
@Table(name="D_LOAN_ACCR_REPORT")
@NamedQuery(name="DLoanAccrReport.findAll", query="SELECT d FROM DLoanAccrReport d")
public class DLoanAccrReport implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCOUNT_NO")
	private String accountNo;

	@Column(name="BALANCE_CREDIT")
	private BigDecimal balanceCredit;

	@Column(name="BALANCE_DEBIT")
	private BigDecimal balanceDebit;

	@Column(name="CUSTOMER_NAME")
	private String customerName;

	@Column(name="DATE_DONE")
	private Object dateDone;

	private String description;

	@Column(name="PREVIOUS_BALANCE_CREDIT")
	private BigDecimal previousBalanceCredit;

	@Column(name="PREVIOUS_BALANCE_DEBIT")
	private BigDecimal previousBalanceDebit;

	@Column(name="REF_NO")
	private String refNo;

	private String status;

	@Column(name="TRANSACTION_AMOUNT_CREDIT")
	private BigDecimal transactionAmountCredit;

	@Column(name="TRANSACTION_AMOUNT_DEBIT")
	private BigDecimal transactionAmountDebit;

	public DLoanAccrReport() {
	}

	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public BigDecimal getBalanceCredit() {
		return this.balanceCredit;
	}

	public void setBalanceCredit(BigDecimal balanceCredit) {
		this.balanceCredit = balanceCredit;
	}

	public BigDecimal getBalanceDebit() {
		return this.balanceDebit;
	}

	public void setBalanceDebit(BigDecimal balanceDebit) {
		this.balanceDebit = balanceDebit;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPreviousBalanceCredit() {
		return this.previousBalanceCredit;
	}

	public void setPreviousBalanceCredit(BigDecimal previousBalanceCredit) {
		this.previousBalanceCredit = previousBalanceCredit;
	}

	public BigDecimal getPreviousBalanceDebit() {
		return this.previousBalanceDebit;
	}

	public void setPreviousBalanceDebit(BigDecimal previousBalanceDebit) {
		this.previousBalanceDebit = previousBalanceDebit;
	}

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getTransactionAmountCredit() {
		return this.transactionAmountCredit;
	}

	public void setTransactionAmountCredit(BigDecimal transactionAmountCredit) {
		this.transactionAmountCredit = transactionAmountCredit;
	}

	public BigDecimal getTransactionAmountDebit() {
		return this.transactionAmountDebit;
	}

	public void setTransactionAmountDebit(BigDecimal transactionAmountDebit) {
		this.transactionAmountDebit = transactionAmountDebit;
	}

}