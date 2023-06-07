package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the RIGHTS database table.
 * 
 */
@Entity
@Table(name="RIGHTS")
@NamedQuery(name="Right.findAll", query="SELECT r FROM Right r")
public class Right implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="RIGHTS_ID")
	private String rightsId;

	@Column(name="BRANCH_ID")
	private BigDecimal branchId;

	private String deleted;

	//bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name="ROLE_ID")
	private Role role;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private User user;

	public Right() {
	}

	public String getRightsId() {
		return this.rightsId;
	}

	public void setRightsId(String rightsId) {
		this.rightsId = rightsId;
	}

	public BigDecimal getBranchId() {
		return this.branchId;
	}

	public void setBranchId(BigDecimal branchId) {
		this.branchId = branchId;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}