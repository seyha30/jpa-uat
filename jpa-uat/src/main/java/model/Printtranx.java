package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the PRINTTRANX database table.
 * 
 */
@Entity
@NamedQuery(name="Printtranx.findAll", query="SELECT p FROM Printtranx p")
public class Printtranx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TRANX_ID")
	private long tranxId;

	private BigDecimal amount;

	private BigDecimal bal;

	@Column(name="CUST_TRANX")
	private BigDecimal custTranx;

	@Column(name="DATE_DONE")
	private String dateDone;

	private String dorc;

	public Printtranx() {
	}

	public long getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(long tranxId) {
		this.tranxId = tranxId;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getBal() {
		return this.bal;
	}

	public void setBal(BigDecimal bal) {
		this.bal = bal;
	}

	public BigDecimal getCustTranx() {
		return this.custTranx;
	}

	public void setCustTranx(BigDecimal custTranx) {
		this.custTranx = custTranx;
	}

	public String getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(String dateDone) {
		this.dateDone = dateDone;
	}

	public String getDorc() {
		return this.dorc;
	}

	public void setDorc(String dorc) {
		this.dorc = dorc;
	}

}