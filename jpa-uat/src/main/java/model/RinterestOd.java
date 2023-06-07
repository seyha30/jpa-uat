package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the RINTEREST_OD database table.
 * 
 */
@Entity
@Table(name="RINTEREST_OD")
@NamedQuery(name="RinterestOd.findAll", query="SELECT r FROM RinterestOd r")
public class RinterestOd implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal amount;

	private BigDecimal balance;

	private String custacct;

	private BigDecimal custacctid;

	private BigDecimal id;

	@Column(name="INT_DATE")
	private Object intDate;

	@Column(name="INT_RATE")
	private BigDecimal intRate;

	private String name;

	private String yorm;

	public RinterestOd() {
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getBalance() {
		return this.balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
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

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public Object getIntDate() {
		return this.intDate;
	}

	public void setIntDate(Object intDate) {
		this.intDate = intDate;
	}

	public BigDecimal getIntRate() {
		return this.intRate;
	}

	public void setIntRate(BigDecimal intRate) {
		this.intRate = intRate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYorm() {
		return this.yorm;
	}

	public void setYorm(String yorm) {
		this.yorm = yorm;
	}

}