package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SBF_ACCT_TRANSFER database table.
 * 
 */
@Entity
@Table(name="SBF_ACCT_TRANSFER")
@NamedQuery(name="SbfAcctTransfer.findAll", query="SELECT s FROM SbfAcctTransfer s")
public class SbfAcctTransfer implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal custacctid;

	@Column(name="LOAN_FAC_ID")
	private BigDecimal loanFacId;

	@Column(name="SAVING_ACC")
	private String savingAcc;

	private String status;

	@Column(name="TR_DATE")
	private Object trDate;

	public SbfAcctTransfer() {
	}

	public BigDecimal getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(BigDecimal custacctid) {
		this.custacctid = custacctid;
	}

	public BigDecimal getLoanFacId() {
		return this.loanFacId;
	}

	public void setLoanFacId(BigDecimal loanFacId) {
		this.loanFacId = loanFacId;
	}

	public String getSavingAcc() {
		return this.savingAcc;
	}

	public void setSavingAcc(String savingAcc) {
		this.savingAcc = savingAcc;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Object getTrDate() {
		return this.trDate;
	}

	public void setTrDate(Object trDate) {
		this.trDate = trDate;
	}

}