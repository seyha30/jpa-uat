package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CHQ_TYPE database table.
 * 
 */
@Entity
@Table(name="CHQ_TYPE")
@NamedQuery(name="ChqType.findAll", query="SELECT c FROM ChqType c")
public class ChqType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CHQ_TYPE_ID")
	private long chqTypeId;

	private String deleted;

	private String description;

	public ChqType() {
	}

	public long getChqTypeId() {
		return this.chqTypeId;
	}

	public void setChqTypeId(long chqTypeId) {
		this.chqTypeId = chqTypeId;
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

}