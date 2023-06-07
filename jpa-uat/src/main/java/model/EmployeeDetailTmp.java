package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the EMPLOYEE_DETAIL_TMP database table.
 * 
 */
@Entity
@Table(name="EMPLOYEE_DETAIL_TMP")
@NamedQuery(name="EmployeeDetailTmp.findAll", query="SELECT e FROM EmployeeDetailTmp e")
public class EmployeeDetailTmp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="BRANCH_ID")
	private String branchId;

	@Column(name="EMPREP_ID")
	private BigDecimal emprepId;

	@Column(name="EMPREP_NAME")
	private String emprepName;

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

	@Column(name="OUTSTANDING_AMT")
	private BigDecimal outstandingAmt;

	@Column(name="PRINCIPAL_AMT")
	private BigDecimal principalAmt;

	private String refno;

	@Column(name="START_DATE")
	private Object startDate;

	@Column(name="USER_ID")
	private String userId;

	public EmployeeDetailTmp() {
	}

	public String getBranchId() {
		return this.branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public BigDecimal getEmprepId() {
		return this.emprepId;
	}

	public void setEmprepId(BigDecimal emprepId) {
		this.emprepId = emprepId;
	}

	public String getEmprepName() {
		return this.emprepName;
	}

	public void setEmprepName(String emprepName) {
		this.emprepName = emprepName;
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

	public BigDecimal getOutstandingAmt() {
		return this.outstandingAmt;
	}

	public void setOutstandingAmt(BigDecimal outstandingAmt) {
		this.outstandingAmt = outstandingAmt;
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

	public Object getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Object startDate) {
		this.startDate = startDate;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}