package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TEM_TRANX_MASTER database table.
 * 
 */
@Entity
@Table(name="TEM_TRANX_MASTER")
@NamedQuery(name="TemTranxMaster.findAll", query="SELECT t FROM TemTranxMaster t")
public class TemTranxMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCT_DES")
	private String acctDes;

	@Column(name="ACCT_ID")
	private BigDecimal acctId;

	@Column(name="ACCT_NAME")
	private String acctName;

	private BigDecimal amt;

	private BigDecimal ba;

	@Column(name="CON_DES")
	private String conDes;

	@Column(name="CON_NAME")
	private String conName;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	@Column(name="DATE_DONE")
	private Object dateDone;

	private String dorc;

	@Column(name="GL_END_BAL")
	private BigDecimal glEndBal;

	@Column(name="GL_PRE_BAL")
	private BigDecimal glPreBal;

	@Column(name="GROUP_ID")
	private BigDecimal groupId;

	@Column(name="TRANX_DES")
	private String tranxDes;

	@Column(name="TRANX_DETAIL_ID")
	private BigDecimal tranxDetailId;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	public TemTranxMaster() {
	}

	public String getAcctDes() {
		return this.acctDes;
	}

	public void setAcctDes(String acctDes) {
		this.acctDes = acctDes;
	}

	public BigDecimal getAcctId() {
		return this.acctId;
	}

	public void setAcctId(BigDecimal acctId) {
		this.acctId = acctId;
	}

	public String getAcctName() {
		return this.acctName;
	}

	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}

	public BigDecimal getAmt() {
		return this.amt;
	}

	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}

	public BigDecimal getBa() {
		return this.ba;
	}

	public void setBa(BigDecimal ba) {
		this.ba = ba;
	}

	public String getConDes() {
		return this.conDes;
	}

	public void setConDes(String conDes) {
		this.conDes = conDes;
	}

	public String getConName() {
		return this.conName;
	}

	public void setConName(String conName) {
		this.conName = conName;
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

	public String getDorc() {
		return this.dorc;
	}

	public void setDorc(String dorc) {
		this.dorc = dorc;
	}

	public BigDecimal getGlEndBal() {
		return this.glEndBal;
	}

	public void setGlEndBal(BigDecimal glEndBal) {
		this.glEndBal = glEndBal;
	}

	public BigDecimal getGlPreBal() {
		return this.glPreBal;
	}

	public void setGlPreBal(BigDecimal glPreBal) {
		this.glPreBal = glPreBal;
	}

	public BigDecimal getGroupId() {
		return this.groupId;
	}

	public void setGroupId(BigDecimal groupId) {
		this.groupId = groupId;
	}

	public String getTranxDes() {
		return this.tranxDes;
	}

	public void setTranxDes(String tranxDes) {
		this.tranxDes = tranxDes;
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

}