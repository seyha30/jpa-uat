package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the LOAN_GROUP_DETAIL database table.
 * 
 */
@Entity
@Table(name="LOAN_GROUP_DETAIL")
@NamedQuery(name="LoanGroupDetail.findAll", query="SELECT l FROM LoanGroupDetail l")
public class LoanGroupDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	private String deleted;

	@Column(name="GROUP_DETAIL_ID")
	private BigDecimal groupDetailId;

	@Column(name="GROUP_ID")
	private BigDecimal groupId;

	@Column(name="LOAN_FAC_ID")
	private BigDecimal loanFacId;

	public LoanGroupDetail() {
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public BigDecimal getGroupDetailId() {
		return this.groupDetailId;
	}

	public void setGroupDetailId(BigDecimal groupDetailId) {
		this.groupDetailId = groupDetailId;
	}

	public BigDecimal getGroupId() {
		return this.groupId;
	}

	public void setGroupId(BigDecimal groupId) {
		this.groupId = groupId;
	}

	public BigDecimal getLoanFacId() {
		return this.loanFacId;
	}

	public void setLoanFacId(BigDecimal loanFacId) {
		this.loanFacId = loanFacId;
	}

}