package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CLVW_REPAYMENT_RATE_BY_CO database table.
 * 
 */
@Entity
@Table(name="CLVW_REPAYMENT_RATE_BY_CO")
@NamedQuery(name="ClvwRepaymentRateByCo.findAll", query="SELECT c FROM ClvwRepaymentRateByCo c")
public class ClvwRepaymentRateByCo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AMOUNT_DUE")
	private BigDecimal amountDue;

	@Column(name="AMT_PAID")
	private BigDecimal amtPaid;

	@Column(name="CO_CODE")
	private String coCode;

	@Column(name="REPAYMENT_RATE")
	private BigDecimal repaymentRate;

	public ClvwRepaymentRateByCo() {
	}

	public BigDecimal getAmountDue() {
		return this.amountDue;
	}

	public void setAmountDue(BigDecimal amountDue) {
		this.amountDue = amountDue;
	}

	public BigDecimal getAmtPaid() {
		return this.amtPaid;
	}

	public void setAmtPaid(BigDecimal amtPaid) {
		this.amtPaid = amtPaid;
	}

	public String getCoCode() {
		return this.coCode;
	}

	public void setCoCode(String coCode) {
		this.coCode = coCode;
	}

	public BigDecimal getRepaymentRate() {
		return this.repaymentRate;
	}

	public void setRepaymentRate(BigDecimal repaymentRate) {
		this.repaymentRate = repaymentRate;
	}

}