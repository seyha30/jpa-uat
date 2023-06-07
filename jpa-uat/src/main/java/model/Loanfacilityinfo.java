package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the LOANFACILITYINFO database table.
 * 
 */
@Entity
@NamedQuery(name="Loanfacilityinfo.findAll", query="SELECT l FROM Loanfacilityinfo l")
public class Loanfacilityinfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="LOAN_FAC_ID")
	private long loanFacId;

	private BigDecimal aging;

	@Column(name="DAY_DUE")
	private BigDecimal dayDue;

	@Column(name="ENTRY_DATE")
	private Object entryDate;

	@Column(name="FAC_REF_NO")
	private String facRefNo;

	@Column(name="LOAN_FAC_REF_NO")
	private String loanFacRefNo;

	@Column(name="LOAN_PRINCIPAL")
	private double loanPrincipal;

	@Column(name="LOAN_STATUS")
	private BigDecimal loanStatus;

	@Column(name="MATURITY_DATE")
	private Object maturityDate;

	private double outstanding;

	public Loanfacilityinfo() {
	}

	public long getLoanFacId() {
		return this.loanFacId;
	}

	public void setLoanFacId(long loanFacId) {
		this.loanFacId = loanFacId;
	}

	public BigDecimal getAging() {
		return this.aging;
	}

	public void setAging(BigDecimal aging) {
		this.aging = aging;
	}

	public BigDecimal getDayDue() {
		return this.dayDue;
	}

	public void setDayDue(BigDecimal dayDue) {
		this.dayDue = dayDue;
	}

	public Object getEntryDate() {
		return this.entryDate;
	}

	public void setEntryDate(Object entryDate) {
		this.entryDate = entryDate;
	}

	public String getFacRefNo() {
		return this.facRefNo;
	}

	public void setFacRefNo(String facRefNo) {
		this.facRefNo = facRefNo;
	}

	public String getLoanFacRefNo() {
		return this.loanFacRefNo;
	}

	public void setLoanFacRefNo(String loanFacRefNo) {
		this.loanFacRefNo = loanFacRefNo;
	}

	public double getLoanPrincipal() {
		return this.loanPrincipal;
	}

	public void setLoanPrincipal(double loanPrincipal) {
		this.loanPrincipal = loanPrincipal;
	}

	public BigDecimal getLoanStatus() {
		return this.loanStatus;
	}

	public void setLoanStatus(BigDecimal loanStatus) {
		this.loanStatus = loanStatus;
	}

	public Object getMaturityDate() {
		return this.maturityDate;
	}

	public void setMaturityDate(Object maturityDate) {
		this.maturityDate = maturityDate;
	}

	public double getOutstanding() {
		return this.outstanding;
	}

	public void setOutstanding(double outstanding) {
		this.outstanding = outstanding;
	}

}