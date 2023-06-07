package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the LOAN_GROUP database table.
 * 
 */
@Entity
@Table(name="LOAN_GROUP")
@NamedQuery(name="LoanGroup.findAll", query="SELECT l FROM LoanGroup l")
public class LoanGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="DATE_DONE")
	private Object dateDone;

	private String deleted;

	private String description;

	@Column(name="DONE_BY")
	private String doneBy;

	@Column(name="GROUP_ID")
	private BigDecimal groupId;

	@Column(name="GROUP_NAME")
	private String groupName;

	@Column(name="GROUP_REF")
	private String groupRef;

	public LoanGroup() {
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDoneBy() {
		return this.doneBy;
	}

	public void setDoneBy(String doneBy) {
		this.doneBy = doneBy;
	}

	public BigDecimal getGroupId() {
		return this.groupId;
	}

	public void setGroupId(BigDecimal groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupRef() {
		return this.groupRef;
	}

	public void setGroupRef(String groupRef) {
		this.groupRef = groupRef;
	}

}