package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the BUSINESS_TYPE database table.
 * 
 */
@Entity
@Table(name="BUSINESS_TYPE")
@NamedQuery(name="BusinessType.findAll", query="SELECT b FROM BusinessType b")
public class BusinessType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="BUS_TYPE_ID")
	private long busTypeId;

	@Column(name="BUS_TYPE_CODE")
	private String busTypeCode;

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

	//bi-directional many-to-one association to CreditFacMaster
	@OneToMany(mappedBy="businessType")
	private List<CreditFacMaster> creditFacMasters;

	public BusinessType() {
	}

	public long getBusTypeId() {
		return this.busTypeId;
	}

	public void setBusTypeId(long busTypeId) {
		this.busTypeId = busTypeId;
	}

	public String getBusTypeCode() {
		return this.busTypeCode;
	}

	public void setBusTypeCode(String busTypeCode) {
		this.busTypeCode = busTypeCode;
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

	public List<CreditFacMaster> getCreditFacMasters() {
		return this.creditFacMasters;
	}

	public void setCreditFacMasters(List<CreditFacMaster> creditFacMasters) {
		this.creditFacMasters = creditFacMasters;
	}

	public CreditFacMaster addCreditFacMaster(CreditFacMaster creditFacMaster) {
		getCreditFacMasters().add(creditFacMaster);
		creditFacMaster.setBusinessType(this);

		return creditFacMaster;
	}

	public CreditFacMaster removeCreditFacMaster(CreditFacMaster creditFacMaster) {
		getCreditFacMasters().remove(creditFacMaster);
		creditFacMaster.setBusinessType(null);

		return creditFacMaster;
	}

}