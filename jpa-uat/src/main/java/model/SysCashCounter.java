package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SYS_CASH_COUNTER database table.
 * 
 */
@Entity
@Table(name="SYS_CASH_COUNTER")
@NamedQuery(name="SysCashCounter.findAll", query="SELECT s FROM SysCashCounter s")
public class SysCashCounter implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal balance;

	private BigDecimal br;

	private BigDecimal ccy;

	private String teller;

	public SysCashCounter() {
	}

	public BigDecimal getBalance() {
		return this.balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public BigDecimal getBr() {
		return this.br;
	}

	public void setBr(BigDecimal br) {
		this.br = br;
	}

	public BigDecimal getCcy() {
		return this.ccy;
	}

	public void setCcy(BigDecimal ccy) {
		this.ccy = ccy;
	}

	public String getTeller() {
		return this.teller;
	}

	public void setTeller(String teller) {
		this.teller = teller;
	}

}