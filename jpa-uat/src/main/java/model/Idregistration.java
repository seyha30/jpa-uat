package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the IDREGISTRATION database table.
 * 
 */
@Entity
@NamedQuery(name="Idregistration.findAll", query="SELECT i FROM Idregistration i")
public class Idregistration implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="REG_ID")
	private long regId;

	private String deleted;

	@Column(name="ID_CODE")
	private String idCode;

	@Column(name="REG_DESCRIPTION")
	private String regDescription;

	public Idregistration() {
	}

	public long getRegId() {
		return this.regId;
	}

	public void setRegId(long regId) {
		this.regId = regId;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getIdCode() {
		return this.idCode;
	}

	public void setIdCode(String idCode) {
		this.idCode = idCode;
	}

	public String getRegDescription() {
		return this.regDescription;
	}

	public void setRegDescription(String regDescription) {
		this.regDescription = regDescription;
	}

}