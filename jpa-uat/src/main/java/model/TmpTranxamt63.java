package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TMP_TRANXAMT63 database table.
 * 
 */
@Entity
@Table(name="TMP_TRANXAMT63")
@NamedQuery(name="TmpTranxamt63.findAll", query="SELECT t FROM TmpTranxamt63 t")
public class TmpTranxamt63 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CASH_TRANX")
	private BigDecimal cashTranx;

	@Column(name="CUST_TRANX")
	private BigDecimal custTranx;

	@Column(name="GL_TRANX")
	private BigDecimal glTranx;

	@Column(name="TRANX_DATE")
	private Object tranxDate;

	public TmpTranxamt63() {
	}

	public BigDecimal getCashTranx() {
		return this.cashTranx;
	}

	public void setCashTranx(BigDecimal cashTranx) {
		this.cashTranx = cashTranx;
	}

	public BigDecimal getCustTranx() {
		return this.custTranx;
	}

	public void setCustTranx(BigDecimal custTranx) {
		this.custTranx = custTranx;
	}

	public BigDecimal getGlTranx() {
		return this.glTranx;
	}

	public void setGlTranx(BigDecimal glTranx) {
		this.glTranx = glTranx;
	}

	public Object getTranxDate() {
		return this.tranxDate;
	}

	public void setTranxDate(Object tranxDate) {
		this.tranxDate = tranxDate;
	}

}