package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CC_AUTODORC database table.
 * 
 */
@Entity
@Table(name="CC_AUTODORC")
@NamedQuery(name="CcAutodorc.findAll", query="SELECT c FROM CcAutodorc c")
public class CcAutodorc implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal amount;

	@Column(name="BRANCH_ID")
	private BigDecimal branchId;

	private BigDecimal checksum;

	@Column(name="CUST_ACC_ID")
	private BigDecimal custAccId;

	@Column(name="CUST_ACCT_TYPE_ID")
	private BigDecimal custAcctTypeId;

	@Column(name="CUST_NAME")
	private String custName;

	@Column(name="CUST_NUMBER")
	private BigDecimal custNumber;

	private String dorc;

	private String flag;

	@Column(name="NBC_CODE")
	private BigDecimal nbcCode;

	@Column(name="PROC_DATE")
	private Object procDate;

	@Column(name="REF_NUMBER")
	private String refNumber;

	public CcAutodorc() {
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getBranchId() {
		return this.branchId;
	}

	public void setBranchId(BigDecimal branchId) {
		this.branchId = branchId;
	}

	public BigDecimal getChecksum() {
		return this.checksum;
	}

	public void setChecksum(BigDecimal checksum) {
		this.checksum = checksum;
	}

	public BigDecimal getCustAccId() {
		return this.custAccId;
	}

	public void setCustAccId(BigDecimal custAccId) {
		this.custAccId = custAccId;
	}

	public BigDecimal getCustAcctTypeId() {
		return this.custAcctTypeId;
	}

	public void setCustAcctTypeId(BigDecimal custAcctTypeId) {
		this.custAcctTypeId = custAcctTypeId;
	}

	public String getCustName() {
		return this.custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public BigDecimal getCustNumber() {
		return this.custNumber;
	}

	public void setCustNumber(BigDecimal custNumber) {
		this.custNumber = custNumber;
	}

	public String getDorc() {
		return this.dorc;
	}

	public void setDorc(String dorc) {
		this.dorc = dorc;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public BigDecimal getNbcCode() {
		return this.nbcCode;
	}

	public void setNbcCode(BigDecimal nbcCode) {
		this.nbcCode = nbcCode;
	}

	public Object getProcDate() {
		return this.procDate;
	}

	public void setProcDate(Object procDate) {
		this.procDate = procDate;
	}

	public String getRefNumber() {
		return this.refNumber;
	}

	public void setRefNumber(String refNumber) {
		this.refNumber = refNumber;
	}

}