package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SBF_LOAN_RESTRUCTURED database table.
 * 
 */
@Entity
@Table(name="SBF_LOAN_RESTRUCTURED")
@NamedQuery(name="SbfLoanRestructured.findAll", query="SELECT s FROM SbfLoanRestructured s")
public class SbfLoanRestructured implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="RESTRUCTURE_ID")
	private long restructureId;

	@Column(name="AFFECTIVE_ACCRUE_DATE")
	private Object affectiveAccrueDate;

	@Column(name="AUTH_BY")
	private String authBy;

	@Column(name="BRANCH_ID")
	private BigDecimal branchId;

	@Column(name="DONE_BY")
	private String doneBy;

	@Column(name="GRAS_INST_INT_AMORTIZED")
	private BigDecimal grasInstIntAmortized;

	@Column(name="GRAS_INST_TRNFEE_AMORTIZED")
	private BigDecimal grasInstTrnfeeAmortized;

	@Column(name="GRAS_INT_AMORTIZED")
	private BigDecimal grasIntAmortized;

	@Column(name="GRAS_INT_CAPITALIZE")
	private BigDecimal grasIntCapitalize;

	@Column(name="GRAS_TRNFEE_AMORTIZED")
	private BigDecimal grasTrnfeeAmortized;

	@Column(name="GRAS_TRNFEE_CAPITALIZE")
	private BigDecimal grasTrnfeeCapitalize;

	@Column(name="INST_INT_AMORTIZED")
	private BigDecimal instIntAmortized;

	@Column(name="INST_PEN_AMORTIZED")
	private BigDecimal instPenAmortized;

	@Column(name="INST_TRNFEE_AMORTIZED")
	private BigDecimal instTrnfeeAmortized;

	@Column(name="INT_AMORTIZED")
	private BigDecimal intAmortized;

	@Column(name="INT_CAPITALIZE")
	private BigDecimal intCapitalize;

	@Column(name="INT_RATE")
	private BigDecimal intRate;

	@Column(name="INT_WAIVE")
	private BigDecimal intWaive;

	@Column(name="LOAN_FAC_ID")
	private BigDecimal loanFacId;

	@Column(name="MATURITY_DATE")
	private Object maturityDate;

	@Column(name="NO_OF_INST")
	private BigDecimal noOfInst;

	@Column(name="PEN_AMORTIZED")
	private BigDecimal penAmortized;

	@Column(name="PEN_CAPITALIZE")
	private BigDecimal penCapitalize;

	@Column(name="PEN_WAIVE")
	private BigDecimal penWaive;

	@Column(name="REF_NO")
	private String refNo;

	@Column(name="RESTRUCTURE_DATE")
	private Object restructureDate;

	@Column(name="RESTRUCTURE_TYPE")
	private String restructureType;

	@Column(name="TRN_FEE_RATE")
	private BigDecimal trnFeeRate;

	@Column(name="TRN_FEE_WAIVE")
	private BigDecimal trnFeeWaive;

	@Column(name="TRNFEE_AMORTIZED")
	private BigDecimal trnfeeAmortized;

	@Column(name="TRNFEE_CAPITALIZE")
	private BigDecimal trnfeeCapitalize;

	public SbfLoanRestructured() {
	}

	public long getRestructureId() {
		return this.restructureId;
	}

	public void setRestructureId(long restructureId) {
		this.restructureId = restructureId;
	}

	public Object getAffectiveAccrueDate() {
		return this.affectiveAccrueDate;
	}

	public void setAffectiveAccrueDate(Object affectiveAccrueDate) {
		this.affectiveAccrueDate = affectiveAccrueDate;
	}

	public String getAuthBy() {
		return this.authBy;
	}

	public void setAuthBy(String authBy) {
		this.authBy = authBy;
	}

	public BigDecimal getBranchId() {
		return this.branchId;
	}

	public void setBranchId(BigDecimal branchId) {
		this.branchId = branchId;
	}

	public String getDoneBy() {
		return this.doneBy;
	}

	public void setDoneBy(String doneBy) {
		this.doneBy = doneBy;
	}

	public BigDecimal getGrasInstIntAmortized() {
		return this.grasInstIntAmortized;
	}

	public void setGrasInstIntAmortized(BigDecimal grasInstIntAmortized) {
		this.grasInstIntAmortized = grasInstIntAmortized;
	}

	public BigDecimal getGrasInstTrnfeeAmortized() {
		return this.grasInstTrnfeeAmortized;
	}

	public void setGrasInstTrnfeeAmortized(BigDecimal grasInstTrnfeeAmortized) {
		this.grasInstTrnfeeAmortized = grasInstTrnfeeAmortized;
	}

	public BigDecimal getGrasIntAmortized() {
		return this.grasIntAmortized;
	}

	public void setGrasIntAmortized(BigDecimal grasIntAmortized) {
		this.grasIntAmortized = grasIntAmortized;
	}

	public BigDecimal getGrasIntCapitalize() {
		return this.grasIntCapitalize;
	}

	public void setGrasIntCapitalize(BigDecimal grasIntCapitalize) {
		this.grasIntCapitalize = grasIntCapitalize;
	}

	public BigDecimal getGrasTrnfeeAmortized() {
		return this.grasTrnfeeAmortized;
	}

	public void setGrasTrnfeeAmortized(BigDecimal grasTrnfeeAmortized) {
		this.grasTrnfeeAmortized = grasTrnfeeAmortized;
	}

	public BigDecimal getGrasTrnfeeCapitalize() {
		return this.grasTrnfeeCapitalize;
	}

	public void setGrasTrnfeeCapitalize(BigDecimal grasTrnfeeCapitalize) {
		this.grasTrnfeeCapitalize = grasTrnfeeCapitalize;
	}

	public BigDecimal getInstIntAmortized() {
		return this.instIntAmortized;
	}

	public void setInstIntAmortized(BigDecimal instIntAmortized) {
		this.instIntAmortized = instIntAmortized;
	}

	public BigDecimal getInstPenAmortized() {
		return this.instPenAmortized;
	}

	public void setInstPenAmortized(BigDecimal instPenAmortized) {
		this.instPenAmortized = instPenAmortized;
	}

	public BigDecimal getInstTrnfeeAmortized() {
		return this.instTrnfeeAmortized;
	}

	public void setInstTrnfeeAmortized(BigDecimal instTrnfeeAmortized) {
		this.instTrnfeeAmortized = instTrnfeeAmortized;
	}

	public BigDecimal getIntAmortized() {
		return this.intAmortized;
	}

	public void setIntAmortized(BigDecimal intAmortized) {
		this.intAmortized = intAmortized;
	}

	public BigDecimal getIntCapitalize() {
		return this.intCapitalize;
	}

	public void setIntCapitalize(BigDecimal intCapitalize) {
		this.intCapitalize = intCapitalize;
	}

	public BigDecimal getIntRate() {
		return this.intRate;
	}

	public void setIntRate(BigDecimal intRate) {
		this.intRate = intRate;
	}

	public BigDecimal getIntWaive() {
		return this.intWaive;
	}

	public void setIntWaive(BigDecimal intWaive) {
		this.intWaive = intWaive;
	}

	public BigDecimal getLoanFacId() {
		return this.loanFacId;
	}

	public void setLoanFacId(BigDecimal loanFacId) {
		this.loanFacId = loanFacId;
	}

	public Object getMaturityDate() {
		return this.maturityDate;
	}

	public void setMaturityDate(Object maturityDate) {
		this.maturityDate = maturityDate;
	}

	public BigDecimal getNoOfInst() {
		return this.noOfInst;
	}

	public void setNoOfInst(BigDecimal noOfInst) {
		this.noOfInst = noOfInst;
	}

	public BigDecimal getPenAmortized() {
		return this.penAmortized;
	}

	public void setPenAmortized(BigDecimal penAmortized) {
		this.penAmortized = penAmortized;
	}

	public BigDecimal getPenCapitalize() {
		return this.penCapitalize;
	}

	public void setPenCapitalize(BigDecimal penCapitalize) {
		this.penCapitalize = penCapitalize;
	}

	public BigDecimal getPenWaive() {
		return this.penWaive;
	}

	public void setPenWaive(BigDecimal penWaive) {
		this.penWaive = penWaive;
	}

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public Object getRestructureDate() {
		return this.restructureDate;
	}

	public void setRestructureDate(Object restructureDate) {
		this.restructureDate = restructureDate;
	}

	public String getRestructureType() {
		return this.restructureType;
	}

	public void setRestructureType(String restructureType) {
		this.restructureType = restructureType;
	}

	public BigDecimal getTrnFeeRate() {
		return this.trnFeeRate;
	}

	public void setTrnFeeRate(BigDecimal trnFeeRate) {
		this.trnFeeRate = trnFeeRate;
	}

	public BigDecimal getTrnFeeWaive() {
		return this.trnFeeWaive;
	}

	public void setTrnFeeWaive(BigDecimal trnFeeWaive) {
		this.trnFeeWaive = trnFeeWaive;
	}

	public BigDecimal getTrnfeeAmortized() {
		return this.trnfeeAmortized;
	}

	public void setTrnfeeAmortized(BigDecimal trnfeeAmortized) {
		this.trnfeeAmortized = trnfeeAmortized;
	}

	public BigDecimal getTrnfeeCapitalize() {
		return this.trnfeeCapitalize;
	}

	public void setTrnfeeCapitalize(BigDecimal trnfeeCapitalize) {
		this.trnfeeCapitalize = trnfeeCapitalize;
	}

}