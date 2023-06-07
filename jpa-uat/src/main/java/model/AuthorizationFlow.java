package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the AUTHORIZATION_FLOW database table.
 * 
 */
@Entity
@Table(name="AUTHORIZATION_FLOW")
@NamedQuery(name="AuthorizationFlow.findAll", query="SELECT a FROM AuthorizationFlow a")
public class AuthorizationFlow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AUTH_STATUS")
	private String authStatus;

	private String authorizer;

	private BigDecimal id;

	@Column(name="PARRENT_ID")
	private BigDecimal parrentId;

	@Column(name="REQUEST_DATE")
	private Object requestDate;

	private String requestor;

	@Column(name="RESPONSE_DATE")
	private Object responseDate;

	@Column(name="TRN_CODE")
	private String trnCode;

	@Column(name="TRN_ID")
	private String trnId;

	public AuthorizationFlow() {
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

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public BigDecimal getParrentId() {
		return this.parrentId;
	}

	public void setParrentId(BigDecimal parrentId) {
		this.parrentId = parrentId;
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

	public String getTrnCode() {
		return this.trnCode;
	}

	public void setTrnCode(String trnCode) {
		this.trnCode = trnCode;
	}

	public String getTrnId() {
		return this.trnId;
	}

	public void setTrnId(String trnId) {
		this.trnId = trnId;
	}

}