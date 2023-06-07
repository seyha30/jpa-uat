package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the MODULE_RIGHTS database table.
 * 
 */
@Embeddable
public class ModuleRightPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="MODULE_ID")
	private long moduleId;

	@Column(name="ROLE_ID", insertable=false, updatable=false)
	private long roleId;

	public ModuleRightPK() {
	}
	public long getModuleId() {
		return this.moduleId;
	}
	public void setModuleId(long moduleId) {
		this.moduleId = moduleId;
	}
	public long getRoleId() {
		return this.roleId;
	}
	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ModuleRightPK)) {
			return false;
		}
		ModuleRightPK castOther = (ModuleRightPK)other;
		return 
			(this.moduleId == castOther.moduleId)
			&& (this.roleId == castOther.roleId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.moduleId ^ (this.moduleId >>> 32)));
		hash = hash * prime + ((int) (this.roleId ^ (this.roleId >>> 32)));
		
		return hash;
	}
}