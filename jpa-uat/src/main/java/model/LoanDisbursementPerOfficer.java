package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the LOAN_DISBURSEMENT_PER_OFFICER database table.
 * 
 */
@Entity
@Table(name="LOAN_DISBURSEMENT_PER_OFFICER")
@NamedQuery(name="LoanDisbursementPerOfficer.findAll", query="SELECT l FROM LoanDisbursementPerOfficer l")
public class LoanDisbursementPerOfficer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="DIS_AMT")
	private BigDecimal disAmt;

	@Column(name="EMP_ID")
	private BigDecimal empId;

	@Column(name="EMP_NAME")
	private String empName;

	@Column(name="N_ACCOUNT")
	private BigDecimal nAccount;

	@Column(name="N_CLIENCTS")
	private BigDecimal nCliencts;

	@Column(name="N_CONTRACT")
	private BigDecimal nContract;

	@Column(name="N_NEW_CLIENCTS")
	private BigDecimal nNewCliencts;

	@Column(name="USER_ID")
	private String userId;

	public LoanDisbursementPerOfficer() {
	}

	public BigDecimal getDisAmt() {
		return this.disAmt;
	}

	public void setDisAmt(BigDecimal disAmt) {
		this.disAmt = disAmt;
	}

	public BigDecimal getEmpId() {
		return this.empId;
	}

	public void setEmpId(BigDecimal empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public BigDecimal getNAccount() {
		return this.nAccount;
	}

	public void setNAccount(BigDecimal nAccount) {
		this.nAccount = nAccount;
	}

	public BigDecimal getNCliencts() {
		return this.nCliencts;
	}

	public void setNCliencts(BigDecimal nCliencts) {
		this.nCliencts = nCliencts;
	}

	public BigDecimal getNContract() {
		return this.nContract;
	}

	public void setNContract(BigDecimal nContract) {
		this.nContract = nContract;
	}

	public BigDecimal getNNewCliencts() {
		return this.nNewCliencts;
	}

	public void setNNewCliencts(BigDecimal nNewCliencts) {
		this.nNewCliencts = nNewCliencts;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}