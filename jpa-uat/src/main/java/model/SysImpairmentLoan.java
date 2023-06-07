package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SYS_IMPAIRMENT_LOAN database table.
 * 
 */
@Entity
@Table(name="SYS_IMPAIRMENT_LOAN")
@NamedQuery(name="SysImpairmentLoan.findAll", query="SELECT s FROM SysImpairmentLoan s")
public class SysImpairmentLoan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCUMULATE_BAL")
	private BigDecimal accumulateBal;

	@Column(name="AFR_ACCU_BAL")
	private BigDecimal afrAccuBal;

	@Column(name="BRANCH_ID")
	private BigDecimal branchId;

	@Column(name="CREDIT_STATUS_ID")
	private BigDecimal creditStatusId;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	@Column(name="FEE_IMPAIRMENT")
	private BigDecimal feeImpairment;

	@Column(name="INT_IMPAIRMENT")
	private BigDecimal intImpairment;

	@Column(name="LGD_RATE")
	private BigDecimal lgdRate;

	@Column(name="LOAN_FAC_REF_NO")
	private String loanFacRefNo;

	private BigDecimal outstanding;

	@Column(name="PD_RATE")
	private BigDecimal pdRate;

	@Column(name="PRIN_IMPAIRMENT")
	private BigDecimal prinImpairment;

	@Column(name="PRO_GL")
	private BigDecimal proGl;

	@Column(name="RESERVE_GL")
	private BigDecimal reserveGl;

	private String sector;

	@Column(name="SML_INT_SUS_GL")
	private BigDecimal smlIntSusGl;

	@Column(name="SML_LESS_RES_GL")
	private BigDecimal smlLessResGl;

	@Column(name="SSL_INT_SUS_GL")
	private BigDecimal sslIntSusGl;

	@Column(name="SSL_LESS_RES_GL")
	private BigDecimal sslLessResGl;

	public SysImpairmentLoan() {
	}

	public BigDecimal getAccumulateBal() {
		return this.accumulateBal;
	}

	public void setAccumulateBal(BigDecimal accumulateBal) {
		this.accumulateBal = accumulateBal;
	}

	public BigDecimal getAfrAccuBal() {
		return this.afrAccuBal;
	}

	public void setAfrAccuBal(BigDecimal afrAccuBal) {
		this.afrAccuBal = afrAccuBal;
	}

	public BigDecimal getBranchId() {
		return this.branchId;
	}

	public void setBranchId(BigDecimal branchId) {
		this.branchId = branchId;
	}

	public BigDecimal getCreditStatusId() {
		return this.creditStatusId;
	}

	public void setCreditStatusId(BigDecimal creditStatusId) {
		this.creditStatusId = creditStatusId;
	}

	public BigDecimal getCurrId() {
		return this.currId;
	}

	public void setCurrId(BigDecimal currId) {
		this.currId = currId;
	}

	public BigDecimal getFeeImpairment() {
		return this.feeImpairment;
	}

	public void setFeeImpairment(BigDecimal feeImpairment) {
		this.feeImpairment = feeImpairment;
	}

	public BigDecimal getIntImpairment() {
		return this.intImpairment;
	}

	public void setIntImpairment(BigDecimal intImpairment) {
		this.intImpairment = intImpairment;
	}

	public BigDecimal getLgdRate() {
		return this.lgdRate;
	}

	public void setLgdRate(BigDecimal lgdRate) {
		this.lgdRate = lgdRate;
	}

	public String getLoanFacRefNo() {
		return this.loanFacRefNo;
	}

	public void setLoanFacRefNo(String loanFacRefNo) {
		this.loanFacRefNo = loanFacRefNo;
	}

	public BigDecimal getOutstanding() {
		return this.outstanding;
	}

	public void setOutstanding(BigDecimal outstanding) {
		this.outstanding = outstanding;
	}

	public BigDecimal getPdRate() {
		return this.pdRate;
	}

	public void setPdRate(BigDecimal pdRate) {
		this.pdRate = pdRate;
	}

	public BigDecimal getPrinImpairment() {
		return this.prinImpairment;
	}

	public void setPrinImpairment(BigDecimal prinImpairment) {
		this.prinImpairment = prinImpairment;
	}

	public BigDecimal getProGl() {
		return this.proGl;
	}

	public void setProGl(BigDecimal proGl) {
		this.proGl = proGl;
	}

	public BigDecimal getReserveGl() {
		return this.reserveGl;
	}

	public void setReserveGl(BigDecimal reserveGl) {
		this.reserveGl = reserveGl;
	}

	public String getSector() {
		return this.sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public BigDecimal getSmlIntSusGl() {
		return this.smlIntSusGl;
	}

	public void setSmlIntSusGl(BigDecimal smlIntSusGl) {
		this.smlIntSusGl = smlIntSusGl;
	}

	public BigDecimal getSmlLessResGl() {
		return this.smlLessResGl;
	}

	public void setSmlLessResGl(BigDecimal smlLessResGl) {
		this.smlLessResGl = smlLessResGl;
	}

	public BigDecimal getSslIntSusGl() {
		return this.sslIntSusGl;
	}

	public void setSslIntSusGl(BigDecimal sslIntSusGl) {
		this.sslIntSusGl = sslIntSusGl;
	}

	public BigDecimal getSslLessResGl() {
		return this.sslLessResGl;
	}

	public void setSslLessResGl(BigDecimal sslLessResGl) {
		this.sslLessResGl = sslLessResGl;
	}

}