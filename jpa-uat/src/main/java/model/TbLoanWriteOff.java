package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TB_LOAN_WRITE_OFF database table.
 * 
 */
@Entity
@Table(name="TB_LOAN_WRITE_OFF")
@NamedQuery(name="TbLoanWriteOff.findAll", query="SELECT t FROM TbLoanWriteOff t")
public class TbLoanWriteOff implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="BRANCH_ID")
	private BigDecimal branchId;

	@Column(name="CBC_PRODUCT_TYPE")
	private String cbcProductType;

	private String ccy;

	@Column(name="CREATE_BY")
	private String createBy;

	@Column(name="CREATE_DATE")
	private Object createDate;

	@Column(name="CURRENT_BAL")
	private BigDecimal currentBal;

	@Column(name="FEE_AMT")
	private BigDecimal feeAmt;

	@Column(name="FEE_PAID")
	private BigDecimal feePaid;

	@Column(name="FULL_NAME")
	private String fullName;

	@Column(name="INT_AMT")
	private BigDecimal intAmt;

	@Column(name="INT_PAID")
	private BigDecimal intPaid;

	@Column(name="LAST_TRN_DATE")
	private Object lastTrnDate;

	@Column(name="PEN_AMT")
	private BigDecimal penAmt;

	@Column(name="PEN_PAID")
	private BigDecimal penPaid;

	@Column(name="PRIN_AMT")
	private BigDecimal prinAmt;

	@Column(name="PRIN_PAID")
	private BigDecimal prinPaid;

	@Column(name="REF_NO")
	private String refNo;

	@Column(name="SAVING_ACCOUNT")
	private String savingAccount;

	@Column(name="UPDATE_BY")
	private String updateBy;

	@Column(name="UPDATE_DATE")
	private Object updateDate;

	@Column(name="WO_AMT")
	private BigDecimal woAmt;

	@Column(name="WO_CURRENT_BAL")
	private BigDecimal woCurrentBal;

	@Column(name="WO_STATUS")
	private String woStatus;

	@Column(name="WRITE_OFF_DATE")
	private Object writeOffDate;

	public TbLoanWriteOff() {
	}

	public BigDecimal getBranchId() {
		return this.branchId;
	}

	public void setBranchId(BigDecimal branchId) {
		this.branchId = branchId;
	}

	public String getCbcProductType() {
		return this.cbcProductType;
	}

	public void setCbcProductType(String cbcProductType) {
		this.cbcProductType = cbcProductType;
	}

	public String getCcy() {
		return this.ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Object getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Object createDate) {
		this.createDate = createDate;
	}

	public BigDecimal getCurrentBal() {
		return this.currentBal;
	}

	public void setCurrentBal(BigDecimal currentBal) {
		this.currentBal = currentBal;
	}

	public BigDecimal getFeeAmt() {
		return this.feeAmt;
	}

	public void setFeeAmt(BigDecimal feeAmt) {
		this.feeAmt = feeAmt;
	}

	public BigDecimal getFeePaid() {
		return this.feePaid;
	}

	public void setFeePaid(BigDecimal feePaid) {
		this.feePaid = feePaid;
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public BigDecimal getIntAmt() {
		return this.intAmt;
	}

	public void setIntAmt(BigDecimal intAmt) {
		this.intAmt = intAmt;
	}

	public BigDecimal getIntPaid() {
		return this.intPaid;
	}

	public void setIntPaid(BigDecimal intPaid) {
		this.intPaid = intPaid;
	}

	public Object getLastTrnDate() {
		return this.lastTrnDate;
	}

	public void setLastTrnDate(Object lastTrnDate) {
		this.lastTrnDate = lastTrnDate;
	}

	public BigDecimal getPenAmt() {
		return this.penAmt;
	}

	public void setPenAmt(BigDecimal penAmt) {
		this.penAmt = penAmt;
	}

	public BigDecimal getPenPaid() {
		return this.penPaid;
	}

	public void setPenPaid(BigDecimal penPaid) {
		this.penPaid = penPaid;
	}

	public BigDecimal getPrinAmt() {
		return this.prinAmt;
	}

	public void setPrinAmt(BigDecimal prinAmt) {
		this.prinAmt = prinAmt;
	}

	public BigDecimal getPrinPaid() {
		return this.prinPaid;
	}

	public void setPrinPaid(BigDecimal prinPaid) {
		this.prinPaid = prinPaid;
	}

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public String getSavingAccount() {
		return this.savingAccount;
	}

	public void setSavingAccount(String savingAccount) {
		this.savingAccount = savingAccount;
	}

	public String getUpdateBy() {
		return this.updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Object getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Object updateDate) {
		this.updateDate = updateDate;
	}

	public BigDecimal getWoAmt() {
		return this.woAmt;
	}

	public void setWoAmt(BigDecimal woAmt) {
		this.woAmt = woAmt;
	}

	public BigDecimal getWoCurrentBal() {
		return this.woCurrentBal;
	}

	public void setWoCurrentBal(BigDecimal woCurrentBal) {
		this.woCurrentBal = woCurrentBal;
	}

	public String getWoStatus() {
		return this.woStatus;
	}

	public void setWoStatus(String woStatus) {
		this.woStatus = woStatus;
	}

	public Object getWriteOffDate() {
		return this.writeOffDate;
	}

	public void setWriteOffDate(Object writeOffDate) {
		this.writeOffDate = writeOffDate;
	}

}