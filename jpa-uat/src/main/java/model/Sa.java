package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the SA database table.
 * 
 */
@Entity
@NamedQuery(name="Sa.findAll", query="SELECT s FROM Sa s")
public class Sa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long custacctid;

	@Column(name="INT_RATE")
	private BigDecimal intRate;

	@Column(name="LAST_ACCRUED_DATE")
	private Object lastAccruedDate;

	@Column(name="LAST_PENDING_DATE")
	private Object lastPendingDate;

	private BigDecimal totaccint;

	//bi-directional many-to-one association to Passbook
	@OneToMany(mappedBy="sa")
	private List<Passbook> passbooks;

	public Sa() {
	}

	public long getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(long custacctid) {
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

	public Object getLastPendingDate() {
		return this.lastPendingDate;
	}

	public void setLastPendingDate(Object lastPendingDate) {
		this.lastPendingDate = lastPendingDate;
	}

	public BigDecimal getTotaccint() {
		return this.totaccint;
	}

	public void setTotaccint(BigDecimal totaccint) {
		this.totaccint = totaccint;
	}

	public List<Passbook> getPassbooks() {
		return this.passbooks;
	}

	public void setPassbooks(List<Passbook> passbooks) {
		this.passbooks = passbooks;
	}

	public Passbook addPassbook(Passbook passbook) {
		getPassbooks().add(passbook);
		passbook.setSa(this);

		return passbook;
	}

	public Passbook removePassbook(Passbook passbook) {
		getPassbooks().remove(passbook);
		passbook.setSa(null);

		return passbook;
	}

}