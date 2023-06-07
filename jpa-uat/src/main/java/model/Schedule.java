package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SCHEDULES database table.
 * 
 */
@Entity
@Table(name="SCHEDULES")
@NamedQuery(name="Schedule.findAll", query="SELECT s FROM Schedule s")
public class Schedule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SCHEDULE_ID")
	private long scheduleId;

	@Column(name="AMENDMENT_TYPE")
	private BigDecimal amendmentType;

	@Column(name="AUTHORISED_BY")
	private String authorisedBy;

	private BigDecimal commission;

	private BigDecimal custacctid;

	private BigDecimal feepaid;

	@Column(name="INST_NO")
	private BigDecimal instNo;

	private String iscancel;

	@Column(name="LOAN_FAC_ID")
	private BigDecimal loanFacId;

	@Column(name="LOAN_TRAN_ID")
	private BigDecimal loanTranId;

	@Column(name="N_DAY")
	private BigDecimal nDay;

	@Column(name="PAID_AMT")
	private BigDecimal paidAmt;

	@Column(name="PAID_DATE")
	private Object paidDate;

	@Column(name="PAID_INT")
	private BigDecimal paidInt;

	@Column(name="PAID_STATUS")
	private String paidStatus;

	private BigDecimal penalty;

	@Column(name="PENALTY_PAID")
	private BigDecimal penaltyPaid;

	@Column(name="PENALTY_STATUS")
	private String penaltyStatus;

	@Column(name="PENALTY_WAIVE")
	private BigDecimal penaltyWaive;

	@Column(name="PRIN_AMT")
	private BigDecimal prinAmt;

	@Column(name="PRIN_PER_INST")
	private BigDecimal prinPerInst;

	@Column(name="PRPL_PAID_STATUS")
	private String prplPaidStatus;

	@Column(name="RECEIVED_BY")
	private String receivedBy;

	@Column(name="REF_NO")
	private String refNo;

	@Column(name="REPAY_AMT")
	private BigDecimal repayAmt;

	@Column(name="REPAY_DATE")
	private Object repayDate;

	@Column(name="REPAY_INT")
	private BigDecimal repayInt;

	@Column(name="RP_METHOD")
	private String rpMethod;

	@Column(name="SCHEDULE_REFNO")
	private String scheduleRefno;

	private BigDecimal trnfee;

	@Column(name="TRNFEE_STATUS")
	private String trnfeeStatus;

	public Schedule() {
	}

	public long getScheduleId() {
		return this.scheduleId;
	}

	public void setScheduleId(long scheduleId) {
		this.scheduleId = scheduleId;
	}

	public BigDecimal getAmendmentType() {
		return this.amendmentType;
	}

	public void setAmendmentType(BigDecimal amendmentType) {
		this.amendmentType = amendmentType;
	}

	public String getAuthorisedBy() {
		return this.authorisedBy;
	}

	public void setAuthorisedBy(String authorisedBy) {
		this.authorisedBy = authorisedBy;
	}

	public BigDecimal getCommission() {
		return this.commission;
	}

	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}

	public BigDecimal getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(BigDecimal custacctid) {
		this.custacctid = custacctid;
	}

	public BigDecimal getFeepaid() {
		return this.feepaid;
	}

	public void setFeepaid(BigDecimal feepaid) {
		this.feepaid = feepaid;
	}

	public BigDecimal getInstNo() {
		return this.instNo;
	}

	public void setInstNo(BigDecimal instNo) {
		this.instNo = instNo;
	}

	public String getIscancel() {
		return this.iscancel;
	}

	public void setIscancel(String iscancel) {
		this.iscancel = iscancel;
	}

	public BigDecimal getLoanFacId() {
		return this.loanFacId;
	}

	public void setLoanFacId(BigDecimal loanFacId) {
		this.loanFacId = loanFacId;
	}

	public BigDecimal getLoanTranId() {
		return this.loanTranId;
	}

	public void setLoanTranId(BigDecimal loanTranId) {
		this.loanTranId = loanTranId;
	}

	public BigDecimal getNDay() {
		return this.nDay;
	}

	public void setNDay(BigDecimal nDay) {
		this.nDay = nDay;
	}

	public BigDecimal getPaidAmt() {
		return this.paidAmt;
	}

	public void setPaidAmt(BigDecimal paidAmt) {
		this.paidAmt = paidAmt;
	}

	public Object getPaidDate() {
		return this.paidDate;
	}

	public void setPaidDate(Object paidDate) {
		this.paidDate = paidDate;
	}

	public BigDecimal getPaidInt() {
		return this.paidInt;
	}

	public void setPaidInt(BigDecimal paidInt) {
		this.paidInt = paidInt;
	}

	public String getPaidStatus() {
		return this.paidStatus;
	}

	public void setPaidStatus(String paidStatus) {
		this.paidStatus = paidStatus;
	}

	public BigDecimal getPenalty() {
		return this.penalty;
	}

	public void setPenalty(BigDecimal penalty) {
		this.penalty = penalty;
	}

	public BigDecimal getPenaltyPaid() {
		return this.penaltyPaid;
	}

	public void setPenaltyPaid(BigDecimal penaltyPaid) {
		this.penaltyPaid = penaltyPaid;
	}

	public String getPenaltyStatus() {
		return this.penaltyStatus;
	}

	public void setPenaltyStatus(String penaltyStatus) {
		this.penaltyStatus = penaltyStatus;
	}

	public BigDecimal getPenaltyWaive() {
		return this.penaltyWaive;
	}

	public void setPenaltyWaive(BigDecimal penaltyWaive) {
		this.penaltyWaive = penaltyWaive;
	}

	public BigDecimal getPrinAmt() {
		return this.prinAmt;
	}

	public void setPrinAmt(BigDecimal prinAmt) {
		this.prinAmt = prinAmt;
	}

	public BigDecimal getPrinPerInst() {
		return this.prinPerInst;
	}

	public void setPrinPerInst(BigDecimal prinPerInst) {
		this.prinPerInst = prinPerInst;
	}

	public String getPrplPaidStatus() {
		return this.prplPaidStatus;
	}

	public void setPrplPaidStatus(String prplPaidStatus) {
		this.prplPaidStatus = prplPaidStatus;
	}

	public String getReceivedBy() {
		return this.receivedBy;
	}

	public void setReceivedBy(String receivedBy) {
		this.receivedBy = receivedBy;
	}

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public BigDecimal getRepayAmt() {
		return this.repayAmt;
	}

	public void setRepayAmt(BigDecimal repayAmt) {
		this.repayAmt = repayAmt;
	}

	public Object getRepayDate() {
		return this.repayDate;
	}

	public void setRepayDate(Object repayDate) {
		this.repayDate = repayDate;
	}

	public BigDecimal getRepayInt() {
		return this.repayInt;
	}

	public void setRepayInt(BigDecimal repayInt) {
		this.repayInt = repayInt;
	}

	public String getRpMethod() {
		return this.rpMethod;
	}

	public void setRpMethod(String rpMethod) {
		this.rpMethod = rpMethod;
	}

	public String getScheduleRefno() {
		return this.scheduleRefno;
	}

	public void setScheduleRefno(String scheduleRefno) {
		this.scheduleRefno = scheduleRefno;
	}

	public BigDecimal getTrnfee() {
		return this.trnfee;
	}

	public void setTrnfee(BigDecimal trnfee) {
		this.trnfee = trnfee;
	}

	public String getTrnfeeStatus() {
		return this.trnfeeStatus;
	}

	public void setTrnfeeStatus(String trnfeeStatus) {
		this.trnfeeStatus = trnfeeStatus;
	}

}