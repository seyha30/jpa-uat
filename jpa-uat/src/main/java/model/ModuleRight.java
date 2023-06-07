package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the MODULE_RIGHTS database table.
 * 
 */
@Entity
@Table(name="MODULE_RIGHTS")
@NamedQuery(name="ModuleRight.findAll", query="SELECT m FROM ModuleRight m")
public class ModuleRight implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ModuleRightPK id;

	//bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name="ROLE_ID")
	private Role role;

	public ModuleRight() {
	}

	public ModuleRightPK getId() {
		return this.id;
	}

	public void setId(ModuleRightPK id) {
		this.id = id;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}