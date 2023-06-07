package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the REPORT_SETUP database table.
 * 
 */
@Entity
@Table(name="REPORT_SETUP")
@NamedQuery(name="ReportSetup.findAll", query="SELECT r FROM ReportSetup r")
public class ReportSetup implements Serializable {
	private static final long serialVersionUID = 1L;

	private String description;

	private String formula1;

	private String formula10;

	private String formula2;

	private String formula3;

	private String formula4;

	private String formula5;

	private String formula6;

	private String formula7;

	private String formula8;

	private String formula9;

	@Column(name="\"LINENO\"")
	private BigDecimal lineno;

	@Column(name="REPORT_ID")
	private BigDecimal reportId;

	@Column(name="TITLE_FORMULA")
	private String titleFormula;

	public ReportSetup() {
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFormula1() {
		return this.formula1;
	}

	public void setFormula1(String formula1) {
		this.formula1 = formula1;
	}

	public String getFormula10() {
		return this.formula10;
	}

	public void setFormula10(String formula10) {
		this.formula10 = formula10;
	}

	public String getFormula2() {
		return this.formula2;
	}

	public void setFormula2(String formula2) {
		this.formula2 = formula2;
	}

	public String getFormula3() {
		return this.formula3;
	}

	public void setFormula3(String formula3) {
		this.formula3 = formula3;
	}

	public String getFormula4() {
		return this.formula4;
	}

	public void setFormula4(String formula4) {
		this.formula4 = formula4;
	}

	public String getFormula5() {
		return this.formula5;
	}

	public void setFormula5(String formula5) {
		this.formula5 = formula5;
	}

	public String getFormula6() {
		return this.formula6;
	}

	public void setFormula6(String formula6) {
		this.formula6 = formula6;
	}

	public String getFormula7() {
		return this.formula7;
	}

	public void setFormula7(String formula7) {
		this.formula7 = formula7;
	}

	public String getFormula8() {
		return this.formula8;
	}

	public void setFormula8(String formula8) {
		this.formula8 = formula8;
	}

	public String getFormula9() {
		return this.formula9;
	}

	public void setFormula9(String formula9) {
		this.formula9 = formula9;
	}

	public BigDecimal getLineno() {
		return this.lineno;
	}

	public void setLineno(BigDecimal lineno) {
		this.lineno = lineno;
	}

	public BigDecimal getReportId() {
		return this.reportId;
	}

	public void setReportId(BigDecimal reportId) {
		this.reportId = reportId;
	}

	public String getTitleFormula() {
		return this.titleFormula;
	}

	public void setTitleFormula(String titleFormula) {
		this.titleFormula = titleFormula;
	}

}