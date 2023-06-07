package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TEST_REPORT_PAID database table.
 * 
 */
@Entity
@Table(name="TEST_REPORT_PAID")
@NamedQuery(name="TestReportPaid.findAll", query="SELECT t FROM TestReportPaid t")
public class TestReportPaid implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal amount;

	@Column(name="BRANCH_ID")
	private String branchId;

	@Column(name="DATE_DONE")
	private Object dateDone;

	@Column(name="DISBURSEMENT_AMT")
	private BigDecimal disbursementAmt;

	private String duration1;

	private String duration2;

	@Column(name="INVOICE_NO")
	private String invoiceNo;

	@Column(name="KH_NAME")
	private String khName;

	private String loan;

	@Column(name="LOAN_FAC_ID")
	private BigDecimal loanFacId;

	@Column(name="LOAN_TRAN_ID")
	private BigDecimal loanTranId;

	@Column(name="\"NAMES\"")
	private String names;

	private String note;

	@Column(name="PAY_MODE")
	private String payMode;

	@Column(name="PAY_OFF")
	private String payOff;

	@Column(name="PRINCIPAL_INT")
	private String principalInt;

	private String refno;

	private String remark;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	@Column(name="USER_ID")
	private String userId;

	public TestReportPaid() {
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getBranchId() {
		return this.branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public BigDecimal getDisbursementAmt() {
		return this.disbursementAmt;
	}

	public void setDisbursementAmt(BigDecimal disbursementAmt) {
		this.disbursementAmt = disbursementAmt;
	}

	public String getDuration1() {
		return this.duration1;
	}

	public void setDuration1(String duration1) {
		this.duration1 = duration1;
	}

	public String getDuration2() {
		return this.duration2;
	}

	public void setDuration2(String duration2) {
		this.duration2 = duration2;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getKhName() {
		return this.khName;
	}

	public void setKhName(String khName) {
		this.khName = khName;
	}

	public String getLoan() {
		return this.loan;
	}

	public void setLoan(String loan) {
		this.loan = loan;
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

	public String getNames() {
		return this.names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getPayMode() {
		return this.payMode;
	}

	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}

	public String getPayOff() {
		return this.payOff;
	}

	public void setPayOff(String payOff) {
		this.payOff = payOff;
	}

	public String getPrincipalInt() {
		return this.principalInt;
	}

	public void setPrincipalInt(String principalInt) {
		this.principalInt = principalInt;
	}

	public String getRefno() {
		return this.refno;
	}

	public void setRefno(String refno) {
		this.refno = refno;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}