package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CAB_GL database table.
 * 
 */
@Entity
@Table(name="CAB_GL")
@NamedQuery(name="CabGl.findAll", query="SELECT c FROM CabGl c")
public class CabGl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCT_TYPE_ID")
	private BigDecimal acctTypeId;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	private String description;

	@Column(name="GROUP_ID")
	private BigDecimal groupId;

	private String name;

	public CabGl() {
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}