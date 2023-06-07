package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the NATIONALITY database table.
 * 
 */
@Entity
@NamedQuery(name="Nationality.findAll", query="SELECT n FROM Nationality n")
public class Nationality implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String code;

	private String deleted;

	private String description;

	private String descriptionkh;

	public Nationality() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public String getDescriptionkh() {
		return this.descriptionkh;
	}

	public void setDescriptionkh(String descriptionkh) {
		this.descriptionkh = descriptionkh;
	}

}