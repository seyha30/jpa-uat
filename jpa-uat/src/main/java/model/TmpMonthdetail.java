package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TMP_MONTHDETAIL database table.
 * 
 */
@Entity
@Table(name="TMP_MONTHDETAIL")
@NamedQuery(name="TmpMonthdetail.findAll", query="SELECT t FROM TmpMonthdetail t")
public class TmpMonthdetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCT_ID")
	private BigDecimal acctId;

	@Column(name="ACCT_TYPE_ID")
	private BigDecimal acctTypeId;

	private String acctdesc;

	private String acctname;

	private BigDecimal amt;

	private BigDecimal bal;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	private String custacctid;

	@Column(name="DATE_DONE")
	private String dateDone;

	private String description;

	private String dorc;

	private BigDecimal recnum;

	private BigDecimal tranxid;

	public TmpMonthdetail() {
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

	public String getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(String custacctid) {
		this.custacctid = custacctid;
	}

	public String getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(String dateDone) {
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

	public BigDecimal getTranxid() {
		return this.tranxid;
	}

	public void setTranxid(BigDecimal tranxid) {
		this.tranxid = tranxid;
	}

}