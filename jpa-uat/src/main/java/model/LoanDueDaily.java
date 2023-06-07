package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the LOAN_DUE_DAILY database table.
 * 
 */
@Entity
@Table(name="LOAN_DUE_DAILY")
@NamedQuery(name="LoanDueDaily.findAll", query="SELECT l FROM LoanDueDaily l")
public class LoanDueDaily implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="BR_CODE")
	private String brCode;

	@Column(name="CURR_CODE")
	private String currCode;

	@Column(name="CUST_ACCT")
	private String custAcct;

	@Column(name="CUST_NAME")
	private String custName;

	private BigDecimal custacctid;

	@Column(name="DATE_DONE")
	private Object dateDone;

	@Column(name="INST_NO")
	private BigDecimal instNo;

	@Column(name="LOAN_FAC_ID")
	private BigDecimal loanFacId;

	private BigDecimal nod;

	private BigDecimal obl;

	@Column(name="PAID_AMT")
	private BigDecimal paidAmt;

	@Column(name="PAID_DATE")
	private Object paidDate;

	@Column(name="PAID_INT")
	private BigDecimal paidInt;

	@Column(name="REF_NO")
	private String refNo;

	@Column(name="REPAY_AMT")
	private BigDecimal repayAmt;

	@Column(name="REPAY_DATE")
	private Object repayDate;

	@Column(name="REPAY_INT")
	private BigDecimal repayInt;

	public LoanDueDaily() {
	}

	public String getBrCode() {
		return this.brCode;
	}

	public void setBrCode(String brCode) {
		this.brCode = brCode;
	}

	public String getCurrCode() {
		return this.currCode;
	}

	public void setCurrCode(String currCode) {
		this.currCode = currCode;
	}

	public String getCustAcct() {
		return this.custAcct;
	}

	public void setCustAcct(String custAcct) {
		this.custAcct = custAcct;
	}

	public String getCustName() {
		return this.custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
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

	public BigDecimal getInstNo() {
		return this.instNo;
	}

	public void setInstNo(BigDecimal instNo) {
		this.instNo = instNo;
	}

	public BigDecimal getLoanFacId() {
		return this.loanFacId;
	}

	public void setLoanFacId(BigDecimal loanFacId) {
		this.loanFacId = loanFacId;
	}

	public BigDecimal getNod() {
		return this.nod;
	}

	public void setNod(BigDecimal nod) {
		this.nod = nod;
	}

	public BigDecimal getObl() {
		return this.obl;
	}

	public void setObl(BigDecimal obl) {
		this.obl = obl;
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

}