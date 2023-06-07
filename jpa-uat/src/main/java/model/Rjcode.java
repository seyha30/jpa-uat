package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the RJCODE database table.
 * 
 */
@Entity
@NamedQuery(name="Rjcode.findAll", query="SELECT r FROM Rjcode r")
public class Rjcode implements Serializable {
	private static final long serialVersionUID = 1L;

	private String code;

	private String descr;

	private BigDecimal id;

	public Rjcode() {
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

}