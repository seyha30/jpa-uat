package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CREDIT_TYPE database table.
 * 
 */
@Entity
@Table(name="CREDIT_TYPE")
@NamedQuery(name="CreditType.findAll", query="SELECT c FROM CreditType c")
public class CreditType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CREDIT_TYPE_ID")
	private long creditTypeId;

	@Column(name="CREATE_DATE")
	private Object createDate;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREDIT_TYPE_CODE")
	private String creditTypeCode;

	@Column(name="CUST_ACCT_TYPE_ID")
	private BigDecimal custAcctTypeId;

	private String description;

	@Column(name="INT_RATE")
	private BigDecimal intRate;

	private String isfacility;

	private String remarks;

	public CreditType() {
	}

	public long getCreditTypeId() {
		return this.creditTypeId;
	}

	public void setCreditTypeId(long creditTypeId) {
		this.creditTypeId = creditTypeId;
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

	public String getCreditTypeCode() {
		return this.creditTypeCode;
	}

	public void setCreditTypeCode(String creditTypeCode) {
		this.creditTypeCode = creditTypeCode;
	}

	public BigDecimal getCustAcctTypeId() {
		return this.custAcctTypeId;
	}

	public void setCustAcctTypeId(BigDecimal custAcctTypeId) {
		this.custAcctTypeId = custAcctTypeId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getIntRate() {
		return this.intRate;
	}

	public void setIntRate(BigDecimal intRate) {
		this.intRate = intRate;
	}

	public String getIsfacility() {
		return this.isfacility;
	}

	public void setIsfacility(String isfacility) {
		this.isfacility = isfacility;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}