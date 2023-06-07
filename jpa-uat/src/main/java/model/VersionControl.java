package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the VERSION_CONTROL database table.
 * 
 */
@Entity
@Table(name="VERSION_CONTROL")
@NamedQuery(name="VersionControl.findAll", query="SELECT v FROM VersionControl v")
public class VersionControl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="DATE_DONE")
	private Object dateDone;

	private String deleted;

	private String description;

	@Column(name="DONE_BY")
	private String doneBy;

	@Column(name="VERSION_CODE")
	private String versionCode;

	@Column(name="VERSION_ID")
	private BigDecimal versionId;

	public VersionControl() {
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

	public String getVersionCode() {
		return this.versionCode;
	}

	public void setVersionCode(String versionCode) {
		this.versionCode = versionCode;
	}

	public BigDecimal getVersionId() {
		return this.versionId;
	}

	public void setVersionId(BigDecimal versionId) {
		this.versionId = versionId;
	}

}