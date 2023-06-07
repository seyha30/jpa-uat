package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TB_DEBIT_L database table.
 * 
 */
@Entity
@Table(name="TB_DEBIT_L")
@NamedQuery(name="TbDebitL.findAll", query="SELECT t FROM TbDebitL t")
public class TbDebitL implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCT_ID")
	private String acctId;

	private String description;

	@Column(name="GL_NAME")
	private String glName;

	@Column(name="LOAN_STATUS")
	private BigDecimal loanStatus;

	public TbDebitL() {
	}

	public String getAcctId() {
		return this.acctId;
	}

	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGlName() {
		return this.glName;
	}

	public void setGlName(String glName) {
		this.glName = glName;
	}

	public BigDecimal getLoanStatus() {
		return this.loanStatus;
	}

	public void setLoanStatus(BigDecimal loanStatus) {
		this.loanStatus = loanStatus;
	}

}