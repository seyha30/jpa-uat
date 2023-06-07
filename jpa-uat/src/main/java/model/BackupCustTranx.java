package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the BACKUP_CUST_TRANX database table.
 * 
 */
@Entity
@Table(name="BACKUP_CUST_TRANX")
@NamedQuery(name="BackupCustTranx.findAll", query="SELECT b FROM BackupCustTranx b")
public class BackupCustTranx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CUST_TRANX_ID")
	private long custTranxId;

	private BigDecimal amount;

	private BigDecimal balance;

	private BigDecimal custacctid;

	@Column(name="CUSTTR_TYPE")
	private String custtrType;

	@Column(name="DATE_DONE")
	private Object dateDone;

	@Column(name="DATE_OVERRIDE")
	private Object dateOverride;

	private String description;

	@Column(name="DONE_BY")
	private String doneBy;

	private String dorc;

	@Column(name="\"NEW\"")
	private String new_;

	@Column(name="OVERRIDE_BY")
	private String overrideBy;

	private String printed;

	private String reverse;

	@Column(name="TRAN_CODE")
	private String tranCode;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	@Column(name="VAL_BAL")
	private BigDecimal valBal;

	@Column(name="VALUE_DATE")
	private Object valueDate;

	public BackupCustTranx() {
	}

	public long getCustTranxId() {
		return this.custTranxId;
	}

	public void setCustTranxId(long custTranxId) {
		this.custTranxId = custTranxId;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getBalance() {
		return this.balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public BigDecimal getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(BigDecimal custacctid) {
		this.custacctid = custacctid;
	}

	public String getCusttrType() {
		return this.custtrType;
	}

	public void setCusttrType(String custtrType) {
		this.custtrType = custtrType;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public Object getDateOverride() {
		return this.dateOverride;
	}

	public void setDateOverride(Object dateOverride) {
		this.dateOverride = dateOverride;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public String getNew_() {
		return this.new_;
	}

	public void setNew_(String new_) {
		this.new_ = new_;
	}

	public String getOverrideBy() {
		return this.overrideBy;
	}

	public void setOverrideBy(String overrideBy) {
		this.overrideBy = overrideBy;
	}

	public String getPrinted() {
		return this.printed;
	}

	public void setPrinted(String printed) {
		this.printed = printed;
	}

	public String getReverse() {
		return this.reverse;
	}

	public void setReverse(String reverse) {
		this.reverse = reverse;
	}

	public String getTranCode() {
		return this.tranCode;
	}

	public void setTranCode(String tranCode) {
		this.tranCode = tranCode;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

	public BigDecimal getValBal() {
		return this.valBal;
	}

	public void setValBal(BigDecimal valBal) {
		this.valBal = valBal;
	}

	public Object getValueDate() {
		return this.valueDate;
	}

	public void setValueDate(Object valueDate) {
		this.valueDate = valueDate;
	}

}