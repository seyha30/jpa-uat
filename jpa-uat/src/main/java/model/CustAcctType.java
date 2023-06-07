package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CUST_ACCT_TYPE database table.
 * 
 */
@Entity
@Table(name="CUST_ACCT_TYPE")
@NamedQuery(name="CustAcctType.findAll", query="SELECT c FROM CustAcctType c")
public class CustAcctType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CUST_ACCT_TYPE_ID")
	private long custAcctTypeId;

	@Column(name="ACCT_ID")
	private BigDecimal acctId;

	@Column(name="ACCT_TYPE")
	private String acctType;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	private String deleted;

	private String description;

	private String name;

	@Column(name="POST_ACCT_ID")
	private BigDecimal postAcctId;

	public CustAcctType() {
	}

	public long getCustAcctTypeId() {
		return this.custAcctTypeId;
	}

	public void setCustAcctTypeId(long custAcctTypeId) {
		this.custAcctTypeId = custAcctTypeId;
	}

	public BigDecimal getAcctId() {
		return this.acctId;
	}

	public void setAcctId(BigDecimal acctId) {
		this.acctId = acctId;
	}

	public String getAcctType() {
		return this.acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}

	public BigDecimal getCurrId() {
		return this.currId;
	}

	public void setCurrId(BigDecimal currId) {
		this.currId = currId;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPostAcctId() {
		return this.postAcctId;
	}

	public void setPostAcctId(BigDecimal postAcctId) {
		this.postAcctId = postAcctId;
	}

}