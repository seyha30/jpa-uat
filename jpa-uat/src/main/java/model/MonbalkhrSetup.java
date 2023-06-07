package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the MONBALKHR_SETUP database table.
 * 
 */
@Entity
@Table(name="MONBALKHR_SETUP")
@NamedQuery(name="MonbalkhrSetup.findAll", query="SELECT m FROM MonbalkhrSetup m")
public class MonbalkhrSetup implements Serializable {
	private static final long serialVersionUID = 1L;

	private String description;

	private String formula;

	private String formula1;

	@Column(name="\"LINENO\"")
	private BigDecimal lineno;

	@Column(name="TITLE_FORMULA")
	private String titleFormula;

	public MonbalkhrSetup() {
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFormula() {
		return this.formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public String getFormula1() {
		return this.formula1;
	}

	public void setFormula1(String formula1) {
		this.formula1 = formula1;
	}

	public BigDecimal getLineno() {
		return this.lineno;
	}

	public void setLineno(BigDecimal lineno) {
		this.lineno = lineno;
	}

	public String getTitleFormula() {
		return this.titleFormula;
	}

	public void setTitleFormula(String titleFormula) {
		this.titleFormula = titleFormula;
	}

}