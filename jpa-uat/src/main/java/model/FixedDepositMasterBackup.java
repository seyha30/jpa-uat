package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FIXED_DEPOSIT_MASTER_BACKUP database table.
 * 
 */
@Entity
@Table(name="FIXED_DEPOSIT_MASTER_BACKUP")
@NamedQuery(name="FixedDepositMasterBackup.findAll", query="SELECT f FROM FixedDepositMasterBackup f")
public class FixedDepositMasterBackup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="APPLICATION_DATE")
	private Object applicationDate;

	@Column(name="AUTO_ROLLOVER")
	private String autoRollover;

	private String compound;

	@Column(name="COMPOUND_PRINCIPAL")
	private BigDecimal compoundPrincipal;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	private BigDecimal custacctid;

	@Column(name="DATE_DONE")
	private Object dateDone;

	private Object dd;

	@Column(name="DEPOSIT_CUSTACCTID")
	private BigDecimal depositCustacctid;

	@Column(name="FD_ID")
	private BigDecimal fdId;

	@Column(name="FIXED_DEPOSIT_REFNO")
	private String fixedDepositRefno;

	private BigDecimal freezedamt;

	@Column(name="INSURENCE_ID")
	private BigDecimal insurenceId;

	@Column(name="INT_ACCRUED_BALANCE")
	private BigDecimal intAccruedBalance;

	@Column(name="INT_ON_MATURITY")
	private BigDecimal intOnMaturity;

	@Column(name="INT_ON_PRE_MATURITY")
	private BigDecimal intOnPreMaturity;

	@Column(name="INT_POSTED")
	private BigDecimal intPosted;

	@Column(name="INT_POSTED_DATE")
	private Object intPostedDate;

	@Column(name="INT_RATE")
	private BigDecimal intRate;

	@Column(name="LAST_AUTOROLLOVER_INT")
	private BigDecimal lastAutorolloverInt;

	@Column(name="LAST_ROLLOVER_DATE")
	private Object lastRolloverDate;

	private BigDecimal latestpostedint;

	@Column(name="MATURED_POST")
	private String maturedPost;

	@Column(name="MATURITY_DATE")
	private Object maturityDate;

	@Column(name="PERIOD_ID")
	private BigDecimal periodId;

	@Column(name="PRE_INT_POST")
	private String preIntPost;

	@Column(name="PRE_MATURITY_DATE")
	private Object preMaturityDate;

	@Column(name="PRE_PERIOD_ID")
	private BigDecimal prePeriodId;

	private BigDecimal principal;

	private String remarks;

	private BigDecimal rolloverno;

	@Column(name="STATUS_ID")
	private BigDecimal statusId;

	private BigDecimal tax;

	@Column(name="TOTAL_PRINCIPAL")
	private BigDecimal totalPrincipal;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	@Column(name="VALUE_DATE")
	private Object valueDate;

	public FixedDepositMasterBackup() {
	}

	public Object getApplicationDate() {
		return this.applicationDate;
	}

	public void setApplicationDate(Object applicationDate) {
		this.applicationDate = applicationDate;
	}

	public String getAutoRollover() {
		return this.autoRollover;
	}

	public void setAutoRollover(String autoRollover) {
		this.autoRollover = autoRollover;
	}

	public String getCompound() {
		return this.compound;
	}

	public void setCompound(String compound) {
		this.compound = compound;
	}

	public BigDecimal getCompoundPrincipal() {
		return this.compoundPrincipal;
	}

	public void setCompoundPrincipal(BigDecimal compoundPrincipal) {
		this.compoundPrincipal = compoundPrincipal;
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

	public Object getDd() {
		return this.dd;
	}

	public void setDd(Object dd) {
		this.dd = dd;
	}

	public BigDecimal getDepositCustacctid() {
		return this.depositCustacctid;
	}

	public void setDepositCustacctid(BigDecimal depositCustacctid) {
		this.depositCustacctid = depositCustacctid;
	}

	public BigDecimal getFdId() {
		return this.fdId;
	}

	public void setFdId(BigDecimal fdId) {
		this.fdId = fdId;
	}

	public String getFixedDepositRefno() {
		return this.fixedDepositRefno;
	}

	public void setFixedDepositRefno(String fixedDepositRefno) {
		this.fixedDepositRefno = fixedDepositRefno;
	}

	public BigDecimal getFreezedamt() {
		return this.freezedamt;
	}

	public void setFreezedamt(BigDecimal freezedamt) {
		this.freezedamt = freezedamt;
	}

	public BigDecimal getInsurenceId() {
		return this.insurenceId;
	}

	public void setInsurenceId(BigDecimal insurenceId) {
		this.insurenceId = insurenceId;
	}

	public BigDecimal getIntAccruedBalance() {
		return this.intAccruedBalance;
	}

	public void setIntAccruedBalance(BigDecimal intAccruedBalance) {
		this.intAccruedBalance = intAccruedBalance;
	}

	public BigDecimal getIntOnMaturity() {
		return this.intOnMaturity;
	}

	public void setIntOnMaturity(BigDecimal intOnMaturity) {
		this.intOnMaturity = intOnMaturity;
	}

	public BigDecimal getIntOnPreMaturity() {
		return this.intOnPreMaturity;
	}

	public void setIntOnPreMaturity(BigDecimal intOnPreMaturity) {
		this.intOnPreMaturity = intOnPreMaturity;
	}

	public BigDecimal getIntPosted() {
		return this.intPosted;
	}

	public void setIntPosted(BigDecimal intPosted) {
		this.intPosted = intPosted;
	}

	public Object getIntPostedDate() {
		return this.intPostedDate;
	}

	public void setIntPostedDate(Object intPostedDate) {
		this.intPostedDate = intPostedDate;
	}

	public BigDecimal getIntRate() {
		return this.intRate;
	}

	public void setIntRate(BigDecimal intRate) {
		this.intRate = intRate;
	}

	public BigDecimal getLastAutorolloverInt() {
		return this.lastAutorolloverInt;
	}

	public void setLastAutorolloverInt(BigDecimal lastAutorolloverInt) {
		this.lastAutorolloverInt = lastAutorolloverInt;
	}

	public Object getLastRolloverDate() {
		return this.lastRolloverDate;
	}

	public void setLastRolloverDate(Object lastRolloverDate) {
		this.lastRolloverDate = lastRolloverDate;
	}

	public BigDecimal getLatestpostedint() {
		return this.latestpostedint;
	}

	public void setLatestpostedint(BigDecimal latestpostedint) {
		this.latestpostedint = latestpostedint;
	}

	public String getMaturedPost() {
		return this.maturedPost;
	}

	public void setMaturedPost(String maturedPost) {
		this.maturedPost = maturedPost;
	}

	public Object getMaturityDate() {
		return this.maturityDate;
	}

	public void setMaturityDate(Object maturityDate) {
		this.maturityDate = maturityDate;
	}

	public BigDecimal getPeriodId() {
		return this.periodId;
	}

	public void setPeriodId(BigDecimal periodId) {
		this.periodId = periodId;
	}

	public String getPreIntPost() {
		return this.preIntPost;
	}

	public void setPreIntPost(String preIntPost) {
		this.preIntPost = preIntPost;
	}

	public Object getPreMaturityDate() {
		return this.preMaturityDate;
	}

	public void setPreMaturityDate(Object preMaturityDate) {
		this.preMaturityDate = preMaturityDate;
	}

	public BigDecimal getPrePeriodId() {
		return this.prePeriodId;
	}

	public void setPrePeriodId(BigDecimal prePeriodId) {
		this.prePeriodId = prePeriodId;
	}

	public BigDecimal getPrincipal() {
		return this.principal;
	}

	public void setPrincipal(BigDecimal principal) {
		this.principal = principal;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public BigDecimal getRolloverno() {
		return this.rolloverno;
	}

	public void setRolloverno(BigDecimal rolloverno) {
		this.rolloverno = rolloverno;
	}

	public BigDecimal getStatusId() {
		return this.statusId;
	}

	public void setStatusId(BigDecimal statusId) {
		this.statusId = statusId;
	}

	public BigDecimal getTax() {
		return this.tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	public BigDecimal getTotalPrincipal() {
		return this.totalPrincipal;
	}

	public void setTotalPrincipal(BigDecimal totalPrincipal) {
		this.totalPrincipal = totalPrincipal;
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