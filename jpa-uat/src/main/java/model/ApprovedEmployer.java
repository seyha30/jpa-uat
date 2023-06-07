package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the APPROVED_EMPLOYER database table.
 * 
 */
@Entity
@Table(name="APPROVED_EMPLOYER")
@NamedQuery(name="ApprovedEmployer.findAll", query="SELECT a FROM ApprovedEmployer a")
public class ApprovedEmployer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String code;

	private String address;

	private String branch;

	private String contact;

	@Column(name="NAME_EN")
	private String nameEn;

	@Column(name="NAME_KH")
	private String nameKh;

	private String remark;

	private String sector;

	private String status;

	@Column(name="\"TYPE\"")
	private String type;

	public ApprovedEmployer() {
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBranch() {
		return this.branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getNameEn() {
		return this.nameEn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	public String getNameKh() {
		return this.nameKh;
	}

	public void setNameKh(String nameKh) {
		this.nameKh = nameKh;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSector() {
		return this.sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}