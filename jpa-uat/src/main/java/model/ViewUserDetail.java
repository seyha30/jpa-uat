package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the VIEW_USER_DETAIL database table.
 * 
 */
@Entity
@Table(name="VIEW_USER_DETAIL")
@NamedQuery(name="ViewUserDetail.findAll", query="SELECT v FROM ViewUserDetail v")
public class ViewUserDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="BRANCH_ID")
	private BigDecimal branchId;

	@Column(name="D_LIMITS")
	private BigDecimal dLimits;

	private String deleted;

	private BigDecimal limits;

	@Column(name="NON_BIZ")
	private String nonBiz;

	private BigDecimal rank;

	@Column(name="RIGHTS_ID")
	private String rightsId;

	@Column(name="ROLE_DESCRIPTION")
	private String roleDescription;

	private BigDecimal userid;

	private String username;

	@Column(name="W_LIMITS")
	private BigDecimal wLimits;

	public ViewUserDetail() {
	}

	public BigDecimal getBranchId() {
		return this.branchId;
	}

	public void setBranchId(BigDecimal branchId) {
		this.branchId = branchId;
	}

	public BigDecimal getDLimits() {
		return this.dLimits;
	}

	public void setDLimits(BigDecimal dLimits) {
		this.dLimits = dLimits;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public BigDecimal getLimits() {
		return this.limits;
	}

	public void setLimits(BigDecimal limits) {
		this.limits = limits;
	}

	public String getNonBiz() {
		return this.nonBiz;
	}

	public void setNonBiz(String nonBiz) {
		this.nonBiz = nonBiz;
	}

	public BigDecimal getRank() {
		return this.rank;
	}

	public void setRank(BigDecimal rank) {
		this.rank = rank;
	}

	public String getRightsId() {
		return this.rightsId;
	}

	public void setRightsId(String rightsId) {
		this.rightsId = rightsId;
	}

	public String getRoleDescription() {
		return this.roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public BigDecimal getUserid() {
		return this.userid;
	}

	public void setUserid(BigDecimal userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public BigDecimal getWLimits() {
		return this.wLimits;
	}

	public void setWLimits(BigDecimal wLimits) {
		this.wLimits = wLimits;
	}

}