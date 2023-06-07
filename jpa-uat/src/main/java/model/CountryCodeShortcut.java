package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the COUNTRY_CODE_SHORTCUT database table.
 * 
 */
@Entity
@Table(name="COUNTRY_CODE_SHORTCUT")
@NamedQuery(name="CountryCodeShortcut.findAll", query="SELECT c FROM CountryCodeShortcut c")
public class CountryCodeShortcut implements Serializable {
	private static final long serialVersionUID = 1L;

	private String code;

	@Column(name="CTRY_ID")
	private BigDecimal ctryId;

	private BigDecimal id;

	public CountryCodeShortcut() {
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public BigDecimal getCtryId() {
		return this.ctryId;
	}

	public void setCtryId(BigDecimal ctryId) {
		this.ctryId = ctryId;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

}