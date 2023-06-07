package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CYCLE_AMOUNT database table.
 * 
 */
@Entity
@Table(name="CYCLE_AMOUNT")
@NamedQuery(name="CycleAmount.findAll", query="SELECT c FROM CycleAmount c")
public class CycleAmount implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AMOUNT_MAX")
	private BigDecimal amountMax;

	@Column(name="AMOUNT_MIN")
	private BigDecimal amountMin;

	@Column(name="CYCLE_ID")
	private BigDecimal cycleId;

	private String deleted;

	private BigDecimal tnumber;

	public CycleAmount() {
	}

	public BigDecimal getAmountMax() {
		return this.amountMax;
	}

	public void setAmountMax(BigDecimal amountMax) {
		this.amountMax = amountMax;
	}

	public BigDecimal getAmountMin() {
		return this.amountMin;
	}

	public void setAmountMin(BigDecimal amountMin) {
		this.amountMin = amountMin;
	}

	public BigDecimal getCycleId() {
		return this.cycleId;
	}

	public void setCycleId(BigDecimal cycleId) {
		this.cycleId = cycleId;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public BigDecimal getTnumber() {
		return this.tnumber;
	}

	public void setTnumber(BigDecimal tnumber) {
		this.tnumber = tnumber;
	}

}