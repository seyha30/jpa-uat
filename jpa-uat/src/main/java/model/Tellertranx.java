package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TELLERTRANX database table.
 * 
 */
@Entity
@NamedQuery(name="Tellertranx.findAll", query="SELECT t FROM Tellertranx t")
public class Tellertranx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long recnum;

	private BigDecimal amount;

	private BigDecimal balance;

	private String custacno;

	private String description;

	private String dorc;

	private String override;

	private String tellername;

	private String tellerno;

	private BigDecimal tranxno;

	private String tranxtime;

	public Tellertranx() {
	}

	public long getRecnum() {
		return this.recnum;
	}

	public void setRecnum(long recnum) {
		this.recnum = recnum;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getBalance() {
		return this.balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public String getCustacno() {
		return this.custacno;
	}

	public void setCustacno(String custacno) {
		this.custacno = custacno;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDorc() {
		return this.dorc;
	}

	public void setDorc(String dorc) {
		this.dorc = dorc;
	}

	public String getOverride() {
		return this.override;
	}

	public void setOverride(String override) {
		this.override = override;
	}

	public String getTellername() {
		return this.tellername;
	}

	public void setTellername(String tellername) {
		this.tellername = tellername;
	}

	public String getTellerno() {
		return this.tellerno;
	}

	public void setTellerno(String tellerno) {
		this.tellerno = tellerno;
	}

	public BigDecimal getTranxno() {
		return this.tranxno;
	}

	public void setTranxno(BigDecimal tranxno) {
		this.tranxno = tranxno;
	}

	public String getTranxtime() {
		return this.tranxtime;
	}

	public void setTranxtime(String tranxtime) {
		this.tranxtime = tranxtime;
	}

}