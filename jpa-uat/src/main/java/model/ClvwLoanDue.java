package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CLVW_LOAN_DUE database table.
 * 
 */
@Entity
@Table(name="CLVW_LOAN_DUE")
@NamedQuery(name="ClvwLoanDue.findAll", query="SELECT c FROM ClvwLoanDue c")
public class ClvwLoanDue implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal aging;

	private BigDecimal custacctid;

	@Column(name="CUSTACCTID_DEPOSIT")
	private BigDecimal custacctidDeposit;

	@Column(name="DUE_DATE")
	private Object dueDate;

	@Column(name="FEE_DUE")
	private BigDecimal feeDue;

	@Column(name="INT_DUE")
	private BigDecimal intDue;

	@Column(name="LOAN_FAC_ID")
	private BigDecimal loanFacId;

	private BigDecimal pen;

	@Column(name="PRIN_DUE")
	private BigDecimal prinDue;

	@Column(name="REF_NO")
	private String refNo;

	@Column(name="TOTAL_DUE")
	private BigDecimal totalDue;

	public ClvwLoanDue() {
	}

	public BigDecimal getAging() {
		return this.aging;
	}

	public void setAging(BigDecimal aging) {
		this.aging = aging;
	}

	public BigDecimal getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(BigDecimal custacctid) {
		this.custacctid = custacctid;
	}

	public BigDecimal getCustacctidDeposit() {
		return this.custacctidDeposit;
	}

	public void setCustacctidDeposit(BigDecimal custacctidDeposit) {
		this.custacctidDeposit = custacctidDeposit;
	}

	public Object getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(Object dueDate) {
		this.dueDate = dueDate;
	}

	public BigDecimal getFeeDue() {
		return this.feeDue;
	}

	public void setFeeDue(BigDecimal feeDue) {
		this.feeDue = feeDue;
	}

	public BigDecimal getIntDue() {
		return this.intDue;
	}

	public void setIntDue(BigDecimal intDue) {
		this.intDue = intDue;
	}

	public BigDecimal getLoanFacId() {
		return this.loanFacId;
	}

	public void setLoanFacId(BigDecimal loanFacId) {
		this.loanFacId = loanFacId;
	}

	public BigDecimal getPen() {
		return this.pen;
	}

	public void setPen(BigDecimal pen) {
		this.pen = pen;
	}

	public BigDecimal getPrinDue() {
		return this.prinDue;
	}

	public void setPrinDue(BigDecimal prinDue) {
		this.prinDue = prinDue;
	}

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public BigDecimal getTotalDue() {
		return this.totalDue;
	}

	public void setTotalDue(BigDecimal totalDue) {
		this.totalDue = totalDue;
	}

}