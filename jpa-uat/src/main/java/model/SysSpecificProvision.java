package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SYS_SPECIFIC_PROVISION database table.
 * 
 */
@Entity
@Table(name="SYS_SPECIFIC_PROVISION")
@NamedQuery(name="SysSpecificProvision.findAll", query="SELECT s FROM SysSpecificProvision s")
public class SysSpecificProvision implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="BRANCH_ID")
	private BigDecimal branchId;

	@Column(name="CUST_TYPE")
	private String custType;

	private BigDecimal diff;

	@Column(name="GL_BAL")
	private BigDecimal glBal;

	@Column(name="LESS_RES_GL")
	private BigDecimal lessResGl;

	private BigDecimal oustanding;

	@Column(name="PRO_AMOUNT")
	private BigDecimal proAmount;

	@Column(name="PROVISION_GL")
	private BigDecimal provisionGl;

	public SysSpecificProvision() {
	}

	public BigDecimal getBranchId() {
		return this.branchId;
	}

	public void setBranchId(BigDecimal branchId) {
		this.branchId = branchId;
	}

	public String getCustType() {
		return this.custType;
	}

	public void setCustType(String custType) {
		this.custType = custType;
	}

	public BigDecimal getDiff() {
		return this.diff;
	}

	public void setDiff(BigDecimal diff) {
		this.diff = diff;
	}

	public BigDecimal getGlBal() {
		return this.glBal;
	}

	public void setGlBal(BigDecimal glBal) {
		this.glBal = glBal;
	}

	public BigDecimal getLessResGl() {
		return this.lessResGl;
	}

	public void setLessResGl(BigDecimal lessResGl) {
		this.lessResGl = lessResGl;
	}

	public BigDecimal getOustanding() {
		return this.oustanding;
	}

	public void setOustanding(BigDecimal oustanding) {
		this.oustanding = oustanding;
	}

	public BigDecimal getProAmount() {
		return this.proAmount;
	}

	public void setProAmount(BigDecimal proAmount) {
		this.proAmount = proAmount;
	}

	public BigDecimal getProvisionGl() {
		return this.provisionGl;
	}

	public void setProvisionGl(BigDecimal provisionGl) {
		this.provisionGl = provisionGl;
	}

}