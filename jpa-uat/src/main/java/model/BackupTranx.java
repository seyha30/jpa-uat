package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the BACKUP_TRANX database table.
 * 
 */
@Entity
@Table(name="BACKUP_TRANX")
@NamedQuery(name="BackupTranx.findAll", query="SELECT b FROM BackupTranx b")
public class BackupTranx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TRANX_ID")
	private long tranxId;

	@Column(name="DATE_DONE")
	private Object dateDone;

	private String deleted;

	private String description;

	@Column(name="DONE_BY")
	private String doneBy;

	private String reverse;

	@Column(name="TT_ID")
	private BigDecimal ttId;

	public BackupTranx() {
	}

	public long getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(long tranxId) {
		this.tranxId = tranxId;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDoneBy() {
		return this.doneBy;
	}

	public void setDoneBy(String doneBy) {
		this.doneBy = doneBy;
	}

	public String getReverse() {
		return this.reverse;
	}

	public void setReverse(String reverse) {
		this.reverse = reverse;
	}

	public BigDecimal getTtId() {
		return this.ttId;
	}

	public void setTtId(BigDecimal ttId) {
		this.ttId = ttId;
	}

}