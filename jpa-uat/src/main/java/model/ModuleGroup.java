package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the MODULE_GROUP database table.
 * 
 */
@Entity
@Table(name="MODULE_GROUP")
@NamedQuery(name="ModuleGroup.findAll", query="SELECT m FROM ModuleGroup m")
public class ModuleGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	private String deleted;

	private String description;

	@Column(name="MODULE_GROUP_ID")
	private BigDecimal moduleGroupId;

	public ModuleGroup() {
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

	public BigDecimal getModuleGroupId() {
		return this.moduleGroupId;
	}

	public void setModuleGroupId(BigDecimal moduleGroupId) {
		this.moduleGroupId = moduleGroupId;
	}

}