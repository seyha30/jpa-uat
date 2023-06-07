package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SCHEDULE_RE_TEMP database table.
 * 
 */
@Entity
@Table(name="SCHEDULE_RE_TEMP")
@NamedQuery(name="ScheduleReTemp.findAll", query="SELECT s FROM ScheduleReTemp s")
public class ScheduleReTemp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCT_NO")
	private String acctNo;

	private BigDecimal commission;

	@Column(name="INST_NO")
	private BigDecimal instNo;

	@Column(name="LOAN_ID")
	private BigDecimal loanId;

	private String name;

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

	public ScheduleReTemp() {
	}

	public String getAcctNo() {
		return this.acctNo;
	}

	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}

	public BigDecimal getCommission() {
		return this.commission;
	}

	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}

	public BigDecimal getInstNo() {
		return this.instNo;
	}

	public void setInstNo(BigDecimal instNo) {
		this.instNo = instNo;
	}

	public BigDecimal getLoanId() {
		return this.loanId;
	}

	public void setLoanId(BigDecimal loanId) {
		this.loanId = loanId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

}