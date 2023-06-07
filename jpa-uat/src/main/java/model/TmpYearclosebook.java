package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TMP_YEARCLOSEBOOK database table.
 * 
 */
@Entity
@Table(name="TMP_YEARCLOSEBOOK")
@NamedQuery(name="TmpYearclosebook.findAll", query="SELECT t FROM TmpYearclosebook t")
public class TmpYearclosebook implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCT_ID")
	private BigDecimal acctId;

	@Column(name="ACCT_TYPE_ID")
	private BigDecimal acctTypeId;

	private String acctdesc;

	private String acctdorc;

	private String acctname;

	private BigDecimal amt;

	private BigDecimal bal;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	@Column(name="DATE_DONE")
	private Object dateDone;

	private String description;

	private String dorc;

	private BigDecimal recnum;

	private BigDecimal ttid;

	public TmpYearclosebook() {
	}

	public BigDecimal getAcctId() {
		return this.acctId;
	}

	public void setAcctId(BigDecimal acctId) {
		this.acctId = acctId;
	}

	public BigDecimal getAcctTypeId() {
		return this.acctTypeId;
	}

	public void setAcctTypeId(BigDecimal acctTypeId) {
		this.acctTypeId = acctTypeId;
	}

	public String getAcctdesc() {
		return this.acctdesc;
	}

	public void setAcctdesc(String acctdesc) {
		this.acctdesc = acctdesc;
	}

	public String getAcctdorc() {
		return this.acctdorc;
	}

	public void setAcctdorc(String acctdorc) {
		this.acctdorc = acctdorc;
	}

	public String getAcctname() {
		return this.acctname;
	}

	public void setAcctname(String acctname) {
		this.acctname = acctname;
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

	public BigDecimal getCurrId() {
		return this.currId;
	}

	public void setCurrId(BigDecimal currId) {
		this.currId = currId;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDorc() {
		return this.dorc;
	}

	public void setDorc(String dorc) {
		this.dorc = dorc;
	}

	public BigDecimal getRecnum() {
		return this.recnum;
	}

	public void setRecnum(BigDecimal recnum) {
		this.recnum = recnum;
	}

	public BigDecimal getTtid() {
		return this.ttid;
	}

	public void setTtid(BigDecimal ttid) {
		this.ttid = ttid;
	}

}