package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ACCT_CODE1 database table.
 * 
 */
@Entity
@Table(name="ACCT_CODE1")
@NamedQuery(name="AcctCode1.findAll", query="SELECT a FROM AcctCode1 a")
public class AcctCode1 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCT_ID")
	private BigDecimal acctId;

	@Column(name="ACCT_TYPE_ID")
	private BigDecimal acctTypeId;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	private String description;

	@Column(name="GROUP_ID")
	private BigDecimal groupId;

	@Column(name="GROUP_NO")
	private BigDecimal groupNo;

	private String name;

	public AcctCode1() {
	}

	public BigDecimal getAcctId() {
		return this.acctId;
	}

	public void setAcctId(BigDecimal acctId) {
		this.acctId = acctId;
	}

	public BigDecimal getAcctTypeId() {
		return this.acctTypeId;
	}

	public void setAcctTypeId(BigDecimal acctTypeId) {
		this.acctTypeId = acctTypeId;
	}

	public BigDecimal getCurrId() {
		return this.currId;
	}

	public void setCurrId(BigDecimal currId) {
		this.currId = currId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getGroupId() {
		return this.groupId;
	}

	public void setGroupId(BigDecimal groupId) {
		this.groupId = groupId;
	}

	public BigDecimal getGroupNo() {
		return this.groupNo;
	}

	public void setGroupNo(BigDecimal groupNo) {
		this.groupNo = groupNo;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}