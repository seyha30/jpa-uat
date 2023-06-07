package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CHQ_DEPOSITED database table.
 * 
 */
@Entity
@Table(name="CHQ_DEPOSITED")
@NamedQuery(name="ChqDeposited.findAll", query="SELECT c FROM ChqDeposited c")
public class ChqDeposited implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CHQDPT_ID")
	private long chqdptId;

	private BigDecimal amount;

	@Column(name="CHQ_TYPE_ID")
	private BigDecimal chqTypeId;

	@Column(name="CUST_PENDING_TRANX_ID")
	private BigDecimal custPendingTranxId;

	@Column(name="CUST_TRANX_ID")
	private BigDecimal custTranxId;

	@Column(name="DATE_OF_DPT")
	private Object dateOfDpt;

	private String deleted;

	private String nostro;

	private String posted;

	private String sno;

	@Column(name="TT_ID")
	private BigDecimal ttId;

	//bi-directional many-to-one association to ChqStatus
	@ManyToOne
	@JoinColumn(name="CHQ_STATUS_ID")
	private ChqStatus chqStatus;

	public ChqDeposited() {
	}

	public long getChqdptId() {
		return this.chqdptId;
	}

	public void setChqdptId(long chqdptId) {
		this.chqdptId = chqdptId;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getChqTypeId() {
		return this.chqTypeId;
	}

	public void setChqTypeId(BigDecimal chqTypeId) {
		this.chqTypeId = chqTypeId;
	}

	public BigDecimal getCustPendingTranxId() {
		return this.custPendingTranxId;
	}

	public void setCustPendingTranxId(BigDecimal custPendingTranxId) {
		this.custPendingTranxId = custPendingTranxId;
	}

	public BigDecimal getCustTranxId() {
		return this.custTranxId;
	}

	public void setCustTranxId(BigDecimal custTranxId) {
		this.custTranxId = custTranxId;
	}

	public Object getDateOfDpt() {
		return this.dateOfDpt;
	}

	public void setDateOfDpt(Object dateOfDpt) {
		this.dateOfDpt = dateOfDpt;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getNostro() {
		return this.nostro;
	}

	public void setNostro(String nostro) {
		this.nostro = nostro;
	}

	public String getPosted() {
		return this.posted;
	}

	public void setPosted(String posted) {
		this.posted = posted;
	}

	public String getSno() {
		return this.sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public BigDecimal getTtId() {
		return this.ttId;
	}

	public void setTtId(BigDecimal ttId) {
		this.ttId = ttId;
	}

	public ChqStatus getChqStatus() {
		return this.chqStatus;
	}

	public void setChqStatus(ChqStatus chqStatus) {
		this.chqStatus = chqStatus;
	}

}