package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the LIQTITEL database table.
 * 
 */
@Entity
@NamedQuery(name="Liqtitel.findAll", query="SELECT l FROM Liqtitel l")
public class Liqtitel implements Serializable {
	private static final long serialVersionUID = 1L;

	private String description;

	@Column(name="LIQ_ID")
	private BigDecimal liqId;

	public Liqtitel() {
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getLiqId() {
		return this.liqId;
	}

	public void setLiqId(BigDecimal liqId) {
		this.liqId = liqId;
	}

}