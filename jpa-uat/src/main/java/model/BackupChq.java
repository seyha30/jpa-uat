package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the BACKUP_CHQ database table.
 * 
 */
@Entity
@Table(name="BACKUP_CHQ")
@NamedQuery(name="BackupChq.findAll", query="SELECT b FROM BackupChq b")
public class BackupChq implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BackupChqPK id;

	@Column(name="CHQ_STATUS_ID")
	private BigDecimal chqStatusId;

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

	public BackupChq() {
	}

	public BackupChqPK getId() {
		return this.id;
	}

	public void setId(BackupChqPK id) {
		this.id = id;
	}

	public BigDecimal getChqStatusId() {
		return this.chqStatusId;
	}

	public void setChqStatusId(BigDecimal chqStatusId) {
		this.chqStatusId = chqStatusId;
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

}