package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the LOAN_DEPOSIT_LINK database table.
 * 
 */
@Entity
@Table(name="LOAN_DEPOSIT_LINK")
@NamedQuery(name="LoanDepositLink.findAll", query="SELECT l FROM LoanDepositLink l")
public class LoanDepositLink implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CUSTACCTID_DEPOSIT")
	private BigDecimal custacctidDeposit;

	private String deleted;

	private String description;

	@Column(name="LOAN_FAC_ID")
	private BigDecimal loanFacId;

	public LoanDepositLink() {
	}

	public BigDecimal getCustacctidDeposit() {
		return this.custacctidDeposit;
	}

	public void setCustacctidDeposit(BigDecimal custacctidDeposit) {
		this.custacctidDeposit = custacctidDeposit;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getLoanFacId() {
		return this.loanFacId;
	}

	public void setLoanFacId(BigDecimal loanFacId) {
		this.loanFacId = loanFacId;
	}

}