package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the COMMUNE database table.
 * 
 */
@Entity
@NamedQuery(name="Commune.findAll", query="SELECT c FROM Commune c")
public class Commune implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="COM_ID")
	private long comId;

	private String deleted;

	private String description;

	@Column(name="DIS_ID")
	private BigDecimal disId;

	public Commune() {
	}

	public long getComId() {
		return this.comId;
	}

	public void setComId(long comId) {
		this.comId = comId;
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

	public BigDecimal getDisId() {
		return this.disId;
	}

	public void setDisId(BigDecimal disId) {
		this.disId = disId;
	}

}