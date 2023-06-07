package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CUST_SPECIAL database table.
 * 
 */
@Entity
@Table(name="CUST_SPECIAL")
@NamedQuery(name="CustSpecial.findAll", query="SELECT c FROM CustSpecial c")
public class CustSpecial implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal custacctid;

	@Column(name="INT_RATE")
	private BigDecimal intRate;

	@Column(name="LAST_ACCRUED_DATE")
	private Object lastAccruedDate;

	public CustSpecial() {
	}

	public BigDecimal getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(BigDecimal custacctid) {
		this.custacctid = custacctid;
	}

	public BigDecimal getIntRate() {
		return this.intRate;
	}

	public void setIntRate(BigDecimal intRate) {
		this.intRate = intRate;
	}

	public Object getLastAccruedDate() {
		return this.lastAccruedDate;
	}

	public void setLastAccruedDate(Object lastAccruedDate) {
		this.lastAccruedDate = lastAccruedDate;
	}

}