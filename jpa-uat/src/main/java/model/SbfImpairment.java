package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SBF_IMPAIRMENT database table.
 * 
 */
@Entity
@Table(name="SBF_IMPAIRMENT")
@NamedQuery(name="SbfImpairment.findAll", query="SELECT s FROM SbfImpairment s")
public class SbfImpairment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AFFECTIVE_DATE")
	private Object affectiveDate;

	@Column(name="CREDIT_STATUS_ID")
	private BigDecimal creditStatusId;

	@Column(name="IMPAIRMENT_ID")
	private BigDecimal impairmentId;

	@Column(name="LGD_RATE")
	private BigDecimal lgdRate;

	@Column(name="PD_RATE")
	private BigDecimal pdRate;

	private String sector;

	public SbfImpairment() {
	}

	public Object getAffectiveDate() {
		return this.affectiveDate;
	}

	public void setAffectiveDate(Object affectiveDate) {
		this.affectiveDate = affectiveDate;
	}

	public BigDecimal getCreditStatusId() {
		return this.creditStatusId;
	}

	public void setCreditStatusId(BigDecimal creditStatusId) {
		this.creditStatusId = creditStatusId;
	}

	public BigDecimal getImpairmentId() {
		return this.impairmentId;
	}

	public void setImpairmentId(BigDecimal impairmentId) {
		this.impairmentId = impairmentId;
	}

	public BigDecimal getLgdRate() {
		return this.lgdRate;
	}

	public void setLgdRate(BigDecimal lgdRate) {
		this.lgdRate = lgdRate;
	}

	public BigDecimal getPdRate() {
		return this.pdRate;
	}

	public void setPdRate(BigDecimal pdRate) {
		this.pdRate = pdRate;
	}

	public String getSector() {
		return this.sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

}