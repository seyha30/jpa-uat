package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the MONTHLY_EXCHANGE_RATE database table.
 * 
 */
@Entity
@Table(name="MONTHLY_EXCHANGE_RATE")
@NamedQuery(name="MonthlyExchangeRate.findAll", query="SELECT m FROM MonthlyExchangeRate m")
public class MonthlyExchangeRate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="BUY_RATE")
	private BigDecimal buyRate;

	private String ccy;

	@Column(name="FM_DATE")
	private Object fmDate;

	private BigDecimal id;

	@Column(name="MID_RATE")
	private BigDecimal midRate;

	@Column(name="SALE_RATE")
	private BigDecimal saleRate;

	private String status;

	public MonthlyExchangeRate() {
	}

	public BigDecimal getBuyRate() {
		return this.buyRate;
	}

	public void setBuyRate(BigDecimal buyRate) {
		this.buyRate = buyRate;
	}

	public String getCcy() {
		return this.ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public Object getFmDate() {
		return this.fmDate;
	}

	public void setFmDate(Object fmDate) {
		this.fmDate = fmDate;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public BigDecimal getMidRate() {
		return this.midRate;
	}

	public void setMidRate(BigDecimal midRate) {
		this.midRate = midRate;
	}

	public BigDecimal getSaleRate() {
		return this.saleRate;
	}

	public void setSaleRate(BigDecimal saleRate) {
		this.saleRate = saleRate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}