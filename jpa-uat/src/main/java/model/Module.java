package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the "MODULE" database table.
 * 
 */
@Entity
@Table(name="\"MODULE\"")
@NamedQuery(name="Module.findAll", query="SELECT m FROM Module m")
public class Module implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MODULE_ID")
	private long moduleId;

	private String deleted;

	private String description;

	@Column(name="F_B_COLOUR")
	private BigDecimal fBColour;

	@Column(name="F_G_COLOUR")
	private BigDecimal fGColour;

	@Column(name="F_R_COLOUR")
	private BigDecimal fRColour;

	private String tt;

	//bi-directional many-to-one association to ModuleCurrency
	@OneToMany(mappedBy="module")
	private List<ModuleCurrency> moduleCurrencies;

	//bi-directional many-to-many association to TranxType
	@ManyToMany(mappedBy="modules")
	private List<TranxType> tranxTypes;

	public Module() {
	}

	public long getModuleId() {
		return this.moduleId;
	}

	public void setModuleId(long moduleId) {
		this.moduleId = moduleId;
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

	public BigDecimal getFBColour() {
		return this.fBColour;
	}

	public void setFBColour(BigDecimal fBColour) {
		this.fBColour = fBColour;
	}

	public BigDecimal getFGColour() {
		return this.fGColour;
	}

	public void setFGColour(BigDecimal fGColour) {
		this.fGColour = fGColour;
	}

	public BigDecimal getFRColour() {
		return this.fRColour;
	}

	public void setFRColour(BigDecimal fRColour) {
		this.fRColour = fRColour;
	}

	public String getTt() {
		return this.tt;
	}

	public void setTt(String tt) {
		this.tt = tt;
	}

	public List<ModuleCurrency> getModuleCurrencies() {
		return this.moduleCurrencies;
	}

	public void setModuleCurrencies(List<ModuleCurrency> moduleCurrencies) {
		this.moduleCurrencies = moduleCurrencies;
	}

	public ModuleCurrency addModuleCurrency(ModuleCurrency moduleCurrency) {
		getModuleCurrencies().add(moduleCurrency);
		moduleCurrency.setModule(this);

		return moduleCurrency;
	}

	public ModuleCurrency removeModuleCurrency(ModuleCurrency moduleCurrency) {
		getModuleCurrencies().remove(moduleCurrency);
		moduleCurrency.setModule(null);

		return moduleCurrency;
	}

	public List<TranxType> getTranxTypes() {
		return this.tranxTypes;
	}

	public void setTranxTypes(List<TranxType> tranxTypes) {
		this.tranxTypes = tranxTypes;
	}

}