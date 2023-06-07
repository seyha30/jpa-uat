package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the BACKUP_CHQ database table.
 * 
 */
@Embeddable
public class BackupChqPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String sno;

	private long custacctid;

	public BackupChqPK() {
	}
	public String getSno() {
		return this.sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public long getCustacctid() {
		return this.custacctid;
	}
	public void setCustacctid(long custacctid) {
		this.custacctid = custacctid;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof BackupChqPK)) {
			return false;
		}
		BackupChqPK castOther = (BackupChqPK)other;
		return 
			this.sno.equals(castOther.sno)
			&& (this.custacctid == castOther.custacctid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.sno.hashCode();
		hash = hash * prime + ((int) (this.custacctid ^ (this.custacctid >>> 32)));
		
		return hash;
	}
}