package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SBF_PECIALIZE database table.
 * 
 */
@Entity
@Table(name="SBF_PECIALIZE")
@NamedQuery(name="SbfPecialize.findAll", query="SELECT s FROM SbfPecialize s")
public class SbfPecialize implements Serializable {
	private static final long serialVersionUID = 1L;

	private String description;

	@Column(name="PAR_RATE")
	private BigDecimal parRate;

	@Column(name="SPECIALIZE_CODE")
	private BigDecimal specializeCode;

	public SbfPecialize() {
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getParRate() {
		return this.parRate;
	}

	public void setParRate(BigDecimal parRate) {
		this.parRate = parRate;
	}

	public BigDecimal getSpecializeCode() {
		return this.specializeCode;
	}

	public void setSpecializeCode(BigDecimal specializeCode) {
		this.specializeCode = specializeCode;
	}

}