package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the NA_TRANX_HISTORIES_REPORT database table.
 * 
 */
@Entity
@Table(name="NA_TRANX_HISTORIES_REPORT")
@NamedQuery(name="NaTranxHistoriesReport.findAll", query="SELECT n FROM NaTranxHistoriesReport n")
public class NaTranxHistoriesReport implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCOUNT_NAME")
	private String accountName;

	@Column(name="ACCOUNT_NO")
	private String accountNo;

	private BigDecimal amt;

	private BigDecimal bal;

	@Column(name="CURR_CODE")
	private String currCode;

	@Column(name="DATE_DONE")
	private Object dateDone;

	@Column(name="DESCR_GL")
	private String descrGl;

	private String description;

	private String dorc;

	private BigDecimal id;

	public NaTranxHistoriesReport() {
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

	public String getCurrCode() {
		return this.currCode;
	}

	public void setCurrCode(String currCode) {
		this.currCode = currCode;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public String getDescrGl() {
		return this.descrGl;
	}

	public void setDescrGl(String descrGl) {
		this.descrGl = descrGl;
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

}