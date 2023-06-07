package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CREDIT_SECURITY_LOG database table.
 * 
 */
@Entity
@Table(name="CREDIT_SECURITY_LOG")
@NamedQuery(name="CreditSecurityLog.findAll", query="SELECT c FROM CreditSecurityLog c")
public class CreditSecurityLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="COLLATERAL_TYPE_ID")
	private BigDecimal collateralTypeId;

	@Column(name="CREATED_DATE")
	private Object createdDate;

	@Column(name="CREDIT_FAC_ID")
	private BigDecimal creditFacId;

	@Column(name="CREDIT_SECURITY_ID")
	private BigDecimal creditSecurityId;

	private String deleted;

	@Column(name="DELETED_BY")
	private String deletedBy;

	@Column(name="DELETED_DATE")
	private Object deletedDate;

	@Column(name="DONE_BY")
	private String doneBy;

	@Column(name="ISSUE_BY")
	private String issueBy;

	private String location;

	@Column(name="OWNER_NAME")
	private String ownerName;

	@Column(name="OWNER_NAME_KH")
	private String ownerNameKh;

	@Column(name="REL_REF_NO")
	private String relRefNo;

	private String remarks;

	private String sizeofasset;

	@Column(name="VALUATION_DATE")
	private Object valuationDate;

	@Column(name="VALUE_AMT")
	private BigDecimal valueAmt;

	@Column(name="VALUED_BY")
	private String valuedBy;

	public CreditSecurityLog() {
	}

	public BigDecimal getCollateralTypeId() {
		return this.collateralTypeId;
	}

	public void setCollateralTypeId(BigDecimal collateralTypeId) {
		this.collateralTypeId = collateralTypeId;
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

	public BigDecimal getCreditSecurityId() {
		return this.creditSecurityId;
	}

	public void setCreditSecurityId(BigDecimal creditSecurityId) {
		this.creditSecurityId = creditSecurityId;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getDeletedBy() {
		return this.deletedBy;
	}

	public void setDeletedBy(String deletedBy) {
		this.deletedBy = deletedBy;
	}

	public Object getDeletedDate() {
		return this.deletedDate;
	}

	public void setDeletedDate(Object deletedDate) {
		this.deletedDate = deletedDate;
	}

	public String getDoneBy() {
		return this.doneBy;
	}

	public void setDoneBy(String doneBy) {
		this.doneBy = doneBy;
	}

	public String getIssueBy() {
		return this.issueBy;
	}

	public void setIssueBy(String issueBy) {
		this.issueBy = issueBy;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getOwnerName() {
		return this.ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerNameKh() {
		return this.ownerNameKh;
	}

	public void setOwnerNameKh(String ownerNameKh) {
		this.ownerNameKh = ownerNameKh;
	}

	public String getRelRefNo() {
		return this.relRefNo;
	}

	public void setRelRefNo(String relRefNo) {
		this.relRefNo = relRefNo;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getSizeofasset() {
		return this.sizeofasset;
	}

	public void setSizeofasset(String sizeofasset) {
		this.sizeofasset = sizeofasset;
	}

	public Object getValuationDate() {
		return this.valuationDate;
	}

	public void setValuationDate(Object valuationDate) {
		this.valuationDate = valuationDate;
	}

	public BigDecimal getValueAmt() {
		return this.valueAmt;
	}

	public void setValueAmt(BigDecimal valueAmt) {
		this.valueAmt = valueAmt;
	}

	public String getValuedBy() {
		return this.valuedBy;
	}

	public void setValuedBy(String valuedBy) {
		this.valuedBy = valuedBy;
	}

}