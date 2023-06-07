package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the COMPANY_TYPE database table.
 * 
 */
@Entity
@Table(name="COMPANY_TYPE")
@NamedQuery(name="CompanyType.findAll", query="SELECT c FROM CompanyType c")
public class CompanyType implements Serializable {
	private static final long serialVersionUID = 1L;

	private String code;

	private String description;

	public CompanyType() {
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}