package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the TRANX_CHART database table.
 * 
 */
@Embeddable
public class TranxChartPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="TT_ID", insertable=false, updatable=false)
	private long ttId;

	@Column(name="ACCT_ID")
	private long acctId;

	private String dorc;

	public TranxChartPK() {
	}
	public long getTtId() {
		return this.ttId;
	}
	public void setTtId(long ttId) {
		this.ttId = ttId;
	}
	public long getAcctId() {
		return this.acctId;
	}
	public void setAcctId(long acctId) {
		this.acctId = acctId;
	}
	public String getDorc() {
		return this.dorc;
	}
	public void setDorc(String dorc) {
		this.dorc = dorc;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TranxChartPK)) {
			return false;
		}
		TranxChartPK castOther = (TranxChartPK)other;
		return 
			(this.ttId == castOther.ttId)
			&& (this.acctId == castOther.acctId)
			&& this.dorc.equals(castOther.dorc);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.ttId ^ (this.ttId >>> 32)));
		hash = hash * prime + ((int) (this.acctId ^ (this.acctId >>> 32)));
		hash = hash * prime + this.dorc.hashCode();
		
		return hash;
	}
}