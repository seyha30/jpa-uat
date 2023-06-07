package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the AUTOTRANSFER database table.
 * 
 */
@Entity
@NamedQuery(name="Autotransfer.findAll", query="SELECT a FROM Autotransfer a")
public class Autotransfer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"ALIAS\"")
	private String alias;

	@Column(name="CR_ACNO")
	private String crAcno;

	@Column(name="CR_AMOUNT")
	private BigDecimal crAmount;

	@Column(name="CR_CCY")
	private String crCcy;

	@Column(name="CR_NAME")
	private String crName;

	private String description;

	@Column(name="DR_ACNO")
	private String drAcno;

	@Column(name="DR_AMOUNT")
	private BigDecimal drAmount;

	@Column(name="DR_CCY")
	private String drCcy;

	@Column(name="DR_NAME")
	private String drName;

	@Column(name="TRANX_DATE")
	private String tranxDate;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	public Autotransfer() {
	}

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getCrAcno() {
		return this.crAcno;
	}

	public void setCrAcno(String crAcno) {
		this.crAcno = crAcno;
	}

	public BigDecimal getCrAmount() {
		return this.crAmount;
	}

	public void setCrAmount(BigDecimal crAmount) {
		this.crAmount = crAmount;
	}

	public String getCrCcy() {
		return this.crCcy;
	}

	public void setCrCcy(String crCcy) {
		this.crCcy = crCcy;
	}

	public String getCrName() {
		return this.crName;
	}

	public void setCrName(String crName) {
		this.crName = crName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDrAcno() {
		return this.drAcno;
	}

	public void setDrAcno(String drAcno) {
		this.drAcno = drAcno;
	}

	public BigDecimal getDrAmount() {
		return this.drAmount;
	}

	public void setDrAmount(BigDecimal drAmount) {
		this.drAmount = drAmount;
	}

	public String getDrCcy() {
		return this.drCcy;
	}

	public void setDrCcy(String drCcy) {
		this.drCcy = drCcy;
	}

	public String getDrName() {
		return this.drName;
	}

	public void setDrName(String drName) {
		this.drName = drName;
	}

	public String getTranxDate() {
		return this.tranxDate;
	}

	public void setTranxDate(String tranxDate) {
		this.tranxDate = tranxDate;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

}