package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FA_CALCULATION_PARAM database table.
 * 
 */
@Entity
@Table(name="FA_CALCULATION_PARAM")
@NamedQuery(name="FaCalculationParam.findAll", query="SELECT f FROM FaCalculationParam f")
public class FaCalculationParam implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ASSET_ID")
	private BigDecimal assetId;

	private BigDecimal cbv;

	private BigDecimal daystillnow;

	@Column(name="DEPR_THRU")
	private Object deprThru;

	@Column(name="DEPRE_METHOD")
	private BigDecimal depreMethod;

	@Column(name="EFFECTIVE_RATE")
	private BigDecimal effectiveRate;

	@Column(name="LAST_POSTING_DATE")
	private Object lastPostingDate;

	private BigDecimal nvb;

	private BigDecimal salvage;

	@Column(name="TOTAL_DEPRE")
	private BigDecimal totalDepre;

	@Column(name="USEFUL_LIFE")
	private BigDecimal usefulLife;

	public FaCalculationParam() {
	}

	public BigDecimal getAssetId() {
		return this.assetId;
	}

	public void setAssetId(BigDecimal assetId) {
		this.assetId = assetId;
	}

	public BigDecimal getCbv() {
		return this.cbv;
	}

	public void setCbv(BigDecimal cbv) {
		this.cbv = cbv;
	}

	public BigDecimal getDaystillnow() {
		return this.daystillnow;
	}

	public void setDaystillnow(BigDecimal daystillnow) {
		this.daystillnow = daystillnow;
	}

	public Object getDeprThru() {
		return this.deprThru;
	}

	public void setDeprThru(Object deprThru) {
		this.deprThru = deprThru;
	}

	public BigDecimal getDepreMethod() {
		return this.depreMethod;
	}

	public void setDepreMethod(BigDecimal depreMethod) {
		this.depreMethod = depreMethod;
	}

	public BigDecimal getEffectiveRate() {
		return this.effectiveRate;
	}

	public void setEffectiveRate(BigDecimal effectiveRate) {
		this.effectiveRate = effectiveRate;
	}

	public Object getLastPostingDate() {
		return this.lastPostingDate;
	}

	public void setLastPostingDate(Object lastPostingDate) {
		this.lastPostingDate = lastPostingDate;
	}

	public BigDecimal getNvb() {
		return this.nvb;
	}

	public void setNvb(BigDecimal nvb) {
		this.nvb = nvb;
	}

	public BigDecimal getSalvage() {
		return this.salvage;
	}

	public void setSalvage(BigDecimal salvage) {
		this.salvage = salvage;
	}

	public BigDecimal getTotalDepre() {
		return this.totalDepre;
	}

	public void setTotalDepre(BigDecimal totalDepre) {
		this.totalDepre = totalDepre;
	}

	public BigDecimal getUsefulLife() {
		return this.usefulLife;
	}

	public void setUsefulLife(BigDecimal usefulLife) {
		this.usefulLife = usefulLife;
	}

}