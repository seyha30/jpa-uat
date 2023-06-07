package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the PROVINCE database table.
 * 
 */
@Entity
@NamedQuery(name="Province.findAll", query="SELECT p FROM Province p")
public class Province implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PRO_ID")
	private long proId;

	@Column(name="CTRY_ID")
	private BigDecimal ctryId;

	private String deleted;

	private String description;

	public Province() {
	}

	public long getProId() {
		return this.proId;
	}

	public void setProId(long proId) {
		this.proId = proId;
	}

	public BigDecimal getCtryId() {
		return this.ctryId;
	}

	public void setCtryId(BigDecimal ctryId) {
		this.ctryId = ctryId;
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

}