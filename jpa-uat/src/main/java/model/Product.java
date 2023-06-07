package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the PRODUCT database table.
 * 
 */
@Entity
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CUST_ACCT_TYPE_ID")
	private long custAcctTypeId;

	@Column(name="ACCR_IN_PAYABLE")
	private BigDecimal accrInPayable;

	@Column(name="ACCR_IN_RECEIVE")
	private BigDecimal accrInReceive;

	@Column(name="ACCR_IN_RECEIVE_OD_UN_USE")
	private BigDecimal accrInReceiveOdUnUse;

	@Column(name="ACCR_IN_RECEIVE_ODUSE")
	private BigDecimal accrInReceiveOduse;

	@Column(name="ACCT_TYPE")
	private String acctType;

	@Column(name="BAD_LOAN_TYPE_ID")
	private BigDecimal badLoanTypeId;

	@Column(name="BALANCE_MAX")
	private BigDecimal balanceMax;

	@Column(name="BALANCE_MIN")
	private BigDecimal balanceMin;

	@Column(name="BRANCH_ID")
	private BigDecimal branchId;

	@Column(name="CBC_FEE_GL")
	private BigDecimal cbcFeeGl;

	@Column(name="COMMITMENT_FEE_GL")
	private BigDecimal commitmentFeeGl;

	@Column(name="COMMITMENT_FEE_MAX")
	private BigDecimal commitmentFeeMax;

	@Column(name="COMMITMENT_FEE_MIN")
	private BigDecimal commitmentFeeMin;

	@Column(name="CREDIT_RATE")
	private BigDecimal creditRate;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	@Column(name="CUST_TYPE")
	private String custType;

	@Column(name="CYCLE_ID")
	private BigDecimal cycleId;

	@Column(name="CYCLE_REPAYMENT")
	private String cycleRepayment;

	@Column(name="DAILY_INTEREST")
	private BigDecimal dailyInterest;

	@Column(name="DEFAULT_RATE")
	private BigDecimal defaultRate;

	private String deleted;

	@Column(name="DEPOSIT_MAX")
	private BigDecimal depositMax;

	@Column(name="DEPOSIT_MIN")
	private BigDecimal depositMin;

	private String descriptions;

	@Column(name="DFL_AIR_GL")
	private BigDecimal dflAirGl;

	@Column(name="DFL_GL")
	private BigDecimal dflGl;

	@Column(name="DFL_INT_GL")
	private BigDecimal dflIntGl;

	@Column(name="DFL_INT_SUS_GL")
	private BigDecimal dflIntSusGl;

	@Column(name="DFL_LESS_RES_GL")
	private BigDecimal dflLessResGl;

	@Column(name="DFL_PROVISION_GL")
	private BigDecimal dflProvisionGl;

	@Column(name="DFL_UN_GL")
	private BigDecimal dflUnGl;

	@Column(name="ENTRY_FEE_MAX")
	private BigDecimal entryFeeMax;

	@Column(name="ENTRY_FEE_MIN")
	private BigDecimal entryFeeMin;

	@Column(name="FEE_AIR_GL")
	private BigDecimal feeAirGl;

	@Column(name="FEE_GL")
	private BigDecimal feeGl;

	@Column(name="FEEEXP1_GL_CR")
	private BigDecimal feeexp1GlCr;

	@Column(name="FEEEXP1_GL_DR")
	private BigDecimal feeexp1GlDr;

	@Column(name="FEEEXP2_GL_CR")
	private BigDecimal feeexp2GlCr;

	@Column(name="FEEEXP2_GL_DR")
	private BigDecimal feeexp2GlDr;

	@Column(name="FEEWH1_GL")
	private BigDecimal feewh1Gl;

	@Column(name="FEEWH2_GL")
	private BigDecimal feewh2Gl;

	@Column(name="FEEWH3_GL")
	private BigDecimal feewh3Gl;

	@Column(name="FEEWH4_GL")
	private BigDecimal feewh4Gl;

	@Column(name="FUN_ID")
	private BigDecimal funId;

	@Column(name="GL_ACCT")
	private BigDecimal glAcct;

	@Column(name="GRACE_PERIOD_DEFAULT")
	private BigDecimal gracePeriodDefault;

	@Column(name="GRACE_PERIOD_MAX")
	private BigDecimal gracePeriodMax;

	@Column(name="GRACE_PERIOD_MIN")
	private BigDecimal gracePeriodMin;

	@Column(name="HOLIDAY_INTEREST")
	private String holidayInterest;

	@Column(name="IN_EXPEND")
	private BigDecimal inExpend;

	@Column(name="IN_INCOME")
	private BigDecimal inIncome;

	@Column(name="IN_INCOME_OD_UN_USE")
	private BigDecimal inIncomeOdUnUse;

	@Column(name="IN_INCOME_ODUSE")
	private BigDecimal inIncomeOduse;

	@Column(name="IN_MAX")
	private BigDecimal inMax;

	@Column(name="IN_MIN")
	private BigDecimal inMin;

	@Column(name="IN_TYPE")
	private String inType;

	@Column(name="INITIAL_AMT_MAX")
	private BigDecimal initialAmtMax;

	@Column(name="INITIAL_AMT_MIN")
	private BigDecimal initialAmtMin;

	@Column(name="INSTALMENT_DEFAULT")
	private BigDecimal instalmentDefault;

	@Column(name="INSTALMENT_MAX")
	private BigDecimal instalmentMax;

	@Column(name="INSTALMENT_MIN")
	private BigDecimal instalmentMin;

	@Column(name="INSTALMENT_TYPE")
	private String instalmentType;

	@Column(name="INSURANCE_FEE_DR_GL")
	private BigDecimal insuranceFeeDrGl;

	@Column(name="INSURANCE_FEE_GL")
	private BigDecimal insuranceFeeGl;

	@Column(name="LAWYER_FEE_GL")
	private BigDecimal lawyerFeeGl;

	@Column(name="LL_AIR_GL")
	private BigDecimal llAirGl;

	@Column(name="LL_GL")
	private BigDecimal llGl;

	@Column(name="LL_INT_GL")
	private BigDecimal llIntGl;

	@Column(name="LL_INT_SUS_GL")
	private BigDecimal llIntSusGl;

	@Column(name="LL_LESS_RES_GL")
	private BigDecimal llLessResGl;

	@Column(name="LL_PROVISION_GL")
	private BigDecimal llProvisionGl;

	@Column(name="LL_UN_GL")
	private BigDecimal llUnGl;

	@Column(name="\"NAMES\"")
	private String names;

	@Column(name="NPL_INT_GL")
	private BigDecimal nplIntGl;

	@Column(name="OD_MAX")
	private BigDecimal odMax;

	@Column(name="OD_MIN")
	private BigDecimal odMin;

	@Column(name="OVERDUE_IN_MAX")
	private BigDecimal overdueInMax;

	@Column(name="OVERDUE_IN_MIN")
	private BigDecimal overdueInMin;

	@Column(name="OVERDUE_PRIN_MAX")
	private BigDecimal overduePrinMax;

	@Column(name="OVERDUE_PRIN_MIN")
	private BigDecimal overduePrinMin;

	@Column(name="OVERDUE_TOTAL_MAX")
	private BigDecimal overdueTotalMax;

	@Column(name="OVERDUE_TOTAL_MIN")
	private BigDecimal overdueTotalMin;

	@Column(name="PAID_PRINCIPLE_FIST")
	private String paidPrincipleFist;

	@Column(name="PAID_PRINCIPLE_OVERDUE_FIRST")
	private String paidPrincipleOverdueFirst;

	@Column(name="PAYOFF_INST_NUM")
	private BigDecimal payoffInstNum;

	@Column(name="PAYOFF_PEN_GL")
	private BigDecimal payoffPenGl;

	@Column(name="PAYOFF_PEN_RATE")
	private BigDecimal payoffPenRate;

	@Column(name="PENALTY_ACCT")
	private BigDecimal penaltyAcct;

	@Column(name="POST_ACCT_ID")
	private BigDecimal postAcctId;

	@Column(name="PRO_GL")
	private BigDecimal proGl;

	@Column(name="RATE_OD_UNUSE_MAX")
	private BigDecimal rateOdUnuseMax;

	@Column(name="RATE_OD_UNUSE_MIN")
	private BigDecimal rateOdUnuseMin;

	@Column(name="RATE_OD_USE_MAX")
	private BigDecimal rateOdUseMax;

	@Column(name="RATE_OD_USE_MIN")
	private BigDecimal rateOdUseMin;

	@Column(name="RESERVE_GL")
	private BigDecimal reserveGl;

	@Column(name="REV_PRO_GEN_GL")
	private BigDecimal revProGenGl;

	@Column(name="SETFO_FEE_GL")
	private BigDecimal setfoFeeGl;

	@Column(name="SML_AIR_GL")
	private BigDecimal smlAirGl;

	@Column(name="SML_GL")
	private BigDecimal smlGl;

	@Column(name="SML_INT_GL")
	private BigDecimal smlIntGl;

	@Column(name="SML_INT_SUS_GL")
	private BigDecimal smlIntSusGl;

	@Column(name="SML_LESS_RES_GL")
	private BigDecimal smlLessResGl;

	@Column(name="SML_PROVISION_GL")
	private BigDecimal smlProvisionGl;

	@Column(name="SML_UN_GL")
	private BigDecimal smlUnGl;

	@Column(name="SSL_AIR_GL")
	private BigDecimal sslAirGl;

	@Column(name="SSL_GL")
	private BigDecimal sslGl;

	@Column(name="SSL_INT_GL")
	private BigDecimal sslIntGl;

	@Column(name="SSL_INT_SUS_GL")
	private BigDecimal sslIntSusGl;

	@Column(name="SSL_LESS_RES_GL")
	private BigDecimal sslLessResGl;

	@Column(name="SSL_PROVISION_GL")
	private BigDecimal sslProvisionGl;

	@Column(name="SSL_UN_GL")
	private BigDecimal sslUnGl;

	private BigDecimal tax;

	@Column(name="TAX_GOV")
	private BigDecimal taxGov;

	@Column(name="UN_COMMITMENT_FEE_GL")
	private BigDecimal unCommitmentFeeGl;

	@Column(name="UNEARN_IN")
	private BigDecimal unearnIn;

	@Column(name="VALUATION_FEE_GL")
	private BigDecimal valuationFeeGl;

	@Column(name="WEEKLY_MAX")
	private BigDecimal weeklyMax;

	@Column(name="WEEKLY_MIN")
	private BigDecimal weeklyMin;

	@Column(name="WITHDRAW_MAX")
	private BigDecimal withdrawMax;

	@Column(name="WITHDRAW_MIN")
	private BigDecimal withdrawMin;

	public Product() {
	}

	public long getCustAcctTypeId() {
		return this.custAcctTypeId;
	}

	public void setCustAcctTypeId(long custAcctTypeId) {
		this.custAcctTypeId = custAcctTypeId;
	}

	public BigDecimal getAccrInPayable() {
		return this.accrInPayable;
	}

	public void setAccrInPayable(BigDecimal accrInPayable) {
		this.accrInPayable = accrInPayable;
	}

	public BigDecimal getAccrInReceive() {
		return this.accrInReceive;
	}

	public void setAccrInReceive(BigDecimal accrInReceive) {
		this.accrInReceive = accrInReceive;
	}

	public BigDecimal getAccrInReceiveOdUnUse() {
		return this.accrInReceiveOdUnUse;
	}

	public void setAccrInReceiveOdUnUse(BigDecimal accrInReceiveOdUnUse) {
		this.accrInReceiveOdUnUse = accrInReceiveOdUnUse;
	}

	public BigDecimal getAccrInReceiveOduse() {
		return this.accrInReceiveOduse;
	}

	public void setAccrInReceiveOduse(BigDecimal accrInReceiveOduse) {
		this.accrInReceiveOduse = accrInReceiveOduse;
	}

	public String getAcctType() {
		return this.acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}

	public BigDecimal getBadLoanTypeId() {
		return this.badLoanTypeId;
	}

	public void setBadLoanTypeId(BigDecimal badLoanTypeId) {
		this.badLoanTypeId = badLoanTypeId;
	}

	public BigDecimal getBalanceMax() {
		return this.balanceMax;
	}

	public void setBalanceMax(BigDecimal balanceMax) {
		this.balanceMax = balanceMax;
	}

	public BigDecimal getBalanceMin() {
		return this.balanceMin;
	}

	public void setBalanceMin(BigDecimal balanceMin) {
		this.balanceMin = balanceMin;
	}

	public BigDecimal getBranchId() {
		return this.branchId;
	}

	public void setBranchId(BigDecimal branchId) {
		this.branchId = branchId;
	}

	public BigDecimal getCbcFeeGl() {
		return this.cbcFeeGl;
	}

	public void setCbcFeeGl(BigDecimal cbcFeeGl) {
		this.cbcFeeGl = cbcFeeGl;
	}

	public BigDecimal getCommitmentFeeGl() {
		return this.commitmentFeeGl;
	}

	public void setCommitmentFeeGl(BigDecimal commitmentFeeGl) {
		this.commitmentFeeGl = commitmentFeeGl;
	}

	public BigDecimal getCommitmentFeeMax() {
		return this.commitmentFeeMax;
	}

	public void setCommitmentFeeMax(BigDecimal commitmentFeeMax) {
		this.commitmentFeeMax = commitmentFeeMax;
	}

	public BigDecimal getCommitmentFeeMin() {
		return this.commitmentFeeMin;
	}

	public void setCommitmentFeeMin(BigDecimal commitmentFeeMin) {
		this.commitmentFeeMin = commitmentFeeMin;
	}

	public BigDecimal getCreditRate() {
		return this.creditRate;
	}

	public void setCreditRate(BigDecimal creditRate) {
		this.creditRate = creditRate;
	}

	public BigDecimal getCurrId() {
		return this.currId;
	}

	public void setCurrId(BigDecimal currId) {
		this.currId = currId;
	}

	public String getCustType() {
		return this.custType;
	}

	public void setCustType(String custType) {
		this.custType = custType;
	}

	public BigDecimal getCycleId() {
		return this.cycleId;
	}

	public void setCycleId(BigDecimal cycleId) {
		this.cycleId = cycleId;
	}

	public String getCycleRepayment() {
		return this.cycleRepayment;
	}

	public void setCycleRepayment(String cycleRepayment) {
		this.cycleRepayment = cycleRepayment;
	}

	public BigDecimal getDailyInterest() {
		return this.dailyInterest;
	}

	public void setDailyInterest(BigDecimal dailyInterest) {
		this.dailyInterest = dailyInterest;
	}

	public BigDecimal getDefaultRate() {
		return this.defaultRate;
	}

	public void setDefaultRate(BigDecimal defaultRate) {
		this.defaultRate = defaultRate;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public BigDecimal getDepositMax() {
		return this.depositMax;
	}

	public void setDepositMax(BigDecimal depositMax) {
		this.depositMax = depositMax;
	}

	public BigDecimal getDepositMin() {
		return this.depositMin;
	}

	public void setDepositMin(BigDecimal depositMin) {
		this.depositMin = depositMin;
	}

	public String getDescriptions() {
		return this.descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	public BigDecimal getDflAirGl() {
		return this.dflAirGl;
	}

	public void setDflAirGl(BigDecimal dflAirGl) {
		this.dflAirGl = dflAirGl;
	}

	public BigDecimal getDflGl() {
		return this.dflGl;
	}

	public void setDflGl(BigDecimal dflGl) {
		this.dflGl = dflGl;
	}

	public BigDecimal getDflIntGl() {
		return this.dflIntGl;
	}

	public void setDflIntGl(BigDecimal dflIntGl) {
		this.dflIntGl = dflIntGl;
	}

	public BigDecimal getDflIntSusGl() {
		return this.dflIntSusGl;
	}

	public void setDflIntSusGl(BigDecimal dflIntSusGl) {
		this.dflIntSusGl = dflIntSusGl;
	}

	public BigDecimal getDflLessResGl() {
		return this.dflLessResGl;
	}

	public void setDflLessResGl(BigDecimal dflLessResGl) {
		this.dflLessResGl = dflLessResGl;
	}

	public BigDecimal getDflProvisionGl() {
		return this.dflProvisionGl;
	}

	public void setDflProvisionGl(BigDecimal dflProvisionGl) {
		this.dflProvisionGl = dflProvisionGl;
	}

	public BigDecimal getDflUnGl() {
		return this.dflUnGl;
	}

	public void setDflUnGl(BigDecimal dflUnGl) {
		this.dflUnGl = dflUnGl;
	}

	public BigDecimal getEntryFeeMax() {
		return this.entryFeeMax;
	}

	public void setEntryFeeMax(BigDecimal entryFeeMax) {
		this.entryFeeMax = entryFeeMax;
	}

	public BigDecimal getEntryFeeMin() {
		return this.entryFeeMin;
	}

	public void setEntryFeeMin(BigDecimal entryFeeMin) {
		this.entryFeeMin = entryFeeMin;
	}

	public BigDecimal getFeeAirGl() {
		return this.feeAirGl;
	}

	public void setFeeAirGl(BigDecimal feeAirGl) {
		this.feeAirGl = feeAirGl;
	}

	public BigDecimal getFeeGl() {
		return this.feeGl;
	}

	public void setFeeGl(BigDecimal feeGl) {
		this.feeGl = feeGl;
	}

	public BigDecimal getFeeexp1GlCr() {
		return this.feeexp1GlCr;
	}

	public void setFeeexp1GlCr(BigDecimal feeexp1GlCr) {
		this.feeexp1GlCr = feeexp1GlCr;
	}

	public BigDecimal getFeeexp1GlDr() {
		return this.feeexp1GlDr;
	}

	public void setFeeexp1GlDr(BigDecimal feeexp1GlDr) {
		this.feeexp1GlDr = feeexp1GlDr;
	}

	public BigDecimal getFeeexp2GlCr() {
		return this.feeexp2GlCr;
	}

	public void setFeeexp2GlCr(BigDecimal feeexp2GlCr) {
		this.feeexp2GlCr = feeexp2GlCr;
	}

	public BigDecimal getFeeexp2GlDr() {
		return this.feeexp2GlDr;
	}

	public void setFeeexp2GlDr(BigDecimal feeexp2GlDr) {
		this.feeexp2GlDr = feeexp2GlDr;
	}

	public BigDecimal getFeewh1Gl() {
		return this.feewh1Gl;
	}

	public void setFeewh1Gl(BigDecimal feewh1Gl) {
		this.feewh1Gl = feewh1Gl;
	}

	public BigDecimal getFeewh2Gl() {
		return this.feewh2Gl;
	}

	public void setFeewh2Gl(BigDecimal feewh2Gl) {
		this.feewh2Gl = feewh2Gl;
	}

	public BigDecimal getFeewh3Gl() {
		return this.feewh3Gl;
	}

	public void setFeewh3Gl(BigDecimal feewh3Gl) {
		this.feewh3Gl = feewh3Gl;
	}

	public BigDecimal getFeewh4Gl() {
		return this.feewh4Gl;
	}

	public void setFeewh4Gl(BigDecimal feewh4Gl) {
		this.feewh4Gl = feewh4Gl;
	}

	public BigDecimal getFunId() {
		return this.funId;
	}

	public void setFunId(BigDecimal funId) {
		this.funId = funId;
	}

	public BigDecimal getGlAcct() {
		return this.glAcct;
	}

	public void setGlAcct(BigDecimal glAcct) {
		this.glAcct = glAcct;
	}

	public BigDecimal getGracePeriodDefault() {
		return this.gracePeriodDefault;
	}

	public void setGracePeriodDefault(BigDecimal gracePeriodDefault) {
		this.gracePeriodDefault = gracePeriodDefault;
	}

	public BigDecimal getGracePeriodMax() {
		return this.gracePeriodMax;
	}

	public void setGracePeriodMax(BigDecimal gracePeriodMax) {
		this.gracePeriodMax = gracePeriodMax;
	}

	public BigDecimal getGracePeriodMin() {
		return this.gracePeriodMin;
	}

	public void setGracePeriodMin(BigDecimal gracePeriodMin) {
		this.gracePeriodMin = gracePeriodMin;
	}

	public String getHolidayInterest() {
		return this.holidayInterest;
	}

	public void setHolidayInterest(String holidayInterest) {
		this.holidayInterest = holidayInterest;
	}

	public BigDecimal getInExpend() {
		return this.inExpend;
	}

	public void setInExpend(BigDecimal inExpend) {
		this.inExpend = inExpend;
	}

	public BigDecimal getInIncome() {
		return this.inIncome;
	}

	public void setInIncome(BigDecimal inIncome) {
		this.inIncome = inIncome;
	}

	public BigDecimal getInIncomeOdUnUse() {
		return this.inIncomeOdUnUse;
	}

	public void setInIncomeOdUnUse(BigDecimal inIncomeOdUnUse) {
		this.inIncomeOdUnUse = inIncomeOdUnUse;
	}

	public BigDecimal getInIncomeOduse() {
		return this.inIncomeOduse;
	}

	public void setInIncomeOduse(BigDecimal inIncomeOduse) {
		this.inIncomeOduse = inIncomeOduse;
	}

	public BigDecimal getInMax() {
		return this.inMax;
	}

	public void setInMax(BigDecimal inMax) {
		this.inMax = inMax;
	}

	public BigDecimal getInMin() {
		return this.inMin;
	}

	public void setInMin(BigDecimal inMin) {
		this.inMin = inMin;
	}

	public String getInType() {
		return this.inType;
	}

	public void setInType(String inType) {
		this.inType = inType;
	}

	public BigDecimal getInitialAmtMax() {
		return this.initialAmtMax;
	}

	public void setInitialAmtMax(BigDecimal initialAmtMax) {
		this.initialAmtMax = initialAmtMax;
	}

	public BigDecimal getInitialAmtMin() {
		return this.initialAmtMin;
	}

	public void setInitialAmtMin(BigDecimal initialAmtMin) {
		this.initialAmtMin = initialAmtMin;
	}

	public BigDecimal getInstalmentDefault() {
		return this.instalmentDefault;
	}

	public void setInstalmentDefault(BigDecimal instalmentDefault) {
		this.instalmentDefault = instalmentDefault;
	}

	public BigDecimal getInstalmentMax() {
		return this.instalmentMax;
	}

	public void setInstalmentMax(BigDecimal instalmentMax) {
		this.instalmentMax = instalmentMax;
	}

	public BigDecimal getInstalmentMin() {
		return this.instalmentMin;
	}

	public void setInstalmentMin(BigDecimal instalmentMin) {
		this.instalmentMin = instalmentMin;
	}

	public String getInstalmentType() {
		return this.instalmentType;
	}

	public void setInstalmentType(String instalmentType) {
		this.instalmentType = instalmentType;
	}

	public BigDecimal getInsuranceFeeDrGl() {
		return this.insuranceFeeDrGl;
	}

	public void setInsuranceFeeDrGl(BigDecimal insuranceFeeDrGl) {
		this.insuranceFeeDrGl = insuranceFeeDrGl;
	}

	public BigDecimal getInsuranceFeeGl() {
		return this.insuranceFeeGl;
	}

	public void setInsuranceFeeGl(BigDecimal insuranceFeeGl) {
		this.insuranceFeeGl = insuranceFeeGl;
	}

	public BigDecimal getLawyerFeeGl() {
		return this.lawyerFeeGl;
	}

	public void setLawyerFeeGl(BigDecimal lawyerFeeGl) {
		this.lawyerFeeGl = lawyerFeeGl;
	}

	public BigDecimal getLlAirGl() {
		return this.llAirGl;
	}

	public void setLlAirGl(BigDecimal llAirGl) {
		this.llAirGl = llAirGl;
	}

	public BigDecimal getLlGl() {
		return this.llGl;
	}

	public void setLlGl(BigDecimal llGl) {
		this.llGl = llGl;
	}

	public BigDecimal getLlIntGl() {
		return this.llIntGl;
	}

	public void setLlIntGl(BigDecimal llIntGl) {
		this.llIntGl = llIntGl;
	}

	public BigDecimal getLlIntSusGl() {
		return this.llIntSusGl;
	}

	public void setLlIntSusGl(BigDecimal llIntSusGl) {
		this.llIntSusGl = llIntSusGl;
	}

	public BigDecimal getLlLessResGl() {
		return this.llLessResGl;
	}

	public void setLlLessResGl(BigDecimal llLessResGl) {
		this.llLessResGl = llLessResGl;
	}

	public BigDecimal getLlProvisionGl() {
		return this.llProvisionGl;
	}

	public void setLlProvisionGl(BigDecimal llProvisionGl) {
		this.llProvisionGl = llProvisionGl;
	}

	public BigDecimal getLlUnGl() {
		return this.llUnGl;
	}

	public void setLlUnGl(BigDecimal llUnGl) {
		this.llUnGl = llUnGl;
	}

	public String getNames() {
		return this.names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public BigDecimal getNplIntGl() {
		return this.nplIntGl;
	}

	public void setNplIntGl(BigDecimal nplIntGl) {
		this.nplIntGl = nplIntGl;
	}

	public BigDecimal getOdMax() {
		return this.odMax;
	}

	public void setOdMax(BigDecimal odMax) {
		this.odMax = odMax;
	}

	public BigDecimal getOdMin() {
		return this.odMin;
	}

	public void setOdMin(BigDecimal odMin) {
		this.odMin = odMin;
	}

	public BigDecimal getOverdueInMax() {
		return this.overdueInMax;
	}

	public void setOverdueInMax(BigDecimal overdueInMax) {
		this.overdueInMax = overdueInMax;
	}

	public BigDecimal getOverdueInMin() {
		return this.overdueInMin;
	}

	public void setOverdueInMin(BigDecimal overdueInMin) {
		this.overdueInMin = overdueInMin;
	}

	public BigDecimal getOverduePrinMax() {
		return this.overduePrinMax;
	}

	public void setOverduePrinMax(BigDecimal overduePrinMax) {
		this.overduePrinMax = overduePrinMax;
	}

	public BigDecimal getOverduePrinMin() {
		return this.overduePrinMin;
	}

	public void setOverduePrinMin(BigDecimal overduePrinMin) {
		this.overduePrinMin = overduePrinMin;
	}

	public BigDecimal getOverdueTotalMax() {
		return this.overdueTotalMax;
	}

	public void setOverdueTotalMax(BigDecimal overdueTotalMax) {
		this.overdueTotalMax = overdueTotalMax;
	}

	public BigDecimal getOverdueTotalMin() {
		return this.overdueTotalMin;
	}

	public void setOverdueTotalMin(BigDecimal overdueTotalMin) {
		this.overdueTotalMin = overdueTotalMin;
	}

	public String getPaidPrincipleFist() {
		return this.paidPrincipleFist;
	}

	public void setPaidPrincipleFist(String paidPrincipleFist) {
		this.paidPrincipleFist = paidPrincipleFist;
	}

	public String getPaidPrincipleOverdueFirst() {
		return this.paidPrincipleOverdueFirst;
	}

	public void setPaidPrincipleOverdueFirst(String paidPrincipleOverdueFirst) {
		this.paidPrincipleOverdueFirst = paidPrincipleOverdueFirst;
	}

	public BigDecimal getPayoffInstNum() {
		return this.payoffInstNum;
	}

	public void setPayoffInstNum(BigDecimal payoffInstNum) {
		this.payoffInstNum = payoffInstNum;
	}

	public BigDecimal getPayoffPenGl() {
		return this.payoffPenGl;
	}

	public void setPayoffPenGl(BigDecimal payoffPenGl) {
		this.payoffPenGl = payoffPenGl;
	}

	public BigDecimal getPayoffPenRate() {
		return this.payoffPenRate;
	}

	public void setPayoffPenRate(BigDecimal payoffPenRate) {
		this.payoffPenRate = payoffPenRate;
	}

	public BigDecimal getPenaltyAcct() {
		return this.penaltyAcct;
	}

	public void setPenaltyAcct(BigDecimal penaltyAcct) {
		this.penaltyAcct = penaltyAcct;
	}

	public BigDecimal getPostAcctId() {
		return this.postAcctId;
	}

	public void setPostAcctId(BigDecimal postAcctId) {
		this.postAcctId = postAcctId;
	}

	public BigDecimal getProGl() {
		return this.proGl;
	}

	public void setProGl(BigDecimal proGl) {
		this.proGl = proGl;
	}

	public BigDecimal getRateOdUnuseMax() {
		return this.rateOdUnuseMax;
	}

	public void setRateOdUnuseMax(BigDecimal rateOdUnuseMax) {
		this.rateOdUnuseMax = rateOdUnuseMax;
	}

	public BigDecimal getRateOdUnuseMin() {
		return this.rateOdUnuseMin;
	}

	public void setRateOdUnuseMin(BigDecimal rateOdUnuseMin) {
		this.rateOdUnuseMin = rateOdUnuseMin;
	}

	public BigDecimal getRateOdUseMax() {
		return this.rateOdUseMax;
	}

	public void setRateOdUseMax(BigDecimal rateOdUseMax) {
		this.rateOdUseMax = rateOdUseMax;
	}

	public BigDecimal getRateOdUseMin() {
		return this.rateOdUseMin;
	}

	public void setRateOdUseMin(BigDecimal rateOdUseMin) {
		this.rateOdUseMin = rateOdUseMin;
	}

	public BigDecimal getReserveGl() {
		return this.reserveGl;
	}

	public void setReserveGl(BigDecimal reserveGl) {
		this.reserveGl = reserveGl;
	}

	public BigDecimal getRevProGenGl() {
		return this.revProGenGl;
	}

	public void setRevProGenGl(BigDecimal revProGenGl) {
		this.revProGenGl = revProGenGl;
	}

	public BigDecimal getSetfoFeeGl() {
		return this.setfoFeeGl;
	}

	public void setSetfoFeeGl(BigDecimal setfoFeeGl) {
		this.setfoFeeGl = setfoFeeGl;
	}

	public BigDecimal getSmlAirGl() {
		return this.smlAirGl;
	}

	public void setSmlAirGl(BigDecimal smlAirGl) {
		this.smlAirGl = smlAirGl;
	}

	public BigDecimal getSmlGl() {
		return this.smlGl;
	}

	public void setSmlGl(BigDecimal smlGl) {
		this.smlGl = smlGl;
	}

	public BigDecimal getSmlIntGl() {
		return this.smlIntGl;
	}

	public void setSmlIntGl(BigDecimal smlIntGl) {
		this.smlIntGl = smlIntGl;
	}

	public BigDecimal getSmlIntSusGl() {
		return this.smlIntSusGl;
	}

	public void setSmlIntSusGl(BigDecimal smlIntSusGl) {
		this.smlIntSusGl = smlIntSusGl;
	}

	public BigDecimal getSmlLessResGl() {
		return this.smlLessResGl;
	}

	public void setSmlLessResGl(BigDecimal smlLessResGl) {
		this.smlLessResGl = smlLessResGl;
	}

	public BigDecimal getSmlProvisionGl() {
		return this.smlProvisionGl;
	}

	public void setSmlProvisionGl(BigDecimal smlProvisionGl) {
		this.smlProvisionGl = smlProvisionGl;
	}

	public BigDecimal getSmlUnGl() {
		return this.smlUnGl;
	}

	public void setSmlUnGl(BigDecimal smlUnGl) {
		this.smlUnGl = smlUnGl;
	}

	public BigDecimal getSslAirGl() {
		return this.sslAirGl;
	}

	public void setSslAirGl(BigDecimal sslAirGl) {
		this.sslAirGl = sslAirGl;
	}

	public BigDecimal getSslGl() {
		return this.sslGl;
	}

	public void setSslGl(BigDecimal sslGl) {
		this.sslGl = sslGl;
	}

	public BigDecimal getSslIntGl() {
		return this.sslIntGl;
	}

	public void setSslIntGl(BigDecimal sslIntGl) {
		this.sslIntGl = sslIntGl;
	}

	public BigDecimal getSslIntSusGl() {
		return this.sslIntSusGl;
	}

	public void setSslIntSusGl(BigDecimal sslIntSusGl) {
		this.sslIntSusGl = sslIntSusGl;
	}

	public BigDecimal getSslLessResGl() {
		return this.sslLessResGl;
	}

	public void setSslLessResGl(BigDecimal sslLessResGl) {
		this.sslLessResGl = sslLessResGl;
	}

	public BigDecimal getSslProvisionGl() {
		return this.sslProvisionGl;
	}

	public void setSslProvisionGl(BigDecimal sslProvisionGl) {
		this.sslProvisionGl = sslProvisionGl;
	}

	public BigDecimal getSslUnGl() {
		return this.sslUnGl;
	}

	public void setSslUnGl(BigDecimal sslUnGl) {
		this.sslUnGl = sslUnGl;
	}

	public BigDecimal getTax() {
		return this.tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	public BigDecimal getTaxGov() {
		return this.taxGov;
	}

	public void setTaxGov(BigDecimal taxGov) {
		this.taxGov = taxGov;
	}

	public BigDecimal getUnCommitmentFeeGl() {
		return this.unCommitmentFeeGl;
	}

	public void setUnCommitmentFeeGl(BigDecimal unCommitmentFeeGl) {
		this.unCommitmentFeeGl = unCommitmentFeeGl;
	}

	public BigDecimal getUnearnIn() {
		return this.unearnIn;
	}

	public void setUnearnIn(BigDecimal unearnIn) {
		this.unearnIn = unearnIn;
	}

	public BigDecimal getValuationFeeGl() {
		return this.valuationFeeGl;
	}

	public void setValuationFeeGl(BigDecimal valuationFeeGl) {
		this.valuationFeeGl = valuationFeeGl;
	}

	public BigDecimal getWeeklyMax() {
		return this.weeklyMax;
	}

	public void setWeeklyMax(BigDecimal weeklyMax) {
		this.weeklyMax = weeklyMax;
	}

	public BigDecimal getWeeklyMin() {
		return this.weeklyMin;
	}

	public void setWeeklyMin(BigDecimal weeklyMin) {
		this.weeklyMin = weeklyMin;
	}

	public BigDecimal getWithdrawMax() {
		return this.withdrawMax;
	}

	public void setWithdrawMax(BigDecimal withdrawMax) {
		this.withdrawMax = withdrawMax;
	}

	public BigDecimal getWithdrawMin() {
		return this.withdrawMin;
	}

	public void setWithdrawMin(BigDecimal withdrawMin) {
		this.withdrawMin = withdrawMin;
	}

}