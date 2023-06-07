package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the OTHER_SCHEDULES database table.
 * 
 */
@Entity
@Table(name="OTHER_SCHEDULES")
@NamedQuery(name="OtherSchedule.findAll", query="SELECT o FROM OtherSchedule o")
public class OtherSchedule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AUTHORISED_BY")
	private String authorisedBy;

	private BigDecimal commission;

	private BigDecimal custacctid;

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

	@Column(name="SCHEDULE_ID")
	private BigDecimal scheduleId;

	@Column(name="SCHEDULE_REFNO")
	private String scheduleRefno;

	public OtherSchedule() {
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

	public BigDecimal getScheduleId() {
		return this.scheduleId;
	}

	public void setScheduleId(BigDecimal scheduleId) {
		this.scheduleId = scheduleId;
	}

	public String getScheduleRefno() {
		return this.scheduleRefno;
	}

	public void setScheduleRefno(String scheduleRefno) {
		this.scheduleRefno = scheduleRefno;
	}

}