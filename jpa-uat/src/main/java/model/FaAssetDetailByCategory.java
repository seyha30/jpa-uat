package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FA_ASSET_DETAIL_BY_CATEGORY database table.
 * 
 */
@Entity
@Table(name="FA_ASSET_DETAIL_BY_CATEGORY")
@NamedQuery(name="FaAssetDetailByCategory.findAll", query="SELECT f FROM FaAssetDetailByCategory f")
public class FaAssetDetailByCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACQ_DATE")
	private Object acqDate;

	private String active;

	@Column(name="ASSET_ID")
	private BigDecimal assetId;

	@Column(name="ASSET_NAME")
	private String assetName;

	@Column(name="BOOK_VALUE")
	private BigDecimal bookValue;

	private String category;

	private BigDecimal daystillnow;

	@Column(name="DEPR_THRU")
	private Object deprThru;

	@Column(name="LAST_DEPR_DATE")
	private Object lastDeprDate;

	private BigDecimal price;

	@Column(name="SERVICE_DATE")
	private Object serviceDate;

	@Column(name="TOTAL_DEPR")
	private BigDecimal totalDepr;

	public FaAssetDetailByCategory() {
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

	public BigDecimal getBookValue() {
		return this.bookValue;
	}

	public void setBookValue(BigDecimal bookValue) {
		this.bookValue = bookValue;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
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

	public Object getLastDeprDate() {
		return this.lastDeprDate;
	}

	public void setLastDeprDate(Object lastDeprDate) {
		this.lastDeprDate = lastDeprDate;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Object getServiceDate() {
		return this.serviceDate;
	}

	public void setServiceDate(Object serviceDate) {
		this.serviceDate = serviceDate;
	}

	public BigDecimal getTotalDepr() {
		return this.totalDepr;
	}

	public void setTotalDepr(BigDecimal totalDepr) {
		this.totalDepr = totalDepr;
	}

}