package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the LC_ACCEPTANCE_BILL database table.
 * 
 */
@Entity
@Table(name="LC_ACCEPTANCE_BILL")
@NamedQuery(name="LcAcceptanceBill.findAll", query="SELECT l FROM LcAcceptanceBill l")
public class LcAcceptanceBill implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AB_AMOUNT_PAID")
	private double abAmountPaid;

	@Column(name="AB_ID")
	private String abId;

	@Column(name="LC_REF_NO")
	private String lcRefNo;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	public LcAcceptanceBill() {
	}

	public double getAbAmountPaid() {
		return this.abAmountPaid;
	}

	public void setAbAmountPaid(double abAmountPaid) {
		this.abAmountPaid = abAmountPaid;
	}

	public String getAbId() {
		return this.abId;
	}

	public void setAbId(String abId) {
		this.abId = abId;
	}

	public String getLcRefNo() {
		return this.lcRefNo;
	}

	public void setLcRefNo(String lcRefNo) {
		this.lcRefNo = lcRefNo;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

}