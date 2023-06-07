package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the BACKUP_AUTH_REQUEST database table.
 * 
 */
@Entity
@Table(name="BACKUP_AUTH_REQUEST")
@NamedQuery(name="BackupAuthRequest.findAll", query="SELECT b FROM BackupAuthRequest b")
public class BackupAuthRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="AUTH_REQ_ID")
	private long authReqId;

	@Column(name="AUTH_AMT")
	private BigDecimal authAmt;

	@Column(name="AUTH_DATE")
	private Object authDate;

	@Column(name="AUTH_MOD")
	private BigDecimal authMod;

	@Column(name="AUTH_REPLY")
	private String authReply;

	@Column(name="AUTH_STATUS")
	private String authStatus;

	private BigDecimal custacctid;

	private String description;

	@Column(name="FORM_NAME")
	private String formName;

	@Column(name="FRIGHT_ID")
	private String frightId;

	@Column(name="TRIGHT_ID")
	private String trightId;

	public BackupAuthRequest() {
	}

	public long getAuthReqId() {
		return this.authReqId;
	}

	public void setAuthReqId(long authReqId) {
		this.authReqId = authReqId;
	}

	public BigDecimal getAuthAmt() {
		return this.authAmt;
	}

	public void setAuthAmt(BigDecimal authAmt) {
		this.authAmt = authAmt;
	}

	public Object getAuthDate() {
		return this.authDate;
	}

	public void setAuthDate(Object authDate) {
		this.authDate = authDate;
	}

	public BigDecimal getAuthMod() {
		return this.authMod;
	}

	public void setAuthMod(BigDecimal authMod) {
		this.authMod = authMod;
	}

	public String getAuthReply() {
		return this.authReply;
	}

	public void setAuthReply(String authReply) {
		this.authReply = authReply;
	}

	public String getAuthStatus() {
		return this.authStatus;
	}

	public void setAuthStatus(String authStatus) {
		this.authStatus = authStatus;
	}

	public BigDecimal getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(BigDecimal custacctid) {
		this.custacctid = custacctid;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFormName() {
		return this.formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}

	public String getFrightId() {
		return this.frightId;
	}

	public void setFrightId(String frightId) {
		this.frightId = frightId;
	}

	public String getTrightId() {
		return this.trightId;
	}

	public void setTrightId(String trightId) {
		this.trightId = trightId;
	}

}