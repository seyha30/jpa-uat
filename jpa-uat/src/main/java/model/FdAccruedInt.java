package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FD_ACCRUED_INT database table.
 * 
 */
@Entity
@Table(name="FD_ACCRUED_INT")
@NamedQuery(name="FdAccruedInt.findAll", query="SELECT f FROM FdAccruedInt f")
public class FdAccruedInt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="ACCRUED_DATE")
	private Object accruedDate;

	private BigDecimal amount;

	private BigDecimal amt;

	private BigDecimal balance;

	private BigDecimal custacctid;

	@Column(name="FD_ID")
	private BigDecimal fdId;

	@Column(name="MATURE_DATE")
	private Object matureDate;

	private String settled;

	public FdAccruedInt() {
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

	public BigDecimal getFdId() {
		return this.fdId;
	}

	public void setFdId(BigDecimal fdId) {
		this.fdId = fdId;
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