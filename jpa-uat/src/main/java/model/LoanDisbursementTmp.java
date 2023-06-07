package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the LOAN_DISBURSEMENT_TMP database table.
 * 
 */
@Entity
@Table(name="LOAN_DISBURSEMENT_TMP")
@NamedQuery(name="LoanDisbursementTmp.findAll", query="SELECT l FROM LoanDisbursementTmp l")
public class LoanDisbursementTmp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AFR_DATE")
	private Object afrDate;

	@Column(name="AIR_DATE")
	private Object airDate;

	@Column(name="CBC_FEE")
	private BigDecimal cbcFee;

	@Column(name="COMMITMENT_FEE_AMT")
	private BigDecimal commitmentFeeAmt;

	@Column(name="COMMITMENT_FEE_DESCRIPTION")
	private String commitmentFeeDescription;

	@Column(name="COMMITMENT_FEE_PERCENT")
	private BigDecimal commitmentFeePercent;

	@Column(name="CREATED_DATE")
	private Object createdDate;

	@Column(name="DISBURSE_DATE")
	private Object disburseDate;

	@Column(name="DISBURSE_DESCRIPTION")
	private String disburseDescription;

	@Column(name="DONE_BY")
	private String doneBy;

	@Column(name="E_RATE")
	private BigDecimal eRate;

	@Column(name="FAC_REF_NO")
	private String facRefNo;

	@Column(name="FEE_GRAS_PERIOD")
	private BigDecimal feeGrasPeriod;

	private BigDecimal feeexp1;

	private BigDecimal feeexp2;

	private BigDecimal feewh1;

	private BigDecimal feewh2;

	private BigDecimal feewh3;

	private BigDecimal feewh4;

	@Column(name="INSTALLMENT_TYPE")
	private String installmentType;

	@Column(name="INSURANCE_FEE")
	private BigDecimal insuranceFee;

	@Column(name="INT_GRAS_PERIOD")
	private BigDecimal intGrasPeriod;

	@Column(name="INTEREST_RATE")
	private BigDecimal interestRate;

	@Column(name="LAWYER_FEE")
	private BigDecimal lawyerFee;

	@Column(name="LOAN_REFERENCE")
	private String loanReference;

	@Column(name="MATURITY_DATE")
	private Object maturityDate;

	private String mory;

	@Column(name="NO_OF_INSTALLMENT")
	private BigDecimal noOfInstallment;

	@Column(name="PAID_STATUS")
	private String paidStatus;

	@Column(name="PRIN_GRAS_PERIOD")
	private BigDecimal prinGrasPeriod;

	@Column(name="RESIDUAL_AMT")
	private BigDecimal residualAmt;

	@Column(name="SETFO_FEE")
	private BigDecimal setfoFee;

	@Column(name="TRNFEE_AMT")
	private BigDecimal trnfeeAmt;

	@Column(name="TRNFEE_FLAT")
	private BigDecimal trnfeeFlat;

	@Column(name="TRNFEE_RATE")
	private BigDecimal trnfeeRate;

	private String uora;

	@Column(name="VALUATION_FEE")
	private BigDecimal valuationFee;

	public LoanDisbursementTmp() {
	}

	public Object getAfrDate() {
		return this.afrDate;
	}

	public void setAfrDate(Object afrDate) {
		this.afrDate = afrDate;
	}

	public Object getAirDate() {
		return this.airDate;
	}

	public void setAirDate(Object airDate) {
		this.airDate = airDate;
	}

	public BigDecimal getCbcFee() {
		return this.cbcFee;
	}

	public void setCbcFee(BigDecimal cbcFee) {
		this.cbcFee = cbcFee;
	}

	public BigDecimal getCommitmentFeeAmt() {
		return this.commitmentFeeAmt;
	}

	public void setCommitmentFeeAmt(BigDecimal commitmentFeeAmt) {
		this.commitmentFeeAmt = commitmentFeeAmt;
	}

	public String getCommitmentFeeDescription() {
		return this.commitmentFeeDescription;
	}

	public void setCommitmentFeeDescription(String commitmentFeeDescription) {
		this.commitmentFeeDescription = commitmentFeeDescription;
	}

	public BigDecimal getCommitmentFeePercent() {
		return this.commitmentFeePercent;
	}

	public void setCommitmentFeePercent(BigDecimal commitmentFeePercent) {
		this.commitmentFeePercent = commitmentFeePercent;
	}

	public Object getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Object createdDate) {
		this.createdDate = createdDate;
	}

	public Object getDisburseDate() {
		return this.disburseDate;
	}

	public void setDisburseDate(Object disburseDate) {
		this.disburseDate = disburseDate;
	}

	public String getDisburseDescription() {
		return this.disburseDescription;
	}

	public void setDisburseDescription(String disburseDescription) {
		this.disburseDescription = disburseDescription;
	}

	public String getDoneBy() {
		return this.doneBy;
	}

	public void setDoneBy(String doneBy) {
		this.doneBy = doneBy;
	}

	public BigDecimal getERate() {
		return this.eRate;
	}

	public void setERate(BigDecimal eRate) {
		this.eRate = eRate;
	}

	public String getFacRefNo() {
		return this.facRefNo;
	}

	public void setFacRefNo(String facRefNo) {
		this.facRefNo = facRefNo;
	}

	public BigDecimal getFeeGrasPeriod() {
		return this.feeGrasPeriod;
	}

	public void setFeeGrasPeriod(BigDecimal feeGrasPeriod) {
		this.feeGrasPeriod = feeGrasPeriod;
	}

	public BigDecimal getFeeexp1() {
		return this.feeexp1;
	}

	public void setFeeexp1(BigDecimal feeexp1) {
		this.feeexp1 = feeexp1;
	}

	public BigDecimal getFeeexp2() {
		return this.feeexp2;
	}

	public void setFeeexp2(BigDecimal feeexp2) {
		this.feeexp2 = feeexp2;
	}

	public BigDecimal getFeewh1() {
		return this.feewh1;
	}

	public void setFeewh1(BigDecimal feewh1) {
		this.feewh1 = feewh1;
	}

	public BigDecimal getFeewh2() {
		return this.feewh2;
	}

	public void setFeewh2(BigDecimal feewh2) {
		this.feewh2 = feewh2;
	}

	public BigDecimal getFeewh3() {
		return this.feewh3;
	}

	public void setFeewh3(BigDecimal feewh3) {
		this.feewh3 = feewh3;
	}

	public BigDecimal getFeewh4() {
		return this.feewh4;
	}

	public void setFeewh4(BigDecimal feewh4) {
		this.feewh4 = feewh4;
	}

	public String getInstallmentType() {
		return this.installmentType;
	}

	public void setInstallmentType(String installmentType) {
		this.installmentType = installmentType;
	}

	public BigDecimal getInsuranceFee() {
		return this.insuranceFee;
	}

	public void setInsuranceFee(BigDecimal insuranceFee) {
		this.insuranceFee = insuranceFee;
	}

	public BigDecimal getIntGrasPeriod() {
		return this.intGrasPeriod;
	}

	public void setIntGrasPeriod(BigDecimal intGrasPeriod) {
		this.intGrasPeriod = intGrasPeriod;
	}

	public BigDecimal getInterestRate() {
		return this.interestRate;
	}

	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}

	public BigDecimal getLawyerFee() {
		return this.lawyerFee;
	}

	public void setLawyerFee(BigDecimal lawyerFee) {
		this.lawyerFee = lawyerFee;
	}

	public String getLoanReference() {
		return this.loanReference;
	}

	public void setLoanReference(String loanReference) {
		this.loanReference = loanReference;
	}

	public Object getMaturityDate() {
		return this.maturityDate;
	}

	public void setMaturityDate(Object maturityDate) {
		this.maturityDate = maturityDate;
	}

	public String getMory() {
		return this.mory;
	}

	public void setMory(String mory) {
		this.mory = mory;
	}

	public BigDecimal getNoOfInstallment() {
		return this.noOfInstallment;
	}

	public void setNoOfInstallment(BigDecimal noOfInstallment) {
		this.noOfInstallment = noOfInstallment;
	}

	public String getPaidStatus() {
		return this.paidStatus;
	}

	public void setPaidStatus(String paidStatus) {
		this.paidStatus = paidStatus;
	}

	public BigDecimal getPrinGrasPeriod() {
		return this.prinGrasPeriod;
	}

	public void setPrinGrasPeriod(BigDecimal prinGrasPeriod) {
		this.prinGrasPeriod = prinGrasPeriod;
	}

	public BigDecimal getResidualAmt() {
		return this.residualAmt;
	}

	public void setResidualAmt(BigDecimal residualAmt) {
		this.residualAmt = residualAmt;
	}

	public BigDecimal getSetfoFee() {
		return this.setfoFee;
	}

	public void setSetfoFee(BigDecimal setfoFee) {
		this.setfoFee = setfoFee;
	}

	public BigDecimal getTrnfeeAmt() {
		return this.trnfeeAmt;
	}

	public void setTrnfeeAmt(BigDecimal trnfeeAmt) {
		this.trnfeeAmt = trnfeeAmt;
	}

	public BigDecimal getTrnfeeFlat() {
		return this.trnfeeFlat;
	}

	public void setTrnfeeFlat(BigDecimal trnfeeFlat) {
		this.trnfeeFlat = trnfeeFlat;
	}

	public BigDecimal getTrnfeeRate() {
		return this.trnfeeRate;
	}

	public void setTrnfeeRate(BigDecimal trnfeeRate) {
		this.trnfeeRate = trnfeeRate;
	}

	public String getUora() {
		return this.uora;
	}

	public void setUora(String uora) {
		this.uora = uora;
	}

	public BigDecimal getValuationFee() {
		return this.valuationFee;
	}

	public void setValuationFee(BigDecimal valuationFee) {
		this.valuationFee = valuationFee;
	}

}