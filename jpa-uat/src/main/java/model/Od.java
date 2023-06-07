package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the OD database table.
 * 
 */
@Entity
@NamedQuery(name="Od.findAll", query="SELECT o FROM Od o")
public class Od implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long custacctid;

	@Column(name="INT_RATE")
	private BigDecimal intRate;

	@Column(name="OD_LIMIT")
	private BigDecimal odLimit;

	@Column(name="OD_USED")
	private BigDecimal odUsed;

	@Column(name="ODMAT_DATE")
	private Object odmatDate;

	@Column(name="REVIEW_DATE")
	private Object reviewDate;

	@Column(name="START_DATE")
	private Object startDate;

	private String yorm;

	public Od() {
	}

	public long getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(long custacctid) {
		this.custacctid = custacctid;
	}

	public BigDecimal getIntRate() {
		return this.intRate;
	}

	public void setIntRate(BigDecimal intRate) {
		this.intRate = intRate;
	}

	public BigDecimal getOdLimit() {
		return this.odLimit;
	}

	public void setOdLimit(BigDecimal odLimit) {
		this.odLimit = odLimit;
	}

	public BigDecimal getOdUsed() {
		return this.odUsed;
	}

	public void setOdUsed(BigDecimal odUsed) {
		this.odUsed = odUsed;
	}

	public Object getOdmatDate() {
		return this.odmatDate;
	}

	public void setOdmatDate(Object odmatDate) {
		this.odmatDate = odmatDate;
	}

	public Object getReviewDate() {
		return this.reviewDate;
	}

	public void setReviewDate(Object reviewDate) {
		this.reviewDate = reviewDate;
	}

	public Object getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Object startDate) {
		this.startDate = startDate;
	}

	public String getYorm() {
		return this.yorm;
	}

	public void setYorm(String yorm) {
		this.yorm = yorm;
	}

}