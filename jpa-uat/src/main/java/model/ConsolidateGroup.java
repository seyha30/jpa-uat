package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CONSOLIDATE_GROUP database table.
 * 
 */
@Entity
@Table(name="CONSOLIDATE_GROUP")
@NamedQuery(name="ConsolidateGroup.findAll", query="SELECT c FROM ConsolidateGroup c")
public class ConsolidateGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ACCT_ID")
	private long acctId;

	@Column(name="ACCT_TYPE_ID")
	private BigDecimal acctTypeId;

	private String description;

	private String name;

	public ConsolidateGroup() {
	}

	public long getAcctId() {
		return this.acctId;
	}

	public void setAcctId(long acctId) {
		this.acctId = acctId;
	}

	public BigDecimal getAcctTypeId() {
		return this.acctTypeId;
	}

	public void setAcctTypeId(BigDecimal acctTypeId) {
		this.acctTypeId = acctTypeId;
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

}