package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the DAILY_LOAN_TRNX database table.
 * 
 */
@Entity
@Table(name="DAILY_LOAN_TRNX")
@NamedQuery(name="DailyLoanTrnx.findAll", query="SELECT d FROM DailyLoanTrnx d")
public class DailyLoanTrnx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCOUNT_NO")
	private String accountNo;

	private BigDecimal balance;

	@Column(name="DATE_DONE")
	private Object dateDone;

	@Column(name="PREVOUS_BAL")
	private BigDecimal prevousBal;

	@Column(name="TRAN_AMT")
	private BigDecimal tranAmt;

	public DailyLoanTrnx() {
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

	public BigDecimal getPrevousBal() {
		return this.prevousBal;
	}

	public void setPrevousBal(BigDecimal prevousBal) {
		this.prevousBal = prevousBal;
	}

	public BigDecimal getTranAmt() {
		return this.tranAmt;
	}

	public void setTranAmt(BigDecimal tranAmt) {
		this.tranAmt = tranAmt;
	}

}