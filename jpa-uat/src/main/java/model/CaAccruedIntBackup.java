package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CA_ACCRUED_INT_BACKUP database table.
 * 
 */
@Entity
@Table(name="CA_ACCRUED_INT_BACKUP")
@NamedQuery(name="CaAccruedIntBackup.findAll", query="SELECT c FROM CaAccruedIntBackup c")
public class CaAccruedIntBackup implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal amount;

	private BigDecimal bal;

	private BigDecimal custacctid;

	@Column(name="LAST_DATE")
	private Object lastDate;

	private BigDecimal prebal;

	private String settled;

	public CaAccruedIntBackup() {
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

	public BigDecimal getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(BigDecimal custacctid) {
		this.custacctid = custacctid;
	}

	public Object getLastDate() {
		return this.lastDate;
	}

	public void setLastDate(Object lastDate) {
		this.lastDate = lastDate;
	}

	public BigDecimal getPrebal() {
		return this.prebal;
	}

	public void setPrebal(BigDecimal prebal) {
		this.prebal = prebal;
	}

	public String getSettled() {
		return this.settled;
	}

	public void setSettled(String settled) {
		this.settled = settled;
	}

}