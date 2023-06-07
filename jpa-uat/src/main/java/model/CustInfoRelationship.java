package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CUST_INFO_RELATIONSHIP database table.
 * 
 */
@Entity
@Table(name="CUST_INFO_RELATIONSHIP")
@NamedQuery(name="CustInfoRelationship.findAll", query="SELECT c FROM CustInfoRelationship c")
public class CustInfoRelationship implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CUST_INFO_ID")
	private BigDecimal custInfoId;

	@Column(name="CUST_RELATIONSHIP_ID")
	private BigDecimal custRelationshipId;

	private String description;

	@Column(name="RELATIONSHIP_ID")
	private BigDecimal relationshipId;

	public CustInfoRelationship() {
	}

	public BigDecimal getCustInfoId() {
		return this.custInfoId;
	}

	public void setCustInfoId(BigDecimal custInfoId) {
		this.custInfoId = custInfoId;
	}

	public BigDecimal getCustRelationshipId() {
		return this.custRelationshipId;
	}

	public void setCustRelationshipId(BigDecimal custRelationshipId) {
		this.custRelationshipId = custRelationshipId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getRelationshipId() {
		return this.relationshipId;
	}

	public void setRelationshipId(BigDecimal relationshipId) {
		this.relationshipId = relationshipId;
	}

}