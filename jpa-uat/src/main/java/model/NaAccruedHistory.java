package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the NA_ACCRUED_HISTORY database table.
 * 
 */
@Entity
@Table(name="NA_ACCRUED_HISTORY")
@NamedQuery(name="NaAccruedHistory.findAll", query="SELECT n FROM NaAccruedHistory n")
public class NaAccruedHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCT_ID")
	private BigDecimal acctId;

	@Column(name="ACCT_NAME")
	private String acctName;

	private BigDecimal bal;

	@Column(name="BEGIN_BAL")
	private BigDecimal beginBal;

	@Column(name="BEGIN_CUST_BAL")
	private BigDecimal beginCustBal;

	@Column(name="CURR_CODE")
	private String currCode;

	@Column(name="CUST_ACCOUNT_NO")
	private String custAccountNo;

	@Column(name="DATE_DONE")
	private Object dateDone;

	private String drorcr;

	@Column(name="GL_NAME")
	private String glName;

	private BigDecimal id;

	@Column(name="REF_NO")
	private String refNo;

	private String status;

	@Column(name="TRANX_DRORCR")
	private BigDecimal tranxDrorcr;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	private String uorn;

	public NaAccruedHistory() {
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

	public BigDecimal getBal() {
		return this.bal;
	}

	public void setBal(BigDecimal bal) {
		this.bal = bal;
	}

	public BigDecimal getBeginBal() {
		return this.beginBal;
	}

	public void setBeginBal(BigDecimal beginBal) {
		this.beginBal = beginBal;
	}

	public BigDecimal getBeginCustBal() {
		return this.beginCustBal;
	}

	public void setBeginCustBal(BigDecimal beginCustBal) {
		this.beginCustBal = beginCustBal;
	}

	public String getCurrCode() {
		return this.currCode;
	}

	public void setCurrCode(String currCode) {
		this.currCode = currCode;
	}

	public String getCustAccountNo() {
		return this.custAccountNo;
	}

	public void setCustAccountNo(String custAccountNo) {
		this.custAccountNo = custAccountNo;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public String getDrorcr() {
		return this.drorcr;
	}

	public void setDrorcr(String drorcr) {
		this.drorcr = drorcr;
	}

	public String getGlName() {
		return this.glName;
	}

	public void setGlName(String glName) {
		this.glName = glName;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getTranxDrorcr() {
		return this.tranxDrorcr;
	}

	public void setTranxDrorcr(BigDecimal tranxDrorcr) {
		this.tranxDrorcr = tranxDrorcr;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

	public String getUorn() {
		return this.uorn;
	}

	public void setUorn(String uorn) {
		this.uorn = uorn;
	}

}