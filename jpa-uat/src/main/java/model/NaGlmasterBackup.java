package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the NA_GLMASTER_BACKUP database table.
 * 
 */
@Entity
@Table(name="NA_GLMASTER_BACKUP")
@NamedQuery(name="NaGlmasterBackup.findAll", query="SELECT n FROM NaGlmasterBackup n")
public class NaGlmasterBackup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCRUED_INT_PA_OR_RE")
	private BigDecimal accruedIntPaOrRe;

	@Column(name="ACCT_ID_D")
	private BigDecimal acctIdD;

	@Column(name="ACCT_TYPE")
	private String acctType;

	@Column(name="ACCUMULATE_BAL")
	private BigDecimal accumulateBal;

	@Column(name="CURRENT_BAL")
	private BigDecimal currentBal;

	private String description;

	@Column(name="GL_CODE")
	private String glCode;

	@Column(name="GL_NAME")
	private String glName;

	@Column(name="INT_RATE")
	private BigDecimal intRate;

	@Column(name="MATURITY_DATE")
	private Object maturityDate;

	@Column(name="NEW_CAPT")
	private String newCapt;

	@Column(name="POSTING_DATE")
	private Object postingDate;

	@Column(name="PREVIOUS_BAL")
	private BigDecimal previousBal;

	@Column(name="REF_NO")
	private String refNo;

	@Column(name="START_DATE")
	private Object startDate;

	private String status;

	@Column(name="STATUS_UN")
	private String statusUn;

	@Column(name="TRANX_AMT")
	private BigDecimal tranxAmt;

	@Column(name="UNEARN_AMT")
	private BigDecimal unearnAmt;

	public NaGlmasterBackup() {
	}

	public BigDecimal getAccruedIntPaOrRe() {
		return this.accruedIntPaOrRe;
	}

	public void setAccruedIntPaOrRe(BigDecimal accruedIntPaOrRe) {
		this.accruedIntPaOrRe = accruedIntPaOrRe;
	}

	public BigDecimal getAcctIdD() {
		return this.acctIdD;
	}

	public void setAcctIdD(BigDecimal acctIdD) {
		this.acctIdD = acctIdD;
	}

	public String getAcctType() {
		return this.acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}

	public BigDecimal getAccumulateBal() {
		return this.accumulateBal;
	}

	public void setAccumulateBal(BigDecimal accumulateBal) {
		this.accumulateBal = accumulateBal;
	}

	public BigDecimal getCurrentBal() {
		return this.currentBal;
	}

	public void setCurrentBal(BigDecimal currentBal) {
		this.currentBal = currentBal;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGlCode() {
		return this.glCode;
	}

	public void setGlCode(String glCode) {
		this.glCode = glCode;
	}

	public String getGlName() {
		return this.glName;
	}

	public void setGlName(String glName) {
		this.glName = glName;
	}

	public BigDecimal getIntRate() {
		return this.intRate;
	}

	public void setIntRate(BigDecimal intRate) {
		this.intRate = intRate;
	}

	public Object getMaturityDate() {
		return this.maturityDate;
	}

	public void setMaturityDate(Object maturityDate) {
		this.maturityDate = maturityDate;
	}

	public String getNewCapt() {
		return this.newCapt;
	}

	public void setNewCapt(String newCapt) {
		this.newCapt = newCapt;
	}

	public Object getPostingDate() {
		return this.postingDate;
	}

	public void setPostingDate(Object postingDate) {
		this.postingDate = postingDate;
	}

	public BigDecimal getPreviousBal() {
		return this.previousBal;
	}

	public void setPreviousBal(BigDecimal previousBal) {
		this.previousBal = previousBal;
	}

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public Object getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Object startDate) {
		this.startDate = startDate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusUn() {
		return this.statusUn;
	}

	public void setStatusUn(String statusUn) {
		this.statusUn = statusUn;
	}

	public BigDecimal getTranxAmt() {
		return this.tranxAmt;
	}

	public void setTranxAmt(BigDecimal tranxAmt) {
		this.tranxAmt = tranxAmt;
	}

	public BigDecimal getUnearnAmt() {
		return this.unearnAmt;
	}

	public void setUnearnAmt(BigDecimal unearnAmt) {
		this.unearnAmt = unearnAmt;
	}

}