package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the EMPREP database table.
 * 
 */
@Entity
@NamedQuery(name="Emprep.findAll", query="SELECT e FROM Emprep e")
public class Emprep implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="EMPREP_ID")
	private String emprepId;

	@Column(name="BRANCH_ID")
	private BigDecimal branchId;

	private String deleted;

	@Column(name="EMP_CODE")
	private String empCode;

	@Column(name="EMP_ID")
	private String empId;

	@Column(name="EMPREP_NAME")
	private String emprepName;

	@Column(name="EMPREP_NAME_KH")
	private String emprepNameKh;

	@Column(name="EMPREP_POSITION")
	private String emprepPosition;

	@Column(name="EMPREP_SEX")
	private String emprepSex;

	@Column(name="JOINING_DATE")
	private Object joiningDate;

	private String phone;

	@Column(name="REPORT_LEVEL")
	private BigDecimal reportLevel;

	public Emprep() {
	}

	public String getEmprepId() {
		return this.emprepId;
	}

	public void setEmprepId(String emprepId) {
		this.emprepId = emprepId;
	}

	public BigDecimal getBranchId() {
		return this.branchId;
	}

	public void setBranchId(BigDecimal branchId) {
		this.branchId = branchId;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getEmpCode() {
		return this.empCode;
	}

	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	public String getEmpId() {
		return this.empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmprepName() {
		return this.emprepName;
	}

	public void setEmprepName(String emprepName) {
		this.emprepName = emprepName;
	}

	public String getEmprepNameKh() {
		return this.emprepNameKh;
	}

	public void setEmprepNameKh(String emprepNameKh) {
		this.emprepNameKh = emprepNameKh;
	}

	public String getEmprepPosition() {
		return this.emprepPosition;
	}

	public void setEmprepPosition(String emprepPosition) {
		this.emprepPosition = emprepPosition;
	}

	public String getEmprepSex() {
		return this.emprepSex;
	}

	public void setEmprepSex(String emprepSex) {
		this.emprepSex = emprepSex;
	}

	public Object getJoiningDate() {
		return this.joiningDate;
	}

	public void setJoiningDate(Object joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public BigDecimal getReportLevel() {
		return this.reportLevel;
	}

	public void setReportLevel(BigDecimal reportLevel) {
		this.reportLevel = reportLevel;
	}

}