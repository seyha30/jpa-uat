package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CUST_INFO_CHECK database table.
 * 
 */
@Entity
@Table(name="CUST_INFO_CHECK")
@NamedQuery(name="CustInfoCheck.findAll", query="SELECT c FROM CustInfoCheck c")
public class CustInfoCheck implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCOUNT_NUMBER")
	private String accountNumber;

	@Column(name="BRANCH_ID")
	private BigDecimal branchId;

	private String dob;

	@Column(name="ERROR_DESCRITION")
	private String errorDescrition;

	@Column(name="F_NAME")
	private String fName;

	@Column(name="ID_EXP_DATE")
	private Object idExpDate;

	@Column(name="ID_ISSUE_DATE")
	private Object idIssueDate;

	@Column(name="ID_TYPE")
	private String idType;

	private String kname;

	@Column(name="L_NAME")
	private String lName;

	@Column(name="LOAN_FAC_REF_NO")
	private String loanFacRefNo;

	@Column(name="\"MAIN\"")
	private String main;

	private String name;

	private String sex;

	@Column(name="START_DATE")
	private Object startDate;

	public CustInfoCheck() {
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigDecimal getBranchId() {
		return this.branchId;
	}

	public void setBranchId(BigDecimal branchId) {
		this.branchId = branchId;
	}

	public String getDob() {
		return this.dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getErrorDescrition() {
		return this.errorDescrition;
	}

	public void setErrorDescrition(String errorDescrition) {
		this.errorDescrition = errorDescrition;
	}

	public String getFName() {
		return this.fName;
	}

	public void setFName(String fName) {
		this.fName = fName;
	}

	public Object getIdExpDate() {
		return this.idExpDate;
	}

	public void setIdExpDate(Object idExpDate) {
		this.idExpDate = idExpDate;
	}

	public Object getIdIssueDate() {
		return this.idIssueDate;
	}

	public void setIdIssueDate(Object idIssueDate) {
		this.idIssueDate = idIssueDate;
	}

	public String getIdType() {
		return this.idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getKname() {
		return this.kname;
	}

	public void setKname(String kname) {
		this.kname = kname;
	}

	public String getLName() {
		return this.lName;
	}

	public void setLName(String lName) {
		this.lName = lName;
	}

	public String getLoanFacRefNo() {
		return this.loanFacRefNo;
	}

	public void setLoanFacRefNo(String loanFacRefNo) {
		this.loanFacRefNo = loanFacRefNo;
	}

	public String getMain() {
		return this.main;
	}

	public void setMain(String main) {
		this.main = main;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Object getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Object startDate) {
		this.startDate = startDate;
	}

}