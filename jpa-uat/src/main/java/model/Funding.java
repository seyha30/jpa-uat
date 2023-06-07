package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FUNDING database table.
 * 
 */
@Entity
@NamedQuery(name="Funding.findAll", query="SELECT f FROM Funding f")
public class Funding implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="FUN_ID")
	private long funId;

	private BigDecimal amount;

	@Column(name="BEGIN_DATE")
	private Object beginDate;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	private String deleted;

	@Column(name="END_DATE")
	private Object endDate;

	private String name;

	public Funding() {
	}

	public long getFunId() {
		return this.funId;
	}

	public void setFunId(long funId) {
		this.funId = funId;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Object getBeginDate() {
		return this.beginDate;
	}

	public void setBeginDate(Object beginDate) {
		this.beginDate = beginDate;
	}

	public BigDecimal getCurrId() {
		return this.currId;
	}

	public void setCurrId(BigDecimal currId) {
		this.currId = currId;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public Object getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Object endDate) {
		this.endDate = endDate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}