package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TMP_CASHIERFLOW database table.
 * 
 */
@Entity
@Table(name="TMP_CASHIERFLOW")
@NamedQuery(name="TmpCashierflow.findAll", query="SELECT t FROM TmpCashierflow t")
public class TmpCashierflow implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal balance;

	private BigDecimal cashin;

	private BigDecimal cashmgtid;

	private BigDecimal cashout;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	@Column(name="DATE_DONE")
	private String dateDone;

	private BigDecimal openbal;

	private String teller;

	public TmpCashierflow() {
	}

	public BigDecimal getBalance() {
		return this.balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
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

	public String getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(String dateDone) {
		this.dateDone = dateDone;
	}

	public BigDecimal getOpenbal() {
		return this.openbal;
	}

	public void setOpenbal(BigDecimal openbal) {
		this.openbal = openbal;
	}

	public String getTeller() {
		return this.teller;
	}

	public void setTeller(String teller) {
		this.teller = teller;
	}

}