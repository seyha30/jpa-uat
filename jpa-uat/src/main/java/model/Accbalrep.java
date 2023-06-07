package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ACCBALREP database table.
 * 
 */
@Entity
@NamedQuery(name="Accbalrep.findAll", query="SELECT a FROM Accbalrep a")
public class Accbalrep implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String acctno;

	private String accttype;

	private BigDecimal availablebal;

	private String ccy;

	private String custname;

	private BigDecimal freezebal;

	private BigDecimal intaccmon;

	private BigDecimal intaccytd;

	private BigDecimal ledgerbal;

	private BigDecimal odlimit;

	private BigDecimal unclearedbal;

	public Accbalrep() {
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

	public BigDecimal getAvailablebal() {
		return this.availablebal;
	}

	public void setAvailablebal(BigDecimal availablebal) {
		this.availablebal = availablebal;
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

	public BigDecimal getIntaccmon() {
		return this.intaccmon;
	}

	public void setIntaccmon(BigDecimal intaccmon) {
		this.intaccmon = intaccmon;
	}

	public BigDecimal getIntaccytd() {
		return this.intaccytd;
	}

	public void setIntaccytd(BigDecimal intaccytd) {
		this.intaccytd = intaccytd;
	}

	public BigDecimal getLedgerbal() {
		return this.ledgerbal;
	}

	public void setLedgerbal(BigDecimal ledgerbal) {
		this.ledgerbal = ledgerbal;
	}

	public BigDecimal getOdlimit() {
		return this.odlimit;
	}

	public void setOdlimit(BigDecimal odlimit) {
		this.odlimit = odlimit;
	}

	public BigDecimal getUnclearedbal() {
		return this.unclearedbal;
	}

	public void setUnclearedbal(BigDecimal unclearedbal) {
		this.unclearedbal = unclearedbal;
	}

}