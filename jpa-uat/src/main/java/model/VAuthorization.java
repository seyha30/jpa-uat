package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the V_AUTHORIZATION database table.
 * 
 */
@Entity
@Table(name="V_AUTHORIZATION")
@NamedQuery(name="VAuthorization.findAll", query="SELECT v FROM VAuthorization v")
public class VAuthorization implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal amount;

	@Column(name="AUTH_STATUS")
	private String authStatus;

	private String authorizer;

	private String ccy;

	private BigDecimal id;

	@Column(name="RELATED_ID")
	private String relatedId;

	@Column(name="REQUEST_DATE")
	private Object requestDate;

	private String requestor;

	@Column(name="RESPONSE_DATE")
	private Object responseDate;

	@Column(name="SA_NO")
	private String saNo;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	public VAuthorization() {
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getAuthStatus() {
		return this.authStatus;
	}

	public void setAuthStatus(String authStatus) {
		this.authStatus = authStatus;
	}

	public String getAuthorizer() {
		return this.authorizer;
	}

	public void setAuthorizer(String authorizer) {
		this.authorizer = authorizer;
	}

	public String getCcy() {
		return this.ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getRelatedId() {
		return this.relatedId;
	}

	public void setRelatedId(String relatedId) {
		this.relatedId = relatedId;
	}

	public Object getRequestDate() {
		return this.requestDate;
	}

	public void setRequestDate(Object requestDate) {
		this.requestDate = requestDate;
	}

	public String getRequestor() {
		return this.requestor;
	}

	public void setRequestor(String requestor) {
		this.requestor = requestor;
	}

	public Object getResponseDate() {
		return this.responseDate;
	}

	public void setResponseDate(Object responseDate) {
		this.responseDate = responseDate;
	}

	public String getSaNo() {
		return this.saNo;
	}

	public void setSaNo(String saNo) {
		this.saNo = saNo;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

}