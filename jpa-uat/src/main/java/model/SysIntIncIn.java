package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SYS_INT_INC_INS database table.
 * 
 */
@Entity
@Table(name="SYS_INT_INC_INS")
@NamedQuery(name="SysIntIncIn.findAll", query="SELECT s FROM SysIntIncIn s")
public class SysIntIncIn implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCUMULATE_BAL")
	private BigDecimal accumulateBal;

	@Column(name="BRANCH_ID")
	private String branchId;

	@Column(name="CLASS_GROUP")
	private BigDecimal classGroup;

	private String description;

	@Column(name="IN_INCOME")
	private BigDecimal inIncome;

	@Column(name="SSL_INT_SUS_GL")
	private BigDecimal sslIntSusGl;

	public SysIntIncIn() {
	}

	public BigDecimal getAccumulateBal() {
		return this.accumulateBal;
	}

	public void setAccumulateBal(BigDecimal accumulateBal) {
		this.accumulateBal = accumulateBal;
	}

	public String getBranchId() {
		return this.branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public BigDecimal getClassGroup() {
		return this.classGroup;
	}

	public void setClassGroup(BigDecimal classGroup) {
		this.classGroup = classGroup;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getInIncome() {
		return this.inIncome;
	}

	public void setInIncome(BigDecimal inIncome) {
		this.inIncome = inIncome;
	}

	public BigDecimal getSslIntSusGl() {
		return this.sslIntSusGl;
	}

	public void setSslIntSusGl(BigDecimal sslIntSusGl) {
		this.sslIntSusGl = sslIntSusGl;
	}

}