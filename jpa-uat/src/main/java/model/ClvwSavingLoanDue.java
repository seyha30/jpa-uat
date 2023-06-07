package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CLVW_SAVING_LOAN_DUE database table.
 * 
 */
@Entity
@Table(name="CLVW_SAVING_LOAN_DUE")
@NamedQuery(name="ClvwSavingLoanDue.findAll", query="SELECT c FROM ClvwSavingLoanDue c")
public class ClvwSavingLoanDue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCOUNT_NO")
	private String accountNo;

	private BigDecimal aging;

	@Column(name="COMMITTEE_ID")
	private String committeeId;

	@Column(name="CURR_CODE")
	private String currCode;

	private BigDecimal custacctid;

	@Column(name="DUE_DATE")
	private Object dueDate;

	private BigDecimal emprep;

	@Column(name="FEE_DUE")
	private BigDecimal feeDue;

	@Column(name="INT_DUE")
	private BigDecimal intDue;

	@Column(name="KH_NAME")
	private String khName;

	@Column(name="\"NAMES\"")
	private String names;

	private BigDecimal pen;

	@Column(name="PHONE_NUMBER")
	private String phoneNumber;

	@Column(name="PRIN_DUE")
	private BigDecimal prinDue;

	@Column(name="TOTAL_DUE")
	private BigDecimal totalDue;

	public ClvwSavingLoanDue() {
	}

	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public BigDecimal getAging() {
		return this.aging;
	}

	public void setAging(BigDecimal aging) {
		this.aging = aging;
	}

	public String getCommitteeId() {
		return this.committeeId;
	}

	public void setCommitteeId(String committeeId) {
		this.committeeId = committeeId;
	}

	public String getCurrCode() {
		return this.currCode;
	}

	public void setCurrCode(String currCode) {
		this.currCode = currCode;
	}

	public BigDecimal getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(BigDecimal custacctid) {
		this.custacctid = custacctid;
	}

	public Object getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(Object dueDate) {
		this.dueDate = dueDate;
	}

	public BigDecimal getEmprep() {
		return this.emprep;
	}

	public void setEmprep(BigDecimal emprep) {
		this.emprep = emprep;
	}

	public BigDecimal getFeeDue() {
		return this.feeDue;
	}

	public void setFeeDue(BigDecimal feeDue) {
		this.feeDue = feeDue;
	}

	public BigDecimal getIntDue() {
		return this.intDue;
	}

	public void setIntDue(BigDecimal intDue) {
		this.intDue = intDue;
	}

	public String getKhName() {
		return this.khName;
	}

	public void setKhName(String khName) {
		this.khName = khName;
	}

	public String getNames() {
		return this.names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public BigDecimal getPen() {
		return this.pen;
	}

	public void setPen(BigDecimal pen) {
		this.pen = pen;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public BigDecimal getPrinDue() {
		return this.prinDue;
	}

	public void setPrinDue(BigDecimal prinDue) {
		this.prinDue = prinDue;
	}

	public BigDecimal getTotalDue() {
		return this.totalDue;
	}

	public void setTotalDue(BigDecimal totalDue) {
		this.totalDue = totalDue;
	}

}