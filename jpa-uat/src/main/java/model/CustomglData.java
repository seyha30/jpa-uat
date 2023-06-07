package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CUSTOMGL_DATA database table.
 * 
 */
@Entity
@Table(name="CUSTOMGL_DATA")
@NamedQuery(name="CustomglData.findAll", query="SELECT c FROM CustomglData c")
public class CustomglData implements Serializable {
	private static final long serialVersionUID = 1L;

	private String bal1;

	private String bal10;

	private String bal2;

	private String bal3;

	private String bal4;

	private String bal5;

	private String bal6;

	private String bal7;

	private String bal8;

	private String bal9;

	private String description;

	@Column(name="\"LINENO\"")
	private BigDecimal lineno;

	public CustomglData() {
	}

	public String getBal1() {
		return this.bal1;
	}

	public void setBal1(String bal1) {
		this.bal1 = bal1;
	}

	public String getBal10() {
		return this.bal10;
	}

	public void setBal10(String bal10) {
		this.bal10 = bal10;
	}

	public String getBal2() {
		return this.bal2;
	}

	public void setBal2(String bal2) {
		this.bal2 = bal2;
	}

	public String getBal3() {
		return this.bal3;
	}

	public void setBal3(String bal3) {
		this.bal3 = bal3;
	}

	public String getBal4() {
		return this.bal4;
	}

	public void setBal4(String bal4) {
		this.bal4 = bal4;
	}

	public String getBal5() {
		return this.bal5;
	}

	public void setBal5(String bal5) {
		this.bal5 = bal5;
	}

	public String getBal6() {
		return this.bal6;
	}

	public void setBal6(String bal6) {
		this.bal6 = bal6;
	}

	public String getBal7() {
		return this.bal7;
	}

	public void setBal7(String bal7) {
		this.bal7 = bal7;
	}

	public String getBal8() {
		return this.bal8;
	}

	public void setBal8(String bal8) {
		this.bal8 = bal8;
	}

	public String getBal9() {
		return this.bal9;
	}

	public void setBal9(String bal9) {
		this.bal9 = bal9;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getLineno() {
		return this.lineno;
	}

	public void setLineno(BigDecimal lineno) {
		this.lineno = lineno;
	}

}