package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TMP_SACADETAIL database table.
 * 
 */
@Entity
@Table(name="TMP_SACADETAIL")
@NamedQuery(name="TmpSacadetail.findAll", query="SELECT t FROM TmpSacadetail t")
public class TmpSacadetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCT_TYPE_ID")
	private BigDecimal acctTypeId;

	private BigDecimal amt;

	private BigDecimal bal;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	private String custacctid;

	private BigDecimal custid;

	private String custname;

	@Column(name="DATE_DONE")
	private String dateDone;

	private String description;

	private String dorc;

	private BigDecimal recnum;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	public TmpSacadetail() {
	}

	public BigDecimal getAcctTypeId() {
		return this.acctTypeId;
	}

	public void setAcctTypeId(BigDecimal acctTypeId) {
		this.acctTypeId = acctTypeId;
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

	public BigDecimal getCustid() {
		return this.custid;
	}

	public void setCustid(BigDecimal custid) {
		this.custid = custid;
	}

	public String getCustname() {
		return this.custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
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

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

}