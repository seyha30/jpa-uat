package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SBF_VARIABLE_BACKUP database table.
 * 
 */
@Entity
@Table(name="SBF_VARIABLE_BACKUP")
@NamedQuery(name="SbfVariableBackup.findAll", query="SELECT s FROM SbfVariableBackup s")
public class SbfVariableBackup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="BEG_OUTSTANDING")
	private BigDecimal begOutstanding;

	@Column(name="BRANCH_ID")
	private BigDecimal branchId;

	@Column(name="CO_ID")
	private String coId;

	@Column(name="DATE_DONE")
	private Object dateDone;

	private String description;

	@Column(name="EMPREP_POSITION")
	private String emprepPosition;

	@Column(name="FEE_COLLECT")
	private BigDecimal feeCollect;

	@Column(name="FUNDING_COST")
	private BigDecimal fundingCost;

	@Column(name="GROW_AMT")
	private BigDecimal growAmt;

	@Column(name="GROW_PLAN")
	private BigDecimal growPlan;

	@Column(name="IN_COLLECT")
	private BigDecimal inCollect;

	@Column(name="INT_COLLECT")
	private BigDecimal intCollect;

	@Column(name="NET_GROW")
	private BigDecimal netGrow;

	@Column(name="NO_ACCT")
	private BigDecimal noAcct;

	@Column(name="NO_ACCT_TRANSFER")
	private BigDecimal noAcctTransfer;

	@Column(name="OPERATION_COST")
	private BigDecimal operationCost;

	@Column(name="OUT_KHR")
	private BigDecimal outKhr;

	@Column(name="OUT_KHR_TRANSFER")
	private BigDecimal outKhrTransfer;

	@Column(name="OUT_USD")
	private BigDecimal outUsd;

	@Column(name="OUT_USD_TRANSFER")
	private BigDecimal outUsdTransfer;

	private BigDecimal outstanding;

	@Column(name="OUTSTANDING_TRANSFER")
	private BigDecimal outstandingTransfer;

	@Column(name="OVERDUE_AMT")
	private BigDecimal overdueAmt;

	@Column(name="P_OWED_LAST_MONTH")
	private BigDecimal pOwedLastMonth;

	@Column(name="PAID_AMOUNT")
	private BigDecimal paidAmount;

	@Column(name="PAR_RATE")
	private BigDecimal parRate;

	@Column(name="PAR30_AMOUNT")
	private BigDecimal par30Amount;

	@Column(name="PAR30_AMOUNT_TR")
	private BigDecimal par30AmountTr;

	@Column(name="PAR30_RATE")
	private BigDecimal par30Rate;

	@Column(name="PAR30_RATE_TR")
	private BigDecimal par30RateTr;

	@Column(name="REPAYMENT_RATE")
	private BigDecimal repaymentRate;

	@Column(name="SPECIALIZE_CODE")
	private BigDecimal specializeCode;

	@Column(name="UP_FRONT_FDD")
	private BigDecimal upFrontFdd;

	@Column(name="VARIABLE_PAY")
	private BigDecimal variablePay;

	@Column(name="VARIABLE_RATE")
	private BigDecimal variableRate;

	@Column(name="YES_NO")
	private String yesNo;

	public SbfVariableBackup() {
	}

	public BigDecimal getBegOutstanding() {
		return this.begOutstanding;
	}

	public void setBegOutstanding(BigDecimal begOutstanding) {
		this.begOutstanding = begOutstanding;
	}

	public BigDecimal getBranchId() {
		return this.branchId;
	}

	public void setBranchId(BigDecimal branchId) {
		this.branchId = branchId;
	}

	public String getCoId() {
		return this.coId;
	}

	public void setCoId(String coId) {
		this.coId = coId;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmprepPosition() {
		return this.emprepPosition;
	}

	public void setEmprepPosition(String emprepPosition) {
		this.emprepPosition = emprepPosition;
	}

	public BigDecimal getFeeCollect() {
		return this.feeCollect;
	}

	public void setFeeCollect(BigDecimal feeCollect) {
		this.feeCollect = feeCollect;
	}

	public BigDecimal getFundingCost() {
		return this.fundingCost;
	}

	public void setFundingCost(BigDecimal fundingCost) {
		this.fundingCost = fundingCost;
	}

	public BigDecimal getGrowAmt() {
		return this.growAmt;
	}

	public void setGrowAmt(BigDecimal growAmt) {
		this.growAmt = growAmt;
	}

	public BigDecimal getGrowPlan() {
		return this.growPlan;
	}

	public void setGrowPlan(BigDecimal growPlan) {
		this.growPlan = growPlan;
	}

	public BigDecimal getInCollect() {
		return this.inCollect;
	}

	public void setInCollect(BigDecimal inCollect) {
		this.inCollect = inCollect;
	}

	public BigDecimal getIntCollect() {
		return this.intCollect;
	}

	public void setIntCollect(BigDecimal intCollect) {
		this.intCollect = intCollect;
	}

	public BigDecimal getNetGrow() {
		return this.netGrow;
	}

	public void setNetGrow(BigDecimal netGrow) {
		this.netGrow = netGrow;
	}

	public BigDecimal getNoAcct() {
		return this.noAcct;
	}

	public void setNoAcct(BigDecimal noAcct) {
		this.noAcct = noAcct;
	}

	public BigDecimal getNoAcctTransfer() {
		return this.noAcctTransfer;
	}

	public void setNoAcctTransfer(BigDecimal noAcctTransfer) {
		this.noAcctTransfer = noAcctTransfer;
	}

	public BigDecimal getOperationCost() {
		return this.operationCost;
	}

	public void setOperationCost(BigDecimal operationCost) {
		this.operationCost = operationCost;
	}

	public BigDecimal getOutKhr() {
		return this.outKhr;
	}

	public void setOutKhr(BigDecimal outKhr) {
		this.outKhr = outKhr;
	}

	public BigDecimal getOutKhrTransfer() {
		return this.outKhrTransfer;
	}

	public void setOutKhrTransfer(BigDecimal outKhrTransfer) {
		this.outKhrTransfer = outKhrTransfer;
	}

	public BigDecimal getOutUsd() {
		return this.outUsd;
	}

	public void setOutUsd(BigDecimal outUsd) {
		this.outUsd = outUsd;
	}

	public BigDecimal getOutUsdTransfer() {
		return this.outUsdTransfer;
	}

	public void setOutUsdTransfer(BigDecimal outUsdTransfer) {
		this.outUsdTransfer = outUsdTransfer;
	}

	public BigDecimal getOutstanding() {
		return this.outstanding;
	}

	public void setOutstanding(BigDecimal outstanding) {
		this.outstanding = outstanding;
	}

	public BigDecimal getOutstandingTransfer() {
		return this.outstandingTransfer;
	}

	public void setOutstandingTransfer(BigDecimal outstandingTransfer) {
		this.outstandingTransfer = outstandingTransfer;
	}

	public BigDecimal getOverdueAmt() {
		return this.overdueAmt;
	}

	public void setOverdueAmt(BigDecimal overdueAmt) {
		this.overdueAmt = overdueAmt;
	}

	public BigDecimal getPOwedLastMonth() {
		return this.pOwedLastMonth;
	}

	public void setPOwedLastMonth(BigDecimal pOwedLastMonth) {
		this.pOwedLastMonth = pOwedLastMonth;
	}

	public BigDecimal getPaidAmount() {
		return this.paidAmount;
	}

	public void setPaidAmount(BigDecimal paidAmount) {
		this.paidAmount = paidAmount;
	}

	public BigDecimal getParRate() {
		return this.parRate;
	}

	public void setParRate(BigDecimal parRate) {
		this.parRate = parRate;
	}

	public BigDecimal getPar30Amount() {
		return this.par30Amount;
	}

	public void setPar30Amount(BigDecimal par30Amount) {
		this.par30Amount = par30Amount;
	}

	public BigDecimal getPar30AmountTr() {
		return this.par30AmountTr;
	}

	public void setPar30AmountTr(BigDecimal par30AmountTr) {
		this.par30AmountTr = par30AmountTr;
	}

	public BigDecimal getPar30Rate() {
		return this.par30Rate;
	}

	public void setPar30Rate(BigDecimal par30Rate) {
		this.par30Rate = par30Rate;
	}

	public BigDecimal getPar30RateTr() {
		return this.par30RateTr;
	}

	public void setPar30RateTr(BigDecimal par30RateTr) {
		this.par30RateTr = par30RateTr;
	}

	public BigDecimal getRepaymentRate() {
		return this.repaymentRate;
	}

	public void setRepaymentRate(BigDecimal repaymentRate) {
		this.repaymentRate = repaymentRate;
	}

	public BigDecimal getSpecializeCode() {
		return this.specializeCode;
	}

	public void setSpecializeCode(BigDecimal specializeCode) {
		this.specializeCode = specializeCode;
	}

	public BigDecimal getUpFrontFdd() {
		return this.upFrontFdd;
	}

	public void setUpFrontFdd(BigDecimal upFrontFdd) {
		this.upFrontFdd = upFrontFdd;
	}

	public BigDecimal getVariablePay() {
		return this.variablePay;
	}

	public void setVariablePay(BigDecimal variablePay) {
		this.variablePay = variablePay;
	}

	public BigDecimal getVariableRate() {
		return this.variableRate;
	}

	public void setVariableRate(BigDecimal variableRate) {
		this.variableRate = variableRate;
	}

	public String getYesNo() {
		return this.yesNo;
	}

	public void setYesNo(String yesNo) {
		this.yesNo = yesNo;
	}

}