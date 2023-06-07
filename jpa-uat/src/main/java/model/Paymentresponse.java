package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the PAYMENTRESPONSE database table.
 * 
 */
@Entity
@NamedQuery(name="Paymentresponse.findAll", query="SELECT p FROM Paymentresponse p")
public class Paymentresponse implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SESSION_ID")
	private long sessionId;

	private BigDecimal amount;

	private String currency;

	@Column(name="CUSTOMER_NAME")
	private String customerName;

	@Column(name="REFERENCE_NUMBER")
	private String referenceNumber;

	@Column(name="RESPONSE_CODE")
	private String responseCode;

	@Column(name="RESPONSE_MSG")
	private String responseMsg;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	@Column(name="TRANX_STAT")
	private String tranxStat;

	public Paymentresponse() {
	}

	public long getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(long sessionId) {
		this.sessionId = sessionId;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getReferenceNumber() {
		return this.referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public String getResponseCode() {
		return this.responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseMsg() {
		return this.responseMsg;
	}

	public void setResponseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

	public String getTranxStat() {
		return this.tranxStat;
	}

	public void setTranxStat(String tranxStat) {
		this.tranxStat = tranxStat;
	}

}