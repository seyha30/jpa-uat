package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the LOAN_COLLECTION database table.
 * 
 */
@Entity
@Table(name="LOAN_COLLECTION")
@NamedQuery(name="LoanCollection.findAll", query="SELECT l FROM LoanCollection l")
public class LoanCollection implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AMT_DUE")
	private BigDecimal amtDue;

	@Column(name="AMT_PAID")
	private BigDecimal amtPaid;

	@Column(name="CM_ID")
	private String cmId;

	@Column(name="COM_ENNAME")
	private String comEnname;

	private BigDecimal commission;

	@Column(name="CREDIT_OFFICER")
	private String creditOfficer;

	@Column(name="DATE_DONE")
	private Object dateDone;

	@Column(name="FEE_COL")
	private BigDecimal feeCol;

	@Column(name="FEE_DUE")
	private BigDecimal feeDue;

	@Column(name="FEE_PAID")
	private BigDecimal feePaid;

	@Column(name="FULL_NAME")
	private String fullName;

	@Column(name="INT_COL")
	private BigDecimal intCol;

	@Column(name="INT_DUE")
	private BigDecimal intDue;

	@Column(name="INT_PAID")
	private BigDecimal intPaid;

	@Column(name="LOAN_FAC_REF_NO")
	private String loanFacRefNo;

	private String member1;

	private String member2;

	@Column(name="PRIN_COL")
	private BigDecimal prinCol;

	@Column(name="PRIN_DUE")
	private BigDecimal prinDue;

	@Column(name="PRIN_PAID")
	private BigDecimal prinPaid;

	@Column(name="REPAY_RATE")
	private BigDecimal repayRate;

	public LoanCollection() {
	}

	public BigDecimal getAmtDue() {
		return this.amtDue;
	}

	public void setAmtDue(BigDecimal amtDue) {
		this.amtDue = amtDue;
	}

	public BigDecimal getAmtPaid() {
		return this.amtPaid;
	}

	public void setAmtPaid(BigDecimal amtPaid) {
		this.amtPaid = amtPaid;
	}

	public String getCmId() {
		return this.cmId;
	}

	public void setCmId(String cmId) {
		this.cmId = cmId;
	}

	public String getComEnname() {
		return this.comEnname;
	}

	public void setComEnname(String comEnname) {
		this.comEnname = comEnname;
	}

	public BigDecimal getCommission() {
		return this.commission;
	}

	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}

	public String getCreditOfficer() {
		return this.creditOfficer;
	}

	public void setCreditOfficer(String creditOfficer) {
		this.creditOfficer = creditOfficer;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public BigDecimal getFeeCol() {
		return this.feeCol;
	}

	public void setFeeCol(BigDecimal feeCol) {
		this.feeCol = feeCol;
	}

	public BigDecimal getFeeDue() {
		return this.feeDue;
	}

	public void setFeeDue(BigDecimal feeDue) {
		this.feeDue = feeDue;
	}

	public BigDecimal getFeePaid() {
		return this.feePaid;
	}

	public void setFeePaid(BigDecimal feePaid) {
		this.feePaid = feePaid;
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public BigDecimal getIntCol() {
		return this.intCol;
	}

	public void setIntCol(BigDecimal intCol) {
		this.intCol = intCol;
	}

	public BigDecimal getIntDue() {
		return this.intDue;
	}

	public void setIntDue(BigDecimal intDue) {
		this.intDue = intDue;
	}

	public BigDecimal getIntPaid() {
		return this.intPaid;
	}

	public void setIntPaid(BigDecimal intPaid) {
		this.intPaid = intPaid;
	}

	public String getLoanFacRefNo() {
		return this.loanFacRefNo;
	}

	public void setLoanFacRefNo(String loanFacRefNo) {
		this.loanFacRefNo = loanFacRefNo;
	}

	public String getMember1() {
		return this.member1;
	}

	public void setMember1(String member1) {
		this.member1 = member1;
	}

	public String getMember2() {
		return this.member2;
	}

	public void setMember2(String member2) {
		this.member2 = member2;
	}

	public BigDecimal getPrinCol() {
		return this.prinCol;
	}

	public void setPrinCol(BigDecimal prinCol) {
		this.prinCol = prinCol;
	}

	public BigDecimal getPrinDue() {
		return this.prinDue;
	}

	public void setPrinDue(BigDecimal prinDue) {
		this.prinDue = prinDue;
	}

	public BigDecimal getPrinPaid() {
		return this.prinPaid;
	}

	public void setPrinPaid(BigDecimal prinPaid) {
		this.prinPaid = prinPaid;
	}

	public BigDecimal getRepayRate() {
		return this.repayRate;
	}

	public void setRepayRate(BigDecimal repayRate) {
		this.repayRate = repayRate;
	}

}