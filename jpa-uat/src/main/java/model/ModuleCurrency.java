package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the MODULE_CURRENCY database table.
 * 
 */
@Entity
@Table(name="MODULE_CURRENCY")
@NamedQuery(name="ModuleCurrency.findAll", query="SELECT m FROM ModuleCurrency m")
public class ModuleCurrency implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	@Column(name="MODULE_GROUP_ID")
	private BigDecimal moduleGroupId;

	//bi-directional many-to-one association to Module
	@ManyToOne
	@JoinColumn(name="MODULE_ID")
	private Module module;

	public ModuleCurrency() {
	}

	public BigDecimal getCurrId() {
		return this.currId;
	}

	public void setCurrId(BigDecimal currId) {
		this.currId = currId;
	}

	public BigDecimal getModuleGroupId() {
		return this.moduleGroupId;
	}

	public void setModuleGroupId(BigDecimal moduleGroupId) {
		this.moduleGroupId = moduleGroupId;
	}

	public Module getModule() {
		return this.module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

}