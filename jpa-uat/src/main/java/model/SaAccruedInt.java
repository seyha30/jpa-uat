package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SA_ACCRUED_INT database table.
 * 
 */
@Entity
@Table(name="SA_ACCRUED_INT")
@NamedQuery(name="SaAccruedInt.findAll", query="SELECT s FROM SaAccruedInt s")
public class SaAccruedInt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCRUED_DATE")
	private Object accruedDate;

	private BigDecimal amount;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	private String settled;

	public SaAccruedInt() {
	}

	public Object getAccruedDate() {
		return this.accruedDate;
	}

	public void setAccruedDate(Object accruedDate) {
		this.accruedDate = accruedDate;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getCurrId() {
		return this.currId;
	}

	public void setCurrId(BigDecimal currId) {
		this.currId = currId;
	}

	public String getSettled() {
		return this.settled;
	}

	public void setSettled(String settled) {
		this.settled = settled;
	}

}