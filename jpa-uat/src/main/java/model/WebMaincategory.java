package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the WEB_MAINCATEGORIES database table.
 * 
 */
@Entity
@Table(name="WEB_MAINCATEGORIES")
@NamedQuery(name="WebMaincategory.findAll", query="SELECT w FROM WebMaincategory w")
public class WebMaincategory implements Serializable {
	private static final long serialVersionUID = 1L;

	private String description;

	private BigDecimal id;

	private String name;

	public WebMaincategory() {
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}