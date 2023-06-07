package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the DUMP_LOAN_TRX database table.
 * 
 */
@Entity
@Table(name="DUMP_LOAN_TRX")
@NamedQuery(name="DumpLoanTrx.findAll", query="SELECT d FROM DumpLoanTrx d")
public class DumpLoanTrx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCOUNT_NO")
	private String accountNo;

	@Column(name="ACCUMULATE_BAL")
	private BigDecimal accumulateBal;

	private String address;

	@Column(name="AFFETIVE_INT")
	private Object affetiveInt;

	@Column(name="AFFETIVE_LOAN_FEE")
	private Object affetiveLoanFee;

	@Column(name="AFR_ACCU_BAL")
	private BigDecimal afrAccuBal;

	private BigDecimal aging;

	@Column(name="AMENDMENT_TYPE")
	private BigDecimal amendmentType;

	@Column(name="BIZ_ACTIVITY")
	private String bizActivity;

	@Column(name="BRANCH_ID")
	private BigDecimal branchId;

	private String ccy;

	@Column(name="CLOSE_DATE")
	private String closeDate;

	private String collateral;

	@Column(name="COMMITTEE_ID")
	private String committeeId;

	@Column(name="COMPANY_ID")
	private String companyId;

	@Column(name="CREDIT_OFFICER")
	private String creditOfficer;

	@Column(name="\"CYCLE\"")
	private BigDecimal cycle;

	@Column(name="DAILY_AFR")
	private BigDecimal dailyAfr;

	@Column(name="DAILY_AIR_ACCR")
	private BigDecimal dailyAirAccr;

	@Column(name="DAILY_PROVISION")
	private BigDecimal dailyProvision;

	@Column(name="DAYS_ACCR")
	private BigDecimal daysAccr;

	@Column(name="DISBURSED_DATE")
	private String disbursedDate;

	private String dob;

	@Column(name="EXTERNAL_ID")
	private String externalId;

	@Column(name="FAC_REMARKS")
	private String facRemarks;

	@Column(name="FEE_INC_COLLATERAL")
	private BigDecimal feeIncCollateral;

	@Column(name="FEE_INC_DOC")
	private BigDecimal feeIncDoc;

	@Column(name="FEE_NEXT_REPAY")
	private BigDecimal feeNextRepay;

	@Column(name="FEE_OVER_DUE")
	private BigDecimal feeOverDue;

	@Column(name="FEE_PAID")
	private BigDecimal feePaid;

	@Column(name="FEE_RATE")
	private BigDecimal feeRate;

	@Column(name="FEE_WH_CBC")
	private BigDecimal feeWhCbc;

	@Column(name="FEE_WH_COLLATERAL_EYES")
	private BigDecimal feeWhCollateralEyes;

	@Column(name="FEE_WH_COLLATERAL_KRATY")
	private BigDecimal feeWhCollateralKraty;

	@Column(name="FEE_WH_INSURANCE")
	private BigDecimal feeWhInsurance;

	@Column(name="FEE_WH_LAWYER")
	private BigDecimal feeWhLawyer;

	@Column(name="FEE_WH_TRDIS")
	private BigDecimal feeWhTrdis;

	@Column(name="FULL_NAME")
	private String fullName;

	@Column(name="GPS_EXP")
	private BigDecimal gpsExp;

	@Column(name="GROUP_REF")
	private String groupRef;

	@Column(name="ID_TYPE")
	private String idType;

	private String idno;

	@Column(name="INST_NO")
	private BigDecimal instNo;

	@Column(name="INSURANCE_EXP")
	private BigDecimal insuranceExp;

	@Column(name="INT_NEXT_REPAY")
	private BigDecimal intNextRepay;

	@Column(name="INT_OVER_DUE")
	private BigDecimal intOverDue;

	@Column(name="INT_PAID")
	private BigDecimal intPaid;

	@Column(name="INT_RATE")
	private BigDecimal intRate;

	@Column(name="LAST_INST_FULL_PAID_DATE")
	private Object lastInstFullPaidDate;

	@Column(name="LAST_INST_INT_PAID_DATE")
	private Object lastInstIntPaidDate;

	@Column(name="LAST_INST_PRIN_FULL_PAID_DATE")
	private Object lastInstPrinFullPaidDate;

	@Column(name="LAST_PRIN_PAID")
	private BigDecimal lastPrinPaid;

	@Column(name="LOAN_CAT")
	private String loanCat;

	@Column(name="LOAN_FAC_REF_NO")
	private String loanFacRefNo;

	@Column(name="LOAN_FEE")
	private BigDecimal loanFee;

	@Column(name="LOAN_PURPOSE")
	private String loanPurpose;

	@Column(name="LOAN_STATUS")
	private String loanStatus;

	@Column(name="MATURITY_DATE")
	private String maturityDate;

	@Column(name="NBC_SECTOR")
	private String nbcSector;

	@Column(name="NEXT_REPAYMENT_DATE")
	private String nextRepaymentDate;

	@Column(name="NO_OF_INST")
	private BigDecimal noOfInst;

	private String occupation;

	private BigDecimal outstanding;

	private BigDecimal pen;

	@Column(name="PHONE_NUMBER")
	private String phoneNumber;

	@Column(name="PRIN_NEXT_REPAY")
	private BigDecimal prinNextRepay;

	@Column(name="PRIN_OVER_DUE")
	private BigDecimal prinOverDue;

	@Column(name="PRINCIPAL_AMT")
	private BigDecimal principalAmt;

	private String product;

	@Column(name="PRODUCT_CODE")
	private BigDecimal productCode;

	@Column(name="PROVISION_AMT")
	private BigDecimal provisionAmt;

	@Column(name="PROVISION_RATE")
	private BigDecimal provisionRate;

	@Column(name="REPAYMENT_METHOD")
	private String repaymentMethod;

	@Column(name="REPORT_DATE")
	private Object reportDate;

	@Column(name="SAVING_ACCOUNT")
	private String savingAccount;

	@Column(name="SAVING_DESCRIPTION")
	private String savingDescription;

	private String sex;

	@Column(name="TOTAL_FEE_INCOME")
	private BigDecimal totalFeeIncome;

	@Column(name="TOTAL_INT_INCOME")
	private BigDecimal totalIntIncome;

	@Column(name="VALUATION_DATE")
	private Object valuationDate;

	@Column(name="VALUE_AMT")
	private BigDecimal valueAmt;

	public DumpLoanTrx() {
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

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Object getAffetiveInt() {
		return this.affetiveInt;
	}

	public void setAffetiveInt(Object affetiveInt) {
		this.affetiveInt = affetiveInt;
	}

	public Object getAffetiveLoanFee() {
		return this.affetiveLoanFee;
	}

	public void setAffetiveLoanFee(Object affetiveLoanFee) {
		this.affetiveLoanFee = affetiveLoanFee;
	}

	public BigDecimal getAfrAccuBal() {
		return this.afrAccuBal;
	}

	public void setAfrAccuBal(BigDecimal afrAccuBal) {
		this.afrAccuBal = afrAccuBal;
	}

	public BigDecimal getAging() {
		return this.aging;
	}

	public void setAging(BigDecimal aging) {
		this.aging = aging;
	}

	public BigDecimal getAmendmentType() {
		return this.amendmentType;
	}

	public void setAmendmentType(BigDecimal amendmentType) {
		this.amendmentType = amendmentType;
	}

	public String getBizActivity() {
		return this.bizActivity;
	}

	public void setBizActivity(String bizActivity) {
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

	public String getCloseDate() {
		return this.closeDate;
	}

	public void setCloseDate(String closeDate) {
		this.closeDate = closeDate;
	}

	public String getCollateral() {
		return this.collateral;
	}

	public void setCollateral(String collateral) {
		this.collateral = collateral;
	}

	public String getCommitteeId() {
		return this.committeeId;
	}

	public void setCommitteeId(String committeeId) {
		this.committeeId = committeeId;
	}

	public String getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getCreditOfficer() {
		return this.creditOfficer;
	}

	public void setCreditOfficer(String creditOfficer) {
		this.creditOfficer = creditOfficer;
	}

	public BigDecimal getCycle() {
		return this.cycle;
	}

	public void setCycle(BigDecimal cycle) {
		this.cycle = cycle;
	}

	public BigDecimal getDailyAfr() {
		return this.dailyAfr;
	}

	public void setDailyAfr(BigDecimal dailyAfr) {
		this.dailyAfr = dailyAfr;
	}

	public BigDecimal getDailyAirAccr() {
		return this.dailyAirAccr;
	}

	public void setDailyAirAccr(BigDecimal dailyAirAccr) {
		this.dailyAirAccr = dailyAirAccr;
	}

	public BigDecimal getDailyProvision() {
		return this.dailyProvision;
	}

	public void setDailyProvision(BigDecimal dailyProvision) {
		this.dailyProvision = dailyProvision;
	}

	public BigDecimal getDaysAccr() {
		return this.daysAccr;
	}

	public void setDaysAccr(BigDecimal daysAccr) {
		this.daysAccr = daysAccr;
	}

	public String getDisbursedDate() {
		return this.disbursedDate;
	}

	public void setDisbursedDate(String disbursedDate) {
		this.disbursedDate = disbursedDate;
	}

	public String getDob() {
		return this.dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getExternalId() {
		return this.externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getFacRemarks() {
		return this.facRemarks;
	}

	public void setFacRemarks(String facRemarks) {
		this.facRemarks = facRemarks;
	}

	public BigDecimal getFeeIncCollateral() {
		return this.feeIncCollateral;
	}

	public void setFeeIncCollateral(BigDecimal feeIncCollateral) {
		this.feeIncCollateral = feeIncCollateral;
	}

	public BigDecimal getFeeIncDoc() {
		return this.feeIncDoc;
	}

	public void setFeeIncDoc(BigDecimal feeIncDoc) {
		this.feeIncDoc = feeIncDoc;
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

	public BigDecimal getFeeWhCbc() {
		return this.feeWhCbc;
	}

	public void setFeeWhCbc(BigDecimal feeWhCbc) {
		this.feeWhCbc = feeWhCbc;
	}

	public BigDecimal getFeeWhCollateralEyes() {
		return this.feeWhCollateralEyes;
	}

	public void setFeeWhCollateralEyes(BigDecimal feeWhCollateralEyes) {
		this.feeWhCollateralEyes = feeWhCollateralEyes;
	}

	public BigDecimal getFeeWhCollateralKraty() {
		return this.feeWhCollateralKraty;
	}

	public void setFeeWhCollateralKraty(BigDecimal feeWhCollateralKraty) {
		this.feeWhCollateralKraty = feeWhCollateralKraty;
	}

	public BigDecimal getFeeWhInsurance() {
		return this.feeWhInsurance;
	}

	public void setFeeWhInsurance(BigDecimal feeWhInsurance) {
		this.feeWhInsurance = feeWhInsurance;
	}

	public BigDecimal getFeeWhLawyer() {
		return this.feeWhLawyer;
	}

	public void setFeeWhLawyer(BigDecimal feeWhLawyer) {
		this.feeWhLawyer = feeWhLawyer;
	}

	public BigDecimal getFeeWhTrdis() {
		return this.feeWhTrdis;
	}

	public void setFeeWhTrdis(BigDecimal feeWhTrdis) {
		this.feeWhTrdis = feeWhTrdis;
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public BigDecimal getGpsExp() {
		return this.gpsExp;
	}

	public void setGpsExp(BigDecimal gpsExp) {
		this.gpsExp = gpsExp;
	}

	public String getGroupRef() {
		return this.groupRef;
	}

	public void setGroupRef(String groupRef) {
		this.groupRef = groupRef;
	}

	public String getIdType() {
		return this.idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
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

	public BigDecimal getInsuranceExp() {
		return this.insuranceExp;
	}

	public void setInsuranceExp(BigDecimal insuranceExp) {
		this.insuranceExp = insuranceExp;
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

	public Object getLastInstFullPaidDate() {
		return this.lastInstFullPaidDate;
	}

	public void setLastInstFullPaidDate(Object lastInstFullPaidDate) {
		this.lastInstFullPaidDate = lastInstFullPaidDate;
	}

	public Object getLastInstIntPaidDate() {
		return this.lastInstIntPaidDate;
	}

	public void setLastInstIntPaidDate(Object lastInstIntPaidDate) {
		this.lastInstIntPaidDate = lastInstIntPaidDate;
	}

	public Object getLastInstPrinFullPaidDate() {
		return this.lastInstPrinFullPaidDate;
	}

	public void setLastInstPrinFullPaidDate(Object lastInstPrinFullPaidDate) {
		this.lastInstPrinFullPaidDate = lastInstPrinFullPaidDate;
	}

	public BigDecimal getLastPrinPaid() {
		return this.lastPrinPaid;
	}

	public void setLastPrinPaid(BigDecimal lastPrinPaid) {
		this.lastPrinPaid = lastPrinPaid;
	}

	public String getLoanCat() {
		return this.loanCat;
	}

	public void setLoanCat(String loanCat) {
		this.loanCat = loanCat;
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

	public String getMaturityDate() {
		return this.maturityDate;
	}

	public void setMaturityDate(String maturityDate) {
		this.maturityDate = maturityDate;
	}

	public String getNbcSector() {
		return this.nbcSector;
	}

	public void setNbcSector(String nbcSector) {
		this.nbcSector = nbcSector;
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

	public String getOccupation() {
		return this.occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
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

	public BigDecimal getProvisionAmt() {
		return this.provisionAmt;
	}

	public void setProvisionAmt(BigDecimal provisionAmt) {
		this.provisionAmt = provisionAmt;
	}

	public BigDecimal getProvisionRate() {
		return this.provisionRate;
	}

	public void setProvisionRate(BigDecimal provisionRate) {
		this.provisionRate = provisionRate;
	}

	public String getRepaymentMethod() {
		return this.repaymentMethod;
	}

	public void setRepaymentMethod(String repaymentMethod) {
		this.repaymentMethod = repaymentMethod;
	}

	public Object getReportDate() {
		return this.reportDate;
	}

	public void setReportDate(Object reportDate) {
		this.reportDate = reportDate;
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

	public BigDecimal getTotalFeeIncome() {
		return this.totalFeeIncome;
	}

	public void setTotalFeeIncome(BigDecimal totalFeeIncome) {
		this.totalFeeIncome = totalFeeIncome;
	}

	public BigDecimal getTotalIntIncome() {
		return this.totalIntIncome;
	}

	public void setTotalIntIncome(BigDecimal totalIntIncome) {
		this.totalIntIncome = totalIntIncome;
	}

	public Object getValuationDate() {
		return this.valuationDate;
	}

	public void setValuationDate(Object valuationDate) {
		this.valuationDate = valuationDate;
	}

	public BigDecimal getValueAmt() {
		return this.valueAmt;
	}

	public void setValueAmt(BigDecimal valueAmt) {
		this.valueAmt = valueAmt;
	}

}