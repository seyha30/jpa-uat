package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the V_COLLECTION_DETAIL database table.
 * 
 */
@Entity
@Table(name="V_COLLECTION_DETAIL")
@NamedQuery(name="VCollectionDetail.findAll", query="SELECT v FROM VCollectionDetail v")
public class VCollectionDetail implements Serializable {
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

	@Column(name="LOG_ID")
	private BigDecimal logId;

	@Column(name="\"NAMES\"")
	private String names;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	@Column(name="USD_AMT")
	private BigDecimal usdAmt;

	public VCollectionDetail() {
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

}