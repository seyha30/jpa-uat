package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the REQ_RAISED database table.
 * 
 */
@Entity
@Table(name="REQ_RAISED")
@NamedQuery(name="ReqRaised.findAll", query="SELECT r FROM ReqRaised r")
public class ReqRaised implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="REQ_CODE")
	private long reqCode;

	private BigDecimal amount;

	@Column(name="CUST_ACCT_TYPE")
	private BigDecimal custAcctType;

	private BigDecimal custacctid;

	private Object date1;

	@Column(name="FORM_NAME")
	private String formName;

	@Column(name="FROM_RIGHTS_ID")
	private String fromRightsId;

	private String reply;

	private String status;

	private Object time1;

	@Column(name="TO_RIGHTS_ID")
	private String toRightsId;

	@Column(name="TT_ID")
	private BigDecimal ttId;

	public ReqRaised() {
	}

	public long getReqCode() {
		return this.reqCode;
	}

	public void setReqCode(long reqCode) {
		this.reqCode = reqCode;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getCustAcctType() {
		return this.custAcctType;
	}

	public void setCustAcctType(BigDecimal custAcctType) {
		this.custAcctType = custAcctType;
	}

	public BigDecimal getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(BigDecimal custacctid) {
		this.custacctid = custacctid;
	}

	public Object getDate1() {
		return this.date1;
	}

	public void setDate1(Object date1) {
		this.date1 = date1;
	}

	public String getFormName() {
		return this.formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}

	public String getFromRightsId() {
		return this.fromRightsId;
	}

	public void setFromRightsId(String fromRightsId) {
		this.fromRightsId = fromRightsId;
	}

	public String getReply() {
		return this.reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Object getTime1() {
		return this.time1;
	}

	public void setTime1(Object time1) {
		this.time1 = time1;
	}

	public String getToRightsId() {
		return this.toRightsId;
	}

	public void setToRightsId(String toRightsId) {
		this.toRightsId = toRightsId;
	}

	public BigDecimal getTtId() {
		return this.ttId;
	}

	public void setTtId(BigDecimal ttId) {
		this.ttId = ttId;
	}

}