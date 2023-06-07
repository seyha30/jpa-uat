package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the UNDEPRECIATED_ASSET database table.
 * 
 */
@Entity
@Table(name="UNDEPRECIATED_ASSET")
@NamedQuery(name="UndepreciatedAsset.findAll", query="SELECT u FROM UndepreciatedAsset u")
public class UndepreciatedAsset implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ADDING_COST")
	private BigDecimal addingCost;

	@Column(name="ASSET_DESCRIPTION")
	private String assetDescription;

	@Column(name="ASSET_GL_NAME")
	private String assetGlName;

	@Column(name="ASSET_ID")
	private BigDecimal assetId;

	@Column(name="CURRENT_DEPRE_AMOUNT")
	private BigDecimal currentDepreAmount;

	@Column(name="DEPRE_RATE")
	private BigDecimal depreRate;

	private BigDecimal dispose;

	@Column(name="GL_NO")
	private String glNo;

	@Column(name="LAST_DEPRE_DATE")
	private Object lastDepreDate;

	@Column(name="NET_BOOK_VALUE")
	private BigDecimal netBookValue;

	@Column(name="ORIGINAL_COST")
	private BigDecimal originalCost;

	@Column(name="PERIOD_VIEW")
	private Object periodView;

	@Column(name="PREV_DEPRE")
	private BigDecimal prevDepre;

	@Column(name="PURCHASE_DATE")
	private String purchaseDate;

	@Column(name="TOTAL_COST")
	private BigDecimal totalCost;

	@Column(name="TOTAL_DEPRE")
	private BigDecimal totalDepre;

	private BigDecimal unit;

	@Column(name="UNIT_PRICE")
	private BigDecimal unitPrice;

	@Column(name="\"YEARS\"")
	private BigDecimal years;

	public UndepreciatedAsset() {
	}

	public BigDecimal getAddingCost() {
		return this.addingCost;
	}

	public void setAddingCost(BigDecimal addingCost) {
		this.addingCost = addingCost;
	}

	public String getAssetDescription() {
		return this.assetDescription;
	}

	public void setAssetDescription(String assetDescription) {
		this.assetDescription = assetDescription;
	}

	public String getAssetGlName() {
		return this.assetGlName;
	}

	public void setAssetGlName(String assetGlName) {
		this.assetGlName = assetGlName;
	}

	public BigDecimal getAssetId() {
		return this.assetId;
	}

	public void setAssetId(BigDecimal assetId) {
		this.assetId = assetId;
	}

	public BigDecimal getCurrentDepreAmount() {
		return this.currentDepreAmount;
	}

	public void setCurrentDepreAmount(BigDecimal currentDepreAmount) {
		this.currentDepreAmount = currentDepreAmount;
	}

	public BigDecimal getDepreRate() {
		return this.depreRate;
	}

	public void setDepreRate(BigDecimal depreRate) {
		this.depreRate = depreRate;
	}

	public BigDecimal getDispose() {
		return this.dispose;
	}

	public void setDispose(BigDecimal dispose) {
		this.dispose = dispose;
	}

	public String getGlNo() {
		return this.glNo;
	}

	public void setGlNo(String glNo) {
		this.glNo = glNo;
	}

	public Object getLastDepreDate() {
		return this.lastDepreDate;
	}

	public void setLastDepreDate(Object lastDepreDate) {
		this.lastDepreDate = lastDepreDate;
	}

	public BigDecimal getNetBookValue() {
		return this.netBookValue;
	}

	public void setNetBookValue(BigDecimal netBookValue) {
		this.netBookValue = netBookValue;
	}

	public BigDecimal getOriginalCost() {
		return this.originalCost;
	}

	public void setOriginalCost(BigDecimal originalCost) {
		this.originalCost = originalCost;
	}

	public Object getPeriodView() {
		return this.periodView;
	}

	public void setPeriodView(Object periodView) {
		this.periodView = periodView;
	}

	public BigDecimal getPrevDepre() {
		return this.prevDepre;
	}

	public void setPrevDepre(BigDecimal prevDepre) {
		this.prevDepre = prevDepre;
	}

	public String getPurchaseDate() {
		return this.purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public BigDecimal getTotalCost() {
		return this.totalCost;
	}

	public void setTotalCost(BigDecimal totalCost) {
		this.totalCost = totalCost;
	}

	public BigDecimal getTotalDepre() {
		return this.totalDepre;
	}

	public void setTotalDepre(BigDecimal totalDepre) {
		this.totalDepre = totalDepre;
	}

	public BigDecimal getUnit() {
		return this.unit;
	}

	public void setUnit(BigDecimal unit) {
		this.unit = unit;
	}

	public BigDecimal getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public BigDecimal getYears() {
		return this.years;
	}

	public void setYears(BigDecimal years) {
		this.years = years;
	}

}