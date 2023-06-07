package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the INSTALLMENT_TYPE database table.
 * 
 */
@Entity
@Table(name="INSTALLMENT_TYPE")
@NamedQuery(name="InstallmentType.findAll", query="SELECT i FROM InstallmentType i")
public class InstallmentType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CREATE_DATE")
	private Object createDate;

	@Column(name="CREATED_BY")
	private String createdBy;

	private String description;

	@Column(name="DESCRIPTION_KH")
	private String descriptionKh;

	@Column(name="INSTALLMENT_TYPE_CODE")
	private String installmentTypeCode;

	@Column(name="INSTALLMENT_TYPE_ID")
	private BigDecimal installmentTypeId;

	private String period;

	private String remarks;

	public InstallmentType() {
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

	public String getInstallmentTypeCode() {
		return this.installmentTypeCode;
	}

	public void setInstallmentTypeCode(String installmentTypeCode) {
		this.installmentTypeCode = installmentTypeCode;
	}

	public BigDecimal getInstallmentTypeId() {
		return this.installmentTypeId;
	}

	public void setInstallmentTypeId(BigDecimal installmentTypeId) {
		this.installmentTypeId = installmentTypeId;
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}