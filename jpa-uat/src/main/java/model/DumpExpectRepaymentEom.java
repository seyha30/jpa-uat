package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the DUMP_EXPECT_REPAYMENT_EOM database table.
 * 
 */
@Entity
@Table(name="DUMP_EXPECT_REPAYMENT_EOM")
@NamedQuery(name="DumpExpectRepaymentEom.findAll", query="SELECT d FROM DumpExpectRepaymentEom d")
public class DumpExpectRepaymentEom implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCOUNT_NO")
	private String accountNo;

	private BigDecimal aging;

	@Column(name="BRANCH_ID")
	private String branchId;

	private String ccy;

	@Column(name="DISBURSED_DATE")
	private Object disbursedDate;

	@Column(name="DUE_DATE")
	private Object dueDate;

	@Column(name="END_DATE")
	private Object endDate;

	@Column(name="F_NPAID")
	private Object fNpaid;

	@Column(name="F_PAID")
	private Object fPaid;

	@Column(name="FEE_DUE")
	private Object feeDue;

	@Column(name="FULL_NAME")
	private String fullName;

	@Column(name="I_NPAID")
	private Object iNpaid;

	@Column(name="I_PAID")
	private Object iPaid;

	@Column(name="INT_DUE")
	private Object intDue;

	@Column(name="INT_RATE")
	private BigDecimal intRate;

	@Column(name="LOAN_STATUS")
	private String loanStatus;

	private Object outstanding;

	@Column(name="P_NPAID")
	private Object pNpaid;

	@Column(name="P_PAID")
	private Object pPaid;

	@Column(name="PAID_DATE")
	private Object paidDate;

	private Object pen;

	@Column(name="PRIN_DUE")
	private Object prinDue;

	@Column(name="REF_NO")
	private String refNo;

	@Column(name="REPORT_DATE")
	private Object reportDate;

	@Column(name="SAVING_ACC")
	private String savingAcc;

	@Column(name="START_DATE")
	private String startDate;

	@Column(name="SV_BAL")
	private Object svBal;

	@Column(name="TOTAL_NPAID")
	private Object totalNpaid;

	@Column(name="TOTAL_PAID")
	private Object totalPaid;

	@Column(name="VAL_BALANCE")
	private Object valBalance;

	public DumpExpectRepaymentEom() {
	}

	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public BigDecimal getAging() {
		return this.aging;
	}

	public void setAging(BigDecimal aging) {
		this.aging = aging;
	}

	public String getBranchId() {
		return this.branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public String getCcy() {
		return this.ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public Object getDisbursedDate() {
		return this.disbursedDate;
	}

	public void setDisbursedDate(Object disbursedDate) {
		this.disbursedDate = disbursedDate;
	}

	public Object getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(Object dueDate) {
		this.dueDate = dueDate;
	}

	public Object getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Object endDate) {
		this.endDate = endDate;
	}

	public Object getFNpaid() {
		return this.fNpaid;
	}

	public void setFNpaid(Object fNpaid) {
		this.fNpaid = fNpaid;
	}

	public Object getFPaid() {
		return this.fPaid;
	}

	public void setFPaid(Object fPaid) {
		this.fPaid = fPaid;
	}

	public Object getFeeDue() {
		return this.feeDue;
	}

	public void setFeeDue(Object feeDue) {
		this.feeDue = feeDue;
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Object getINpaid() {
		return this.iNpaid;
	}

	public void setINpaid(Object iNpaid) {
		this.iNpaid = iNpaid;
	}

	public Object getIPaid() {
		return this.iPaid;
	}

	public void setIPaid(Object iPaid) {
		this.iPaid = iPaid;
	}

	public Object getIntDue() {
		return this.intDue;
	}

	public void setIntDue(Object intDue) {
		this.intDue = intDue;
	}

	public BigDecimal getIntRate() {
		return this.intRate;
	}

	public void setIntRate(BigDecimal intRate) {
		this.intRate = intRate;
	}

	public String getLoanStatus() {
		return this.loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	public Object getOutstanding() {
		return this.outstanding;
	}

	public void setOutstanding(Object outstanding) {
		this.outstanding = outstanding;
	}

	public Object getPNpaid() {
		return this.pNpaid;
	}

	public void setPNpaid(Object pNpaid) {
		this.pNpaid = pNpaid;
	}

	public Object getPPaid() {
		return this.pPaid;
	}

	public void setPPaid(Object pPaid) {
		this.pPaid = pPaid;
	}

	public Object getPaidDate() {
		return this.paidDate;
	}

	public void setPaidDate(Object paidDate) {
		this.paidDate = paidDate;
	}

	public Object getPen() {
		return this.pen;
	}

	public void setPen(Object pen) {
		this.pen = pen;
	}

	public Object getPrinDue() {
		return this.prinDue;
	}

	public void setPrinDue(Object prinDue) {
		this.prinDue = prinDue;
	}

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public Object getReportDate() {
		return this.reportDate;
	}

	public void setReportDate(Object reportDate) {
		this.reportDate = reportDate;
	}

	public String getSavingAcc() {
		return this.savingAcc;
	}

	public void setSavingAcc(String savingAcc) {
		this.savingAcc = savingAcc;
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public Object getSvBal() {
		return this.svBal;
	}

	public void setSvBal(Object svBal) {
		this.svBal = svBal;
	}

	public Object getTotalNpaid() {
		return this.totalNpaid;
	}

	public void setTotalNpaid(Object totalNpaid) {
		this.totalNpaid = totalNpaid;
	}

	public Object getTotalPaid() {
		return this.totalPaid;
	}

	public void setTotalPaid(Object totalPaid) {
		this.totalPaid = totalPaid;
	}

	public Object getValBalance() {
		return this.valBalance;
	}

	public void setValBalance(Object valBalance) {
		this.valBalance = valBalance;
	}

}