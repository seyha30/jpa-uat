package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the LOAN_FACILITY_LOG database table.
 * 
 */
@Entity
@Table(name="LOAN_FACILITY_LOG")
@NamedQuery(name="LoanFacilityLog.findAll", query="SELECT l FROM LoanFacilityLog l")
public class LoanFacilityLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="BUS_TYPE_ID")
	private BigDecimal busTypeId;

	@Column(name="CAT_ID")
	private String catId;

	@Column(name="CBC_ENQUIRY_REF")
	private String cbcEnquiryRef;

	@Column(name="COM_ID")
	private String comId;

	@Column(name="CREATED_DATE")
	private Object createdDate;

	@Column(name="CREDIT_FAC_ID")
	private BigDecimal creditFacId;

	@Column(name="CREDIT_STATUS_ID")
	private BigDecimal creditStatusId;

	@Column(name="CREDIT_TYPE_ID")
	private BigDecimal creditTypeId;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	private String custrefno;

	@Column(name="\"CYCLE\"")
	private BigDecimal cycle;

	private String deleted;

	@Column(name="DONE_BY")
	private String doneBy;

	@Column(name="EMPREP_ID")
	private String emprepId;

	@Column(name="ENTRY_DATE")
	private Object entryDate;

	@Column(name="EXPIRY_DATE")
	private Object expiryDate;

	@Column(name="EXT_APP_ID")
	private String extAppId;

	@Column(name="EXTERNAL_ID")
	private String externalId;

	@Column(name="FAC_REF_NO")
	private String facRefNo;

	private String isrollover;

	@Column(name="LOAN_FAC_ID")
	private BigDecimal loanFacId;

	@Column(name="LOAN_FAC_REF_NO")
	private String loanFacRefNo;

	@Column(name="LOAN_PRINCIPAL")
	private BigDecimal loanPrincipal;

	private String referee;

	private String remarks;

	@Column(name="REVIEW_DATE")
	private Object reviewDate;

	@Column(name="SPECIAL_NOTE_ID")
	private BigDecimal specialNoteId;

	public LoanFacilityLog() {
	}

	public BigDecimal getBusTypeId() {
		return this.busTypeId;
	}

	public void setBusTypeId(BigDecimal busTypeId) {
		this.busTypeId = busTypeId;
	}

	public String getCatId() {
		return this.catId;
	}

	public void setCatId(String catId) {
		this.catId = catId;
	}

	public String getCbcEnquiryRef() {
		return this.cbcEnquiryRef;
	}

	public void setCbcEnquiryRef(String cbcEnquiryRef) {
		this.cbcEnquiryRef = cbcEnquiryRef;
	}

	public String getComId() {
		return this.comId;
	}

	public void setComId(String comId) {
		this.comId = comId;
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

	public BigDecimal getCreditTypeId() {
		return this.creditTypeId;
	}

	public void setCreditTypeId(BigDecimal creditTypeId) {
		this.creditTypeId = creditTypeId;
	}

	public BigDecimal getCurrId() {
		return this.currId;
	}

	public void setCurrId(BigDecimal currId) {
		this.currId = currId;
	}

	public String getCustrefno() {
		return this.custrefno;
	}

	public void setCustrefno(String custrefno) {
		this.custrefno = custrefno;
	}

	public BigDecimal getCycle() {
		return this.cycle;
	}

	public void setCycle(BigDecimal cycle) {
		this.cycle = cycle;
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

	public String getEmprepId() {
		return this.emprepId;
	}

	public void setEmprepId(String emprepId) {
		this.emprepId = emprepId;
	}

	public Object getEntryDate() {
		return this.entryDate;
	}

	public void setEntryDate(Object entryDate) {
		this.entryDate = entryDate;
	}

	public Object getExpiryDate() {
		return this.expiryDate;
	}

	public void setExpiryDate(Object expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getExtAppId() {
		return this.extAppId;
	}

	public void setExtAppId(String extAppId) {
		this.extAppId = extAppId;
	}

	public String getExternalId() {
		return this.externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getFacRefNo() {
		return this.facRefNo;
	}

	public void setFacRefNo(String facRefNo) {
		this.facRefNo = facRefNo;
	}

	public String getIsrollover() {
		return this.isrollover;
	}

	public void setIsrollover(String isrollover) {
		this.isrollover = isrollover;
	}

	public BigDecimal getLoanFacId() {
		return this.loanFacId;
	}

	public void setLoanFacId(BigDecimal loanFacId) {
		this.loanFacId = loanFacId;
	}

	public String getLoanFacRefNo() {
		return this.loanFacRefNo;
	}

	public void setLoanFacRefNo(String loanFacRefNo) {
		this.loanFacRefNo = loanFacRefNo;
	}

	public BigDecimal getLoanPrincipal() {
		return this.loanPrincipal;
	}

	public void setLoanPrincipal(BigDecimal loanPrincipal) {
		this.loanPrincipal = loanPrincipal;
	}

	public String getReferee() {
		return this.referee;
	}

	public void setReferee(String referee) {
		this.referee = referee;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Object getReviewDate() {
		return this.reviewDate;
	}

	public void setReviewDate(Object reviewDate) {
		this.reviewDate = reviewDate;
	}

	public BigDecimal getSpecialNoteId() {
		return this.specialNoteId;
	}

	public void setSpecialNoteId(BigDecimal specialNoteId) {
		this.specialNoteId = specialNoteId;
	}

}