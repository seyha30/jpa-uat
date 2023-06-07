package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the VILLAGE database table.
 * 
 */
@Entity
@NamedQuery(name="Village.findAll", query="SELECT v FROM Village v")
public class Village implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="VIL_ID")
	private long vilId;

	@Column(name="COM_ID")
	private BigDecimal comId;

	private String deleted;

	private String description;

	public Village() {
	}

	public long getVilId() {
		return this.vilId;
	}

	public void setVilId(long vilId) {
		this.vilId = vilId;
	}

	public BigDecimal getComId() {
		return this.comId;
	}

	public void setComId(BigDecimal comId) {
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

}