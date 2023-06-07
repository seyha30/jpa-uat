package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CUST_ACCT_LOG database table.
 * 
 */
@Entity
@Table(name="CUST_ACCT_LOG")
@NamedQuery(name="CustAcctLog.findAll", query="SELECT c FROM CustAcctLog c")
public class CustAcctLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCT_NUM")
	private BigDecimal acctNum;

	@Column(name="ACCT_STATUS_ID")
	private BigDecimal acctStatusId;

	@Column(name="ACCT_TYPE")
	private String acctType;

	@Column(name="BRANCH_ID")
	private BigDecimal branchId;

	private BigDecimal chksum;

	@Column(name="CLOSE_DATE")
	private Object closeDate;

	@Column(name="CREATED_DATE")
	private Object createdDate;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	@Column(name="CUST_ACCT_TYPE_ID")
	private BigDecimal custAcctTypeId;

	private BigDecimal custacctid;

	@Column(name="DONE_BY")
	private String doneBy;

	private BigDecimal freezedamt;

	private String locked;

	@Column(name="\"NAMES\"")
	private String names;

	@Column(name="NBC_CODE")
	private BigDecimal nbcCode;

	@Column(name="OPEN_DATE")
	private Object openDate;

	private String refno;

	private String resident;

	private String sigcond;

	@Column(name="TERM_ID")
	private BigDecimal termId;

	public CustAcctLog() {
	}

	public BigDecimal getAcctNum() {
		return this.acctNum;
	}

	public void setAcctNum(BigDecimal acctNum) {
		this.acctNum = acctNum;
	}

	public BigDecimal getAcctStatusId() {
		return this.acctStatusId;
	}

	public void setAcctStatusId(BigDecimal acctStatusId) {
		this.acctStatusId = acctStatusId;
	}

	public String getAcctType() {
		return this.acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}

	public BigDecimal getBranchId() {
		return this.branchId;
	}

	public void setBranchId(BigDecimal branchId) {
		this.branchId = branchId;
	}

	public BigDecimal getChksum() {
		return this.chksum;
	}

	public void setChksum(BigDecimal chksum) {
		this.chksum = chksum;
	}

	public Object getCloseDate() {
		return this.closeDate;
	}

	public void setCloseDate(Object closeDate) {
		this.closeDate = closeDate;
	}

	public Object getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Object createdDate) {
		this.createdDate = createdDate;
	}

	public BigDecimal getCurrId() {
		return this.currId;
	}

	public void setCurrId(BigDecimal currId) {
		this.currId = currId;
	}

	public BigDecimal getCustAcctTypeId() {
		return this.custAcctTypeId;
	}

	public void setCustAcctTypeId(BigDecimal custAcctTypeId) {
		this.custAcctTypeId = custAcctTypeId;
	}

	public BigDecimal getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(BigDecimal custacctid) {
		this.custacctid = custacctid;
	}

	public String getDoneBy() {
		return this.doneBy;
	}

	public void setDoneBy(String doneBy) {
		this.doneBy = doneBy;
	}

	public BigDecimal getFreezedamt() {
		return this.freezedamt;
	}

	public void setFreezedamt(BigDecimal freezedamt) {
		this.freezedamt = freezedamt;
	}

	public String getLocked() {
		return this.locked;
	}

	public void setLocked(String locked) {
		this.locked = locked;
	}

	public String getNames() {
		return this.names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public BigDecimal getNbcCode() {
		return this.nbcCode;
	}

	public void setNbcCode(BigDecimal nbcCode) {
		this.nbcCode = nbcCode;
	}

	public Object getOpenDate() {
		return this.openDate;
	}

	public void setOpenDate(Object openDate) {
		this.openDate = openDate;
	}

	public String getRefno() {
		return this.refno;
	}

	public void setRefno(String refno) {
		this.refno = refno;
	}

	public String getResident() {
		return this.resident;
	}

	public void setResident(String resident) {
		this.resident = resident;
	}

	public String getSigcond() {
		return this.sigcond;
	}

	public void setSigcond(String sigcond) {
		this.sigcond = sigcond;
	}

	public BigDecimal getTermId() {
		return this.termId;
	}

	public void setTermId(BigDecimal termId) {
		this.termId = termId;
	}

}