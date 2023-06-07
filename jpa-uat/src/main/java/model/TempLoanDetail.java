package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TEMP_LOAN_DETAIL database table.
 * 
 */
@Entity
@Table(name="TEMP_LOAN_DETAIL")
@NamedQuery(name="TempLoanDetail.findAll", query="SELECT t FROM TempLoanDetail t")
public class TempLoanDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal amount;

	@Column(name="CURR_TYPE")
	private String currType;

	private String entrydate;

	private String expirydate;

	@Column(name="LOAN_REF_NO")
	private String loanRefNo;

	@Column(name="LOAN_TYPE")
	private String loanType;

	private String remarks;

	private String reviewdate;

	public TempLoanDetail() {
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCurrType() {
		return this.currType;
	}

	public void setCurrType(String currType) {
		this.currType = currType;
	}

	public String getEntrydate() {
		return this.entrydate;
	}

	public void setEntrydate(String entrydate) {
		this.entrydate = entrydate;
	}

	public String getExpirydate() {
		return this.expirydate;
	}

	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}

	public String getLoanRefNo() {
		return this.loanRefNo;
	}

	public void setLoanRefNo(String loanRefNo) {
		this.loanRefNo = loanRefNo;
	}

	public String getLoanType() {
		return this.loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getReviewdate() {
		return this.reviewdate;
	}

	public void setReviewdate(String reviewdate) {
		this.reviewdate = reviewdate;
	}

}