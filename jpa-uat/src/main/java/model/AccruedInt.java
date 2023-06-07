package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ACCRUED_INT database table.
 * 
 */
@Entity
@Table(name="ACCRUED_INT")
@NamedQuery(name="AccruedInt.findAll", query="SELECT a FROM AccruedInt a")
public class AccruedInt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="ACCRUED_DATE")
	private Object accruedDate;

	private BigDecimal amount;

	private BigDecimal amt;

	private BigDecimal balance;

	private BigDecimal custacctid;

	@Column(name="MATURE_DATE")
	private Object matureDate;

	private String settled;

	public AccruedInt() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Object getAccruedDate() {
		return this.accruedDate;
	}

	public void setAccruedDate(Object accruedDate) {
		this.accruedDate = accruedDate;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getAmt() {
		return this.amt;
	}

	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}

	public BigDecimal getBalance() {
		return this.balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public BigDecimal getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(BigDecimal custacctid) {
		this.custacctid = custacctid;
	}

	public Object getMatureDate() {
		return this.matureDate;
	}

	public void setMatureDate(Object matureDate) {
		this.matureDate = matureDate;
	}

	public String getSettled() {
		return this.settled;
	}

	public void setSettled(String settled) {
		this.settled = settled;
	}

}