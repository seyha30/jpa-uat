package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the BUSINESS_TYPE_OLD database table.
 * 
 */
@Entity
@Table(name="BUSINESS_TYPE_OLD")
@NamedQuery(name="BusinessTypeOld.findAll", query="SELECT b FROM BusinessTypeOld b")
public class BusinessTypeOld implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="BUS_TYPE_CODE")
	private String busTypeCode;

	@Column(name="BUS_TYPE_ID")
	private BigDecimal busTypeId;

	@Column(name="CBC_CODE")
	private String cbcCode;

	@Column(name="CREATE_DATE")
	private Object createDate;

	@Column(name="CREATED_BY")
	private String createdBy;

	private String description;

	@Column(name="DESCRIPTION_KH")
	private String descriptionKh;

	private String industry;

	private String remarks;

	private String sector;

	public BusinessTypeOld() {
	}

	public String getBusTypeCode() {
		return this.busTypeCode;
	}

	public void setBusTypeCode(String busTypeCode) {
		this.busTypeCode = busTypeCode;
	}

	public BigDecimal getBusTypeId() {
		return this.busTypeId;
	}

	public void setBusTypeId(BigDecimal busTypeId) {
		this.busTypeId = busTypeId;
	}

	public String getCbcCode() {
		return this.cbcCode;
	}

	public void setCbcCode(String cbcCode) {
		this.cbcCode = cbcCode;
	}

	public Object getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Object createDate) {
		this.createDate = createDate;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
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

	public String getIndustry() {
		return this.industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getSector() {
		return this.sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

}