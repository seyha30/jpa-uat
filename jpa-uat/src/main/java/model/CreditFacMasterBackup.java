package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CREDIT_FAC_MASTER_BACKUP database table.
 * 
 */
@Entity
@Table(name="CREDIT_FAC_MASTER_BACKUP")
@NamedQuery(name="CreditFacMasterBackup.findAll", query="SELECT c FROM CreditFacMasterBackup c")
public class CreditFacMasterBackup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AMT_LIMIT")
	private BigDecimal amtLimit;

	@Column(name="APPL_DATE")
	private Object applDate;

	@Column(name="BUS_TYPE_ID")
	private BigDecimal busTypeId;

	@Column(name="BY_USER")
	private String byUser;

	@Column(name="CREATE_DATE")
	private Object createDate;

	@Column(name="CREDIT_FAC_ID")
	private BigDecimal creditFacId;

	@Column(name="CREDIT_STATUS_ID")
	private BigDecimal creditStatusId;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	private BigDecimal custacctid;

	private String deleted;

	@Column(name="EXPIRY_DATE")
	private Object expiryDate;

	@Column(name="FAC_REF_NO")
	private String facRefNo;

	@Column(name="GRANTED_BY")
	private String grantedBy;

	@Column(name="REL_REF_NO")
	private String relRefNo;

	private String remarked;

	@Column(name="REVIEW_DATE")
	private Object reviewDate;

	public CreditFacMasterBackup() {
	}

	public BigDecimal getAmtLimit() {
		return this.amtLimit;
	}

	public void setAmtLimit(BigDecimal amtLimit) {
		this.amtLimit = amtLimit;
	}

	public Object getApplDate() {
		return this.applDate;
	}

	public void setApplDate(Object applDate) {
		this.applDate = applDate;
	}

	public BigDecimal getBusTypeId() {
		return this.busTypeId;
	}

	public void setBusTypeId(BigDecimal busTypeId) {
		this.busTypeId = busTypeId;
	}

	public String getByUser() {
		return this.byUser;
	}

	public void setByUser(String byUser) {
		this.byUser = byUser;
	}

	public Object getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Object createDate) {
		this.createDate = createDate;
	}

	public BigDecimal getCreditFacId() {
		return this.creditFacId;
	}

	public void setCreditFacId(BigDecimal creditFacId) {
		this.creditFacId = creditFacId;
	}

	public BigDecimal getCreditStatusId() {
		return this.creditStatusId;
	}

	public void setCreditStatusId(BigDecimal creditStatusId) {
		this.creditStatusId = creditStatusId;
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

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public Object getExpiryDate() {
		return this.expiryDate;
	}

	public void setExpiryDate(Object expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getFacRefNo() {
		return this.facRefNo;
	}

	public void setFacRefNo(String facRefNo) {
		this.facRefNo = facRefNo;
	}

	public String getGrantedBy() {
		return this.grantedBy;
	}

	public void setGrantedBy(String grantedBy) {
		this.grantedBy = grantedBy;
	}

	public String getRelRefNo() {
		return this.relRefNo;
	}

	public void setRelRefNo(String relRefNo) {
		this.relRefNo = relRefNo;
	}

	public String getRemarked() {
		return this.remarked;
	}

	public void setRemarked(String remarked) {
		this.remarked = remarked;
	}

	public Object getReviewDate() {
		return this.reviewDate;
	}

	public void setReviewDate(Object reviewDate) {
		this.reviewDate = reviewDate;
	}

}