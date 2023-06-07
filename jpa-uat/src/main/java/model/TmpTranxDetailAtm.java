package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TMP_TRANX_DETAIL_ATM database table.
 * 
 */
@Entity
@Table(name="TMP_TRANX_DETAIL_ATM")
@NamedQuery(name="TmpTranxDetailAtm.findAll", query="SELECT t FROM TmpTranxDetailAtm t")
public class TmpTranxDetailAtm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCT_ID")
	private BigDecimal acctId;

	private BigDecimal amt;

	private BigDecimal bal;

	@Column(name="CST_NAME")
	private String cstName;

	private String custno;

	@Column(name="DATE_DONE")
	private Object dateDone;

	@Column(name="DONE_BY")
	private String doneBy;

	private String dorc;

	private BigDecimal prevbal;

	private BigDecimal sumc;

	private BigDecimal sumd;

	private String time1;

	@Column(name="TRANX_DETAIL_ID")
	private BigDecimal tranxDetailId;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	private BigDecimal ytdbal;

	public TmpTranxDetailAtm() {
	}

	public BigDecimal getAcctId() {
		return this.acctId;
	}

	public void setAcctId(BigDecimal acctId) {
		this.acctId = acctId;
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

	public String getCstName() {
		return this.cstName;
	}

	public void setCstName(String cstName) {
		this.cstName = cstName;
	}

	public String getCustno() {
		return this.custno;
	}

	public void setCustno(String custno) {
		this.custno = custno;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public String getDoneBy() {
		return this.doneBy;
	}

	public void setDoneBy(String doneBy) {
		this.doneBy = doneBy;
	}

	public String getDorc() {
		return this.dorc;
	}

	public void setDorc(String dorc) {
		this.dorc = dorc;
	}

	public BigDecimal getPrevbal() {
		return this.prevbal;
	}

	public void setPrevbal(BigDecimal prevbal) {
		this.prevbal = prevbal;
	}

	public BigDecimal getSumc() {
		return this.sumc;
	}

	public void setSumc(BigDecimal sumc) {
		this.sumc = sumc;
	}

	public BigDecimal getSumd() {
		return this.sumd;
	}

	public void setSumd(BigDecimal sumd) {
		this.sumd = sumd;
	}

	public String getTime1() {
		return this.time1;
	}

	public void setTime1(String time1) {
		this.time1 = time1;
	}

	public BigDecimal getTranxDetailId() {
		return this.tranxDetailId;
	}

	public void setTranxDetailId(BigDecimal tranxDetailId) {
		this.tranxDetailId = tranxDetailId;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

	public BigDecimal getYtdbal() {
		return this.ytdbal;
	}

	public void setYtdbal(BigDecimal ytdbal) {
		this.ytdbal = ytdbal;
	}

}