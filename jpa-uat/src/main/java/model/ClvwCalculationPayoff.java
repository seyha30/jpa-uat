package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CLVW_CALCULATION_PAYOFF database table.
 * 
 */
@Entity
@Table(name="CLVW_CALCULATION_PAYOFF")
@NamedQuery(name="ClvwCalculationPayoff.findAll", query="SELECT c FROM ClvwCalculationPayoff c")
public class ClvwCalculationPayoff implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCOUNT_NAME")
	private String accountName;

	private BigDecimal aging;

	@Column(name="BRANCH_ID")
	private BigDecimal branchId;

	@Column(name="CURR_CODE")
	private String currCode;

	private BigDecimal custacctid;

	@Column(name="END_DAYS")
	private BigDecimal endDays;

	@Column(name="FEE_END_DAY")
	private BigDecimal feeEndDay;

	@Column(name="FEE_SCHEDULE")
	private BigDecimal feeSchedule;

	@Column(name="INT_END_DAY")
	private BigDecimal intEndDay;

	@Column(name="INT_RATE")
	private BigDecimal intRate;

	@Column(name="INT_SCHEDULE")
	private BigDecimal intSchedule;

	@Column(name="LOAN_FAC_ID")
	private BigDecimal loanFacId;

	@Column(name="NO_INST")
	private BigDecimal noInst;

	@Column(name="NO_OF_INST")
	private BigDecimal noOfInst;

	@Column(name="OUT_FOR_INT")
	private BigDecimal outForInt;

	@Column(name="OUT_SCHEDULE")
	private BigDecimal outSchedule;

	private BigDecimal outstanding;

	private BigDecimal pen;

	@Column(name="PREPAY_PENALTY")
	private BigDecimal prepayPenalty;

	@Column(name="PRINCIPAL_AMT")
	private BigDecimal principalAmt;

	@Column(name="PRINCIPAL_PAID")
	private BigDecimal principalPaid;

	@Column(name="REF_NO")
	private String refNo;

	@Column(name="START_DATE")
	private Object startDate;

	@Column(name="START_INT_END_DAY")
	private Object startIntEndDay;

	@Column(name="TOTAL_FEE")
	private BigDecimal totalFee;

	@Column(name="TOTAL_INT")
	private BigDecimal totalInt;

	public ClvwCalculationPayoff() {
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public BigDecimal getAging() {
		return this.aging;
	}

	public void setAging(BigDecimal aging) {
		this.aging = aging;
	}

	public BigDecimal getBranchId() {
		return this.branchId;
	}

	public void setBranchId(BigDecimal branchId) {
		this.branchId = branchId;
	}

	public String getCurrCode() {
		return this.currCode;
	}

	public void setCurrCode(String currCode) {
		this.currCode = currCode;
	}

	public BigDecimal getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(BigDecimal custacctid) {
		this.custacctid = custacctid;
	}

	public BigDecimal getEndDays() {
		return this.endDays;
	}

	public void setEndDays(BigDecimal endDays) {
		this.endDays = endDays;
	}

	public BigDecimal getFeeEndDay() {
		return this.feeEndDay;
	}

	public void setFeeEndDay(BigDecimal feeEndDay) {
		this.feeEndDay = feeEndDay;
	}

	public BigDecimal getFeeSchedule() {
		return this.feeSchedule;
	}

	public void setFeeSchedule(BigDecimal feeSchedule) {
		this.feeSchedule = feeSchedule;
	}

	public BigDecimal getIntEndDay() {
		return this.intEndDay;
	}

	public void setIntEndDay(BigDecimal intEndDay) {
		this.intEndDay = intEndDay;
	}

	public BigDecimal getIntRate() {
		return this.intRate;
	}

	public void setIntRate(BigDecimal intRate) {
		this.intRate = intRate;
	}

	public BigDecimal getIntSchedule() {
		return this.intSchedule;
	}

	public void setIntSchedule(BigDecimal intSchedule) {
		this.intSchedule = intSchedule;
	}

	public BigDecimal getLoanFacId() {
		return this.loanFacId;
	}

	public void setLoanFacId(BigDecimal loanFacId) {
		this.loanFacId = loanFacId;
	}

	public BigDecimal getNoInst() {
		return this.noInst;
	}

	public void setNoInst(BigDecimal noInst) {
		this.noInst = noInst;
	}

	public BigDecimal getNoOfInst() {
		return this.noOfInst;
	}

	public void setNoOfInst(BigDecimal noOfInst) {
		this.noOfInst = noOfInst;
	}

	public BigDecimal getOutForInt() {
		return this.outForInt;
	}

	public void setOutForInt(BigDecimal outForInt) {
		this.outForInt = outForInt;
	}

	public BigDecimal getOutSchedule() {
		return this.outSchedule;
	}

	public void setOutSchedule(BigDecimal outSchedule) {
		this.outSchedule = outSchedule;
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

	public BigDecimal getPrepayPenalty() {
		return this.prepayPenalty;
	}

	public void setPrepayPenalty(BigDecimal prepayPenalty) {
		this.prepayPenalty = prepayPenalty;
	}

	public BigDecimal getPrincipalAmt() {
		return this.principalAmt;
	}

	public void setPrincipalAmt(BigDecimal principalAmt) {
		this.principalAmt = principalAmt;
	}

	public BigDecimal getPrincipalPaid() {
		return this.principalPaid;
	}

	public void setPrincipalPaid(BigDecimal principalPaid) {
		this.principalPaid = principalPaid;
	}

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public Object getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Object startDate) {
		this.startDate = startDate;
	}

	public Object getStartIntEndDay() {
		return this.startIntEndDay;
	}

	public void setStartIntEndDay(Object startIntEndDay) {
		this.startIntEndDay = startIntEndDay;
	}

	public BigDecimal getTotalFee() {
		return this.totalFee;
	}

	public void setTotalFee(BigDecimal totalFee) {
		this.totalFee = totalFee;
	}

	public BigDecimal getTotalInt() {
		return this.totalInt;
	}

	public void setTotalInt(BigDecimal totalInt) {
		this.totalInt = totalInt;
	}

}