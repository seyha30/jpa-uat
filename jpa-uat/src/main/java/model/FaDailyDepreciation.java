package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FA_DAILY_DEPRECIATION database table.
 * 
 */
@Entity
@Table(name="FA_DAILY_DEPRECIATION")
@NamedQuery(name="FaDailyDepreciation.findAll", query="SELECT f FROM FaDailyDepreciation f")
public class FaDailyDepreciation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCUM_DEPR")
	private BigDecimal accumDepr;

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

	@Column(name="FAGL_ID")
	private BigDecimal faglId;

	@Column(name="GL_NAME")
	private String glName;

	private String location;

	@Column(name="ORIGINAL_COST")
	private BigDecimal originalCost;

	@Column(name="PREV_DEPR")
	private BigDecimal prevDepr;

	private String reference;

	@Column(name="SERIAL_NO")
	private String serialNo;

	@Column(name="SERVICE_DATE")
	private Object serviceDate;

	@Column(name="\"YEAR\"")
	private BigDecimal year;

	public FaDailyDepreciation() {
	}

	public BigDecimal getAccumDepr() {
		return this.accumDepr;
	}

	public void setAccumDepr(BigDecimal accumDepr) {
		this.accumDepr = accumDepr;
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

	public BigDecimal getFaglId() {
		return this.faglId;
	}

	public void setFaglId(BigDecimal faglId) {
		this.faglId = faglId;
	}

	public String getGlName() {
		return this.glName;
	}

	public void setGlName(String glName) {
		this.glName = glName;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
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

	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
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