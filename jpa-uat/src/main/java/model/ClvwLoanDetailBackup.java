package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CLVW_LOAN_DETAIL_BACKUP database table.
 * 
 */
@Entity
@Table(name="CLVW_LOAN_DETAIL_BACKUP")
@NamedQuery(name="ClvwLoanDetailBackup.findAll", query="SELECT c FROM ClvwLoanDetailBackup c")
public class ClvwLoanDetailBackup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCOUNT_NO")
	private String accountNo;

	@Column(name="ACCUMULATE_BAL")
	private BigDecimal accumulateBal;

	@Column(name="ADD_TYPE")
	private String addType;

	@Column(name="ADDRESS_CODE")
	private String addressCode;

	private BigDecimal aging;

	@Column(name="APPLI_TYPE")
	private BigDecimal appliType;

	@Column(name="BIZ_ACTIVITY")
	private String bizActivity;

	@Column(name="BRANCH_ID")
	private String branchId;

	@Column(name="BUS_TYPE_ID")
	private BigDecimal busTypeId;

	@Column(name="CASH_CARD_ID")
	private String cashCardId;

	private String ccy;

	@Column(name="COMMITTEE_ID")
	private String committeeId;

	@Column(name="CREDIT_OFFICER")
	private String creditOfficer;

	private BigDecimal custacctid;

	@Column(name="CUSTOMER_NO")
	private BigDecimal customerNo;

	@Column(name="DAILY_AIR_ACCR")
	private BigDecimal dailyAirAccr;

	@Column(name="DAILY_PEN")
	private BigDecimal dailyPen;

	@Column(name="DATE_DONE")
	private Object dateDone;

	@Column(name="DISBURSED_DATE")
	private Object disbursedDate;

	private Object dob;

	@Column(name="DUE_DATE")
	private Object dueDate;

	@Column(name="FAC_REF_NO")
	private String facRefNo;

	@Column(name="FEE_NEXT_REPAY")
	private BigDecimal feeNextRepay;

	@Column(name="FEE_OVER_DUE")
	private BigDecimal feeOverDue;

	@Column(name="FEE_PAID")
	private BigDecimal feePaid;

	@Column(name="FEE_RATE")
	private BigDecimal feeRate;

	@Column(name="FULL_NAME")
	private String fullName;

	@Column(name="GROUP_NAME")
	private String groupName;

	@Column(name="GROUP_REF")
	private String groupRef;

	private String idno;

	@Column(name="INST_NO")
	private BigDecimal instNo;

	@Column(name="INT_NEXT_REPAY")
	private BigDecimal intNextRepay;

	@Column(name="INT_OVER_DUE")
	private BigDecimal intOverDue;

	@Column(name="INT_PAID")
	private BigDecimal intPaid;

	@Column(name="INT_RATE")
	private BigDecimal intRate;

	@Column(name="LAST_FEE_PAID")
	private BigDecimal lastFeePaid;

	@Column(name="LAST_INT_PAID")
	private BigDecimal lastIntPaid;

	@Column(name="LAST_PEN_PAID")
	private BigDecimal lastPenPaid;

	@Column(name="LAST_PRIN_PAID")
	private BigDecimal lastPrinPaid;

	@Column(name="LAST_TRN_DATE")
	private Object lastTrnDate;

	@Column(name="LIMIT_AMOUNT")
	private BigDecimal limitAmount;

	@Column(name="LOAN_CAT")
	private String loanCat;

	@Column(name="LOAN_FAC_ID")
	private BigDecimal loanFacId;

	@Column(name="LOAN_FEE")
	private BigDecimal loanFee;

	@Column(name="LOAN_PURPOSE")
	private String loanPurpose;

	@Column(name="LOAN_STATUS")
	private String loanStatus;

	@Column(name="MATURITY_DATE")
	private Object maturityDate;

	@Column(name="NEXT_REPAYMENT_DATE")
	private Object nextRepaymentDate;

	@Column(name="NO_OF_INST")
	private BigDecimal noOfInst;

	private BigDecimal outstanding;

	private BigDecimal pen;

	@Column(name="PEN_PAID")
	private BigDecimal penPaid;

	@Column(name="PHONE_NUMBER")
	private String phoneNumber;

	@Column(name="PRIN_NEXT_REPAY")
	private BigDecimal prinNextRepay;

	@Column(name="PRIN_OVER_DUE")
	private BigDecimal prinOverDue;

	@Column(name="PRIN_PAID")
	private BigDecimal prinPaid;

	@Column(name="PRINCIPAL_AMT")
	private BigDecimal principalAmt;

	private String product;

	@Column(name="PRODUCT_CODE")
	private BigDecimal productCode;

	@Column(name="PROPERTY_TYPE")
	private String propertyType;

	@Column(name="REF_NO")
	private String refNo;

	private String registype;

	@Column(name="REPAYMENT_METHOD")
	private String repaymentMethod;

	@Column(name="SA_BALANCE")
	private BigDecimal saBalance;

	@Column(name="SAVING_ACCOUNT")
	private String savingAccount;

	@Column(name="SAVING_CODE")
	private BigDecimal savingCode;

	@Column(name="SAVING_DESCRIPTION")
	private String savingDescription;

	@Column(name="SECURITY_TYPE")
	private String securityType;

	private String sex;

	@Column(name="TOTAL_INT_INCOME")
	private BigDecimal totalIntIncome;

	public ClvwLoanDetailBackup() {
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

	public String getAddType() {
		return this.addType;
	}

	public void setAddType(String addType) {
		this.addType = addType;
	}

	public String getAddressCode() {
		return this.addressCode;
	}

	public void setAddressCode(String addressCode) {
		this.addressCode = addressCode;
	}

	public BigDecimal getAging() {
		return this.aging;
	}

	public void setAging(BigDecimal aging) {
		this.aging = aging;
	}

	public BigDecimal getAppliType() {
		return this.appliType;
	}

	public void setAppliType(BigDecimal appliType) {
		this.appliType = appliType;
	}

	public String getBizActivity() {
		return this.bizActivity;
	}

	public void setBizActivity(String bizActivity) {
		this.bizActivity = bizActivity;
	}

	public String getBranchId() {
		return this.branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public BigDecimal getBusTypeId() {
		return this.busTypeId;
	}

	public void setBusTypeId(BigDecimal busTypeId) {
		this.busTypeId = busTypeId;
	}

	public String getCashCardId() {
		return this.cashCardId;
	}

	public void setCashCardId(String cashCardId) {
		this.cashCardId = cashCardId;
	}

	public String getCcy() {
		return this.ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public String getCommitteeId() {
		return this.committeeId;
	}

	public void setCommitteeId(String committeeId) {
		this.committeeId = committeeId;
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

	public BigDecimal getDailyPen() {
		return this.dailyPen;
	}

	public void setDailyPen(BigDecimal dailyPen) {
		this.dailyPen = dailyPen;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public Object getDisbursedDate() {
		return this.disbursedDate;
	}

	public void setDisbursedDate(Object disbursedDate) {
		this.disbursedDate = disbursedDate;
	}

	public Object getDob() {
		return this.dob;
	}

	public void setDob(Object dob) {
		this.dob = dob;
	}

	public Object getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(Object dueDate) {
		this.dueDate = dueDate;
	}

	public String getFacRefNo() {
		return this.facRefNo;
	}

	public void setFacRefNo(String facRefNo) {
		this.facRefNo = facRefNo;
	}

	public BigDecimal getFeeNextRepay() {
		return this.feeNextRepay;
	}

	public void setFeeNextRepay(BigDecimal feeNextRepay) {
		this.feeNextRepay = feeNextRepay;
	}

	public BigDecimal getFeeOverDue() {
		return this.feeOverDue;
	}

	public void setFeeOverDue(BigDecimal feeOverDue) {
		this.feeOverDue = feeOverDue;
	}

	public BigDecimal getFeePaid() {
		return this.feePaid;
	}

	public void setFeePaid(BigDecimal feePaid) {
		this.feePaid = feePaid;
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

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupRef() {
		return this.groupRef;
	}

	public void setGroupRef(String groupRef) {
		this.groupRef = groupRef;
	}

	public String getIdno() {
		return this.idno;
	}

	public void setIdno(String idno) {
		this.idno = idno;
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

	public BigDecimal getIntOverDue() {
		return this.intOverDue;
	}

	public void setIntOverDue(BigDecimal intOverDue) {
		this.intOverDue = intOverDue;
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

	public BigDecimal getLastFeePaid() {
		return this.lastFeePaid;
	}

	public void setLastFeePaid(BigDecimal lastFeePaid) {
		this.lastFeePaid = lastFeePaid;
	}

	public BigDecimal getLastIntPaid() {
		return this.lastIntPaid;
	}

	public void setLastIntPaid(BigDecimal lastIntPaid) {
		this.lastIntPaid = lastIntPaid;
	}

	public BigDecimal getLastPenPaid() {
		return this.lastPenPaid;
	}

	public void setLastPenPaid(BigDecimal lastPenPaid) {
		this.lastPenPaid = lastPenPaid;
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

	public BigDecimal getLimitAmount() {
		return this.limitAmount;
	}

	public void setLimitAmount(BigDecimal limitAmount) {
		this.limitAmount = limitAmount;
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

	public BigDecimal getLoanFee() {
		return this.loanFee;
	}

	public void setLoanFee(BigDecimal loanFee) {
		this.loanFee = loanFee;
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

	public Object getNextRepaymentDate() {
		return this.nextRepaymentDate;
	}

	public void setNextRepaymentDate(Object nextRepaymentDate) {
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

	public BigDecimal getPen() {
		return this.pen;
	}

	public void setPen(BigDecimal pen) {
		this.pen = pen;
	}

	public BigDecimal getPenPaid() {
		return this.penPaid;
	}

	public void setPenPaid(BigDecimal penPaid) {
		this.penPaid = penPaid;
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

	public BigDecimal getPrinOverDue() {
		return this.prinOverDue;
	}

	public void setPrinOverDue(BigDecimal prinOverDue) {
		this.prinOverDue = prinOverDue;
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

	public String getPropertyType() {
		return this.propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public String getRegistype() {
		return this.registype;
	}

	public void setRegistype(String registype) {
		this.registype = registype;
	}

	public String getRepaymentMethod() {
		return this.repaymentMethod;
	}

	public void setRepaymentMethod(String repaymentMethod) {
		this.repaymentMethod = repaymentMethod;
	}

	public BigDecimal getSaBalance() {
		return this.saBalance;
	}

	public void setSaBalance(BigDecimal saBalance) {
		this.saBalance = saBalance;
	}

	public String getSavingAccount() {
		return this.savingAccount;
	}

	public void setSavingAccount(String savingAccount) {
		this.savingAccount = savingAccount;
	}

	public BigDecimal getSavingCode() {
		return this.savingCode;
	}

	public void setSavingCode(BigDecimal savingCode) {
		this.savingCode = savingCode;
	}

	public String getSavingDescription() {
		return this.savingDescription;
	}

	public void setSavingDescription(String savingDescription) {
		this.savingDescription = savingDescription;
	}

	public String getSecurityType() {
		return this.securityType;
	}

	public void setSecurityType(String securityType) {
		this.securityType = securityType;
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