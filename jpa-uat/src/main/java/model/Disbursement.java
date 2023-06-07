package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the DISBURSEMENT database table.
 * 
 */
@Entity
@NamedQuery(name="Disbursement.findAll", query="SELECT d FROM Disbursement d")
public class Disbursement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DISBURSEMENT_ID")
	private long disbursementId;

	@Column(name="CREATED_DATE")
	private Object createdDate;

	@Column(name="CREDIT_FAC_REF_NO")
	private String creditFacRefNo;

	@Column(name="CREDIT_TYPE_ID")
	private BigDecimal creditTypeId;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	private String deleted;

	@Column(name="DONE_BY")
	private String doneBy;

	@Column(name="INSTALLMENT_TYPE_ID")
	private BigDecimal installmentTypeId;

	@Column(name="INT_RATE")
	private BigDecimal intRate;

	@Column(name="INT_TRANX_ID")
	private BigDecimal intTranxId;

	@Column(name="INTEREST_PAID")
	private BigDecimal interestPaid;

	private String isbulletloan;

	private String isflatinterest;

	@Column(name="MATURITY_DATE")
	private Object maturityDate;

	@Column(name="NO_OF_INST")
	private BigDecimal noOfInst;

	@Column(name="PAYMENT_MODE")
	private String paymentMode;

	@Column(name="PRINCIPAL_AMT")
	private BigDecimal principalAmt;

	@Column(name="PRINCIPAL_PAID")
	private BigDecimal principalPaid;

	private String reverse;

	@Column(name="START_DATE")
	private Object startDate;

	@Column(name="TO_CUSTACCTID")
	private BigDecimal toCustacctid;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	private String yorm;

	//bi-directional many-to-one association to LoanFacility
	@ManyToOne
	@JoinColumn(name="LOAN_FAC_ID")
	private LoanFacility loanFacility;

	public Disbursement() {
	}

	public long getDisbursementId() {
		return this.disbursementId;
	}

	public void setDisbursementId(long disbursementId) {
		this.disbursementId = disbursementId;
	}

	public Object getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Object createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreditFacRefNo() {
		return this.creditFacRefNo;
	}

	public void setCreditFacRefNo(String creditFacRefNo) {
		this.creditFacRefNo = creditFacRefNo;
	}

	public BigDecimal getCreditTypeId() {
		return this.creditTypeId;
	}

	public void setCreditTypeId(BigDecimal creditTypeId) {
		this.creditTypeId = creditTypeId;
	}

	public BigDecimal getCurrId() {
		return this.currId;
	}

	public void setCurrId(BigDecimal currId) {
		this.currId = currId;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getDoneBy() {
		return this.doneBy;
	}

	public void setDoneBy(String doneBy) {
		this.doneBy = doneBy;
	}

	public BigDecimal getInstallmentTypeId() {
		return this.installmentTypeId;
	}

	public void setInstallmentTypeId(BigDecimal installmentTypeId) {
		this.installmentTypeId = installmentTypeId;
	}

	public BigDecimal getIntRate() {
		return this.intRate;
	}

	public void setIntRate(BigDecimal intRate) {
		this.intRate = intRate;
	}

	public BigDecimal getIntTranxId() {
		return this.intTranxId;
	}

	public void setIntTranxId(BigDecimal intTranxId) {
		this.intTranxId = intTranxId;
	}

	public BigDecimal getInterestPaid() {
		return this.interestPaid;
	}

	public void setInterestPaid(BigDecimal interestPaid) {
		this.interestPaid = interestPaid;
	}

	public String getIsbulletloan() {
		return this.isbulletloan;
	}

	public void setIsbulletloan(String isbulletloan) {
		this.isbulletloan = isbulletloan;
	}

	public String getIsflatinterest() {
		return this.isflatinterest;
	}

	public void setIsflatinterest(String isflatinterest) {
		this.isflatinterest = isflatinterest;
	}

	public Object getMaturityDate() {
		return this.maturityDate;
	}

	public void setMaturityDate(Object maturityDate) {
		this.maturityDate = maturityDate;
	}

	public BigDecimal getNoOfInst() {
		return this.noOfInst;
	}

	public void setNoOfInst(BigDecimal noOfInst) {
		this.noOfInst = noOfInst;
	}

	public String getPaymentMode() {
		return this.paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
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

	public String getReverse() {
		return this.reverse;
	}

	public void setReverse(String reverse) {
		this.reverse = reverse;
	}

	public Object getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Object startDate) {
		this.startDate = startDate;
	}

	public BigDecimal getToCustacctid() {
		return this.toCustacctid;
	}

	public void setToCustacctid(BigDecimal toCustacctid) {
		this.toCustacctid = toCustacctid;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

	public String getYorm() {
		return this.yorm;
	}

	public void setYorm(String yorm) {
		this.yorm = yorm;
	}

	public LoanFacility getLoanFacility() {
		return this.loanFacility;
	}

	public void setLoanFacility(LoanFacility loanFacility) {
		this.loanFacility = loanFacility;
	}

}