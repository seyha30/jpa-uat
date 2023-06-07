package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the LOAN_DISBURSEMENT_PER_LOCATION database table.
 * 
 */
@Entity
@Table(name="LOAN_DISBURSEMENT_PER_LOCATION")
@NamedQuery(name="LoanDisbursementPerLocation.findAll", query="SELECT l FROM LoanDisbursementPerLocation l")
public class LoanDisbursementPerLocation implements Serializable {
	private static final long serialVersionUID = 1L;

	private String description;

	@Column(name="DIS_AMT")
	private BigDecimal disAmt;

	@Column(name="DIS_ID")
	private BigDecimal disId;

	@Column(name="N_ACCT")
	private BigDecimal nAcct;

	@Column(name="N_CLIENT")
	private BigDecimal nClient;

	@Column(name="N_CONTRACT")
	private BigDecimal nContract;

	@Column(name="N_NEW_CONTRACT")
	private BigDecimal nNewContract;

	@Column(name="OLB_AMT")
	private BigDecimal olbAmt;

	@Column(name="USER_ID")
	private String userId;

	public LoanDisbursementPerLocation() {
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getDisAmt() {
		return this.disAmt;
	}

	public void setDisAmt(BigDecimal disAmt) {
		this.disAmt = disAmt;
	}

	public BigDecimal getDisId() {
		return this.disId;
	}

	public void setDisId(BigDecimal disId) {
		this.disId = disId;
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

	public BigDecimal getNNewContract() {
		return this.nNewContract;
	}

	public void setNNewContract(BigDecimal nNewContract) {
		this.nNewContract = nNewContract;
	}

	public BigDecimal getOlbAmt() {
		return this.olbAmt;
	}

	public void setOlbAmt(BigDecimal olbAmt) {
		this.olbAmt = olbAmt;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}