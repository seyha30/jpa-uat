package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the REPORT_LOAN_CLOSE_TEMP database table.
 * 
 */
@Entity
@Table(name="REPORT_LOAN_CLOSE_TEMP")
@NamedQuery(name="ReportLoanCloseTemp.findAll", query="SELECT r FROM ReportLoanCloseTemp r")
public class ReportLoanCloseTemp implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal amt;

	@Column(name="BRANCH_ID")
	private String branchId;

	@Column(name="DATE_DONE")
	private Object dateDone;

	@Column(name="EMP_NAME")
	private String empName;

	@Column(name="INT_RATE")
	private BigDecimal intRate;

	@Column(name="KH_NAME")
	private String khName;

	@Column(name="LOAN_FAC_ID")
	private BigDecimal loanFacId;

	@Column(name="LOAN_FAC_REF_NO")
	private String loanFacRefNo;

	@Column(name="MATURITY_DATE")
	private Object maturityDate;

	@Column(name="\"NAMES\"")
	private String names;

	@Column(name="NO_OF_INST")
	private BigDecimal noOfInst;

	@Column(name="PRINCIPAL_AMT")
	private BigDecimal principalAmt;

	private String refno;

	@Column(name="RP_METHOD")
	private String rpMethod;

	@Column(name="START_DATE")
	private Object startDate;

	@Column(name="TOTAL_AMT")
	private BigDecimal totalAmt;

	private String userid;

	public ReportLoanCloseTemp() {
	}

	public BigDecimal getAmt() {
		return this.amt;
	}

	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}

	public String getBranchId() {
		return this.branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public BigDecimal getIntRate() {
		return this.intRate;
	}

	public void setIntRate(BigDecimal intRate) {
		this.intRate = intRate;
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

	public String getRpMethod() {
		return this.rpMethod;
	}

	public void setRpMethod(String rpMethod) {
		this.rpMethod = rpMethod;
	}

	public Object getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Object startDate) {
		this.startDate = startDate;
	}

	public BigDecimal getTotalAmt() {
		return this.totalAmt;
	}

	public void setTotalAmt(BigDecimal totalAmt) {
		this.totalAmt = totalAmt;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

}