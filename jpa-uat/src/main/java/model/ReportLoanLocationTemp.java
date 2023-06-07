package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the REPORT_LOAN_LOCATION_TEMP database table.
 * 
 */
@Entity
@Table(name="REPORT_LOAN_LOCATION_TEMP")
@NamedQuery(name="ReportLoanLocationTemp.findAll", query="SELECT r FROM ReportLoanLocationTemp r")
public class ReportLoanLocationTemp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACC_NUMBER")
	private String accNumber;

	@Column(name="BRANCH_ID")
	private String branchId;

	@Column(name="COM_ID")
	private BigDecimal comId;

	@Column(name="DIS_ID")
	private BigDecimal disId;

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

	@Column(name="LOAN_STATUS")
	private BigDecimal loanStatus;

	@Column(name="MATURITY_DATE")
	private Object maturityDate;

	@Column(name="\"NAMES\"")
	private String names;

	@Column(name="NO_OF_INST")
	private BigDecimal noOfInst;

	@Column(name="PRINCIPAL_AMT")
	private BigDecimal principalAmt;

	@Column(name="PRO_ID")
	private BigDecimal proId;

	private String refno;

	@Column(name="RP_METHOD")
	private String rpMethod;

	private String sex;

	@Column(name="START_DATE")
	private Object startDate;

	@Column(name="TOTALPAID_AMT")
	private BigDecimal totalpaidAmt;

	private String userid;

	@Column(name="VIL_ID")
	private BigDecimal vilId;

	public ReportLoanLocationTemp() {
	}

	public String getAccNumber() {
		return this.accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public String getBranchId() {
		return this.branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public BigDecimal getComId() {
		return this.comId;
	}

	public void setComId(BigDecimal comId) {
		this.comId = comId;
	}

	public BigDecimal getDisId() {
		return this.disId;
	}

	public void setDisId(BigDecimal disId) {
		this.disId = disId;
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

	public BigDecimal getLoanStatus() {
		return this.loanStatus;
	}

	public void setLoanStatus(BigDecimal loanStatus) {
		this.loanStatus = loanStatus;
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

	public BigDecimal getProId() {
		return this.proId;
	}

	public void setProId(BigDecimal proId) {
		this.proId = proId;
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

	public BigDecimal getTotalpaidAmt() {
		return this.totalpaidAmt;
	}

	public void setTotalpaidAmt(BigDecimal totalpaidAmt) {
		this.totalpaidAmt = totalpaidAmt;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public BigDecimal getVilId() {
		return this.vilId;
	}

	public void setVilId(BigDecimal vilId) {
		this.vilId = vilId;
	}

}