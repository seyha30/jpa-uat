package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the M_STATUS database table.
 * 
 */
@Entity
@Table(name="M_STATUS")
@NamedQuery(name="MStatus.findAll", query="SELECT m FROM MStatus m")
public class MStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="DATE_DONE")
	private Object dateDone;

	private String deleted;

	@Column(name="DONE_BY")
	private String doneBy;

	@Column(name="M_STATUS_CODE")
	private String mStatusCode;

	@Column(name="M_STATUS_DESCRIPTION")
	private String mStatusDescription;

	@Column(name="M_STATUS_ID")
	private BigDecimal mStatusId;

	public MStatus() {
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

	public String getDoneBy() {
		return this.doneBy;
	}

	public void setDoneBy(String doneBy) {
		this.doneBy = doneBy;
	}

	public String getMStatusCode() {
		return this.mStatusCode;
	}

	public void setMStatusCode(String mStatusCode) {
		this.mStatusCode = mStatusCode;
	}

	public String getMStatusDescription() {
		return this.mStatusDescription;
	}

	public void setMStatusDescription(String mStatusDescription) {
		this.mStatusDescription = mStatusDescription;
	}

	public BigDecimal getMStatusId() {
		return this.mStatusId;
	}

	public void setMStatusId(BigDecimal mStatusId) {
		this.mStatusId = mStatusId;
	}

}