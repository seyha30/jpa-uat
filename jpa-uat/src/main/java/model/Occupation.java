package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the OCCUPATION database table.
 * 
 */
@Entity
@NamedQuery(name="Occupation.findAll", query="SELECT o FROM Occupation o")
public class Occupation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String description;

	@Column(name="DESCRIPTION_KH")
	private String descriptionKh;

	public Occupation() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescriptionKh() {
		return this.descriptionKh;
	}

	public void setDescriptionKh(String descriptionKh) {
		this.descriptionKh = descriptionKh;
	}

}