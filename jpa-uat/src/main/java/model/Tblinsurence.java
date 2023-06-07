package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TBLINSURENCE database table.
 * 
 */
@Entity
@NamedQuery(name="Tblinsurence.findAll", query="SELECT t FROM Tblinsurence t")
public class Tblinsurence implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal amount;

	@Column(name="COMPANY_NAME")
	private String companyName;

	private String deleted;

	@Column(name="INSURENCE_ID")
	private BigDecimal insurenceId;

	private String plans;

	private String remark;

	public Tblinsurence() {
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public BigDecimal getInsurenceId() {
		return this.insurenceId;
	}

	public void setInsurenceId(BigDecimal insurenceId) {
		this.insurenceId = insurenceId;
	}

	public String getPlans() {
		return this.plans;
	}

	public void setPlans(String plans) {
		this.plans = plans;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}