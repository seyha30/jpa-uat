package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the BAL_MASTERX database table.
 * 
 */
@Entity
@Table(name="BAL_MASTERX")
@NamedQuery(name="BalMasterx.findAll", query="SELECT b FROM BalMasterx b")
public class BalMasterx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCT_DES")
	private String acctDes;

	@Column(name="ACCT_ID")
	private BigDecimal acctId;

	@Column(name="ACCT_NAME")
	private String acctName;

	@Column(name="ACCT_TYPE_ID")
	private BigDecimal acctTypeId;

	private BigDecimal bal;

	@Column(name="CON_DES")
	private String conDes;

	@Column(name="CON_NAME")
	private String conName;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	@Column(name="GROUP_ID")
	private BigDecimal groupId;

	public BalMasterx() {
	}

	public String getAcctDes() {
		return this.acctDes;
	}

	public void setAcctDes(String acctDes) {
		this.acctDes = acctDes;
	}

	public BigDecimal getAcctId() {
		return this.acctId;
	}

	public void setAcctId(BigDecimal acctId) {
		this.acctId = acctId;
	}

	public String getAcctName() {
		return this.acctName;
	}

	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}

	public BigDecimal getAcctTypeId() {
		return this.acctTypeId;
	}

	public void setAcctTypeId(BigDecimal acctTypeId) {
		this.acctTypeId = acctTypeId;
	}

	public BigDecimal getBal() {
		return this.bal;
	}

	public void setBal(BigDecimal bal) {
		this.bal = bal;
	}

	public String getConDes() {
		return this.conDes;
	}

	public void setConDes(String conDes) {
		this.conDes = conDes;
	}

	public String getConName() {
		return this.conName;
	}

	public void setConName(String conName) {
		this.conName = conName;
	}

	public BigDecimal getCurrId() {
		return this.currId;
	}

	public void setCurrId(BigDecimal currId) {
		this.currId = currId;
	}

	public BigDecimal getGroupId() {
		return this.groupId;
	}

	public void setGroupId(BigDecimal groupId) {
		this.groupId = groupId;
	}

}