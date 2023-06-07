package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FA_INFORMATION_REPORT database table.
 * 
 */
@Entity
@Table(name="FA_INFORMATION_REPORT")
@NamedQuery(name="FaInformationReport.findAll", query="SELECT f FROM FaInformationReport f")
public class FaInformationReport implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ASSET_GL")
	private BigDecimal assetGl;

	@Column(name="ASSET_ID")
	private BigDecimal assetId;

	@Column(name="ASSIGN_TO")
	private String assignTo;

	private String location;

	private String name;

	private BigDecimal price;

	@Column(name="PURCHASE_DATE")
	private Object purchaseDate;

	private String reference;

	@Column(name="SERIAL_NO")
	private String serialNo;

	@Column(name="TOTAL_DEPRE")
	private BigDecimal totalDepre;

	private String vendor;

	public FaInformationReport() {
	}

	public BigDecimal getAssetGl() {
		return this.assetGl;
	}

	public void setAssetGl(BigDecimal assetGl) {
		this.assetGl = assetGl;
	}

	public BigDecimal getAssetId() {
		return this.assetId;
	}

	public void setAssetId(BigDecimal assetId) {
		this.assetId = assetId;
	}

	public String getAssignTo() {
		return this.assignTo;
	}

	public void setAssignTo(String assignTo) {
		this.assignTo = assignTo;
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

	public Object getPurchaseDate() {
		return this.purchaseDate;
	}

	public void setPurchaseDate(Object purchaseDate) {
		this.purchaseDate = purchaseDate;
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

	public BigDecimal getTotalDepre() {
		return this.totalDepre;
	}

	public void setTotalDepre(BigDecimal totalDepre) {
		this.totalDepre = totalDepre;
	}

	public String getVendor() {
		return this.vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

}