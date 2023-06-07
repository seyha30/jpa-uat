package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the BRANCHADJUST database table.
 * 
 */
@Entity
@NamedQuery(name="Branchadjust.findAll", query="SELECT b FROM Branchadjust b")
public class Branchadjust implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"ALIAS\"")
	private String alias;

	private BigDecimal amount;

	private String crac;

	private String crname;

	private String dbac;

	private String dbname;

	@Column(name="TRANX_DATE")
	private Object tranxDate;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	public Branchadjust() {
	}

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCrac() {
		return this.crac;
	}

	public void setCrac(String crac) {
		this.crac = crac;
	}

	public String getCrname() {
		return this.crname;
	}

	public void setCrname(String crname) {
		this.crname = crname;
	}

	public String getDbac() {
		return this.dbac;
	}

	public void setDbac(String dbac) {
		this.dbac = dbac;
	}

	public String getDbname() {
		return this.dbname;
	}

	public void setDbname(String dbname) {
		this.dbname = dbname;
	}

	public Object getTranxDate() {
		return this.tranxDate;
	}

	public void setTranxDate(Object tranxDate) {
		this.tranxDate = tranxDate;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

}