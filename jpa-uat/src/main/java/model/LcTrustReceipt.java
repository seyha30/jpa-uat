package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the LC_TRUST_RECEIPT database table.
 * 
 */
@Entity
@Table(name="LC_TRUST_RECEIPT")
@NamedQuery(name="LcTrustReceipt.findAll", query="SELECT l FROM LcTrustReceipt l")
public class LcTrustReceipt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="LC_REF_NO")
	private String lcRefNo;

	@Column(name="TR_AMOUNT")
	private double trAmount;

	@Column(name="TR_AMOUNT_DUE")
	private double trAmountDue;

	@Column(name="TR_ID")
	private String trId;

	@Column(name="TR_MATURITY_DATE")
	private Object trMaturityDate;

	@Column(name="TR_RATE_CHARGE")
	private BigDecimal trRateCharge;

	@Column(name="TR_VALUE_DATE")
	private Object trValueDate;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	public LcTrustReceipt() {
	}

	public String getLcRefNo() {
		return this.lcRefNo;
	}

	public void setLcRefNo(String lcRefNo) {
		this.lcRefNo = lcRefNo;
	}

	public double getTrAmount() {
		return this.trAmount;
	}

	public void setTrAmount(double trAmount) {
		this.trAmount = trAmount;
	}

	public double getTrAmountDue() {
		return this.trAmountDue;
	}

	public void setTrAmountDue(double trAmountDue) {
		this.trAmountDue = trAmountDue;
	}

	public String getTrId() {
		return this.trId;
	}

	public void setTrId(String trId) {
		this.trId = trId;
	}

	public Object getTrMaturityDate() {
		return this.trMaturityDate;
	}

	public void setTrMaturityDate(Object trMaturityDate) {
		this.trMaturityDate = trMaturityDate;
	}

	public BigDecimal getTrRateCharge() {
		return this.trRateCharge;
	}

	public void setTrRateCharge(BigDecimal trRateCharge) {
		this.trRateCharge = trRateCharge;
	}

	public Object getTrValueDate() {
		return this.trValueDate;
	}

	public void setTrValueDate(Object trValueDate) {
		this.trValueDate = trValueDate;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

}