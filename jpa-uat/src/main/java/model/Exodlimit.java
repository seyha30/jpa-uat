package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the EXODLIMIT database table.
 * 
 */
@Entity
@NamedQuery(name="Exodlimit.findAll", query="SELECT e FROM Exodlimit e")
public class Exodlimit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long recnum;

	private String acctno;

	private String accttype;

	private BigDecimal avaibal;

	private String ccy;

	private String custname;

	private BigDecimal exceededod;

	@Column(name="INT_RATE")
	private BigDecimal intRate;

	private BigDecimal ledgerbal;

	private BigDecimal odbal;

	private BigDecimal odlimit;

	private BigDecimal totaccint;

	private BigDecimal unclearedbal;

	public Exodlimit() {
	}

	public long getRecnum() {
		return this.recnum;
	}

	public void setRecnum(long recnum) {
		this.recnum = recnum;
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

	public BigDecimal getExceededod() {
		return this.exceededod;
	}

	public void setExceededod(BigDecimal exceededod) {
		this.exceededod = exceededod;
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

	public BigDecimal getTotaccint() {
		return this.totaccint;
	}

	public void setTotaccint(BigDecimal totaccint) {
		this.totaccint = totaccint;
	}

	public BigDecimal getUnclearedbal() {
		return this.unclearedbal;
	}

	public void setUnclearedbal(BigDecimal unclearedbal) {
		this.unclearedbal = unclearedbal;
	}

}