package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CLVW_LOAN_CONTRANCT database table.
 * 
 */
@Entity
@Table(name="CLVW_LOAN_CONTRANCT")
@NamedQuery(name="ClvwLoanContranct.findAll", query="SELECT c FROM ClvwLoanContranct c")
public class ClvwLoanContranct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCOUNT_NO")
	private String accountNo;

	@Column(name="ACCUMULATE_BAL")
	private BigDecimal accumulateBal;

	@Column(name="ADD_CODE")
	private BigDecimal addCode;

	private String address;

	private String address1;

	private String address2;

	private BigDecimal aging;

	@Column(name="BAD_LOAN_TYPE_ID")
	private BigDecimal badLoanTypeId;

	@Column(name="BIZ_ACTIVITY")
	private BigDecimal bizActivity;

	@Column(name="BRANCH_ID")
	private BigDecimal branchId;

	private String ccy;

	private String committee;

	@Column(name="CREDIT_OFFICER")
	private String creditOfficer;

	private BigDecimal custacctid;

	@Column(name="CUSTOMER_NO")
	private BigDecimal customerNo;

	@Column(name="DAILY_AIR_ACCR")
	private BigDecimal dailyAirAccr;

	@Column(name="DISBURSED_DATE")
	private Object disbursedDate;

	private String entity;

	@Column(name="EXTERNAL_ID")
	private String externalId;

	@Column(name="FEE_NEXT_REPAY")
	private BigDecimal feeNextRepay;

	@Column(name="FEE_RATE")
	private BigDecimal feeRate;

	@Column(name="FULL_NAME")
	private String fullName;

	@Column(name="GROUP_REF")
	private String groupRef;

	@Column(name="INST_NO")
	private BigDecimal instNo;

	@Column(name="INT_NEXT_REPAY")
	private BigDecimal intNextRepay;

	@Column(name="INT_PAID")
	private BigDecimal intPaid;

	@Column(name="INT_RATE")
	private BigDecimal intRate;

	@Column(name="LAST_INT_PAD")
	private BigDecimal lastIntPad;

	@Column(name="LAST_LOAN_FEE_PAID")
	private BigDecimal lastLoanFeePaid;

	@Column(name="LAST_PEN_PAD")
	private BigDecimal lastPenPad;

	@Column(name="LAST_PRIN_PAID")
	private BigDecimal lastPrinPaid;

	@Column(name="LAST_TRN_DATE")
	private Object lastTrnDate;

	@Column(name="LOAN_CAT")
	private String loanCat;

	@Column(name="LOAN_FAC_ID")
	private BigDecimal loanFacId;

	@Column(name="LOAN_FAC_REF_NO")
	private String loanFacRefNo;

	@Column(name="LOAN_FEE")
	private BigDecimal loanFee;

	@Column(name="LOAN_FEE_PAID")
	private BigDecimal loanFeePaid;

	@Column(name="LOAN_PURPOSE")
	private String loanPurpose;

	@Column(name="LOAN_STATUS")
	private String loanStatus;

	@Column(name="MATURITY_DATE")
	private Object maturityDate;

	@Column(name="NEXT_REPAYMENT_DATE")
	private String nextRepaymentDate;

	@Column(name="NO_OF_INST")
	private BigDecimal noOfInst;

	private BigDecimal outstanding;

	@Column(name="PHONE_NUMBER")
	private String phoneNumber;

	@Column(name="PRIN_NEXT_REPAY")
	private BigDecimal prinNextRepay;

	@Column(name="PRIN_PAID")
	private BigDecimal prinPaid;

	@Column(name="PRINCIPAL_AMT")
	private BigDecimal principalAmt;

	private String product;

	@Column(name="PRODUCT_CODE")
	private BigDecimal productCode;

	private String remarks;

	@Column(name="REPAYMENT_METHOD")
	private String repaymentMethod;

	@Column(name="SAVING_ACCOUNT")
	private String savingAccount;

	@Column(name="SAVING_DESCRIPTION")
	private String savingDescription;

	private String sex;

	@Column(name="TOTAL_INT_INCOME")
	private BigDecimal totalIntIncome;

	public ClvwLoanContranct() {
	}

	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public BigDecimal getAccumulateBal() {
		return this.accumulateBal;
	}

	public void setAccumulateBal(BigDecimal accumulateBal) {
		this.accumulateBal = accumulateBal;
	}

	public BigDecimal getAddCode() {
		return this.addCode;
	}

	public void setAddCode(BigDecimal addCode) {
		this.addCode = addCode;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public BigDecimal getAging() {
		return this.aging;
	}

	public void setAging(BigDecimal aging) {
		this.aging = aging;
	}

	public BigDecimal getBadLoanTypeId() {
		return this.badLoanTypeId;
	}

	public void setBadLoanTypeId(BigDecimal badLoanTypeId) {
		this.badLoanTypeId = badLoanTypeId;
	}

	public BigDecimal getBizActivity() {
		return this.bizActivity;
	}

	public void setBizActivity(BigDecimal bizActivity) {
		this.bizActivity = bizActivity;
	}

	public BigDecimal getBranchId() {
		return this.branchId;
	}

	public void setBranchId(BigDecimal branchId) {
		this.branchId = branchId;
	}

	public String getCcy() {
		return this.ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public String getCommittee() {
		return this.committee;
	}

	public void setCommittee(String committee) {
		this.committee = committee;
	}

	public String getCreditOfficer() {
		return this.creditOfficer;
	}

	public void setCreditOfficer(String creditOfficer) {
		this.creditOfficer = creditOfficer;
	}

	public BigDecimal getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(BigDecimal custacctid) {
		this.custacctid = custacctid;
	}

	public BigDecimal getCustomerNo() {
		return this.customerNo;
	}

	public void setCustomerNo(BigDecimal customerNo) {
		this.customerNo = customerNo;
	}

	public BigDecimal getDailyAirAccr() {
		return this.dailyAirAccr;
	}

	public void setDailyAirAccr(BigDecimal dailyAirAccr) {
		this.dailyAirAccr = dailyAirAccr;
	}

	public Object getDisbursedDate() {
		return this.disbursedDate;
	}

	public void setDisbursedDate(Object disbursedDate) {
		this.disbursedDate = disbursedDate;
	}

	public String getEntity() {
		return this.entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}

	public String getExternalId() {
		return this.externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public BigDecimal getFeeNextRepay() {
		return this.feeNextRepay;
	}

	public void setFeeNextRepay(BigDecimal feeNextRepay) {
		this.feeNextRepay = feeNextRepay;
	}

	public BigDecimal getFeeRate() {
		return this.feeRate;
	}

	public void setFeeRate(BigDecimal feeRate) {
		this.feeRate = feeRate;
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

	public BigDecimal getInstNo() {
		return this.instNo;
	}

	public void setInstNo(BigDecimal instNo) {
		this.instNo = instNo;
	}

	public BigDecimal getIntNextRepay() {
		return this.intNextRepay;
	}

	public void setIntNextRepay(BigDecimal intNextRepay) {
		this.intNextRepay = intNextRepay;
	}

	public BigDecimal getIntPaid() {
		return this.intPaid;
	}

	public void setIntPaid(BigDecimal intPaid) {
		this.intPaid = intPaid;
	}

	public BigDecimal getIntRate() {
		return this.intRate;
	}

	public void setIntRate(BigDecimal intRate) {
		this.intRate = intRate;
	}

	public BigDecimal getLastIntPad() {
		return this.lastIntPad;
	}

	public void setLastIntPad(BigDecimal lastIntPad) {
		this.lastIntPad = lastIntPad;
	}

	public BigDecimal getLastLoanFeePaid() {
		return this.lastLoanFeePaid;
	}

	public void setLastLoanFeePaid(BigDecimal lastLoanFeePaid) {
		this.lastLoanFeePaid = lastLoanFeePaid;
	}

	public BigDecimal getLastPenPad() {
		return this.lastPenPad;
	}

	public void setLastPenPad(BigDecimal lastPenPad) {
		this.lastPenPad = lastPenPad;
	}

	public BigDecimal getLastPrinPaid() {
		return this.lastPrinPaid;
	}

	public void setLastPrinPaid(BigDecimal lastPrinPaid) {
		this.lastPrinPaid = lastPrinPaid;
	}

	public Object getLastTrnDate() {
		return this.lastTrnDate;
	}

	public void setLastTrnDate(Object lastTrnDate) {
		this.lastTrnDate = lastTrnDate;
	}

	public String getLoanCat() {
		return this.loanCat;
	}

	public void setLoanCat(String loanCat) {
		this.loanCat = loanCat;
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

	public BigDecimal getLoanFee() {
		return this.loanFee;
	}

	public void setLoanFee(BigDecimal loanFee) {
		this.loanFee = loanFee;
	}

	public BigDecimal getLoanFeePaid() {
		return this.loanFeePaid;
	}

	public void setLoanFeePaid(BigDecimal loanFeePaid) {
		this.loanFeePaid = loanFeePaid;
	}

	public String getLoanPurpose() {
		return this.loanPurpose;
	}

	public void setLoanPurpose(String loanPurpose) {
		this.loanPurpose = loanPurpose;
	}

	public String getLoanStatus() {
		return this.loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	public Object getMaturityDate() {
		return this.maturityDate;
	}

	public void setMaturityDate(Object maturityDate) {
		this.maturityDate = maturityDate;
	}

	public String getNextRepaymentDate() {
		return this.nextRepaymentDate;
	}

	public void setNextRepaymentDate(String nextRepaymentDate) {
		this.nextRepaymentDate = nextRepaymentDate;
	}

	public BigDecimal getNoOfInst() {
		return this.noOfInst;
	}

	public void setNoOfInst(BigDecimal noOfInst) {
		this.noOfInst = noOfInst;
	}

	public BigDecimal getOutstanding() {
		return this.outstanding;
	}

	public void setOutstanding(BigDecimal outstanding) {
		this.outstanding = outstanding;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public BigDecimal getPrinNextRepay() {
		return this.prinNextRepay;
	}

	public void setPrinNextRepay(BigDecimal prinNextRepay) {
		this.prinNextRepay = prinNextRepay;
	}

	public BigDecimal getPrinPaid() {
		return this.prinPaid;
	}

	public void setPrinPaid(BigDecimal prinPaid) {
		this.prinPaid = prinPaid;
	}

	public BigDecimal getPrincipalAmt() {
		return this.principalAmt;
	}

	public void setPrincipalAmt(BigDecimal principalAmt) {
		this.principalAmt = principalAmt;
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public BigDecimal getProductCode() {
		return this.productCode;
	}

	public void setProductCode(BigDecimal productCode) {
		this.productCode = productCode;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getRepaymentMethod() {
		return this.repaymentMethod;
	}

	public void setRepaymentMethod(String repaymentMethod) {
		this.repaymentMethod = repaymentMethod;
	}

	public String getSavingAccount() {
		return this.savingAccount;
	}

	public void setSavingAccount(String savingAccount) {
		this.savingAccount = savingAccount;
	}

	public String getSavingDescription() {
		return this.savingDescription;
	}

	public void setSavingDescription(String savingDescription) {
		this.savingDescription = savingDescription;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public BigDecimal getTotalIntIncome() {
		return this.totalIntIncome;
	}

	public void setTotalIntIncome(BigDecimal totalIntIncome) {
		this.totalIntIncome = totalIntIncome;
	}

}