package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the WEB_CATEGORIES database table.
 * 
 */
@Entity
@Table(name="WEB_CATEGORIES")
@NamedQuery(name="WebCategory.findAll", query="SELECT w FROM WebCategory w")
public class WebCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	private String description;

	private BigDecimal id;

	private BigDecimal maincategoryid;

	private String name;

	public WebCategory() {
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

	public BigDecimal getMaincategoryid() {
		return this.maincategoryid;
	}

	public void setMaincategoryid(BigDecimal maincategoryid) {
		this.maincategoryid = maincategoryid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}