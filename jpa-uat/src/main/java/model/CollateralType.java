package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the COLLATERAL_TYPE database table.
 * 
 */
@Entity
@Table(name="COLLATERAL_TYPE")
@NamedQuery(name="CollateralType.findAll", query="SELECT c FROM CollateralType c")
public class CollateralType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="COLLATERAL_TYPE_CODE")
	private String collateralTypeCode;

	@Column(name="COLLATERAL_TYPE_ID")
	private BigDecimal collateralTypeId;

	@Column(name="CREATE_DATE")
	private Object createDate;

	@Column(name="CREATED_BY")
	private String createdBy;

	private String description;

	private String remarks;

	public CollateralType() {
	}

	public String getCollateralTypeCode() {
		return this.collateralTypeCode;
	}

	public void setCollateralTypeCode(String collateralTypeCode) {
		this.collateralTypeCode = collateralTypeCode;
	}

	public BigDecimal getCollateralTypeId() {
		return this.collateralTypeId;
	}

	public void setCollateralTypeId(BigDecimal collateralTypeId) {
		this.collateralTypeId = collateralTypeId;
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

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}