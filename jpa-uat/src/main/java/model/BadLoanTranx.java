package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the BAD_LOAN_TRANX database table.
 * 
 */
@Entity
@Table(name="BAD_LOAN_TRANX")
@NamedQuery(name="BadLoanTranx.findAll", query="SELECT b FROM BadLoanTranx b")
public class BadLoanTranx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="BAD_LOAN_TRANX_ID")
	private BigDecimal badLoanTranxId;

	@Column(name="BAD_LOAN_TYPE_DETAIL_ID")
	private BigDecimal badLoanTypeDetailId;

	@Column(name="BRANCH_ID")
	private BigDecimal branchId;

	@Column(name="CREDIT_STATUS_ID")
	private BigDecimal creditStatusId;

	@Column(name="CUST_ACCT_TYPE_ID")
	private BigDecimal custAcctTypeId;

	private BigDecimal custacctid;

	@Column(name="DATE_DONE")
	private Object dateDone;

	@Column(name="LOAN_FAC_ID")
	private BigDecimal loanFacId;

	@Column(name="LOAN_OUTSTANDING")
	private BigDecimal loanOutstanding;

	private BigDecimal nod;

	@Column(name="PROVISION_PAID")
	private BigDecimal provisionPaid;

	@Column(name="REF_NO")
	private String refNo;

	@Column(name="REPAY_DATE")
	private Object repayDate;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	public BadLoanTranx() {
	}

	public BigDecimal getBadLoanTranxId() {
		return this.badLoanTranxId;
	}

	public void setBadLoanTranxId(BigDecimal badLoanTranxId) {
		this.badLoanTranxId = badLoanTranxId;
	}

	public BigDecimal getBadLoanTypeDetailId() {
		return this.badLoanTypeDetailId;
	}

	public void setBadLoanTypeDetailId(BigDecimal badLoanTypeDetailId) {
		this.badLoanTypeDetailId = badLoanTypeDetailId;
	}

	public BigDecimal getBranchId() {
		return this.branchId;
	}

	public void setBranchId(BigDecimal branchId) {
		this.branchId = branchId;
	}

	public BigDecimal getCreditStatusId() {
		return this.creditStatusId;
	}

	public void setCreditStatusId(BigDecimal creditStatusId) {
		this.creditStatusId = creditStatusId;
	}

	public BigDecimal getCustAcctTypeId() {
		return this.custAcctTypeId;
	}

	public void setCustAcctTypeId(BigDecimal custAcctTypeId) {
		this.custAcctTypeId = custAcctTypeId;
	}

	public BigDecimal getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(BigDecimal custacctid) {
		this.custacctid = custacctid;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public BigDecimal getLoanFacId() {
		return this.loanFacId;
	}

	public void setLoanFacId(BigDecimal loanFacId) {
		this.loanFacId = loanFacId;
	}

	public BigDecimal getLoanOutstanding() {
		return this.loanOutstanding;
	}

	public void setLoanOutstanding(BigDecimal loanOutstanding) {
		this.loanOutstanding = loanOutstanding;
	}

	public BigDecimal getNod() {
		return this.nod;
	}

	public void setNod(BigDecimal nod) {
		this.nod = nod;
	}

	public BigDecimal getProvisionPaid() {
		return this.provisionPaid;
	}

	public void setProvisionPaid(BigDecimal provisionPaid) {
		this.provisionPaid = provisionPaid;
	}

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public Object getRepayDate() {
		return this.repayDate;
	}

	public void setRepayDate(Object repayDate) {
		this.repayDate = repayDate;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

}