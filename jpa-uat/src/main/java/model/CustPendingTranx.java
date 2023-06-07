package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CUST_PENDING_TRANX database table.
 * 
 */
@Entity
@Table(name="CUST_PENDING_TRANX")
@NamedQuery(name="CustPendingTranx.findAll", query="SELECT c FROM CustPendingTranx c")
public class CustPendingTranx implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal amount;

	private BigDecimal balance;

	private String cleared;

	@Column(name="CUST_PENDING_TRANX_ID")
	private BigDecimal custPendingTranxId;

	private BigDecimal custacctid;

	@Column(name="CUSTTR_TYPE")
	private String custtrType;

	@Column(name="DATE_DONE")
	private Object dateDone;

	@Column(name="DATE_OVERRRIDE")
	private Object dateOverrride;

	private String description;

	@Column(name="DONE_BY")
	private String doneBy;

	private String dorc;

	private String latest;

	@Column(name="OVERRIDE_BY")
	private String overrideBy;

	private String printed;

	private String reverse;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	@Column(name="VALUE_DATE")
	private Object valueDate;

	public CustPendingTranx() {
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

	public String getCleared() {
		return this.cleared;
	}

	public void setCleared(String cleared) {
		this.cleared = cleared;
	}

	public BigDecimal getCustPendingTranxId() {
		return this.custPendingTranxId;
	}

	public void setCustPendingTranxId(BigDecimal custPendingTranxId) {
		this.custPendingTranxId = custPendingTranxId;
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

	public Object getDateOverrride() {
		return this.dateOverrride;
	}

	public void setDateOverrride(Object dateOverrride) {
		this.dateOverrride = dateOverrride;
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

	public String getLatest() {
		return this.latest;
	}

	public void setLatest(String latest) {
		this.latest = latest;
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