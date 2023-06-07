package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SBF_GROUP_GL database table.
 * 
 */
@Entity
@Table(name="SBF_GROUP_GL")
@NamedQuery(name="SbfGroupGl.findAll", query="SELECT s FROM SbfGroupGl s")
public class SbfGroupGl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CONS_ACCT")
	private String consAcct;

	@Column(name="CONS_NAME")
	private String consName;

	@Column(name="GL_GROUP")
	private BigDecimal glGroup;

	@Column(name="GL_GROUP_ID")
	private BigDecimal glGroupId;

	@Column(name="GL_TYPE")
	private BigDecimal glType;

	public SbfGroupGl() {
	}

	public String getConsAcct() {
		return this.consAcct;
	}

	public void setConsAcct(String consAcct) {
		this.consAcct = consAcct;
	}

	public String getConsName() {
		return this.consName;
	}

	public void setConsName(String consName) {
		this.consName = consName;
	}

	public BigDecimal getGlGroup() {
		return this.glGroup;
	}

	public void setGlGroup(BigDecimal glGroup) {
		this.glGroup = glGroup;
	}

	public BigDecimal getGlGroupId() {
		return this.glGroupId;
	}

	public void setGlGroupId(BigDecimal glGroupId) {
		this.glGroupId = glGroupId;
	}

	public BigDecimal getGlType() {
		return this.glType;
	}

	public void setGlType(BigDecimal glType) {
		this.glType = glType;
	}

}