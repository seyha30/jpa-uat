package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FA_RETIRED database table.
 * 
 */
@Entity
@Table(name="FA_RETIRED")
@NamedQuery(name="FaRetired.findAll", query="SELECT f FROM FaRetired f")
public class FaRetired implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ASSET_GL")
	private String assetGl;

	@Column(name="ASSET_ID")
	private BigDecimal assetId;

	@Column(name="ASSET_NAME")
	private String assetName;

	@Column(name="BOOK_VALUE")
	private BigDecimal bookValue;

	@Column(name="DATE_RETIRED")
	private Object dateRetired;

	@Column(name="DEPRE_METHOD")
	private String depreMethod;

	@Column(name="GL_NAME")
	private String glName;

	@Column(name="LAST_DEPR_AMT")
	private BigDecimal lastDeprAmt;

	@Column(name="LAST_PID")
	private BigDecimal lastPid;

	private String reason;

	@Column(name="RETIRED_BY")
	private String retiredBy;

	@Column(name="TOTAL_DEPR")
	private BigDecimal totalDepr;

	public FaRetired() {
	}

	public String getAssetGl() {
		return this.assetGl;
	}

	public void setAssetGl(String assetGl) {
		this.assetGl = assetGl;
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

	public Object getDateRetired() {
		return this.dateRetired;
	}

	public void setDateRetired(Object dateRetired) {
		this.dateRetired = dateRetired;
	}

	public String getDepreMethod() {
		return this.depreMethod;
	}

	public void setDepreMethod(String depreMethod) {
		this.depreMethod = depreMethod;
	}

	public String getGlName() {
		return this.glName;
	}

	public void setGlName(String glName) {
		this.glName = glName;
	}

	public BigDecimal getLastDeprAmt() {
		return this.lastDeprAmt;
	}

	public void setLastDeprAmt(BigDecimal lastDeprAmt) {
		this.lastDeprAmt = lastDeprAmt;
	}

	public BigDecimal getLastPid() {
		return this.lastPid;
	}

	public void setLastPid(BigDecimal lastPid) {
		this.lastPid = lastPid;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getRetiredBy() {
		return this.retiredBy;
	}

	public void setRetiredBy(String retiredBy) {
		this.retiredBy = retiredBy;
	}

	public BigDecimal getTotalDepr() {
		return this.totalDepr;
	}

	public void setTotalDepr(BigDecimal totalDepr) {
		this.totalDepr = totalDepr;
	}

}