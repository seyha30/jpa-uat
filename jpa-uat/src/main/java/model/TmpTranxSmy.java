package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TMP_TRANX_SMY database table.
 * 
 */
@Entity
@Table(name="TMP_TRANX_SMY")
@NamedQuery(name="TmpTranxSmy.findAll", query="SELECT t FROM TmpTranxSmy t")
public class TmpTranxSmy implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCT_ID")
	private BigDecimal acctId;

	@Column(name="ACCT_TYPE_ID")
	private BigDecimal acctTypeId;

	private BigDecimal balcr;

	private BigDecimal baldr;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	@Column(name="DATE_DONE")
	private Object dateDone;

	private BigDecimal opencr;

	private BigDecimal opendr;

	private BigDecimal recnum;

	private BigDecimal sumcr;

	private BigDecimal sumdr;

	public TmpTranxSmy() {
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

	public BigDecimal getBalcr() {
		return this.balcr;
	}

	public void setBalcr(BigDecimal balcr) {
		this.balcr = balcr;
	}

	public BigDecimal getBaldr() {
		return this.baldr;
	}

	public void setBaldr(BigDecimal baldr) {
		this.baldr = baldr;
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

	public BigDecimal getOpencr() {
		return this.opencr;
	}

	public void setOpencr(BigDecimal opencr) {
		this.opencr = opencr;
	}

	public BigDecimal getOpendr() {
		return this.opendr;
	}

	public void setOpendr(BigDecimal opendr) {
		this.opendr = opendr;
	}

	public BigDecimal getRecnum() {
		return this.recnum;
	}

	public void setRecnum(BigDecimal recnum) {
		this.recnum = recnum;
	}

	public BigDecimal getSumcr() {
		return this.sumcr;
	}

	public void setSumcr(BigDecimal sumcr) {
		this.sumcr = sumcr;
	}

	public BigDecimal getSumdr() {
		return this.sumdr;
	}

	public void setSumdr(BigDecimal sumdr) {
		this.sumdr = sumdr;
	}

}