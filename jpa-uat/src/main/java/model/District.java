package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the DISTRICT database table.
 * 
 */
@Entity
@NamedQuery(name="District.findAll", query="SELECT d FROM District d")
public class District implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DIS_ID")
	private long disId;

	private String deleted;

	private String description;

	@Column(name="PRO_ID")
	private BigDecimal proId;

	public District() {
	}

	public long getDisId() {
		return this.disId;
	}

	public void setDisId(long disId) {
		this.disId = disId;
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

	public BigDecimal getProId() {
		return this.proId;
	}

	public void setProId(BigDecimal proId) {
		this.proId = proId;
	}

}