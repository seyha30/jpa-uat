package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the API_TRANX_LOG database table.
 * 
 */
@Entity
@Table(name="API_TRANX_LOG")
@NamedQuery(name="ApiTranxLog.findAll", query="SELECT a FROM ApiTranxLog a")
public class ApiTranxLog implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal amount;

	private String ccy;

	private String channel;

	@Column(name="DATE_DONE")
	private Object dateDone;

	@Column(name="DONE_BY")
	private String doneBy;

	@Column(name="\"HOST\"")
	private String host;

	private BigDecimal id;

	@Column(name="PARTNER_TRANX_ID")
	private String partnerTranxId;

	@Column(name="PHONE_NO")
	private String phoneNo;

	@Column(name="RELATED_ID")
	private BigDecimal relatedId;

	@Column(name="REQUEST_MEDIUM")
	private String requestMedium;

	@Column(name="REQUEST_MEDIUM_ID")
	private String requestMediumId;

	@Column(name="SA_NO")
	private String saNo;

	@Column(name="SQL_SCRIPT")
	private String sqlScript;

	private String status;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	public ApiTranxLog() {
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCcy() {
		return this.ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public String getDoneBy() {
		return this.doneBy;
	}

	public void setDoneBy(String doneBy) {
		this.doneBy = doneBy;
	}

	public String getHost() {
		return this.host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getPartnerTranxId() {
		return this.partnerTranxId;
	}

	public void setPartnerTranxId(String partnerTranxId) {
		this.partnerTranxId = partnerTranxId;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public BigDecimal getRelatedId() {
		return this.relatedId;
	}

	public void setRelatedId(BigDecimal relatedId) {
		this.relatedId = relatedId;
	}

	public String getRequestMedium() {
		return this.requestMedium;
	}

	public void setRequestMedium(String requestMedium) {
		this.requestMedium = requestMedium;
	}

	public String getRequestMediumId() {
		return this.requestMediumId;
	}

	public void setRequestMediumId(String requestMediumId) {
		this.requestMediumId = requestMediumId;
	}

	public String getSaNo() {
		return this.saNo;
	}

	public void setSaNo(String saNo) {
		this.saNo = saNo;
	}

	public String getSqlScript() {
		return this.sqlScript;
	}

	public void setSqlScript(String sqlScript) {
		this.sqlScript = sqlScript;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

}