package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the LOAN_TRAN database table.
 * 
 */
@Entity
@Table(name="LOAN_TRAN")
@NamedQuery(name="LoanTran.findAll", query="SELECT l FROM LoanTran l")
public class LoanTran implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="LOAN_TRAN_ID")
	private long loanTranId;

	private BigDecimal amount;

	@Column(name="DATE_DONE")
	private Object dateDone;

	private String deleted;

	@Column(name="DONE_BY")
	private String doneBy;

	@Column(name="IN_NO")
	private BigDecimal inNo;

	@Column(name="OVERRIDE_BY")
	private String overrideBy;

	@Column(name="OVERRIDE_DATE")
	private Object overrideDate;

	@Column(name="PRINCIPAL_INT")
	private String principalInt;

	private String reverse;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	//bi-directional many-to-one association to LoanFacility
	@ManyToOne
	@JoinColumn(name="LOAN_FAC_ID")
	private LoanFacility loanFacility;

	public LoanTran() {
	}

	public long getLoanTranId() {
		return this.loanTranId;
	}

	public void setLoanTranId(long loanTranId) {
		this.loanTranId = loanTranId;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
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

	public String getDoneBy() {
		return this.doneBy;
	}

	public void setDoneBy(String doneBy) {
		this.doneBy = doneBy;
	}

	public BigDecimal getInNo() {
		return this.inNo;
	}

	public void setInNo(BigDecimal inNo) {
		this.inNo = inNo;
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

	public String getPrincipalInt() {
		return this.principalInt;
	}

	public void setPrincipalInt(String principalInt) {
		this.principalInt = principalInt;
	}

	public String getReverse() {
		return this.reverse;
	}

	public void setReverse(String reverse) {
		this.reverse = reverse;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

	public LoanFacility getLoanFacility() {
		return this.loanFacility;
	}

	public void setLoanFacility(LoanFacility loanFacility) {
		this.loanFacility = loanFacility;
	}

}