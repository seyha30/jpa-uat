package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CUST_ENQUIRY_NO database table.
 * 
 */
@Entity
@Table(name="CUST_ENQUIRY_NO")
@NamedQuery(name="CustEnquiryNo.findAll", query="SELECT c FROM CustEnquiryNo c")
public class CustEnquiryNo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CUST_ENQUIRY_NO_ID")
	private BigDecimal custEnquiryNoId;

	@Column(name="CUST_ENQUITY_NO_CODE")
	private String custEnquityNoCode;

	@Column(name="CUST_KEY_NUM")
	private BigDecimal custKeyNum;

	@Column(name="DATE_DONE")
	private Object dateDone;

	private String deleted;

	private String description;

	@Column(name="DONE_BY")
	private String doneBy;

	//bi-directional many-to-one association to LoanFacility
	@ManyToOne
	@JoinColumn(name="LOAN_FAC_ID")
	private LoanFacility loanFacility;

	public CustEnquiryNo() {
	}

	public BigDecimal getCustEnquiryNoId() {
		return this.custEnquiryNoId;
	}

	public void setCustEnquiryNoId(BigDecimal custEnquiryNoId) {
		this.custEnquiryNoId = custEnquiryNoId;
	}

	public String getCustEnquityNoCode() {
		return this.custEnquityNoCode;
	}

	public void setCustEnquityNoCode(String custEnquityNoCode) {
		this.custEnquityNoCode = custEnquityNoCode;
	}

	public BigDecimal getCustKeyNum() {
		return this.custKeyNum;
	}

	public void setCustKeyNum(BigDecimal custKeyNum) {
		this.custKeyNum = custKeyNum;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
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

	public LoanFacility getLoanFacility() {
		return this.loanFacility;
	}

	public void setLoanFacility(LoanFacility loanFacility) {
		this.loanFacility = loanFacility;
	}

}