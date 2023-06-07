package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TB_NONE_PFL_RECOVERY database table.
 * 
 */
@Entity
@Table(name="TB_NONE_PFL_RECOVERY")
@NamedQuery(name="TbNonePflRecovery.findAll", query="SELECT t FROM TbNonePflRecovery t")
public class TbNonePflRecovery implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCT_NAME")
	private String acctName;

	@Column(name="ACCT_NO")
	private String acctNo;

	@Column(name="ACCU_BAL")
	private BigDecimal accuBal;

	@Column(name="BUSINESS_TYPE")
	private String businessType;

	@Column(name="CURR_CODE")
	private String currCode;

	@Column(name="GL_STATUS")
	private String glStatus;

	@Column(name="INT_RATE")
	private String intRate;

	@Column(name="INT_RECEIVABLE")
	private BigDecimal intReceivable;

	@Column(name="MATURITY_DATE")
	private String maturityDate;

	@Column(name="POSTING_DATE")
	private String postingDate;

	@Column(name="PREV_BAL")
	private BigDecimal prevBal;

	@Column(name="PRICIPAL_AMT")
	private BigDecimal pricipalAmt;

	@Column(name="REF_NO")
	private String refNo;

	private String show;

	@Column(name="START_DATE")
	private String startDate;

	@Column(name="START_POSTING_DATE")
	private String startPostingDate;

	private String status;

	@Column(name="TRANX_AMT")
	private BigDecimal tranxAmt;

	@Column(name="\"TYPE\"")
	private String type;

	public TbNonePflRecovery() {
	}

	public String getAcctName() {
		return this.acctName;
	}

	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}

	public String getAcctNo() {
		return this.acctNo;
	}

	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}

	public BigDecimal getAccuBal() {
		return this.accuBal;
	}

	public void setAccuBal(BigDecimal accuBal) {
		this.accuBal = accuBal;
	}

	public String getBusinessType() {
		return this.businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getCurrCode() {
		return this.currCode;
	}

	public void setCurrCode(String currCode) {
		this.currCode = currCode;
	}

	public String getGlStatus() {
		return this.glStatus;
	}

	public void setGlStatus(String glStatus) {
		this.glStatus = glStatus;
	}

	public String getIntRate() {
		return this.intRate;
	}

	public void setIntRate(String intRate) {
		this.intRate = intRate;
	}

	public BigDecimal getIntReceivable() {
		return this.intReceivable;
	}

	public void setIntReceivable(BigDecimal intReceivable) {
		this.intReceivable = intReceivable;
	}

	public String getMaturityDate() {
		return this.maturityDate;
	}

	public void setMaturityDate(String maturityDate) {
		this.maturityDate = maturityDate;
	}

	public String getPostingDate() {
		return this.postingDate;
	}

	public void setPostingDate(String postingDate) {
		this.postingDate = postingDate;
	}

	public BigDecimal getPrevBal() {
		return this.prevBal;
	}

	public void setPrevBal(BigDecimal prevBal) {
		this.prevBal = prevBal;
	}

	public BigDecimal getPricipalAmt() {
		return this.pricipalAmt;
	}

	public void setPricipalAmt(BigDecimal pricipalAmt) {
		this.pricipalAmt = pricipalAmt;
	}

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public String getShow() {
		return this.show;
	}

	public void setShow(String show) {
		this.show = show;
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getStartPostingDate() {
		return this.startPostingDate;
	}

	public void setStartPostingDate(String startPostingDate) {
		this.startPostingDate = startPostingDate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getTranxAmt() {
		return this.tranxAmt;
	}

	public void setTranxAmt(BigDecimal tranxAmt) {
		this.tranxAmt = tranxAmt;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}