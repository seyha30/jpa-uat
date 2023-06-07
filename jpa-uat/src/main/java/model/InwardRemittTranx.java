package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the INWARD_REMITT_TRANX database table.
 * 
 */
@Entity
@Table(name="INWARD_REMITT_TRANX")
@NamedQuery(name="InwardRemittTranx.findAll", query="SELECT i FROM InwardRemittTranx i")
public class InwardRemittTranx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCT_NON_ACCT")
	private String acctNonAcct;

	private BigDecimal amount;

	@Column(name="CLEAR_MODULE_ID")
	private BigDecimal clearModuleId;

	private String cleared;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	private BigDecimal custacctid;

	@Column(name="DATE_DONE")
	private Object dateDone;

	@Column(name="DONE_BY")
	private String doneBy;

	@Column(name="FCURR_ID")
	private BigDecimal fcurrId;

	@Column(name="FNOSTRO_GL")
	private BigDecimal fnostroGl;

	@Column(name="INWARD_REMIT_ID")
	private BigDecimal inwardRemitId;

	@Column(name="MODULE_ID")
	private BigDecimal moduleId;

	private String name;

	@Column(name="NOSTRO_ID")
	private BigDecimal nostroId;

	@Column(name="\"OLD\"")
	private String old;

	@Column(name="OVERRIDE_BY")
	private String overrideBy;

	@Column(name="OVERRIDE_DATE")
	private Object overrideDate;

	private String passport;

	@Column(name="PAY_TRANX_ID")
	private BigDecimal payTranxId;

	@Column(name="PAY_TRANX_NO")
	private BigDecimal payTranxNo;

	@Column(name="PENDING_MODULE_ID")
	private BigDecimal pendingModuleId;

	@Column(name="PENDING_TRANX_ID")
	private BigDecimal pendingTranxId;

	@Column(name="REFERENCE_NO")
	private String referenceNo;

	private String remark;

	private String remitter;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	@Column(name="VALUE_DATE")
	private Object valueDate;

	public InwardRemittTranx() {
	}

	public String getAcctNonAcct() {
		return this.acctNonAcct;
	}

	public void setAcctNonAcct(String acctNonAcct) {
		this.acctNonAcct = acctNonAcct;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getClearModuleId() {
		return this.clearModuleId;
	}

	public void setClearModuleId(BigDecimal clearModuleId) {
		this.clearModuleId = clearModuleId;
	}

	public String getCleared() {
		return this.cleared;
	}

	public void setCleared(String cleared) {
		this.cleared = cleared;
	}

	public BigDecimal getCurrId() {
		return this.currId;
	}

	public void setCurrId(BigDecimal currId) {
		this.currId = currId;
	}

	public BigDecimal getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(BigDecimal custacctid) {
		this.custacctid = custacctid;
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

	public BigDecimal getFcurrId() {
		return this.fcurrId;
	}

	public void setFcurrId(BigDecimal fcurrId) {
		this.fcurrId = fcurrId;
	}

	public BigDecimal getFnostroGl() {
		return this.fnostroGl;
	}

	public void setFnostroGl(BigDecimal fnostroGl) {
		this.fnostroGl = fnostroGl;
	}

	public BigDecimal getInwardRemitId() {
		return this.inwardRemitId;
	}

	public void setInwardRemitId(BigDecimal inwardRemitId) {
		this.inwardRemitId = inwardRemitId;
	}

	public BigDecimal getModuleId() {
		return this.moduleId;
	}

	public void setModuleId(BigDecimal moduleId) {
		this.moduleId = moduleId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getNostroId() {
		return this.nostroId;
	}

	public void setNostroId(BigDecimal nostroId) {
		this.nostroId = nostroId;
	}

	public String getOld() {
		return this.old;
	}

	public void setOld(String old) {
		this.old = old;
	}

	public String getOverrideBy() {
		return this.overrideBy;
	}

	public void setOverrideBy(String overrideBy) {
		this.overrideBy = overrideBy;
	}

	public Object getOverrideDate() {
		return this.overrideDate;
	}

	public void setOverrideDate(Object overrideDate) {
		this.overrideDate = overrideDate;
	}

	public String getPassport() {
		return this.passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public BigDecimal getPayTranxId() {
		return this.payTranxId;
	}

	public void setPayTranxId(BigDecimal payTranxId) {
		this.payTranxId = payTranxId;
	}

	public BigDecimal getPayTranxNo() {
		return this.payTranxNo;
	}

	public void setPayTranxNo(BigDecimal payTranxNo) {
		this.payTranxNo = payTranxNo;
	}

	public BigDecimal getPendingModuleId() {
		return this.pendingModuleId;
	}

	public void setPendingModuleId(BigDecimal pendingModuleId) {
		this.pendingModuleId = pendingModuleId;
	}

	public BigDecimal getPendingTranxId() {
		return this.pendingTranxId;
	}

	public void setPendingTranxId(BigDecimal pendingTranxId) {
		this.pendingTranxId = pendingTranxId;
	}

	public String getReferenceNo() {
		return this.referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemitter() {
		return this.remitter;
	}

	public void setRemitter(String remitter) {
		this.remitter = remitter;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

	public Object getValueDate() {
		return this.valueDate;
	}

	public void setValueDate(Object valueDate) {
		this.valueDate = valueDate;
	}

}