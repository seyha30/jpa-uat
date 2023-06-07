package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the BAD_LOAN_MASTER database table.
 * 
 */
@Entity
@Table(name="BAD_LOAN_MASTER")
@NamedQuery(name="BadLoanMaster.findAll", query="SELECT b FROM BadLoanMaster b")
public class BadLoanMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCT_CODE")
	private String acctCode;

	@Column(name="BAD_CUST_TRANX_ID")
	private BigDecimal badCustTranxId;

	@Column(name="BAD_LOAN_TYPE_ID")
	private BigDecimal badLoanTypeId;

	@Column(name="BAD_TRANX_ID")
	private BigDecimal badTranxId;

	@Column(name="LOAN_FAC_REF_NO")
	private String loanFacRefNo;

	@Column(name="MOVE_DATE")
	private Object moveDate;

	@Column(name="PRE_STATUS")
	private BigDecimal preStatus;

	@Column(name="PROVISION_PAID")
	private BigDecimal provisionPaid;

	public BadLoanMaster() {
	}

	public String getAcctCode() {
		return this.acctCode;
	}

	public void setAcctCode(String acctCode) {
		this.acctCode = acctCode;
	}

	public BigDecimal getBadCustTranxId() {
		return this.badCustTranxId;
	}

	public void setBadCustTranxId(BigDecimal badCustTranxId) {
		this.badCustTranxId = badCustTranxId;
	}

	public BigDecimal getBadLoanTypeId() {
		return this.badLoanTypeId;
	}

	public void setBadLoanTypeId(BigDecimal badLoanTypeId) {
		this.badLoanTypeId = badLoanTypeId;
	}

	public BigDecimal getBadTranxId() {
		return this.badTranxId;
	}

	public void setBadTranxId(BigDecimal badTranxId) {
		this.badTranxId = badTranxId;
	}

	public String getLoanFacRefNo() {
		return this.loanFacRefNo;
	}

	public void setLoanFacRefNo(String loanFacRefNo) {
		this.loanFacRefNo = loanFacRefNo;
	}

	public Object getMoveDate() {
		return this.moveDate;
	}

	public void setMoveDate(Object moveDate) {
		this.moveDate = moveDate;
	}

	public BigDecimal getPreStatus() {
		return this.preStatus;
	}

	public void setPreStatus(BigDecimal preStatus) {
		this.preStatus = preStatus;
	}

	public BigDecimal getProvisionPaid() {
		return this.provisionPaid;
	}

	public void setProvisionPaid(BigDecimal provisionPaid) {
		this.provisionPaid = provisionPaid;
	}

}