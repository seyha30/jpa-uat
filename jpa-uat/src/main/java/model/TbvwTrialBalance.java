package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TBVW_TRIAL_BALANCE database table.
 * 
 */
@Entity
@Table(name="TBVW_TRIAL_BALANCE")
@NamedQuery(name="TbvwTrialBalance.findAll", query="SELECT t FROM TbvwTrialBalance t")
public class TbvwTrialBalance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCT_ID")
	private BigDecimal acctId;

	@Column(name="ACCT_TYPE_ID")
	private BigDecimal acctTypeId;

	private BigDecimal balance;

	@Column(name="BEGINING_BAL")
	private BigDecimal beginingBal;

	private String branch;

	private BigDecimal cr;

	private String description;

	private BigDecimal dr;

	@Column(name="GL_CODE")
	private String glCode;

	@Column(name="GROUP_DESC")
	private String groupDesc;

	@Column(name="GROUP_NO")
	private String groupNo;

	@Column(name="REPORT_DATE")
	private Object reportDate;

	public TbvwTrialBalance() {
	}

	public BigDecimal getAcctId() {
		return this.acctId;
	}

	public void setAcctId(BigDecimal acctId) {
		this.acctId = acctId;
	}

	public BigDecimal getAcctTypeId() {
		return this.acctTypeId;
	}

	public void setAcctTypeId(BigDecimal acctTypeId) {
		this.acctTypeId = acctTypeId;
	}

	public BigDecimal getBalance() {
		return this.balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public BigDecimal getBeginingBal() {
		return this.beginingBal;
	}

	public void setBeginingBal(BigDecimal beginingBal) {
		this.beginingBal = beginingBal;
	}

	public String getBranch() {
		return this.branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public BigDecimal getCr() {
		return this.cr;
	}

	public void setCr(BigDecimal cr) {
		this.cr = cr;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getDr() {
		return this.dr;
	}

	public void setDr(BigDecimal dr) {
		this.dr = dr;
	}

	public String getGlCode() {
		return this.glCode;
	}

	public void setGlCode(String glCode) {
		this.glCode = glCode;
	}

	public String getGroupDesc() {
		return this.groupDesc;
	}

	public void setGroupDesc(String groupDesc) {
		this.groupDesc = groupDesc;
	}

	public String getGroupNo() {
		return this.groupNo;
	}

	public void setGroupNo(String groupNo) {
		this.groupNo = groupNo;
	}

	public Object getReportDate() {
		return this.reportDate;
	}

	public void setReportDate(Object reportDate) {
		this.reportDate = reportDate;
	}

}