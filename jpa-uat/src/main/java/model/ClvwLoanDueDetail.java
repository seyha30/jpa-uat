package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CLVW_LOAN_DUE_DETAIL database table.
 * 
 */
@Entity
@Table(name="CLVW_LOAN_DUE_DETAIL")
@NamedQuery(name="ClvwLoanDueDetail.findAll", query="SELECT c FROM ClvwLoanDueDetail c")
public class ClvwLoanDueDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal aging;

	@Column(name="BUS_TYPE_ID")
	private BigDecimal busTypeId;

	@Column(name="COMMITTEE_ID")
	private String committeeId;

	@Column(name="CREDIT_STATUS_ID")
	private BigDecimal creditStatusId;

	@Column(name="CREDIT_TYPE_ID")
	private BigDecimal creditTypeId;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	@Column(name="DUE_DATE")
	private Object dueDate;

	private BigDecimal emprep;

	@Column(name="FEE_DUE")
	private BigDecimal feeDue;

	@Column(name="FULL_NAME")
	private String fullName;

	@Column(name="GROUP_REF")
	private String groupRef;

	@Column(name="INT_DUE")
	private BigDecimal intDue;

	@Column(name="INT_RATE")
	private BigDecimal intRate;

	@Column(name="KH_NAME")
	private String khName;

	@Column(name="LOAN_FAC_ID")
	private BigDecimal loanFacId;

	@Column(name="MATURITY_DATE")
	private Object maturityDate;

	private BigDecimal pen;

	@Column(name="PHONE_NUMBER")
	private String phoneNumber;

	@Column(name="PRIN_DUE")
	private BigDecimal prinDue;

	@Column(name="PRIN_OUTSTANDING")
	private BigDecimal prinOutstanding;

	@Column(name="PRINCIPAL_AMT")
	private BigDecimal principalAmt;

	@Column(name="REF_NO")
	private String refNo;

	@Column(name="SAVING_ACC")
	private String savingAcc;

	@Column(name="START_DATE")
	private Object startDate;

	@Column(name="TOTAL_DUE")
	private BigDecimal totalDue;

	@Column(name="TRNFEE_RATE")
	private BigDecimal trnfeeRate;

	@Column(name="VAL_BALANCE")
	private BigDecimal valBalance;

	public ClvwLoanDueDetail() {
	}

	public BigDecimal getAging() {
		return this.aging;
	}

	public void setAging(BigDecimal aging) {
		this.aging = aging;
	}

	public BigDecimal getBusTypeId() {
		return this.busTypeId;
	}

	public void setBusTypeId(BigDecimal busTypeId) {
		this.busTypeId = busTypeId;
	}

	public String getCommitteeId() {
		return this.committeeId;
	}

	public void setCommitteeId(String committeeId) {
		this.committeeId = committeeId;
	}

	public BigDecimal getCreditStatusId() {
		return this.creditStatusId;
	}

	public void setCreditStatusId(BigDecimal creditStatusId) {
		this.creditStatusId = creditStatusId;
	}

	public BigDecimal getCreditTypeId() {
		return this.creditTypeId;
	}

	public void setCreditTypeId(BigDecimal creditTypeId) {
		this.creditTypeId = creditTypeId;
	}

	public BigDecimal getCurrId() {
		return this.currId;
	}

	public void setCurrId(BigDecimal currId) {
		this.currId = currId;
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

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGroupRef() {
		return this.groupRef;
	}

	public void setGroupRef(String groupRef) {
		this.groupRef = groupRef;
	}

	public BigDecimal getIntDue() {
		return this.intDue;
	}

	public void setIntDue(BigDecimal intDue) {
		this.intDue = intDue;
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

	public Object getMaturityDate() {
		return this.maturityDate;
	}

	public void setMaturityDate(Object maturityDate) {
		this.maturityDate = maturityDate;
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

	public BigDecimal getPrinOutstanding() {
		return this.prinOutstanding;
	}

	public void setPrinOutstanding(BigDecimal prinOutstanding) {
		this.prinOutstanding = prinOutstanding;
	}

	public BigDecimal getPrincipalAmt() {
		return this.principalAmt;
	}

	public void setPrincipalAmt(BigDecimal principalAmt) {
		this.principalAmt = principalAmt;
	}

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public String getSavingAcc() {
		return this.savingAcc;
	}

	public void setSavingAcc(String savingAcc) {
		this.savingAcc = savingAcc;
	}

	public Object getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Object startDate) {
		this.startDate = startDate;
	}

	public BigDecimal getTotalDue() {
		return this.totalDue;
	}

	public void setTotalDue(BigDecimal totalDue) {
		this.totalDue = totalDue;
	}

	public BigDecimal getTrnfeeRate() {
		return this.trnfeeRate;
	}

	public void setTrnfeeRate(BigDecimal trnfeeRate) {
		this.trnfeeRate = trnfeeRate;
	}

	public BigDecimal getValBalance() {
		return this.valBalance;
	}

	public void setValBalance(BigDecimal valBalance) {
		this.valBalance = valBalance;
	}

}