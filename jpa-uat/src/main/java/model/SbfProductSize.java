package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SBF_PRODUCT_SIZE database table.
 * 
 */
@Entity
@Table(name="SBF_PRODUCT_SIZE")
@NamedQuery(name="SbfProductSize.findAll", query="SELECT s FROM SbfProductSize s")
public class SbfProductSize implements Serializable {
	private static final long serialVersionUID = 1L;

	private String description;

	private BigDecimal id;

	public SbfProductSize() {
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

}