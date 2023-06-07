package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FA_INFORMATION database table.
 * 
 */
@Entity
@Table(name="FA_INFORMATION")
@NamedQuery(name="FaInformation.findAll", query="SELECT f FROM FaInformation f")
public class FaInformation implements Serializable {
	private static final long serialVersionUID = 1L;

	private String active;

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

	private BigDecimal qty;

	private String reference;

	private String retire;

	@Column(name="SERIAL_NO")
	private String serialNo;

	@Column(name="SERVICE_DATE")
	private Object serviceDate;

	private String vendor;

	public FaInformation() {
	}

	public String getActive() {
		return this.active;
	}

	public void setActive(String active) {
		this.active = active;
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

	public BigDecimal getQty() {
		return this.qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
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

	public String getVendor() {
		return this.vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

}