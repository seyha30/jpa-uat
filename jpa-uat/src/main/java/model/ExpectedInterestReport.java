package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the EXPECTED_INTEREST_REPORT database table.
 * 
 */
@Entity
@Table(name="EXPECTED_INTEREST_REPORT")
@NamedQuery(name="ExpectedInterestReport.findAll", query="SELECT e FROM ExpectedInterestReport e")
public class ExpectedInterestReport implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACC_NO")
	private String accNo;

	@Column(name="BRANCH_NAME")
	private String branchName;

	@Column(name="CURR_CODE")
	private String currCode;

	private String emprep;

	private String gname;

	@Column(name="INST_NO")
	private BigDecimal instNo;

	@Column(name="LOAN_REF_NO")
	private String loanRefNo;

	@Column(name="\"NAMES\"")
	private String names;

	private BigDecimal outstanding;

	@Column(name="PAID_AMT")
	private BigDecimal paidAmt;

	@Column(name="PAID_DATE")
	private Object paidDate;

	@Column(name="PAID_INT")
	private BigDecimal paidInt;

	@Column(name="REPAY_AMT")
	private BigDecimal repayAmt;

	@Column(name="REPAY_DATE")
	private Object repayDate;

	@Column(name="REPAY_INT")
	private BigDecimal repayInt;

	@Column(name="USER_ID")
	private String userId;

	public ExpectedInterestReport() {
	}

	public String getAccNo() {
		return this.accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getBranchName() {
		return this.branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getCurrCode() {
		return this.currCode;
	}

	public void setCurrCode(String currCode) {
		this.currCode = currCode;
	}

	public String getEmprep() {
		return this.emprep;
	}

	public void setEmprep(String emprep) {
		this.emprep = emprep;
	}

	public String getGname() {
		return this.gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public BigDecimal getInstNo() {
		return this.instNo;
	}

	public void setInstNo(BigDecimal instNo) {
		this.instNo = instNo;
	}

	public String getLoanRefNo() {
		return this.loanRefNo;
	}

	public void setLoanRefNo(String loanRefNo) {
		this.loanRefNo = loanRefNo;
	}

	public String getNames() {
		return this.names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public BigDecimal getOutstanding() {
		return this.outstanding;
	}

	public void setOutstanding(BigDecimal outstanding) {
		this.outstanding = outstanding;
	}

	public BigDecimal getPaidAmt() {
		return this.paidAmt;
	}

	public void setPaidAmt(BigDecimal paidAmt) {
		this.paidAmt = paidAmt;
	}

	public Object getPaidDate() {
		return this.paidDate;
	}

	public void setPaidDate(Object paidDate) {
		this.paidDate = paidDate;
	}

	public BigDecimal getPaidInt() {
		return this.paidInt;
	}

	public void setPaidInt(BigDecimal paidInt) {
		this.paidInt = paidInt;
	}

	public BigDecimal getRepayAmt() {
		return this.repayAmt;
	}

	public void setRepayAmt(BigDecimal repayAmt) {
		this.repayAmt = repayAmt;
	}

	public Object getRepayDate() {
		return this.repayDate;
	}

	public void setRepayDate(Object repayDate) {
		this.repayDate = repayDate;
	}

	public BigDecimal getRepayInt() {
		return this.repayInt;
	}

	public void setRepayInt(BigDecimal repayInt) {
		this.repayInt = repayInt;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}