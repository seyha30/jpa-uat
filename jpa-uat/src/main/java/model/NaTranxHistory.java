package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the NA_TRANX_HISTORIES database table.
 * 
 */
@Entity
@Table(name="NA_TRANX_HISTORIES")
@NamedQuery(name="NaTranxHistory.findAll", query="SELECT n FROM NaTranxHistory n")
public class NaTranxHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCOUNT_NAME")
	private String accountName;

	@Column(name="ACCOUNT_NO")
	private String accountNo;

	@Column(name="ACCT_ID")
	private BigDecimal acctId;

	private BigDecimal amt;

	private BigDecimal bal;

	@Column(name="DATE_DONE")
	private Object dateDone;

	private String description;

	private String dorc;

	private BigDecimal id;

	private String noted;

	private String status;

	public NaTranxHistory() {
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
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

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
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

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getNoted() {
		return this.noted;
	}

	public void setNoted(String noted) {
		this.noted = noted;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}