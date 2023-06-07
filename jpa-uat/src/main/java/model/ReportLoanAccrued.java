package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the REPORT_LOAN_ACCRUED database table.
 * 
 */
@Entity
@Table(name="REPORT_LOAN_ACCRUED")
@NamedQuery(name="ReportLoanAccrued.findAll", query="SELECT r FROM ReportLoanAccrued r")
public class ReportLoanAccrued implements Serializable {
	private static final long serialVersionUID = 1L;

	private String acno;

	@Column(name="\"INT\"")
	private BigDecimal int_;

	@Column(name="LOAN_FAC_ID")
	private BigDecimal loanFacId;

	public ReportLoanAccrued() {
	}

	public String getAcno() {
		return this.acno;
	}

	public void setAcno(String acno) {
		this.acno = acno;
	}

	public BigDecimal getInt_() {
		return this.int_;
	}

	public void setInt_(BigDecimal int_) {
		this.int_ = int_;
	}

	public BigDecimal getLoanFacId() {
		return this.loanFacId;
	}

	public void setLoanFacId(BigDecimal loanFacId) {
		this.loanFacId = loanFacId;
	}

}