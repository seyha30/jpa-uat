package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TB_DAILY_LOAN_TRNX database table.
 * 
 */
@Entity
@Table(name="TB_DAILY_LOAN_TRNX")
@NamedQuery(name="TbDailyLoanTrnx.findAll", query="SELECT t FROM TbDailyLoanTrnx t")
public class TbDailyLoanTrnx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCOUNT_NO")
	private String accountNo;

	private BigDecimal balance;

	@Column(name="DATE_DONE")
	private Object dateDone;

	@Column(name="PREVIOUS_BALANCE")
	private BigDecimal previousBalance;

	@Column(name="REFERENT_NO")
	private String referentNo;

	@Column(name="TRANX_AMT")
	private BigDecimal tranxAmt;

	public TbDailyLoanTrnx() {
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

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public BigDecimal getPreviousBalance() {
		return this.previousBalance;
	}

	public void setPreviousBalance(BigDecimal previousBalance) {
		this.previousBalance = previousBalance;
	}

	public String getReferentNo() {
		return this.referentNo;
	}

	public void setReferentNo(String referentNo) {
		this.referentNo = referentNo;
	}

	public BigDecimal getTranxAmt() {
		return this.tranxAmt;
	}

	public void setTranxAmt(BigDecimal tranxAmt) {
		this.tranxAmt = tranxAmt;
	}

}