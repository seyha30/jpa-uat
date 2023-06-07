package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the VLOAN_TRANX database table.
 * 
 */
@Entity
@Table(name="VLOAN_TRANX")
@NamedQuery(name="VloanTranx.findAll", query="SELECT v FROM VloanTranx v")
public class VloanTranx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="DATE_DONE")
	private Object dateDone;

	@Column(name="DONE_BY")
	private String doneBy;

	@Column(name="FAC_REF_NO")
	private String facRefNo;

	@Column(name="FROM_CUSTACCTID")
	private BigDecimal fromCustacctid;

	private BigDecimal interest;

	@Column(name="INTEREST_TRANX_ID")
	private BigDecimal interestTranxId;

	@Column(name="LOAN_FAC_REF_NO")
	private String loanFacRefNo;

	@Column(name="LOAN_TRANX_ID")
	private BigDecimal loanTranxId;

	@Column(name="\"NAMES\"")
	private String names;

	private BigDecimal principal;

	@Column(name="PRINCIPAL_TRANX_ID")
	private BigDecimal principalTranxId;

	public VloanTranx() {
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public String getDoneBy() {
		return this.doneBy;
	}

	public void setDoneBy(String doneBy) {
		this.doneBy = doneBy;
	}

	public String getFacRefNo() {
		return this.facRefNo;
	}

	public void setFacRefNo(String facRefNo) {
		this.facRefNo = facRefNo;
	}

	public BigDecimal getFromCustacctid() {
		return this.fromCustacctid;
	}

	public void setFromCustacctid(BigDecimal fromCustacctid) {
		this.fromCustacctid = fromCustacctid;
	}

	public BigDecimal getInterest() {
		return this.interest;
	}

	public void setInterest(BigDecimal interest) {
		this.interest = interest;
	}

	public BigDecimal getInterestTranxId() {
		return this.interestTranxId;
	}

	public void setInterestTranxId(BigDecimal interestTranxId) {
		this.interestTranxId = interestTranxId;
	}

	public String getLoanFacRefNo() {
		return this.loanFacRefNo;
	}

	public void setLoanFacRefNo(String loanFacRefNo) {
		this.loanFacRefNo = loanFacRefNo;
	}

	public BigDecimal getLoanTranxId() {
		return this.loanTranxId;
	}

	public void setLoanTranxId(BigDecimal loanTranxId) {
		this.loanTranxId = loanTranxId;
	}

	public String getNames() {
		return this.names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public BigDecimal getPrincipal() {
		return this.principal;
	}

	public void setPrincipal(BigDecimal principal) {
		this.principal = principal;
	}

	public BigDecimal getPrincipalTranxId() {
		return this.principalTranxId;
	}

	public void setPrincipalTranxId(BigDecimal principalTranxId) {
		this.principalTranxId = principalTranxId;
	}

}