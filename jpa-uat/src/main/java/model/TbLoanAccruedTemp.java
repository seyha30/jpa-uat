package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TB_LOAN_ACCRUED_TEMP database table.
 * 
 */
@Entity
@Table(name="TB_LOAN_ACCRUED_TEMP")
@NamedQuery(name="TbLoanAccruedTemp.findAll", query="SELECT t FROM TbLoanAccruedTemp t")
public class TbLoanAccruedTemp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCOUNT_NO")
	private String accountNo;

	private BigDecimal balance;

	@Column(name="CUSTOMER_NAME")
	private String customerName;

	private String descriptoin;

	@Column(name="PREVIOUS_BALANCE")
	private BigDecimal previousBalance;

	public TbLoanAccruedTemp() {
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

	public String getDescriptoin() {
		return this.descriptoin;
	}

	public void setDescriptoin(String descriptoin) {
		this.descriptoin = descriptoin;
	}

	public BigDecimal getPreviousBalance() {
		return this.previousBalance;
	}

	public void setPreviousBalance(BigDecimal previousBalance) {
		this.previousBalance = previousBalance;
	}

}