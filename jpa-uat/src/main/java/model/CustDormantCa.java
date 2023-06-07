package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CUST_DORMANT_CA database table.
 * 
 */
@Entity
@Table(name="CUST_DORMANT_CA")
@NamedQuery(name="CustDormantCa.findAll", query="SELECT c FROM CustDormantCa c")
public class CustDormantCa implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal amount;

	private BigDecimal balance;

	private BigDecimal custacctid;

	@Column(name="DATE_DONE")
	private Object dateDone;

	@Column(name="DELETE_DATE")
	private Object deleteDate;

	private String description;

	private String dorc;

	@Column(name="DORMANT_DATE")
	private Object dormantDate;

	private String status;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	public CustDormantCa() {
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

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public Object getDeleteDate() {
		return this.deleteDate;
	}

	public void setDeleteDate(Object deleteDate) {
		this.deleteDate = deleteDate;
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

	public Object getDormantDate() {
		return this.dormantDate;
	}

	public void setDormantDate(Object dormantDate) {
		this.dormantDate = dormantDate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

}