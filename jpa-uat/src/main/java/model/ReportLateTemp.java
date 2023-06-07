package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the REPORT_LATE_TEMP database table.
 * 
 */
@Entity
@Table(name="REPORT_LATE_TEMP")
@NamedQuery(name="ReportLateTemp.findAll", query="SELECT r FROM ReportLateTemp r")
public class ReportLateTemp implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal amt;

	@Column(name="AMT_1")
	private BigDecimal amt1;

	@Column(name="BRANCH_ID")
	private String branchId;

	@Column(name="EMP_NAME")
	private String empName;

	@Column(name="\"INT\"")
	private BigDecimal int_;

	@Column(name="INT_1")
	private BigDecimal int1;

	@Column(name="INT_RATE")
	private BigDecimal intRate;

	private BigDecimal interest;

	@Column(name="KH_NAME")
	private String khName;

	@Column(name="LOAN_FAC_ID")
	private BigDecimal loanFacId;

	@Column(name="LOAN_FAC_REF_NO")
	private String loanFacRefNo;

	@Column(name="MATURITY_DATE")
	private Object maturityDate;

	@Column(name="N_DAY")
	private String nDay;

	@Column(name="\"NAMES\"")
	private String names;

	@Column(name="NO_OF_INST")
	private BigDecimal noOfInst;

	private String phone;

	private BigDecimal principal;

	@Column(name="PRINCIPAL_AMT")
	private BigDecimal principalAmt;

	private String refno;

	@Column(name="REPAY_DATE")
	private Object repayDate;

	@Column(name="START_DATE")
	private Object startDate;

	@Column(name="TOTALPAID_AMT")
	private BigDecimal totalpaidAmt;

	private BigDecimal userid;

	private String username;

	public ReportLateTemp() {
	}

	public BigDecimal getAmt() {
		return this.amt;
	}

	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}

	public BigDecimal getAmt1() {
		return this.amt1;
	}

	public void setAmt1(BigDecimal amt1) {
		this.amt1 = amt1;
	}

	public String getBranchId() {
		return this.branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public BigDecimal getInt_() {
		return this.int_;
	}

	public void setInt_(BigDecimal int_) {
		this.int_ = int_;
	}

	public BigDecimal getInt1() {
		return this.int1;
	}

	public void setInt1(BigDecimal int1) {
		this.int1 = int1;
	}

	public BigDecimal getIntRate() {
		return this.intRate;
	}

	public void setIntRate(BigDecimal intRate) {
		this.intRate = intRate;
	}

	public BigDecimal getInterest() {
		return this.interest;
	}

	public void setInterest(BigDecimal interest) {
		this.interest = interest;
	}

	public String getKhName() {
		return this.khName;
	}

	public void setKhName(String khName) {
		this.khName = khName;
	}

	public BigDecimal getLoanFacId() {
		return this.loanFacId;
	}

	public void setLoanFacId(BigDecimal loanFacId) {
		this.loanFacId = loanFacId;
	}

	public String getLoanFacRefNo() {
		return this.loanFacRefNo;
	}

	public void setLoanFacRefNo(String loanFacRefNo) {
		this.loanFacRefNo = loanFacRefNo;
	}

	public Object getMaturityDate() {
		return this.maturityDate;
	}

	public void setMaturityDate(Object maturityDate) {
		this.maturityDate = maturityDate;
	}

	public String getNDay() {
		return this.nDay;
	}

	public void setNDay(String nDay) {
		this.nDay = nDay;
	}

	public String getNames() {
		return this.names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public BigDecimal getNoOfInst() {
		return this.noOfInst;
	}

	public void setNoOfInst(BigDecimal noOfInst) {
		this.noOfInst = noOfInst;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public BigDecimal getPrincipal() {
		return this.principal;
	}

	public void setPrincipal(BigDecimal principal) {
		this.principal = principal;
	}

	public BigDecimal getPrincipalAmt() {
		return this.principalAmt;
	}

	public void setPrincipalAmt(BigDecimal principalAmt) {
		this.principalAmt = principalAmt;
	}

	public String getRefno() {
		return this.refno;
	}

	public void setRefno(String refno) {
		this.refno = refno;
	}

	public Object getRepayDate() {
		return this.repayDate;
	}

	public void setRepayDate(Object repayDate) {
		this.repayDate = repayDate;
	}

	public Object getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Object startDate) {
		this.startDate = startDate;
	}

	public BigDecimal getTotalpaidAmt() {
		return this.totalpaidAmt;
	}

	public void setTotalpaidAmt(BigDecimal totalpaidAmt) {
		this.totalpaidAmt = totalpaidAmt;
	}

	public BigDecimal getUserid() {
		return this.userid;
	}

	public void setUserid(BigDecimal userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}