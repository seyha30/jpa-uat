package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the MERCHANT database table.
 * 
 */
@Entity
@NamedQuery(name="Merchant.findAll", query="SELECT m FROM Merchant m")
public class Merchant implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="APPROVED_BY")
	private String approvedBy;

	@Column(name="APPROVED_DATE")
	private Object approvedDate;

	@Column(name="CREATE_BY")
	private String createBy;

	@Column(name="CREATE_DATE")
	private Object createDate;

	@Column(name="IS_ACTIVE")
	private BigDecimal isActive;

	private BigDecimal isapproved;

	@Column(name="MERCHANT_CODE")
	private String merchantCode;

	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Column(name="MODIFIED_DATE")
	private Object modifiedDate;

	//bi-directional many-to-one association to CreditFacMaster
	@ManyToOne
	@JoinColumn(name="CREDIT_FAC_ID")
	private CreditFacMaster creditFacMaster;

	public Merchant() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getApprovedBy() {
		return this.approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public Object getApprovedDate() {
		return this.approvedDate;
	}

	public void setApprovedDate(Object approvedDate) {
		this.approvedDate = approvedDate;
	}

	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Object getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Object createDate) {
		this.createDate = createDate;
	}

	public BigDecimal getIsActive() {
		return this.isActive;
	}

	public void setIsActive(BigDecimal isActive) {
		this.isActive = isActive;
	}

	public BigDecimal getIsapproved() {
		return this.isapproved;
	}

	public void setIsapproved(BigDecimal isapproved) {
		this.isapproved = isapproved;
	}

	public String getMerchantCode() {
		return this.merchantCode;
	}

	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Object getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Object modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public CreditFacMaster getCreditFacMaster() {
		return this.creditFacMaster;
	}

	public void setCreditFacMaster(CreditFacMaster creditFacMaster) {
		this.creditFacMaster = creditFacMaster;
	}

}