package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TMP_OVERDRAFT database table.
 * 
 */
@Entity
@Table(name="TMP_OVERDRAFT")
@NamedQuery(name="TmpOverdraft.findAll", query="SELECT t FROM TmpOverdraft t")
public class TmpOverdraft implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal amount;

	private BigDecimal balance;

	private BigDecimal custacctid;

	private BigDecimal prebalance;

	public TmpOverdraft() {
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

	public BigDecimal getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(BigDecimal custacctid) {
		this.custacctid = custacctid;
	}

	public BigDecimal getPrebalance() {
		return this.prebalance;
	}

	public void setPrebalance(BigDecimal prebalance) {
		this.prebalance = prebalance;
	}

}