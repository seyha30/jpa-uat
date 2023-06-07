package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the NA_REPORT database table.
 * 
 */
@Entity
@Table(name="NA_REPORT")
@NamedQuery(name="NaReport.findAll", query="SELECT n FROM NaReport n")
public class NaReport implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CHQ_STATUS_ID")
	private BigDecimal chqStatusId;

	@Column(name="CLEARED_DATE")
	private Object clearedDate;

	@Column(name="CURRENCY_ID")
	private BigDecimal currencyId;

	@Column(name="ISSUE_DATE")
	private Object issueDate;

	private String sno;

	public NaReport() {
	}

	public BigDecimal getChqStatusId() {
		return this.chqStatusId;
	}

	public void setChqStatusId(BigDecimal chqStatusId) {
		this.chqStatusId = chqStatusId;
	}

	public Object getClearedDate() {
		return this.clearedDate;
	}

	public void setClearedDate(Object clearedDate) {
		this.clearedDate = clearedDate;
	}

	public BigDecimal getCurrencyId() {
		return this.currencyId;
	}

	public void setCurrencyId(BigDecimal currencyId) {
		this.currencyId = currencyId;
	}

	public Object getIssueDate() {
		return this.issueDate;
	}

	public void setIssueDate(Object issueDate) {
		this.issueDate = issueDate;
	}

	public String getSno() {
		return this.sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

}