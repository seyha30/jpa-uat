package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CARDHOLDER_TRANX database table.
 * 
 */
@Entity
@Table(name="CARDHOLDER_TRANX")
@NamedQuery(name="CardholderTranx.findAll", query="SELECT c FROM CardholderTranx c")
public class CardholderTranx implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal ballance;

	@Column(name="CREDIT_CARD_N")
	private String creditCardN;

	private String dorc;

	@Column(name="PAYMENT_MODE")
	private String paymentMode;

	private String reverse;

	private String status;

	@Column(name="TRANSACTION_AMT")
	private BigDecimal transactionAmt;

	@Column(name="TRANSACTION_DATE")
	private Object transactionDate;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	@Column(name="UNCLEAR_BAL")
	private BigDecimal unclearBal;

	public CardholderTranx() {
	}

	public BigDecimal getBallance() {
		return this.ballance;
	}

	public void setBallance(BigDecimal ballance) {
		this.ballance = ballance;
	}

	public String getCreditCardN() {
		return this.creditCardN;
	}

	public void setCreditCardN(String creditCardN) {
		this.creditCardN = creditCardN;
	}

	public String getDorc() {
		return this.dorc;
	}

	public void setDorc(String dorc) {
		this.dorc = dorc;
	}

	public String getPaymentMode() {
		return this.paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getReverse() {
		return this.reverse;
	}

	public void setReverse(String reverse) {
		this.reverse = reverse;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getTransactionAmt() {
		return this.transactionAmt;
	}

	public void setTransactionAmt(BigDecimal transactionAmt) {
		this.transactionAmt = transactionAmt;
	}

	public Object getTransactionDate() {
		return this.transactionDate;
	}

	public void setTransactionDate(Object transactionDate) {
		this.transactionDate = transactionDate;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

	public BigDecimal getUnclearBal() {
		return this.unclearBal;
	}

	public void setUnclearBal(BigDecimal unclearBal) {
		this.unclearBal = unclearBal;
	}

}