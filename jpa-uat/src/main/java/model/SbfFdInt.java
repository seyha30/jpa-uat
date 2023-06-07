package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SBF_FD_INT database table.
 * 
 */
@Entity
@Table(name="SBF_FD_INT")
@NamedQuery(name="SbfFdInt.findAll", query="SELECT s FROM SbfFdInt s")
public class SbfFdInt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AFFECTIVE_DATE")
	private Object affectiveDate;

	@Column(name="FD_TYPE")
	private String fdType;

	private BigDecimal id;

	@Column(name="INT_RATE")
	private BigDecimal intRate;

	private BigDecimal period;

	@Column(name="RECORD_STAT")
	private String recordStat;

	private String terms;

	public SbfFdInt() {
	}

	public Object getAffectiveDate() {
		return this.affectiveDate;
	}

	public void setAffectiveDate(Object affectiveDate) {
		this.affectiveDate = affectiveDate;
	}

	public String getFdType() {
		return this.fdType;
	}

	public void setFdType(String fdType) {
		this.fdType = fdType;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public BigDecimal getIntRate() {
		return this.intRate;
	}

	public void setIntRate(BigDecimal intRate) {
		this.intRate = intRate;
	}

	public BigDecimal getPeriod() {
		return this.period;
	}

	public void setPeriod(BigDecimal period) {
		this.period = period;
	}

	public String getRecordStat() {
		return this.recordStat;
	}

	public void setRecordStat(String recordStat) {
		this.recordStat = recordStat;
	}

	public String getTerms() {
		return this.terms;
	}

	public void setTerms(String terms) {
		this.terms = terms;
	}

}