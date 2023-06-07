package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SBF_EMPREP_PLAN database table.
 * 
 */
@Entity
@Table(name="SBF_EMPREP_PLAN")
@NamedQuery(name="SbfEmprepPlan.findAll", query="SELECT s FROM SbfEmprepPlan s")
public class SbfEmprepPlan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AUTH_BY")
	private String authBy;

	@Column(name="AUTH_DATE")
	private Object authDate;

	@Column(name="BEG_OUTSTANDING")
	private BigDecimal begOutstanding;

	@Column(name="EMP_ID")
	private String empId;

	@Column(name="END_DATE")
	private Object endDate;

	@Column(name="GROW_PLAN")
	private BigDecimal growPlan;

	@Column(name="INPUT_BY")
	private String inputBy;

	@Column(name="INPUT_DATE")
	private Object inputDate;

	@Column(name="OPERATION_COST")
	private BigDecimal operationCost;

	@Column(name="P_OWED_LAST_MONTH")
	private BigDecimal pOwedLastMonth;

	@Column(name="SPECIALIZE_CODE")
	private BigDecimal specializeCode;

	@Column(name="START_DATE")
	private Object startDate;

	private String staturs;

	public SbfEmprepPlan() {
	}

	public String getAuthBy() {
		return this.authBy;
	}

	public void setAuthBy(String authBy) {
		this.authBy = authBy;
	}

	public Object getAuthDate() {
		return this.authDate;
	}

	public void setAuthDate(Object authDate) {
		this.authDate = authDate;
	}

	public BigDecimal getBegOutstanding() {
		return this.begOutstanding;
	}

	public void setBegOutstanding(BigDecimal begOutstanding) {
		this.begOutstanding = begOutstanding;
	}

	public String getEmpId() {
		return this.empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Object getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Object endDate) {
		this.endDate = endDate;
	}

	public BigDecimal getGrowPlan() {
		return this.growPlan;
	}

	public void setGrowPlan(BigDecimal growPlan) {
		this.growPlan = growPlan;
	}

	public String getInputBy() {
		return this.inputBy;
	}

	public void setInputBy(String inputBy) {
		this.inputBy = inputBy;
	}

	public Object getInputDate() {
		return this.inputDate;
	}

	public void setInputDate(Object inputDate) {
		this.inputDate = inputDate;
	}

	public BigDecimal getOperationCost() {
		return this.operationCost;
	}

	public void setOperationCost(BigDecimal operationCost) {
		this.operationCost = operationCost;
	}

	public BigDecimal getPOwedLastMonth() {
		return this.pOwedLastMonth;
	}

	public void setPOwedLastMonth(BigDecimal pOwedLastMonth) {
		this.pOwedLastMonth = pOwedLastMonth;
	}

	public BigDecimal getSpecializeCode() {
		return this.specializeCode;
	}

	public void setSpecializeCode(BigDecimal specializeCode) {
		this.specializeCode = specializeCode;
	}

	public Object getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Object startDate) {
		this.startDate = startDate;
	}

	public String getStaturs() {
		return this.staturs;
	}

	public void setStaturs(String staturs) {
		this.staturs = staturs;
	}

}