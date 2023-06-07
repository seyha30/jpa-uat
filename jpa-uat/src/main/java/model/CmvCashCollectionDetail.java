package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CMV_CASH_COLLECTION_DETAIL database table.
 * 
 */
@Entity
@Table(name="CMV_CASH_COLLECTION_DETAIL")
@NamedQuery(name="CmvCashCollectionDetail.findAll", query="SELECT c FROM CmvCashCollectionDetail c")
public class CmvCashCollectionDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCOUNT_NO")
	private String accountNo;

	private BigDecimal amount;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	private BigDecimal custacctid;

	@Column(name="DATE_DONE")
	private Object dateDone;

	private String description;

	@Column(name="DONE_BY")
	private String doneBy;

	@Column(name="KHR_AMT")
	private BigDecimal khrAmt;

	@Column(name="KHR_BAL")
	private BigDecimal khrBal;

	@Column(name="LOG_ID")
	private BigDecimal logId;

	@Column(name="\"NAMES\"")
	private String names;

	@Column(name="REF_NO")
	private String refNo;

	@Column(name="REQUEST_MEDIUM_ID")
	private String requestMediumId;

	private String status;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	@Column(name="USD_AMT")
	private BigDecimal usdAmt;

	@Column(name="USD_BAL")
	private BigDecimal usdBal;

	public CmvCashCollectionDetail() {
	}

	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getCurrId() {
		return this.currId;
	}

	public void setCurrId(BigDecimal currId) {
		this.currId = currId;
	}

	public BigDecimal getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(BigDecimal custacctid) {
		this.custacctid = custacctid;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDoneBy() {
		return this.doneBy;
	}

	public void setDoneBy(String doneBy) {
		this.doneBy = doneBy;
	}

	public BigDecimal getKhrAmt() {
		return this.khrAmt;
	}

	public void setKhrAmt(BigDecimal khrAmt) {
		this.khrAmt = khrAmt;
	}

	public BigDecimal getKhrBal() {
		return this.khrBal;
	}

	public void setKhrBal(BigDecimal khrBal) {
		this.khrBal = khrBal;
	}

	public BigDecimal getLogId() {
		return this.logId;
	}

	public void setLogId(BigDecimal logId) {
		this.logId = logId;
	}

	public String getNames() {
		return this.names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public String getRequestMediumId() {
		return this.requestMediumId;
	}

	public void setRequestMediumId(String requestMediumId) {
		this.requestMediumId = requestMediumId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

	public BigDecimal getUsdAmt() {
		return this.usdAmt;
	}

	public void setUsdAmt(BigDecimal usdAmt) {
		this.usdAmt = usdAmt;
	}

	public BigDecimal getUsdBal() {
		return this.usdBal;
	}

	public void setUsdBal(BigDecimal usdBal) {
		this.usdBal = usdBal;
	}

}