package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the LOAN_DISBURSEMENT_PER_PRODUCT database table.
 * 
 */
@Entity
@Table(name="LOAN_DISBURSEMENT_PER_PRODUCT")
@NamedQuery(name="LoanDisbursementPerProduct.findAll", query="SELECT l FROM LoanDisbursementPerProduct l")
public class LoanDisbursementPerProduct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="DIS_AMT")
	private BigDecimal disAmt;

	@Column(name="N_ACCT")
	private BigDecimal nAcct;

	@Column(name="N_CLIENT")
	private BigDecimal nClient;

	@Column(name="N_CONTRACT")
	private BigDecimal nContract;

	@Column(name="N_NEW_CLIENT")
	private BigDecimal nNewClient;

	@Column(name="PRODUCT_ID")
	private BigDecimal productId;

	@Column(name="USER_ID")
	private String userId;

	public LoanDisbursementPerProduct() {
	}

	public BigDecimal getDisAmt() {
		return this.disAmt;
	}

	public void setDisAmt(BigDecimal disAmt) {
		this.disAmt = disAmt;
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

	public BigDecimal getProductId() {
		return this.productId;
	}

	public void setProductId(BigDecimal productId) {
		this.productId = productId;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}