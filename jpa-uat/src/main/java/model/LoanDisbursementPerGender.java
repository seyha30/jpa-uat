package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the LOAN_DISBURSEMENT_PER_GENDER database table.
 * 
 */
@Entity
@Table(name="LOAN_DISBURSEMENT_PER_GENDER")
@NamedQuery(name="LoanDisbursementPerGender.findAll", query="SELECT l FROM LoanDisbursementPerGender l")
public class LoanDisbursementPerGender implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="DIS_AMT")
	private BigDecimal disAmt;

	@Column(name="GENDER_ID")
	private String genderId;

	@Column(name="N_ACCT")
	private BigDecimal nAcct;

	@Column(name="N_CLIENT")
	private BigDecimal nClient;

	@Column(name="N_CONTRACT")
	private BigDecimal nContract;

	@Column(name="N_NEW_CLIENT")
	private BigDecimal nNewClient;

	@Column(name="USER_ID")
	private String userId;

	public LoanDisbursementPerGender() {
	}

	public BigDecimal getDisAmt() {
		return this.disAmt;
	}

	public void setDisAmt(BigDecimal disAmt) {
		this.disAmt = disAmt;
	}

	public String getGenderId() {
		return this.genderId;
	}

	public void setGenderId(String genderId) {
		this.genderId = genderId;
	}

	public BigDecimal getNAcct() {
		return this.nAcct;
	}

	public void setNAcct(BigDecimal nAcct) {
		this.nAcct = nAcct;
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