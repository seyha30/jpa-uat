package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the LOAN_ACCRUED_JOIN database table.
 * 
 */
@Entity
@Table(name="LOAN_ACCRUED_JOIN")
@NamedQuery(name="LoanAccruedJoin.findAll", query="SELECT l FROM LoanAccruedJoin l")
public class LoanAccruedJoin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCOUNT_NO")
	private String accountNo;

	private BigDecimal balance;

	@Column(name="CUSTOMER_NAME")
	private String customerName;

	private String flag;

	@Column(name="PREVIOUS_BALANCE")
	private BigDecimal previousBalance;

	@Column(name="TRANSACTION_AMT")
	private BigDecimal transactionAmt;

	public LoanAccruedJoin() {
	}

	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public BigDecimal getBalance() {
		return this.balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public BigDecimal getPreviousBalance() {
		return this.previousBalance;
	}

	public void setPreviousBalance(BigDecimal previousBalance) {
		this.previousBalance = previousBalance;
	}

	public BigDecimal getTransactionAmt() {
		return this.transactionAmt;
	}

	public void setTransactionAmt(BigDecimal transactionAmt) {
		this.transactionAmt = transactionAmt;
	}

}