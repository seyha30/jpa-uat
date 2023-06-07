package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FDVW_DETAIL database table.
 * 
 */
@Entity
@Table(name="FDVW_DETAIL")
@NamedQuery(name="FdvwDetail.findAll", query="SELECT f FROM FdvwDetail f")
public class FdvwDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCUMULATE_AIP")
	private BigDecimal accumulateAip;

	private String address;

	@Column(name="BORROWING_AC_NO")
	private String borrowingAcNo;

	@Column(name="BORROWING_AMT")
	private BigDecimal borrowingAmt;

	@Column(name="BORROWING_DATE")
	private Object borrowingDate;

	@Column(name="BORROWING_FAC_REF_NO")
	private String borrowingFacRefNo;

	@Column(name="BORROWING_OUT")
	private BigDecimal borrowingOut;

	@Column(name="BRANCH_ID")
	private BigDecimal branchId;

	private String ccy;

	@Column(name="CLOSE_DATE")
	private String closeDate;

	private BigDecimal custacctid;

	@Column(name="DAILY_AIP_ACCR")
	private BigDecimal dailyAipAccr;

	@Column(name="DAYS_ACCR")
	private BigDecimal daysAccr;

	@Column(name="FULL_NAME")
	private String fullName;

	private String glbl;

	@Column(name="INT_NEXT_REPAY")
	private BigDecimal intNextRepay;

	@Column(name="INT_PAID")
	private BigDecimal intPaid;

	@Column(name="INT_RATE")
	private BigDecimal intRate;

	@Column(name="L_PRIN_PAID")
	private BigDecimal lPrinPaid;

	@Column(name="MATURITY_DATE")
	private Object maturityDate;

	@Column(name="NEXT_REPAYMENT_DATE")
	private Object nextRepaymentDate;

	private String officer;

	@Column(name="PRIN_NEXT_REPAY")
	private BigDecimal prinNextRepay;

	private String product;

	private String referal;

	private String remarks;

	@Column(name="REPAYMENT_METHOD")
	private String repaymentMethod;

	@Column(name="SAVING_ACCOUNT")
	private String savingAccount;

	@Column(name="SETTLEMENT_DES")
	private String settlementDes;

	private String sex;

	private String status;

	private String tenor;

	@Column(name="TOTAL_INT_EXP")
	private BigDecimal totalIntExp;

	@Column(name="WEIGHTED_RATE")
	private BigDecimal weightedRate;

	@Column(name="WEIGHTED_TENURE")
	private BigDecimal weightedTenure;

	public FdvwDetail() {
	}

	public BigDecimal getAccumulateAip() {
		return this.accumulateAip;
	}

	public void setAccumulateAip(BigDecimal accumulateAip) {
		this.accumulateAip = accumulateAip;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBorrowingAcNo() {
		return this.borrowingAcNo;
	}

	public void setBorrowingAcNo(String borrowingAcNo) {
		this.borrowingAcNo = borrowingAcNo;
	}

	public BigDecimal getBorrowingAmt() {
		return this.borrowingAmt;
	}

	public void setBorrowingAmt(BigDecimal borrowingAmt) {
		this.borrowingAmt = borrowingAmt;
	}

	public Object getBorrowingDate() {
		return this.borrowingDate;
	}

	public void setBorrowingDate(Object borrowingDate) {
		this.borrowingDate = borrowingDate;
	}

	public String getBorrowingFacRefNo() {
		return this.borrowingFacRefNo;
	}

	public void setBorrowingFacRefNo(String borrowingFacRefNo) {
		this.borrowingFacRefNo = borrowingFacRefNo;
	}

	public BigDecimal getBorrowingOut() {
		return this.borrowingOut;
	}

	public void setBorrowingOut(BigDecimal borrowingOut) {
		this.borrowingOut = borrowingOut;
	}

	public BigDecimal getBranchId() {
		return this.branchId;
	}

	public void setBranchId(BigDecimal branchId) {
		this.branchId = branchId;
	}

	public String getCcy() {
		return this.ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public String getCloseDate() {
		return this.closeDate;
	}

	public void setCloseDate(String closeDate) {
		this.closeDate = closeDate;
	}

	public BigDecimal getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(BigDecimal custacctid) {
		this.custacctid = custacctid;
	}

	public BigDecimal getDailyAipAccr() {
		return this.dailyAipAccr;
	}

	public void setDailyAipAccr(BigDecimal dailyAipAccr) {
		this.dailyAipAccr = dailyAipAccr;
	}

	public BigDecimal getDaysAccr() {
		return this.daysAccr;
	}

	public void setDaysAccr(BigDecimal daysAccr) {
		this.daysAccr = daysAccr;
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGlbl() {
		return this.glbl;
	}

	public void setGlbl(String glbl) {
		this.glbl = glbl;
	}

	public BigDecimal getIntNextRepay() {
		return this.intNextRepay;
	}

	public void setIntNextRepay(BigDecimal intNextRepay) {
		this.intNextRepay = intNextRepay;
	}

	public BigDecimal getIntPaid() {
		return this.intPaid;
	}

	public void setIntPaid(BigDecimal intPaid) {
		this.intPaid = intPaid;
	}

	public BigDecimal getIntRate() {
		return this.intRate;
	}

	public void setIntRate(BigDecimal intRate) {
		this.intRate = intRate;
	}

	public BigDecimal getLPrinPaid() {
		return this.lPrinPaid;
	}

	public void setLPrinPaid(BigDecimal lPrinPaid) {
		this.lPrinPaid = lPrinPaid;
	}

	public Object getMaturityDate() {
		return this.maturityDate;
	}

	public void setMaturityDate(Object maturityDate) {
		this.maturityDate = maturityDate;
	}

	public Object getNextRepaymentDate() {
		return this.nextRepaymentDate;
	}

	public void setNextRepaymentDate(Object nextRepaymentDate) {
		this.nextRepaymentDate = nextRepaymentDate;
	}

	public String getOfficer() {
		return this.officer;
	}

	public void setOfficer(String officer) {
		this.officer = officer;
	}

	public BigDecimal getPrinNextRepay() {
		return this.prinNextRepay;
	}

	public void setPrinNextRepay(BigDecimal prinNextRepay) {
		this.prinNextRepay = prinNextRepay;
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getReferal() {
		return this.referal;
	}

	public void setReferal(String referal) {
		this.referal = referal;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getRepaymentMethod() {
		return this.repaymentMethod;
	}

	public void setRepaymentMethod(String repaymentMethod) {
		this.repaymentMethod = repaymentMethod;
	}

	public String getSavingAccount() {
		return this.savingAccount;
	}

	public void setSavingAccount(String savingAccount) {
		this.savingAccount = savingAccount;
	}

	public String getSettlementDes() {
		return this.settlementDes;
	}

	public void setSettlementDes(String settlementDes) {
		this.settlementDes = settlementDes;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTenor() {
		return this.tenor;
	}

	public void setTenor(String tenor) {
		this.tenor = tenor;
	}

	public BigDecimal getTotalIntExp() {
		return this.totalIntExp;
	}

	public void setTotalIntExp(BigDecimal totalIntExp) {
		this.totalIntExp = totalIntExp;
	}

	public BigDecimal getWeightedRate() {
		return this.weightedRate;
	}

	public void setWeightedRate(BigDecimal weightedRate) {
		this.weightedRate = weightedRate;
	}

	public BigDecimal getWeightedTenure() {
		return this.weightedTenure;
	}

	public void setWeightedTenure(BigDecimal weightedTenure) {
		this.weightedTenure = weightedTenure;
	}

}