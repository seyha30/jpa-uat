package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the INITIAL_GL database table.
 * 
 */
@Entity
@Table(name="INITIAL_GL")
@NamedQuery(name="InitialGl.findAll", query="SELECT i FROM InitialGl i")
public class InitialGl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ACCT_ID")
	private long acctId;

	private BigDecimal amount;

	private String description;

	private String dorc;

	private String name;

	private String taken;

	public InitialGl() {
	}

	public long getAcctId() {
		return this.acctId;
	}

	public void setAcctId(long acctId) {
		this.acctId = acctId;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTaken() {
		return this.taken;
	}

	public void setTaken(String taken) {
		this.taken = taken;
	}

}