package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the LIABILITY_REPORT_DATA database table.
 * 
 */
@Entity
@Table(name="LIABILITY_REPORT_DATA")
@NamedQuery(name="LiabilityReportData.findAll", query="SELECT l FROM LiabilityReportData l")
public class LiabilityReportData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="BRANCH_ID")
	private BigDecimal branchId;

	@Column(name="LINE_ID")
	private BigDecimal lineId;

	private BigDecimal value1;

	private BigDecimal value2;

	private BigDecimal value3;

	public LiabilityReportData() {
	}

	public BigDecimal getBranchId() {
		return this.branchId;
	}

	public void setBranchId(BigDecimal branchId) {
		this.branchId = branchId;
	}

	public BigDecimal getLineId() {
		return this.lineId;
	}

	public void setLineId(BigDecimal lineId) {
		this.lineId = lineId;
	}

	public BigDecimal getValue1() {
		return this.value1;
	}

	public void setValue1(BigDecimal value1) {
		this.value1 = value1;
	}

	public BigDecimal getValue2() {
		return this.value2;
	}

	public void setValue2(BigDecimal value2) {
		this.value2 = value2;
	}

	public BigDecimal getValue3() {
		return this.value3;
	}

	public void setValue3(BigDecimal value3) {
		this.value3 = value3;
	}

}