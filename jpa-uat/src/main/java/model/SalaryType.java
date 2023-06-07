package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SALARY_TYPE database table.
 * 
 */
@Entity
@Table(name="SALARY_TYPE")
@NamedQuery(name="SalaryType.findAll", query="SELECT s FROM SalaryType s")
public class SalaryType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="BRANCH_ID")
	private BigDecimal branchId;

	private BigDecimal currid;

	private String description;

	@Column(name="POST_GL")
	private BigDecimal postGl;

	@Column(name="TYPE_ID")
	private BigDecimal typeId;

	public SalaryType() {
	}

	public BigDecimal getBranchId() {
		return this.branchId;
	}

	public void setBranchId(BigDecimal branchId) {
		this.branchId = branchId;
	}

	public BigDecimal getCurrid() {
		return this.currid;
	}

	public void setCurrid(BigDecimal currid) {
		this.currid = currid;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPostGl() {
		return this.postGl;
	}

	public void setPostGl(BigDecimal postGl) {
		this.postGl = postGl;
	}

	public BigDecimal getTypeId() {
		return this.typeId;
	}

	public void setTypeId(BigDecimal typeId) {
		this.typeId = typeId;
	}

}