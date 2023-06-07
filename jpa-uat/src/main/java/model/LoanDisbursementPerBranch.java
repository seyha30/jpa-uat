package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the LOAN_DISBURSEMENT_PER_BRANCH database table.
 * 
 */
@Entity
@Table(name="LOAN_DISBURSEMENT_PER_BRANCH")
@NamedQuery(name="LoanDisbursementPerBranch.findAll", query="SELECT l FROM LoanDisbursementPerBranch l")
public class LoanDisbursementPerBranch implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="BRANCH_ID")
	private BigDecimal branchId;

	@Column(name="DIS_AMT")
	private BigDecimal disAmt;

	@Column(name="N_ACCOUNT")
	private BigDecimal nAccount;

	@Column(name="N_CLIENT")
	private BigDecimal nClient;

	@Column(name="N_CONTRACT")
	private BigDecimal nContract;

	@Column(name="N_NEW_CLIENT")
	private BigDecimal nNewClient;

	@Column(name="USER_ID")
	private String userId;

	public LoanDisbursementPerBranch() {
	}

	public BigDecimal getBranchId() {
		return this.branchId;
	}

	public void setBranchId(BigDecimal branchId) {
		this.branchId = branchId;
	}

	public BigDecimal getDisAmt() {
		return this.disAmt;
	}

	public void setDisAmt(BigDecimal disAmt) {
		this.disAmt = disAmt;
	}

	public BigDecimal getNAccount() {
		return this.nAccount;
	}

	public void setNAccount(BigDecimal nAccount) {
		this.nAccount = nAccount;
	}

	public BigDecimal getNClient() {
		return this.nClient;
	}

	public void setNClient(BigDecimal nClient) {
		this.nClient = nClient;
	}

	public BigDecimal getNContract() {
		return this.nContract;
	}

	public void setNContract(BigDecimal nContract) {
		this.nContract = nContract;
	}

	public BigDecimal getNNewClient() {
		return this.nNewClient;
	}

	public void setNNewClient(BigDecimal nNewClient) {
		this.nNewClient = nNewClient;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}