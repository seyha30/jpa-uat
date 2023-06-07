package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the LOAN_DISBURSEMENT_PER_ACTIVITY database table.
 * 
 */
@Entity
@Table(name="LOAN_DISBURSEMENT_PER_ACTIVITY")
@NamedQuery(name="LoanDisbursementPerActivity.findAll", query="SELECT l FROM LoanDisbursementPerActivity l")
public class LoanDisbursementPerActivity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="BUSINESS_TYPE")
	private String businessType;

	@Column(name="DIS_AMT")
	private BigDecimal disAmt;

	@Column(name="N_ACCOUNT")
	private BigDecimal nAccount;

	@Column(name="N_CLIENT")
	private BigDecimal nClient;

	@Column(name="N_CONTRACT")
	private BigDecimal nContract;

	@Column(name="N_NEW_CONTRACT")
	private BigDecimal nNewContract;

	@Column(name="USER_ID")
	private String userId;

	public LoanDisbursementPerActivity() {
	}

	public String getBusinessType() {
		return this.businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
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

	public BigDecimal getNNewContract() {
		return this.nNewContract;
	}

	public void setNNewContract(BigDecimal nNewContract) {
		this.nNewContract = nNewContract;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}