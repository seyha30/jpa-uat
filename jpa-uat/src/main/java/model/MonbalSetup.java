package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the MONBAL_SETUP database table.
 * 
 */
@Entity
@Table(name="MONBAL_SETUP")
@NamedQuery(name="MonbalSetup.findAll", query="SELECT m FROM MonbalSetup m")
public class MonbalSetup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"LINENO\"")
	private long lineno;

	private String description;

	private String formula;

	private String formula1;

	@Column(name="TITLE_FORMULA")
	private String titleFormula;

	public MonbalSetup() {
	}

	public long getLineno() {
		return this.lineno;
	}

	public void setLineno(long lineno) {
		this.lineno = lineno;
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

	public String getTitleFormula() {
		return this.titleFormula;
	}

	public void setTitleFormula(String titleFormula) {
		this.titleFormula = titleFormula;
	}

}