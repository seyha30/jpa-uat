package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SBF_COMPANY database table.
 * 
 */
@Entity
@Table(name="SBF_COMPANY")
@NamedQuery(name="SbfCompany.findAll", query="SELECT s FROM SbfCompany s")
public class SbfCompany implements Serializable {
	private static final long serialVersionUID = 1L;

	private String branch;

	@Column(name="COM_CONTACT")
	private String comContact;

	@Column(name="COM_ENNAME")
	private String comEnname;

	@Column(name="COM_ID")
	private String comId;

	@Column(name="COM_KHNAME")
	private Object comKhname;

	@Column(name="CORPORATE_STATUS")
	private String corporateStatus;

	private String gategory;

	@Column(name="LOAN_EXPOSURE")
	private BigDecimal loanExposure;

	private String location;

	@Column(name="MAX_LOAN_SIZE")
	private BigDecimal maxLoanSize;

	@Column(name="PAR_RATE")
	private BigDecimal parRate;

	private Object remark;

	private String sector;

	public SbfCompany() {
	}

	public String getBranch() {
		return this.branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getComContact() {
		return this.comContact;
	}

	public void setComContact(String comContact) {
		this.comContact = comContact;
	}

	public String getComEnname() {
		return this.comEnname;
	}

	public void setComEnname(String comEnname) {
		this.comEnname = comEnname;
	}

	public String getComId() {
		return this.comId;
	}

	public void setComId(String comId) {
		this.comId = comId;
	}

	public Object getComKhname() {
		return this.comKhname;
	}

	public void setComKhname(Object comKhname) {
		this.comKhname = comKhname;
	}

	public String getCorporateStatus() {
		return this.corporateStatus;
	}

	public void setCorporateStatus(String corporateStatus) {
		this.corporateStatus = corporateStatus;
	}

	public String getGategory() {
		return this.gategory;
	}

	public void setGategory(String gategory) {
		this.gategory = gategory;
	}

	public BigDecimal getLoanExposure() {
		return this.loanExposure;
	}

	public void setLoanExposure(BigDecimal loanExposure) {
		this.loanExposure = loanExposure;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public BigDecimal getMaxLoanSize() {
		return this.maxLoanSize;
	}

	public void setMaxLoanSize(BigDecimal maxLoanSize) {
		this.maxLoanSize = maxLoanSize;
	}

	public BigDecimal getParRate() {
		return this.parRate;
	}

	public void setParRate(BigDecimal parRate) {
		this.parRate = parRate;
	}

	public Object getRemark() {
		return this.remark;
	}

	public void setRemark(Object remark) {
		this.remark = remark;
	}

	public String getSector() {
		return this.sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

}