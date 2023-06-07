package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ODLIMIT database table.
 * 
 */
@Entity
@NamedQuery(name="Odlimit.findAll", query="SELECT o FROM Odlimit o")
public class Odlimit implements Serializable {
	private static final long serialVersionUID = 1L;

	private String acctno;

	private String accttype;

	private BigDecimal avaibal;

	private String ccy;

	private String custname;

	private BigDecimal freezebal;

	@Column(name="INT_RATE")
	private BigDecimal intRate;

	private BigDecimal ledgerbal;

	@Column(name="MAT_DATE")
	private String matDate;

	private BigDecimal odbal;

	private BigDecimal odlimit;

	@Column(name="PREV_BAL")
	private BigDecimal prevBal;

	private BigDecimal unclearedbal;

	public Odlimit() {
	}

	public String getAcctno() {
		return this.acctno;
	}

	public void setAcctno(String acctno) {
		this.acctno = acctno;
	}

	public String getAccttype() {
		return this.accttype;
	}

	public void setAccttype(String accttype) {
		this.accttype = accttype;
	}

	public BigDecimal getAvaibal() {
		return this.avaibal;
	}

	public void setAvaibal(BigDecimal avaibal) {
		this.avaibal = avaibal;
	}

	public String getCcy() {
		return this.ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public String getCustname() {
		return this.custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public BigDecimal getFreezebal() {
		return this.freezebal;
	}

	public void setFreezebal(BigDecimal freezebal) {
		this.freezebal = freezebal;
	}

	public BigDecimal getIntRate() {
		return this.intRate;
	}

	public void setIntRate(BigDecimal intRate) {
		this.intRate = intRate;
	}

	public BigDecimal getLedgerbal() {
		return this.ledgerbal;
	}

	public void setLedgerbal(BigDecimal ledgerbal) {
		this.ledgerbal = ledgerbal;
	}

	public String getMatDate() {
		return this.matDate;
	}

	public void setMatDate(String matDate) {
		this.matDate = matDate;
	}

	public BigDecimal getOdbal() {
		return this.odbal;
	}

	public void setOdbal(BigDecimal odbal) {
		this.odbal = odbal;
	}

	public BigDecimal getOdlimit() {
		return this.odlimit;
	}

	public void setOdlimit(BigDecimal odlimit) {
		this.odlimit = odlimit;
	}

	public BigDecimal getPrevBal() {
		return this.prevBal;
	}

	public void setPrevBal(BigDecimal prevBal) {
		this.prevBal = prevBal;
	}

	public BigDecimal getUnclearedbal() {
		return this.unclearedbal;
	}

	public void setUnclearedbal(BigDecimal unclearedbal) {
		this.unclearedbal = unclearedbal;
	}

}