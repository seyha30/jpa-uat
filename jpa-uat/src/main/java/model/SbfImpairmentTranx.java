package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SBF_IMPAIRMENT_TRANX database table.
 * 
 */
@Entity
@Table(name="SBF_IMPAIRMENT_TRANX")
@NamedQuery(name="SbfImpairmentTranx.findAll", query="SELECT s FROM SbfImpairmentTranx s")
public class SbfImpairmentTranx implements Serializable {
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

	@Column(name="DATE_DONE")
	private Object dateDone;

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

	private String sector;

	public SbfImpairmentTranx() {
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

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
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

	public String getSector() {
		return this.sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

}