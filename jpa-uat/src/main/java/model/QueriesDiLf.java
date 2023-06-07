package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the QUERIES_DI_LF database table.
 * 
 */
@Entity
@Table(name="QUERIES_DI_LF")
@NamedQuery(name="QueriesDiLf.findAll", query="SELECT q FROM QueriesDiLf q")
public class QueriesDiLf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CREDIT_FAC_REF_NO")
	private String creditFacRefNo;

	private String custrefno;

	@Column(name="INT_RATE")
	private BigDecimal intRate;

	@Column(name="LOAN_FAC_ID")
	private BigDecimal loanFacId;

	@Column(name="LOAN_FAC_REF_NO")
	private String loanFacRefNo;

	@Column(name="PRINCIPAL_AMT")
	private BigDecimal principalAmt;

	@Column(name="START_DATE")
	private Object startDate;

	public QueriesDiLf() {
	}

	public String getCreditFacRefNo() {
		return this.creditFacRefNo;
	}

	public void setCreditFacRefNo(String creditFacRefNo) {
		this.creditFacRefNo = creditFacRefNo;
	}

	public String getCustrefno() {
		return this.custrefno;
	}

	public void setCustrefno(String custrefno) {
		this.custrefno = custrefno;
	}

	public BigDecimal getIntRate() {
		return this.intRate;
	}

	public void setIntRate(BigDecimal intRate) {
		this.intRate = intRate;
	}

	public BigDecimal getLoanFacId() {
		return this.loanFacId;
	}

	public void setLoanFacId(BigDecimal loanFacId) {
		this.loanFacId = loanFacId;
	}

	public String getLoanFacRefNo() {
		return this.loanFacRefNo;
	}

	public void setLoanFacRefNo(String loanFacRefNo) {
		this.loanFacRefNo = loanFacRefNo;
	}

	public BigDecimal getPrincipalAmt() {
		return this.principalAmt;
	}

	public void setPrincipalAmt(BigDecimal principalAmt) {
		this.principalAmt = principalAmt;
	}

	public Object getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Object startDate) {
		this.startDate = startDate;
	}

}