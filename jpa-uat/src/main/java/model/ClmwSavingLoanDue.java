package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CLMW_SAVING_LOAN_DUE database table.
 * 
 */
@Entity
@Table(name="CLMW_SAVING_LOAN_DUE")
@NamedQuery(name="ClmwSavingLoanDue.findAll", query="SELECT c FROM ClmwSavingLoanDue c")
public class ClmwSavingLoanDue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="REFERENCE_NUMBER")
	private String referenceNumber;

	private BigDecimal amount;

	private String currency;

	@Column(name="CUSTOMER_NAME")
	private String customerName;

	@Column(name="RESPONSE_CODE")
	private String responseCode;

	@Column(name="RESPONSE_MSG")
	private String responseMsg;

	@Column(name="SESSION_ID")
	private BigDecimal sessionId;

	public ClmwSavingLoanDue() {
	}

	public String getReferenceNumber() {
		return this.referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
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

	public BigDecimal getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(BigDecimal sessionId) {
		this.sessionId = sessionId;
	}

}