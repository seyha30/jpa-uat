package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TMPDAILYGLACC database table.
 * 
 */
@Entity
@NamedQuery(name="Tmpdailyglacc.findAll", query="SELECT t FROM Tmpdailyglacc t")
public class Tmpdailyglacc implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal balamtcr;

	private BigDecimal balamtdr;

	private String code;

	private BigDecimal curamtcr;

	private BigDecimal curamtdr;

	private String description;

	private BigDecimal id;

	private BigDecimal preamtcr;

	private BigDecimal preamtdr;

	public Tmpdailyglacc() {
	}

	public BigDecimal getBalamtcr() {
		return this.balamtcr;
	}

	public void setBalamtcr(BigDecimal balamtcr) {
		this.balamtcr = balamtcr;
	}

	public BigDecimal getBalamtdr() {
		return this.balamtdr;
	}

	public void setBalamtdr(BigDecimal balamtdr) {
		this.balamtdr = balamtdr;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public BigDecimal getCuramtcr() {
		return this.curamtcr;
	}

	public void setCuramtcr(BigDecimal curamtcr) {
		this.curamtcr = curamtcr;
	}

	public BigDecimal getCuramtdr() {
		return this.curamtdr;
	}

	public void setCuramtdr(BigDecimal curamtdr) {
		this.curamtdr = curamtdr;
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

	public BigDecimal getPreamtcr() {
		return this.preamtcr;
	}

	public void setPreamtcr(BigDecimal preamtcr) {
		this.preamtcr = preamtcr;
	}

	public BigDecimal getPreamtdr() {
		return this.preamtdr;
	}

	public void setPreamtdr(BigDecimal preamtdr) {
		this.preamtdr = preamtdr;
	}

}