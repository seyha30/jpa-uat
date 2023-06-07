package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ODRPTTMP database table.
 * 
 */
@Entity
@NamedQuery(name="Odrpttmp.findAll", query="SELECT o FROM Odrpttmp o")
public class Odrpttmp implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal balance;

	private String currency;

	private String custacct;

	private BigDecimal custacctid;

	@Column(name="INT_AMT")
	private BigDecimal intAmt;

	@Column(name="INT_RATE")
	private BigDecimal intRate;

	@Column(name="\"NAMES\"")
	private String names;

	@Column(name="OD_LIMIT")
	private BigDecimal odLimit;

	@Column(name="ODMAT_DATE")
	private Object odmatDate;

	private BigDecimal oduse;

	private BigDecimal prebal;

	@Column(name="START_DATE")
	private Object startDate;

	public Odrpttmp() {
	}

	public BigDecimal getBalance() {
		return this.balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCustacct() {
		return this.custacct;
	}

	public void setCustacct(String custacct) {
		this.custacct = custacct;
	}

	public BigDecimal getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(BigDecimal custacctid) {
		this.custacctid = custacctid;
	}

	public BigDecimal getIntAmt() {
		return this.intAmt;
	}

	public void setIntAmt(BigDecimal intAmt) {
		this.intAmt = intAmt;
	}

	public BigDecimal getIntRate() {
		return this.intRate;
	}

	public void setIntRate(BigDecimal intRate) {
		this.intRate = intRate;
	}

	public String getNames() {
		return this.names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public BigDecimal getOdLimit() {
		return this.odLimit;
	}

	public void setOdLimit(BigDecimal odLimit) {
		this.odLimit = odLimit;
	}

	public Object getOdmatDate() {
		return this.odmatDate;
	}

	public void setOdmatDate(Object odmatDate) {
		this.odmatDate = odmatDate;
	}

	public BigDecimal getOduse() {
		return this.oduse;
	}

	public void setOduse(BigDecimal oduse) {
		this.oduse = oduse;
	}

	public BigDecimal getPrebal() {
		return this.prebal;
	}

	public void setPrebal(BigDecimal prebal) {
		this.prebal = prebal;
	}

	public Object getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Object startDate) {
		this.startDate = startDate;
	}

}