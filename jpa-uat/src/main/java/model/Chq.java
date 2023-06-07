package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CHQ database table.
 * 
 */
@Entity
@NamedQuery(name="Chq.findAll", query="SELECT c FROM Chq c")
public class Chq implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ChqPK id;

	@Column(name="CLEARED_BY")
	private String clearedBy;

	@Column(name="CLEARED_DATE")
	private Object clearedDate;

	@Column(name="CUST_TRANX_ID")
	private BigDecimal custTranxId;

	@Column(name="ISSUE_BY")
	private String issueBy;

	@Column(name="ISSUE_DATE")
	private Object issueDate;

	@Column(name="OVERRIDE_BY")
	private String overrideBy;

	@Column(name="OVERRIDE_DATE")
	private Object overrideDate;

	@Column(name="PRESENT_BY")
	private String presentBy;

	@Column(name="PRESENT_DATE")
	private Object presentDate;

	private String remarks;

	//bi-directional many-to-one association to Ca
	@ManyToOne
	@JoinColumn(name="CUSTACCTID")
	private Ca ca;

	//bi-directional many-to-one association to ChqStatus
	@ManyToOne
	@JoinColumn(name="CHQ_STATUS_ID")
	private ChqStatus chqStatus;

	public Chq() {
	}

	public ChqPK getId() {
		return this.id;
	}

	public void setId(ChqPK id) {
		this.id = id;
	}

	public String getClearedBy() {
		return this.clearedBy;
	}

	public void setClearedBy(String clearedBy) {
		this.clearedBy = clearedBy;
	}

	public Object getClearedDate() {
		return this.clearedDate;
	}

	public void setClearedDate(Object clearedDate) {
		this.clearedDate = clearedDate;
	}

	public BigDecimal getCustTranxId() {
		return this.custTranxId;
	}

	public void setCustTranxId(BigDecimal custTranxId) {
		this.custTranxId = custTranxId;
	}

	public String getIssueBy() {
		return this.issueBy;
	}

	public void setIssueBy(String issueBy) {
		this.issueBy = issueBy;
	}

	public Object getIssueDate() {
		return this.issueDate;
	}

	public void setIssueDate(Object issueDate) {
		this.issueDate = issueDate;
	}

	public String getOverrideBy() {
		return this.overrideBy;
	}

	public void setOverrideBy(String overrideBy) {
		this.overrideBy = overrideBy;
	}

	public Object getOverrideDate() {
		return this.overrideDate;
	}

	public void setOverrideDate(Object overrideDate) {
		this.overrideDate = overrideDate;
	}

	public String getPresentBy() {
		return this.presentBy;
	}

	public void setPresentBy(String presentBy) {
		this.presentBy = presentBy;
	}

	public Object getPresentDate() {
		return this.presentDate;
	}

	public void setPresentDate(Object presentDate) {
		this.presentDate = presentDate;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Ca getCa() {
		return this.ca;
	}

	public void setCa(Ca ca) {
		this.ca = ca;
	}

	public ChqStatus getChqStatus() {
		return this.chqStatus;
	}

	public void setChqStatus(ChqStatus chqStatus) {
		this.chqStatus = chqStatus;
	}

}