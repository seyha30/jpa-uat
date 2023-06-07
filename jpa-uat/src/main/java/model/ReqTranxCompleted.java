package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the REQ_TRANX_COMPLETED database table.
 * 
 */
@Entity
@Table(name="REQ_TRANX_COMPLETED")
@NamedQuery(name="ReqTranxCompleted.findAll", query="SELECT r FROM ReqTranxCompleted r")
public class ReqTranxCompleted implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CUST_TRANX_ID")
	private BigDecimal custTranxId;

	@Column(name="REQ_CODE")
	private BigDecimal reqCode;

	@Column(name="REQ_TRANX_COMPLETED_ID")
	private BigDecimal reqTranxCompletedId;

	//bi-directional many-to-one association to ReqApproved
	@ManyToOne
	@JoinColumn(name="REQ_APP_ID")
	private ReqApproved reqApproved;

	public ReqTranxCompleted() {
	}

	public BigDecimal getCustTranxId() {
		return this.custTranxId;
	}

	public void setCustTranxId(BigDecimal custTranxId) {
		this.custTranxId = custTranxId;
	}

	public BigDecimal getReqCode() {
		return this.reqCode;
	}

	public void setReqCode(BigDecimal reqCode) {
		this.reqCode = reqCode;
	}

	public BigDecimal getReqTranxCompletedId() {
		return this.reqTranxCompletedId;
	}

	public void setReqTranxCompletedId(BigDecimal reqTranxCompletedId) {
		this.reqTranxCompletedId = reqTranxCompletedId;
	}

	public ReqApproved getReqApproved() {
		return this.reqApproved;
	}

	public void setReqApproved(ReqApproved reqApproved) {
		this.reqApproved = reqApproved;
	}

}