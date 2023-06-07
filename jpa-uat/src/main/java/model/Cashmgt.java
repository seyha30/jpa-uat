package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CASHMGT database table.
 * 
 */
@Entity
@NamedQuery(name="Cashmgt.findAll", query="SELECT c FROM Cashmgt c")
public class Cashmgt implements Serializable {
	private static final long serialVersionUID = 1L;

	private String acctno;

	private BigDecimal amt;

	private BigDecimal bal;

	@Column(name="CASH_MGT_ID")
	private BigDecimal cashMgtId;

	private BigDecimal cashin;

	private BigDecimal cashmgtid;

	private BigDecimal cashout;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	@Column(name="\"INOUT\"")
	private String inout;

	private String tellerid;

	private String tellername;

	@Column(name="\"TIME\"")
	private String time;

	private String towho;

	public Cashmgt() {
	}

	public String getAcctno() {
		return this.acctno;
	}

	public void setAcctno(String acctno) {
		this.acctno = acctno;
	}

	public BigDecimal getAmt() {
		return this.amt;
	}

	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}

	public BigDecimal getBal() {
		return this.bal;
	}

	public void setBal(BigDecimal bal) {
		this.bal = bal;
	}

	public BigDecimal getCashMgtId() {
		return this.cashMgtId;
	}

	public void setCashMgtId(BigDecimal cashMgtId) {
		this.cashMgtId = cashMgtId;
	}

	public BigDecimal getCashin() {
		return this.cashin;
	}

	public void setCashin(BigDecimal cashin) {
		this.cashin = cashin;
	}

	public BigDecimal getCashmgtid() {
		return this.cashmgtid;
	}

	public void setCashmgtid(BigDecimal cashmgtid) {
		this.cashmgtid = cashmgtid;
	}

	public BigDecimal getCashout() {
		return this.cashout;
	}

	public void setCashout(BigDecimal cashout) {
		this.cashout = cashout;
	}

	public BigDecimal getCurrId() {
		return this.currId;
	}

	public void setCurrId(BigDecimal currId) {
		this.currId = currId;
	}

	public String getInout() {
		return this.inout;
	}

	public void setInout(String inout) {
		this.inout = inout;
	}

	public String getTellerid() {
		return this.tellerid;
	}

	public void setTellerid(String tellerid) {
		this.tellerid = tellerid;
	}

	public String getTellername() {
		return this.tellername;
	}

	public void setTellername(String tellername) {
		this.tellername = tellername;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTowho() {
		return this.towho;
	}

	public void setTowho(String towho) {
		this.towho = towho;
	}

}