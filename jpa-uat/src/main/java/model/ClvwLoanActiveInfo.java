package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CLVW_LOAN_ACTIVE_INFO database table.
 * 
 */
@Entity
@Table(name="CLVW_LOAN_ACTIVE_INFO")
@NamedQuery(name="ClvwLoanActiveInfo.findAll", query="SELECT c FROM ClvwLoanActiveInfo c")
public class ClvwLoanActiveInfo implements Serializable {
	private static final long serialVersionUID = 1L;

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

	private BigDecimal emprep;

	@Column(name="FULL_NAME")
	private String fullName;

	@Column(name="GROUP_REF")
	private String groupRef;

	@Column(name="INT_RATE")
	private BigDecimal intRate;

	@Column(name="KH_NAME")
	private String khName;

	@Column(name="LOAN_FAC_ID")
	private BigDecimal loanFacId;

	@Column(name="MATURITY_DATE")
	private Object maturityDate;

	@Column(name="PHONE_NUMBER")
	private String phoneNumber;

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

	@Column(name="TRNFEE_RATE")
	private BigDecimal trnfeeRate;

	@Column(name="VAL_BALANCE")
	private BigDecimal valBalance;

	public ClvwLoanActiveInfo() {
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

	public BigDecimal getEmprep() {
		return this.emprep;
	}

	public void setEmprep(BigDecimal emprep) {
		this.emprep = emprep;
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

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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