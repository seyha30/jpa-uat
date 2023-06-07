package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the OUTWARD_REMITT_TRANX database table.
 * 
 */
@Entity
@Table(name="OUTWARD_REMITT_TRANX")
@NamedQuery(name="OutwardRemittTranx.findAll", query="SELECT o FROM OutwardRemittTranx o")
public class OutwardRemittTranx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCT_NON_ACCT")
	private String acctNonAcct;

	private BigDecimal amount;

	private String beneficiary;

	private String beneficiaryacct;

	@Column(name="CASH_ORDER_NO")
	private String cashOrderNo;

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

	private String instruction;

	@Column(name="MODULE_ID")
	private BigDecimal moduleId;

	private String name;

	@Column(name="NOSTRO_ID")
	private BigDecimal nostroId;

	@Column(name="\"OLD\"")
	private String old;

	@Column(name="OUTWARD_REMIT_ID")
	private BigDecimal outwardRemitId;

	@Column(name="OVERRIDE_BY")
	private String overrideBy;

	@Column(name="OVERRIDE_DATE")
	private Object overrideDate;

	private String passport;

	@Column(name="PAY_ACCT_WITH_BANK")
	private String payAcctWithBank;

	@Column(name="PAY_INTERMEDIATE_BANK")
	private String payIntermediateBank;

	@Column(name="PAY_TRANX_ID")
	private BigDecimal payTranxId;

	@Column(name="PENDING_MODULE_ID")
	private BigDecimal pendingModuleId;

	@Column(name="PENDING_TRANX_ID")
	private BigDecimal pendingTranxId;

	@Column(name="REFERENCE_NO")
	private String referenceNo;

	private String remark;

	private String remitter;

	@Column(name="SETTLEMENT_CASH_ACCOUNT")
	private String settlementCashAccount;

	@Column(name="TOTAL_CHARGE_AMOUNT")
	private BigDecimal totalChargeAmount;

	@Column(name="TOTAL_PAYABLE")
	private BigDecimal totalPayable;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	@Column(name="TYPE_ID")
	private BigDecimal typeId;

	@Column(name="VALUE_DATE")
	private Object valueDate;

	public OutwardRemittTranx() {
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

	public String getBeneficiary() {
		return this.beneficiary;
	}

	public void setBeneficiary(String beneficiary) {
		this.beneficiary = beneficiary;
	}

	public String getBeneficiaryacct() {
		return this.beneficiaryacct;
	}

	public void setBeneficiaryacct(String beneficiaryacct) {
		this.beneficiaryacct = beneficiaryacct;
	}

	public String getCashOrderNo() {
		return this.cashOrderNo;
	}

	public void setCashOrderNo(String cashOrderNo) {
		this.cashOrderNo = cashOrderNo;
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

	public String getInstruction() {
		return this.instruction;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
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

	public BigDecimal getOutwardRemitId() {
		return this.outwardRemitId;
	}

	public void setOutwardRemitId(BigDecimal outwardRemitId) {
		this.outwardRemitId = outwardRemitId;
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

	public String getPayAcctWithBank() {
		return this.payAcctWithBank;
	}

	public void setPayAcctWithBank(String payAcctWithBank) {
		this.payAcctWithBank = payAcctWithBank;
	}

	public String getPayIntermediateBank() {
		return this.payIntermediateBank;
	}

	public void setPayIntermediateBank(String payIntermediateBank) {
		this.payIntermediateBank = payIntermediateBank;
	}

	public BigDecimal getPayTranxId() {
		return this.payTranxId;
	}

	public void setPayTranxId(BigDecimal payTranxId) {
		this.payTranxId = payTranxId;
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

	public String getSettlementCashAccount() {
		return this.settlementCashAccount;
	}

	public void setSettlementCashAccount(String settlementCashAccount) {
		this.settlementCashAccount = settlementCashAccount;
	}

	public BigDecimal getTotalChargeAmount() {
		return this.totalChargeAmount;
	}

	public void setTotalChargeAmount(BigDecimal totalChargeAmount) {
		this.totalChargeAmount = totalChargeAmount;
	}

	public BigDecimal getTotalPayable() {
		return this.totalPayable;
	}

	public void setTotalPayable(BigDecimal totalPayable) {
		this.totalPayable = totalPayable;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

	public BigDecimal getTypeId() {
		return this.typeId;
	}

	public void setTypeId(BigDecimal typeId) {
		this.typeId = typeId;
	}

	public Object getValueDate() {
		return this.valueDate;
	}

	public void setValueDate(Object valueDate) {
		this.valueDate = valueDate;
	}

}