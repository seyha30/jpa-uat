package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the MINISTRY database table.
 * 
 */
@Entity
@NamedQuery(name="Ministry.findAll", query="SELECT m FROM Ministry m")
public class Ministry implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MINISTRY_ID")
	private long ministryId;

	private String deleted;

	@Column(name="MINISTRY_DESCRIPTION_EN")
	private String ministryDescriptionEn;

	@Column(name="MINISTRY_DESCRIPTION_KH")
	private String ministryDescriptionKh;

	public Ministry() {
	}

	public long getMinistryId() {
		return this.ministryId;
	}

	public void setMinistryId(long ministryId) {
		this.ministryId = ministryId;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getMinistryDescriptionEn() {
		return this.ministryDescriptionEn;
	}

	public void setMinistryDescriptionEn(String ministryDescriptionEn) {
		this.ministryDescriptionEn = ministryDescriptionEn;
	}

	public String getMinistryDescriptionKh() {
		return this.ministryDescriptionKh;
	}

	public void setMinistryDescriptionKh(String ministryDescriptionKh) {
		this.ministryDescriptionKh = ministryDescriptionKh;
	}

}