package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CLVW_LOAN_TRANSFERED_DETAIL database table.
 * 
 */
@Entity
@Table(name="CLVW_LOAN_TRANSFERED_DETAIL")
@NamedQuery(name="ClvwLoanTransferedDetail.findAll", query="SELECT c FROM ClvwLoanTransferedDetail c")
public class ClvwLoanTransferedDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal aging;

	@Column(name="AGING_TRAN")
	private BigDecimal agingTran;

	@Column(name="BRANCH_ID")
	private String branchId;

	@Column(name="CREDIT_OFFICER")
	private String creditOfficer;

	@Column(name="DATE_DONE")
	private Object dateDone;

	@Column(name="DATE_TRAN")
	private Object dateTran;

	@Column(name="LOAN_CAT")
	private String loanCat;

	@Column(name="OUTS_TRAN")
	private BigDecimal outsTran;

	private BigDecimal outstanding;

	@Column(name="REF_NO")
	private String refNo;

	public ClvwLoanTransferedDetail() {
	}

	public BigDecimal getAging() {
		return this.aging;
	}

	public void setAging(BigDecimal aging) {
		this.aging = aging;
	}

	public BigDecimal getAgingTran() {
		return this.agingTran;
	}

	public void setAgingTran(BigDecimal agingTran) {
		this.agingTran = agingTran;
	}

	public String getBranchId() {
		return this.branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public String getCreditOfficer() {
		return this.creditOfficer;
	}

	public void setCreditOfficer(String creditOfficer) {
		this.creditOfficer = creditOfficer;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public Object getDateTran() {
		return this.dateTran;
	}

	public void setDateTran(Object dateTran) {
		this.dateTran = dateTran;
	}

	public String getLoanCat() {
		return this.loanCat;
	}

	public void setLoanCat(String loanCat) {
		this.loanCat = loanCat;
	}

	public BigDecimal getOutsTran() {
		return this.outsTran;
	}

	public void setOutsTran(BigDecimal outsTran) {
		this.outsTran = outsTran;
	}

	public BigDecimal getOutstanding() {
		return this.outstanding;
	}

	public void setOutstanding(BigDecimal outstanding) {
		this.outstanding = outstanding;
	}

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

}