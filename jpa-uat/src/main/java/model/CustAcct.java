package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the CUST_ACCT database table.
 * 
 */
@Entity
@Table(name="CUST_ACCT")
@NamedQuery(name="CustAcct.findAll", query="SELECT c FROM CustAcct c")
public class CustAcct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long custacctid;

	@Column(name="ACCT_NUM")
	private BigDecimal acctNum;

	@Column(name="ACCT_TYPE")
	private String acctType;

	private BigDecimal chksum;

	@Column(name="CLOSE_DATE")
	private Object closeDate;

	@Column(name="CREATED_DATE")
	private Object createdDate;

	@Column(name="CUST_ACCT_TYPE_ID")
	private BigDecimal custAcctTypeId;

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

	//bi-directional many-to-one association to AcctStatus
	@ManyToOne
	@JoinColumn(name="ACCT_STATUS_ID")
	private AcctStatus acctStatus;

	//bi-directional many-to-one association to Branch
	@ManyToOne
	@JoinColumn(name="BRANCH_ID")
	private Branch branch;

	//bi-directional many-to-one association to CurrencyCode
	@ManyToOne
	@JoinColumn(name="CURR_ID")
	private CurrencyCode currencyCode;

	//bi-directional many-to-one association to CustInfoCustAcct
	@OneToMany(mappedBy="custAcct")
	private List<CustInfoCustAcct> custInfoCustAccts;

	//bi-directional many-to-one association to CustTranx
	@OneToMany(mappedBy="custAcct")
	private List<CustTranx> custTranxs;

	public CustAcct() {
	}

	public long getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(long custacctid) {
		this.custacctid = custacctid;
	}

	public BigDecimal getAcctNum() {
		return this.acctNum;
	}

	public void setAcctNum(BigDecimal acctNum) {
		this.acctNum = acctNum;
	}

	public String getAcctType() {
		return this.acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
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

	public BigDecimal getCustAcctTypeId() {
		return this.custAcctTypeId;
	}

	public void setCustAcctTypeId(BigDecimal custAcctTypeId) {
		this.custAcctTypeId = custAcctTypeId;
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

	public AcctStatus getAcctStatus() {
		return this.acctStatus;
	}

	public void setAcctStatus(AcctStatus acctStatus) {
		this.acctStatus = acctStatus;
	}

	public Branch getBranch() {
		return this.branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public CurrencyCode getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(CurrencyCode currencyCode) {
		this.currencyCode = currencyCode;
	}

	public List<CustInfoCustAcct> getCustInfoCustAccts() {
		return this.custInfoCustAccts;
	}

	public void setCustInfoCustAccts(List<CustInfoCustAcct> custInfoCustAccts) {
		this.custInfoCustAccts = custInfoCustAccts;
	}

	public CustInfoCustAcct addCustInfoCustAcct(CustInfoCustAcct custInfoCustAcct) {
		getCustInfoCustAccts().add(custInfoCustAcct);
		custInfoCustAcct.setCustAcct(this);

		return custInfoCustAcct;
	}

	public CustInfoCustAcct removeCustInfoCustAcct(CustInfoCustAcct custInfoCustAcct) {
		getCustInfoCustAccts().remove(custInfoCustAcct);
		custInfoCustAcct.setCustAcct(null);

		return custInfoCustAcct;
	}

	public List<CustTranx> getCustTranxs() {
		return this.custTranxs;
	}

	public void setCustTranxs(List<CustTranx> custTranxs) {
		this.custTranxs = custTranxs;
	}

	public CustTranx addCustTranx(CustTranx custTranx) {
		getCustTranxs().add(custTranx);
		custTranx.setCustAcct(this);

		return custTranx;
	}

	public CustTranx removeCustTranx(CustTranx custTranx) {
		getCustTranxs().remove(custTranx);
		custTranx.setCustAcct(null);

		return custTranx;
	}

}