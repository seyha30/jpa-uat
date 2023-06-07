package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the NA_INTERBRACHES database table.
 * 
 */
@Entity
@Table(name="NA_INTERBRACHES")
@NamedQuery(name="NaInterbrach.findAll", query="SELECT n FROM NaInterbrach n")
public class NaInterbrach implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCT_ID")
	private BigDecimal acctId;

	@Column(name="ACCT_TYPE")
	private String acctType;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	private String deleted;

	private String description;

	@Column(name="INTBR_ID")
	private BigDecimal intbrId;

	private String name;

	public NaInterbrach() {
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

	public BigDecimal getIntbrId() {
		return this.intbrId;
	}

	public void setIntbrId(BigDecimal intbrId) {
		this.intbrId = intbrId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}