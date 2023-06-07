package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the CA database table.
 * 
 */
@Entity
@NamedQuery(name="Ca.findAll", query="SELECT c FROM Ca c")
public class Ca implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long custacctid;

	@Column(name="HOLD_AMT")
	private BigDecimal holdAmt;

	@Column(name="LAST_ACCRUED_DATE")
	private Object lastAccruedDate;

	@Column(name="LAST_PENDING_DATE")
	private Object lastPendingDate;

	//bi-directional many-to-one association to Chq
	@OneToMany(mappedBy="ca")
	private List<Chq> chqs;

	public Ca() {
	}

	public long getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(long custacctid) {
		this.custacctid = custacctid;
	}

	public BigDecimal getHoldAmt() {
		return this.holdAmt;
	}

	public void setHoldAmt(BigDecimal holdAmt) {
		this.holdAmt = holdAmt;
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

	public List<Chq> getChqs() {
		return this.chqs;
	}

	public void setChqs(List<Chq> chqs) {
		this.chqs = chqs;
	}

	public Chq addChq(Chq chq) {
		getChqs().add(chq);
		chq.setCa(this);

		return chq;
	}

	public Chq removeChq(Chq chq) {
		getChqs().remove(chq);
		chq.setCa(null);

		return chq;
	}

}