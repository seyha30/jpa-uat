package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CURRENCY_CODE_HISTORY database table.
 * 
 */
@Entity
@Table(name="CURRENCY_CODE_HISTORY")
@NamedQuery(name="CurrencyCodeHistory.findAll", query="SELECT c FROM CurrencyCodeHistory c")
public class CurrencyCodeHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AVERAGE_RATE")
	private BigDecimal averageRate;

	@Column(name="CURR_CODE")
	private String currCode;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	@Column(name="DATE_DONE")
	private Object dateDone;

	private String deleted;

	private String description;

	@Column(name="DESCRIPTION_KH")
	private String descriptionKh;

	private BigDecimal rate;

	@Column(name="SALE_RATE")
	private BigDecimal saleRate;

	@Column(name="VISA_ST_CODE")
	private BigDecimal visaStCode;

	public CurrencyCodeHistory() {
	}

	public BigDecimal getAverageRate() {
		return this.averageRate;
	}

	public void setAverageRate(BigDecimal averageRate) {
		this.averageRate = averageRate;
	}

	public String getCurrCode() {
		return this.currCode;
	}

	public void setCurrCode(String currCode) {
		this.currCode = currCode;
	}

	public BigDecimal getCurrId() {
		return this.currId;
	}

	public void setCurrId(BigDecimal currId) {
		this.currId = currId;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescriptionKh() {
		return this.descriptionKh;
	}

	public void setDescriptionKh(String descriptionKh) {
		this.descriptionKh = descriptionKh;
	}

	public BigDecimal getRate() {
		return this.rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public BigDecimal getSaleRate() {
		return this.saleRate;
	}

	public void setSaleRate(BigDecimal saleRate) {
		this.saleRate = saleRate;
	}

	public BigDecimal getVisaStCode() {
		return this.visaStCode;
	}

	public void setVisaStCode(BigDecimal visaStCode) {
		this.visaStCode = visaStCode;
	}

}