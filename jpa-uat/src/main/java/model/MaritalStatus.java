package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the MARITAL_STATUS database table.
 * 
 */
@Entity
@Table(name="MARITAL_STATUS")
@NamedQuery(name="MaritalStatus.findAll", query="SELECT m FROM MaritalStatus m")
public class MaritalStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MS_ID")
	private long msId;

	@Column(name="CBC_CODE")
	private String cbcCode;

	private String deleted;

	private String description;

	public MaritalStatus() {
	}

	public long getMsId() {
		return this.msId;
	}

	public void setMsId(long msId) {
		this.msId = msId;
	}

	public String getCbcCode() {
		return this.cbcCode;
	}

	public void setCbcCode(String cbcCode) {
		this.cbcCode = cbcCode;
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