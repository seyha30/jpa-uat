package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the LOAN_ACCRUED_TEMP database table.
 * 
 */
@Entity
@Table(name="LOAN_ACCRUED_TEMP")
@NamedQuery(name="LoanAccruedTemp.findAll", query="SELECT l FROM LoanAccruedTemp l")
public class LoanAccruedTemp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCOUNT_NO")
	private String accountNo;

	private BigDecimal balance;

	@Column(name="CUSTOMER_NAME")
	private String customerName;

	private String description;

	@Column(name="LOAN_STATUS")
	private BigDecimal loanStatus;

	@Column(name="NBC_CODE")
	private BigDecimal nbcCode;

	@Column(name="PREVIOUS_BALANCE")
	private BigDecimal previousBalance;

	public LoanAccruedTemp() {
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getLoanStatus() {
		return this.loanStatus;
	}

	public void setLoanStatus(BigDecimal loanStatus) {
		this.loanStatus = loanStatus;
	}

	public BigDecimal getNbcCode() {
		return this.nbcCode;
	}

	public void setNbcCode(BigDecimal nbcCode) {
		this.nbcCode = nbcCode;
	}

	public BigDecimal getPreviousBalance() {
		return this.previousBalance;
	}

	public void setPreviousBalance(BigDecimal previousBalance) {
		this.previousBalance = previousBalance;
	}

}