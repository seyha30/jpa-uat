package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the AGING_SCHEDULES database table.
 * 
 */
@Entity
@Table(name="AGING_SCHEDULES")
@NamedQuery(name="AgingSchedule.findAll", query="SELECT a FROM AgingSchedule a")
public class AgingSchedule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCOUNT_NO")
	private String accountNo;

	@Column(name="AGING_180_360_I")
	private BigDecimal aging180360I;

	@Column(name="AGING_180_360_P")
	private BigDecimal aging180360P;

	@Column(name="AGING_30_I")
	private BigDecimal aging30I;

	@Column(name="AGING_30_P")
	private BigDecimal aging30P;

	@Column(name="AGING_360_I")
	private BigDecimal aging360I;

	@Column(name="AGING_360_P")
	private BigDecimal aging360P;

	@Column(name="AGING_60_I")
	private BigDecimal aging60I;

	@Column(name="AGING_60_P")
	private BigDecimal aging60P;

	@Column(name="AGING_90_180_I")
	private BigDecimal aging90180I;

	@Column(name="AGING_90_180_P")
	private BigDecimal aging90180P;

	@Column(name="AGING_90_I")
	private BigDecimal aging90I;

	@Column(name="AGING_90_P")
	private BigDecimal aging90P;

	@Column(name="CURR_CODE")
	private String currCode;

	@Column(name="CUSTOMER_NAME")
	private String customerName;

	@Column(name="LOAN_ID")
	private BigDecimal loanId;

	@Column(name="REF_NO")
	private String refNo;

	@Column(name="REPAY_AMT")
	private BigDecimal repayAmt;

	@Column(name="REPAY_DATE")
	private Object repayDate;

	@Column(name="REPAY_INT")
	private BigDecimal repayInt;

	@Column(name="RP_METHOD")
	private String rpMethod;

	public AgingSchedule() {
	}

	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public BigDecimal getAging180360I() {
		return this.aging180360I;
	}

	public void setAging180360I(BigDecimal aging180360I) {
		this.aging180360I = aging180360I;
	}

	public BigDecimal getAging180360P() {
		return this.aging180360P;
	}

	public void setAging180360P(BigDecimal aging180360P) {
		this.aging180360P = aging180360P;
	}

	public BigDecimal getAging30I() {
		return this.aging30I;
	}

	public void setAging30I(BigDecimal aging30I) {
		this.aging30I = aging30I;
	}

	public BigDecimal getAging30P() {
		return this.aging30P;
	}

	public void setAging30P(BigDecimal aging30P) {
		this.aging30P = aging30P;
	}

	public BigDecimal getAging360I() {
		return this.aging360I;
	}

	public void setAging360I(BigDecimal aging360I) {
		this.aging360I = aging360I;
	}

	public BigDecimal getAging360P() {
		return this.aging360P;
	}

	public void setAging360P(BigDecimal aging360P) {
		this.aging360P = aging360P;
	}

	public BigDecimal getAging60I() {
		return this.aging60I;
	}

	public void setAging60I(BigDecimal aging60I) {
		this.aging60I = aging60I;
	}

	public BigDecimal getAging60P() {
		return this.aging60P;
	}

	public void setAging60P(BigDecimal aging60P) {
		this.aging60P = aging60P;
	}

	public BigDecimal getAging90180I() {
		return this.aging90180I;
	}

	public void setAging90180I(BigDecimal aging90180I) {
		this.aging90180I = aging90180I;
	}

	public BigDecimal getAging90180P() {
		return this.aging90180P;
	}

	public void setAging90180P(BigDecimal aging90180P) {
		this.aging90180P = aging90180P;
	}

	public BigDecimal getAging90I() {
		return this.aging90I;
	}

	public void setAging90I(BigDecimal aging90I) {
		this.aging90I = aging90I;
	}

	public BigDecimal getAging90P() {
		return this.aging90P;
	}

	public void setAging90P(BigDecimal aging90P) {
		this.aging90P = aging90P;
	}

	public String getCurrCode() {
		return this.currCode;
	}

	public void setCurrCode(String currCode) {
		this.currCode = currCode;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public BigDecimal getLoanId() {
		return this.loanId;
	}

	public void setLoanId(BigDecimal loanId) {
		this.loanId = loanId;
	}

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public BigDecimal getRepayAmt() {
		return this.repayAmt;
	}

	public void setRepayAmt(BigDecimal repayAmt) {
		this.repayAmt = repayAmt;
	}

	public Object getRepayDate() {
		return this.repayDate;
	}

	public void setRepayDate(Object repayDate) {
		this.repayDate = repayDate;
	}

	public BigDecimal getRepayInt() {
		return this.repayInt;
	}

	public void setRepayInt(BigDecimal repayInt) {
		this.repayInt = repayInt;
	}

	public String getRpMethod() {
		return this.rpMethod;
	}

	public void setRpMethod(String rpMethod) {
		this.rpMethod = rpMethod;
	}

}