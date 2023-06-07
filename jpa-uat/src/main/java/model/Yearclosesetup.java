package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the YEARCLOSESETUP database table.
 * 
 */
@Entity
@NamedQuery(name="Yearclosesetup.findAll", query="SELECT y FROM Yearclosesetup y")
public class Yearclosesetup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="BR_ID")
	private BigDecimal brId;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	@Column(name="FCC_ACCT_ID")
	private BigDecimal fccAcctId;

	@Column(name="PL_ACCT_ID")
	private BigDecimal plAcctId;

	public Yearclosesetup() {
	}

	public BigDecimal getBrId() {
		return this.brId;
	}

	public void setBrId(BigDecimal brId) {
		this.brId = brId;
	}

	public BigDecimal getCurrId() {
		return this.currId;
	}

	public void setCurrId(BigDecimal currId) {
		this.currId = currId;
	}

	public BigDecimal getFccAcctId() {
		return this.fccAcctId;
	}

	public void setFccAcctId(BigDecimal fccAcctId) {
		this.fccAcctId = fccAcctId;
	}

	public BigDecimal getPlAcctId() {
		return this.plAcctId;
	}

	public void setPlAcctId(BigDecimal plAcctId) {
		this.plAcctId = plAcctId;
	}

}