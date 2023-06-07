package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the NA_REPORTTEMP database table.
 * 
 */
@Entity
@Table(name="NA_REPORTTEMP")
@NamedQuery(name="NaReporttemp.findAll", query="SELECT n FROM NaReporttemp n")
public class NaReporttemp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCT_NO")
	private String acctNo;

	@Column(name="AMT_LIMIT")
	private BigDecimal amtLimit;

	@Column(name="AVAILABLE_BAL")
	private BigDecimal availableBal;

	@Column(name="BEG_PRINT_PAID")
	private BigDecimal begPrintPaid;

	@Column(name="CONTRACT_DATE")
	private Object contractDate;

	@Column(name="CREDIT_FAC_ID")
	private BigDecimal creditFacId;

	@Column(name="CURR_CODE")
	private String currCode;

	private BigDecimal custacctid;

	@Column(name="EXPIRED_DATE")
	private Object expiredDate;

	@Column(name="FAC_REF_NO")
	private String facRefNo;

	@Column(name="INTEREST_PAID")
	private BigDecimal interestPaid;

	@Column(name="LOAN_FAC_REF_NO")
	private String loanFacRefNo;

	@Column(name="LOAN_PRINCIPAL")
	private BigDecimal loanPrincipal;

	@Column(name="MATURITY_DATE")
	private Object maturityDate;

	@Column(name="\"NAMES\"")
	private String names;

	@Column(name="PRINT_PAID")
	private BigDecimal printPaid;

	@Column(name="START_DATE")
	private Object startDate;

	public NaReporttemp() {
	}

	public String getAcctNo() {
		return this.acctNo;
	}

	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}

	public BigDecimal getAmtLimit() {
		return this.amtLimit;
	}

	public void setAmtLimit(BigDecimal amtLimit) {
		this.amtLimit = amtLimit;
	}

	public BigDecimal getAvailableBal() {
		return this.availableBal;
	}

	public void setAvailableBal(BigDecimal availableBal) {
		this.availableBal = availableBal;
	}

	public BigDecimal getBegPrintPaid() {
		return this.begPrintPaid;
	}

	public void setBegPrintPaid(BigDecimal begPrintPaid) {
		this.begPrintPaid = begPrintPaid;
	}

	public Object getContractDate() {
		return this.contractDate;
	}

	public void setContractDate(Object contractDate) {
		this.contractDate = contractDate;
	}

	public BigDecimal getCreditFacId() {
		return this.creditFacId;
	}

	public void setCreditFacId(BigDecimal creditFacId) {
		this.creditFacId = creditFacId;
	}

	public String getCurrCode() {
		return this.currCode;
	}

	public void setCurrCode(String currCode) {
		this.currCode = currCode;
	}

	public BigDecimal getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(BigDecimal custacctid) {
		this.custacctid = custacctid;
	}

	public Object getExpiredDate() {
		return this.expiredDate;
	}

	public void setExpiredDate(Object expiredDate) {
		this.expiredDate = expiredDate;
	}

	public String getFacRefNo() {
		return this.facRefNo;
	}

	public void setFacRefNo(String facRefNo) {
		this.facRefNo = facRefNo;
	}

	public BigDecimal getInterestPaid() {
		return this.interestPaid;
	}

	public void setInterestPaid(BigDecimal interestPaid) {
		this.interestPaid = interestPaid;
	}

	public String getLoanFacRefNo() {
		return this.loanFacRefNo;
	}

	public void setLoanFacRefNo(String loanFacRefNo) {
		this.loanFacRefNo = loanFacRefNo;
	}

	public BigDecimal getLoanPrincipal() {
		return this.loanPrincipal;
	}

	public void setLoanPrincipal(BigDecimal loanPrincipal) {
		this.loanPrincipal = loanPrincipal;
	}

	public Object getMaturityDate() {
		return this.maturityDate;
	}

	public void setMaturityDate(Object maturityDate) {
		this.maturityDate = maturityDate;
	}

	public String getNames() {
		return this.names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public BigDecimal getPrintPaid() {
		return this.printPaid;
	}

	public void setPrintPaid(BigDecimal printPaid) {
		this.printPaid = printPaid;
	}

	public Object getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Object startDate) {
		this.startDate = startDate;
	}

}