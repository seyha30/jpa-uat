package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the LOAN_CATEGORY database table.
 * 
 */
@Entity
@Table(name="LOAN_CATEGORY")
@NamedQuery(name="LoanCategory.findAll", query="SELECT l FROM LoanCategory l")
public class LoanCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CAT_ID")
	private String catId;

	@Column(name="CAT_NAME")
	private String catName;

	private String collateral;

	private String description;

	@Column(name="DOC_FEE")
	private String docFee;

	private String joint;

	@Column(name="MAX_FEE")
	private BigDecimal maxFee;

	@Column(name="MAX_INT_RATE")
	private BigDecimal maxIntRate;

	@Column(name="MAX_LOAN_SIZE")
	private BigDecimal maxLoanSize;

	@Column(name="MAX_TERM")
	private BigDecimal maxTerm;

	@Column(name="MIN_FEE")
	private BigDecimal minFee;

	@Column(name="MIN_INT_RATE")
	private BigDecimal minIntRate;

	@Column(name="MIN_LOAN_SIZE")
	private BigDecimal minLoanSize;

	@Column(name="MIX_TERM")
	private BigDecimal mixTerm;

	@Column(name="PAYMENT_MODE")
	private BigDecimal paymentMode;

	@Column(name="PRODUCT_CODE")
	private String productCode;

	@Column(name="ROW_NUM")
	private BigDecimal rowNum;

	public LoanCategory() {
	}

	public String getCatId() {
		return this.catId;
	}

	public void setCatId(String catId) {
		this.catId = catId;
	}

	public String getCatName() {
		return this.catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getCollateral() {
		return this.collateral;
	}

	public void setCollateral(String collateral) {
		this.collateral = collateral;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDocFee() {
		return this.docFee;
	}

	public void setDocFee(String docFee) {
		this.docFee = docFee;
	}

	public String getJoint() {
		return this.joint;
	}

	public void setJoint(String joint) {
		this.joint = joint;
	}

	public BigDecimal getMaxFee() {
		return this.maxFee;
	}

	public void setMaxFee(BigDecimal maxFee) {
		this.maxFee = maxFee;
	}

	public BigDecimal getMaxIntRate() {
		return this.maxIntRate;
	}

	public void setMaxIntRate(BigDecimal maxIntRate) {
		this.maxIntRate = maxIntRate;
	}

	public BigDecimal getMaxLoanSize() {
		return this.maxLoanSize;
	}

	public void setMaxLoanSize(BigDecimal maxLoanSize) {
		this.maxLoanSize = maxLoanSize;
	}

	public BigDecimal getMaxTerm() {
		return this.maxTerm;
	}

	public void setMaxTerm(BigDecimal maxTerm) {
		this.maxTerm = maxTerm;
	}

	public BigDecimal getMinFee() {
		return this.minFee;
	}

	public void setMinFee(BigDecimal minFee) {
		this.minFee = minFee;
	}

	public BigDecimal getMinIntRate() {
		return this.minIntRate;
	}

	public void setMinIntRate(BigDecimal minIntRate) {
		this.minIntRate = minIntRate;
	}

	public BigDecimal getMinLoanSize() {
		return this.minLoanSize;
	}

	public void setMinLoanSize(BigDecimal minLoanSize) {
		this.minLoanSize = minLoanSize;
	}

	public BigDecimal getMixTerm() {
		return this.mixTerm;
	}

	public void setMixTerm(BigDecimal mixTerm) {
		this.mixTerm = mixTerm;
	}

	public BigDecimal getPaymentMode() {
		return this.paymentMode;
	}

	public void setPaymentMode(BigDecimal paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public BigDecimal getRowNum() {
		return this.rowNum;
	}

	public void setRowNum(BigDecimal rowNum) {
		this.rowNum = rowNum;
	}

}