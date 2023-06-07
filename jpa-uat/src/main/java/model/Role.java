package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the "ROLE" database table.
 * 
 */
@Entity
@Table(name="\"ROLE\"")
@NamedQuery(name="Role.findAll", query="SELECT r FROM Role r")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ROLE_ID")
	private long roleId;

	@Column(name="D_LIMITS")
	private BigDecimal dLimits;

	private String deleted;

	private String description;

	private BigDecimal limits;

	private BigDecimal rank;

	@Column(name="W_LIMITS")
	private BigDecimal wLimits;

	//bi-directional many-to-one association to ModuleRight
	@OneToMany(mappedBy="role")
	private List<ModuleRight> moduleRights;

	//bi-directional many-to-one association to Right
	@OneToMany(mappedBy="role")
	private List<Right> rights;

	public Role() {
	}

	public long getRoleId() {
		return this.roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getLimits() {
		return this.limits;
	}

	public void setLimits(BigDecimal limits) {
		this.limits = limits;
	}

	public BigDecimal getRank() {
		return this.rank;
	}

	public void setRank(BigDecimal rank) {
		this.rank = rank;
	}

	public BigDecimal getWLimits() {
		return this.wLimits;
	}

	public void setWLimits(BigDecimal wLimits) {
		this.wLimits = wLimits;
	}

	public List<ModuleRight> getModuleRights() {
		return this.moduleRights;
	}

	public void setModuleRights(List<ModuleRight> moduleRights) {
		this.moduleRights = moduleRights;
	}

	public ModuleRight addModuleRight(ModuleRight moduleRight) {
		getModuleRights().add(moduleRight);
		moduleRight.setRole(this);

		return moduleRight;
	}

	public ModuleRight removeModuleRight(ModuleRight moduleRight) {
		getModuleRights().remove(moduleRight);
		moduleRight.setRole(null);

		return moduleRight;
	}

	public List<Right> getRights() {
		return this.rights;
	}

	public void setRights(List<Right> rights) {
		this.rights = rights;
	}

	public Right addRight(Right right) {
		getRights().add(right);
		right.setRole(this);

		return right;
	}

	public Right removeRight(Right right) {
		getRights().remove(right);
		right.setRole(null);

		return right;
	}

}