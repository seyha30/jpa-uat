package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CAINTEREST database table.
 * 
 */
@Entity
@NamedQuery(name="Cainterest.findAll", query="SELECT c FROM Cainterest c")
public class Cainterest implements Serializable {
	private static final long serialVersionUID = 1L;

	private String custacct;

	private BigDecimal custacctid;

	private BigDecimal idsa;

	@Column(name="INT_AMT")
	private BigDecimal intAmt;

	@Column(name="INT_DATE")
	private Object intDate;

	@Column(name="INT_RATE")
	private BigDecimal intRate;

	private String name;

	private BigDecimal tax;

	private BigDecimal totalbal;

	public Cainterest() {
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

	public BigDecimal getIdsa() {
		return this.idsa;
	}

	public void setIdsa(BigDecimal idsa) {
		this.idsa = idsa;
	}

	public BigDecimal getIntAmt() {
		return this.intAmt;
	}

	public void setIntAmt(BigDecimal intAmt) {
		this.intAmt = intAmt;
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

	public BigDecimal getTax() {
		return this.tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	public BigDecimal getTotalbal() {
		return this.totalbal;
	}

	public void setTotalbal(BigDecimal totalbal) {
		this.totalbal = totalbal;
	}

}