package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CREDIT_RATE database table.
 * 
 */
@Entity
@Table(name="CREDIT_RATE")
@NamedQuery(name="CreditRate.findAll", query="SELECT c FROM CreditRate c")
public class CreditRate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CREDIT_RATE_ID")
	private long creditRateId;

	@Column(name="CREATE_DATE")
	private Object createDate;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREDIT_RATE_CODE")
	private String creditRateCode;

	private String description;

	private String remarks;

	public CreditRate() {
	}

	public long getCreditRateId() {
		return this.creditRateId;
	}

	public void setCreditRateId(long creditRateId) {
		this.creditRateId = creditRateId;
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

	public String getCreditRateCode() {
		return this.creditRateCode;
	}

	public void setCreditRateCode(String creditRateCode) {
		this.creditRateCode = creditRateCode;
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