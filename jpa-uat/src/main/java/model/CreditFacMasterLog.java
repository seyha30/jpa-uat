package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CREDIT_FAC_MASTER_LOG database table.
 * 
 */
@Entity
@Table(name="CREDIT_FAC_MASTER_LOG")
@NamedQuery(name="CreditFacMasterLog.findAll", query="SELECT c FROM CreditFacMasterLog c")
public class CreditFacMasterLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AMT_LIMIT")
	private BigDecimal amtLimit;

	@Column(name="APPL_DATE")
	private Object applDate;

	@Column(name="BUS_TYPE_ID")
	private BigDecimal busTypeId;

	@Column(name="CREATED_DATE")
	private Object createdDate;

	@Column(name="CREDIT_FAC_ID")
	private BigDecimal creditFacId;

	@Column(name="CREDIT_STATUS_ID")
	private BigDecimal creditStatusId;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	private BigDecimal custacctid;

	private String deleted;

	@Column(name="DONE_BY")
	private String doneBy;

	@Column(name="EXPIRY_DATE")
	private Object expiryDate;

	@Column(name="FAC_REF_NO")
	private String facRefNo;

	@Column(name="GRANTED_BY")
	private String grantedBy;

	@Column(name="REL_REF_NO")
	private String relRefNo;

	@Column(name="REVIEW_DATE")
	private Object reviewDate;

	public CreditFacMasterLog() {
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

	public Object getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Object createdDate) {
		this.createdDate = createdDate;
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

	public String getDoneBy() {
		return this.doneBy;
	}

	public void setDoneBy(String doneBy) {
		this.doneBy = doneBy;
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

	public Object getReviewDate() {
		return this.reviewDate;
	}

	public void setReviewDate(Object reviewDate) {
		this.reviewDate = reviewDate;
	}

}