package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FA_PERIODVIEW database table.
 * 
 */
@Entity
@Table(name="FA_PERIODVIEW")
@NamedQuery(name="FaPeriodview.findAll", query="SELECT f FROM FaPeriodview f")
public class FaPeriodview implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCUM_DEPR")
	private BigDecimal accumDepr;

	@Column(name="ASSET_ID")
	private BigDecimal assetId;

	@Column(name="ASSET_NAME")
	private String assetName;

	@Column(name="ASSET_NBC_CODE")
	private BigDecimal assetNbcCode;

	@Column(name="CLOSING_BOOK_VALUE")
	private BigDecimal closingBookValue;

	@Column(name="DEPR_AMOUNT")
	private BigDecimal deprAmount;

	@Column(name="DEPR_FROM")
	private Object deprFrom;

	@Column(name="DEPR_RATE")
	private BigDecimal deprRate;

	@Column(name="DEPR_TO")
	private Object deprTo;

	@Column(name="ORIGINAL_COST")
	private BigDecimal originalCost;

	@Column(name="PREV_DEPR")
	private BigDecimal prevDepr;

	@Column(name="SERVICE_DATE")
	private Object serviceDate;

	@Column(name="\"YEAR\"")
	private BigDecimal year;

	public FaPeriodview() {
	}

	public BigDecimal getAccumDepr() {
		return this.accumDepr;
	}

	public void setAccumDepr(BigDecimal accumDepr) {
		this.accumDepr = accumDepr;
	}

	public BigDecimal getAssetId() {
		return this.assetId;
	}

	public void setAssetId(BigDecimal assetId) {
		this.assetId = assetId;
	}

	public String getAssetName() {
		return this.assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public BigDecimal getAssetNbcCode() {
		return this.assetNbcCode;
	}

	public void setAssetNbcCode(BigDecimal assetNbcCode) {
		this.assetNbcCode = assetNbcCode;
	}

	public BigDecimal getClosingBookValue() {
		return this.closingBookValue;
	}

	public void setClosingBookValue(BigDecimal closingBookValue) {
		this.closingBookValue = closingBookValue;
	}

	public BigDecimal getDeprAmount() {
		return this.deprAmount;
	}

	public void setDeprAmount(BigDecimal deprAmount) {
		this.deprAmount = deprAmount;
	}

	public Object getDeprFrom() {
		return this.deprFrom;
	}

	public void setDeprFrom(Object deprFrom) {
		this.deprFrom = deprFrom;
	}

	public BigDecimal getDeprRate() {
		return this.deprRate;
	}

	public void setDeprRate(BigDecimal deprRate) {
		this.deprRate = deprRate;
	}

	public Object getDeprTo() {
		return this.deprTo;
	}

	public void setDeprTo(Object deprTo) {
		this.deprTo = deprTo;
	}

	public BigDecimal getOriginalCost() {
		return this.originalCost;
	}

	public void setOriginalCost(BigDecimal originalCost) {
		this.originalCost = originalCost;
	}

	public BigDecimal getPrevDepr() {
		return this.prevDepr;
	}

	public void setPrevDepr(BigDecimal prevDepr) {
		this.prevDepr = prevDepr;
	}

	public Object getServiceDate() {
		return this.serviceDate;
	}

	public void setServiceDate(Object serviceDate) {
		this.serviceDate = serviceDate;
	}

	public BigDecimal getYear() {
		return this.year;
	}

	public void setYear(BigDecimal year) {
		this.year = year;
	}

}