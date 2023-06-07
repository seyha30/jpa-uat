package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FA_ASSET_DETAIL_BY_ASSET_ID database table.
 * 
 */
@Entity
@Table(name="FA_ASSET_DETAIL_BY_ASSET_ID")
@NamedQuery(name="FaAssetDetailByAssetId.findAll", query="SELECT f FROM FaAssetDetailByAssetId f")
public class FaAssetDetailByAssetId implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCUMULATED_DEPRECIATION")
	private BigDecimal accumulatedDepreciation;

	@Column(name="ACQ_DATE")
	private Object acqDate;

	private String active;

	@Column(name="ASSET_ALLOW_GL_NUMBER")
	private String assetAllowGlNumber;

	@Column(name="ASSET_ID")
	private BigDecimal assetId;

	@Column(name="ASSIGNED_TO")
	private String assignedTo;

	private String category;

	@Column(name="CURRENT_BOOK_VALUE")
	private BigDecimal currentBookValue;

	private BigDecimal daystillnow;

	@Column(name="DEPR_EXP_GL_NAME")
	private String deprExpGlName;

	@Column(name="DEPR_METHOD")
	private String deprMethod;

	@Column(name="DEPR_THRU")
	private Object deprThru;

	@Column(name="LAST_POSTING_DATE")
	private Object lastPostingDate;

	private String location;

	private String name;

	private BigDecimal price;

	private String reference;

	private String retire;

	private String serial;

	@Column(name="SERVICE_DATE")
	private Object serviceDate;

	private String vendor;

	public FaAssetDetailByAssetId() {
	}

	public BigDecimal getAccumulatedDepreciation() {
		return this.accumulatedDepreciation;
	}

	public void setAccumulatedDepreciation(BigDecimal accumulatedDepreciation) {
		this.accumulatedDepreciation = accumulatedDepreciation;
	}

	public Object getAcqDate() {
		return this.acqDate;
	}

	public void setAcqDate(Object acqDate) {
		this.acqDate = acqDate;
	}

	public String getActive() {
		return this.active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getAssetAllowGlNumber() {
		return this.assetAllowGlNumber;
	}

	public void setAssetAllowGlNumber(String assetAllowGlNumber) {
		this.assetAllowGlNumber = assetAllowGlNumber;
	}

	public BigDecimal getAssetId() {
		return this.assetId;
	}

	public void setAssetId(BigDecimal assetId) {
		this.assetId = assetId;
	}

	public String getAssignedTo() {
		return this.assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public BigDecimal getCurrentBookValue() {
		return this.currentBookValue;
	}

	public void setCurrentBookValue(BigDecimal currentBookValue) {
		this.currentBookValue = currentBookValue;
	}

	public BigDecimal getDaystillnow() {
		return this.daystillnow;
	}

	public void setDaystillnow(BigDecimal daystillnow) {
		this.daystillnow = daystillnow;
	}

	public String getDeprExpGlName() {
		return this.deprExpGlName;
	}

	public void setDeprExpGlName(String deprExpGlName) {
		this.deprExpGlName = deprExpGlName;
	}

	public String getDeprMethod() {
		return this.deprMethod;
	}

	public void setDeprMethod(String deprMethod) {
		this.deprMethod = deprMethod;
	}

	public Object getDeprThru() {
		return this.deprThru;
	}

	public void setDeprThru(Object deprThru) {
		this.deprThru = deprThru;
	}

	public Object getLastPostingDate() {
		return this.lastPostingDate;
	}

	public void setLastPostingDate(Object lastPostingDate) {
		this.lastPostingDate = lastPostingDate;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getRetire() {
		return this.retire;
	}

	public void setRetire(String retire) {
		this.retire = retire;
	}

	public String getSerial() {
		return this.serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public Object getServiceDate() {
		return this.serviceDate;
	}

	public void setServiceDate(Object serviceDate) {
		this.serviceDate = serviceDate;
	}

	public String getVendor() {
		return this.vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

}