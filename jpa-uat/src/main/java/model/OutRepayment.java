package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the OUT_REPAYMENT database table.
 * 
 */
@Entity
@Table(name="OUT_REPAYMENT")
@NamedQuery(name="OutRepayment.findAll", query="SELECT o FROM OutRepayment o")
public class OutRepayment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="APPROVAL_CODE")
	private String approvalCode;

	@Column(name="BRANCH_NAME")
	private String branchName;

	@Column(name="COST_CENTRE")
	private String costCentre;

	@Column(name="CREDIT_CARD_N")
	private String creditCardN;

	@Column(name="GL_ACCOUNT_NUMBER")
	private String glAccountNumber;

	@Column(name="PAYMENT_MODE")
	private String paymentMode;

	@Column(name="POST_DATE")
	private Object postDate;

	@Column(name="PROCESSING_BRANCH_N")
	private BigDecimal processingBranchN;

	@Column(name="PRODUCT_ID")
	private String productId;

	@Column(name="RECORD_TYPE")
	private String recordType;

	private String remark;

	@Column(name="REVERSAL_EXCEPTION_REASON")
	private String reversalExceptionReason;

	@Column(name="TRANSACTION_AMT")
	private BigDecimal transactionAmt;

	@Column(name="TRANSACTION_CODE")
	private String transactionCode;

	@Column(name="TRANSACTION_DATE")
	private String transactionDate;

	@Column(name="TRANSACTION_TIME")
	private String transactionTime;

	@Column(name="TRANSACTION_TYPE")
	private String transactionType;

	@Column(name="TRANX_ID")
	private String tranxId;

	public OutRepayment() {
	}

	public String getApprovalCode() {
		return this.approvalCode;
	}

	public void setApprovalCode(String approvalCode) {
		this.approvalCode = approvalCode;
	}

	public String getBranchName() {
		return this.branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getCostCentre() {
		return this.costCentre;
	}

	public void setCostCentre(String costCentre) {
		this.costCentre = costCentre;
	}

	public String getCreditCardN() {
		return this.creditCardN;
	}

	public void setCreditCardN(String creditCardN) {
		this.creditCardN = creditCardN;
	}

	public String getGlAccountNumber() {
		return this.glAccountNumber;
	}

	public void setGlAccountNumber(String glAccountNumber) {
		this.glAccountNumber = glAccountNumber;
	}

	public String getPaymentMode() {
		return this.paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public Object getPostDate() {
		return this.postDate;
	}

	public void setPostDate(Object postDate) {
		this.postDate = postDate;
	}

	public BigDecimal getProcessingBranchN() {
		return this.processingBranchN;
	}

	public void setProcessingBranchN(BigDecimal processingBranchN) {
		this.processingBranchN = processingBranchN;
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getRecordType() {
		return this.recordType;
	}

	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getReversalExceptionReason() {
		return this.reversalExceptionReason;
	}

	public void setReversalExceptionReason(String reversalExceptionReason) {
		this.reversalExceptionReason = reversalExceptionReason;
	}

	public BigDecimal getTransactionAmt() {
		return this.transactionAmt;
	}

	public void setTransactionAmt(BigDecimal transactionAmt) {
		this.transactionAmt = transactionAmt;
	}

	public String getTransactionCode() {
		return this.transactionCode;
	}

	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}

	public String getTransactionDate() {
		return this.transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionTime() {
		return this.transactionTime;
	}

	public void setTransactionTime(String transactionTime) {
		this.transactionTime = transactionTime;
	}

	public String getTransactionType() {
		return this.transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(String tranxId) {
		this.tranxId = tranxId;
	}

}