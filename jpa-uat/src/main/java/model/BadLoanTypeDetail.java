package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the BAD_LOAN_TYPE_DETAIL database table.
 * 
 */
@Entity
@Table(name="BAD_LOAN_TYPE_DETAIL")
@NamedQuery(name="BadLoanTypeDetail.findAll", query="SELECT b FROM BadLoanTypeDetail b")
public class BadLoanTypeDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="BAD_LOAN_TYPE_DETAIL_ID")
	private long badLoanTypeDetailId;

	@Column(name="BAD_LOAN_TYPE_ID")
	private BigDecimal badLoanTypeId;

	@Column(name="CREDIT_STATUS_ID")
	private BigDecimal creditStatusId;

	private String description;

	@Column(name="MAX_DATE")
	private BigDecimal maxDate;

	@Column(name="MIN_DATE")
	private BigDecimal minDate;

	private BigDecimal rate;

	public BadLoanTypeDetail() {
	}

	public long getBadLoanTypeDetailId() {
		return this.badLoanTypeDetailId;
	}

	public void setBadLoanTypeDetailId(long badLoanTypeDetailId) {
		this.badLoanTypeDetailId = badLoanTypeDetailId;
	}

	public BigDecimal getBadLoanTypeId() {
		return this.badLoanTypeId;
	}

	public void setBadLoanTypeId(BigDecimal badLoanTypeId) {
		this.badLoanTypeId = badLoanTypeId;
	}

	public BigDecimal getCreditStatusId() {
		return this.creditStatusId;
	}

	public void setCreditStatusId(BigDecimal creditStatusId) {
		this.creditStatusId = creditStatusId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getMaxDate() {
		return this.maxDate;
	}

	public void setMaxDate(BigDecimal maxDate) {
		this.maxDate = maxDate;
	}

	public BigDecimal getMinDate() {
		return this.minDate;
	}

	public void setMinDate(BigDecimal minDate) {
		this.minDate = minDate;
	}

	public BigDecimal getRate() {
		return this.rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

}