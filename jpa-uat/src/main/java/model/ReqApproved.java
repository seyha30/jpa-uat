package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the REQ_APPROVED database table.
 * 
 */
@Entity
@Table(name="REQ_APPROVED")
@NamedQuery(name="ReqApproved.findAll", query="SELECT r FROM ReqApproved r")
public class ReqApproved implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="REQ_APP_ID")
	private long reqAppId;

	@Column(name="BY_RIGHTS_ID")
	private String byRightsId;

	private Object date1;

	@Column(name="REQ_CODE")
	private BigDecimal reqCode;

	private String status;

	private Object time1;

	//bi-directional many-to-one association to ReqTranxCompleted
	@OneToMany(mappedBy="reqApproved")
	private List<ReqTranxCompleted> reqTranxCompleteds;

	public ReqApproved() {
	}

	public long getReqAppId() {
		return this.reqAppId;
	}

	public void setReqAppId(long reqAppId) {
		this.reqAppId = reqAppId;
	}

	public String getByRightsId() {
		return this.byRightsId;
	}

	public void setByRightsId(String byRightsId) {
		this.byRightsId = byRightsId;
	}

	public Object getDate1() {
		return this.date1;
	}

	public void setDate1(Object date1) {
		this.date1 = date1;
	}

	public BigDecimal getReqCode() {
		return this.reqCode;
	}

	public void setReqCode(BigDecimal reqCode) {
		this.reqCode = reqCode;
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

	public List<ReqTranxCompleted> getReqTranxCompleteds() {
		return this.reqTranxCompleteds;
	}

	public void setReqTranxCompleteds(List<ReqTranxCompleted> reqTranxCompleteds) {
		this.reqTranxCompleteds = reqTranxCompleteds;
	}

	public ReqTranxCompleted addReqTranxCompleted(ReqTranxCompleted reqTranxCompleted) {
		getReqTranxCompleteds().add(reqTranxCompleted);
		reqTranxCompleted.setReqApproved(this);

		return reqTranxCompleted;
	}

	public ReqTranxCompleted removeReqTranxCompleted(ReqTranxCompleted reqTranxCompleted) {
		getReqTranxCompleteds().remove(reqTranxCompleted);
		reqTranxCompleted.setReqApproved(null);

		return reqTranxCompleted;
	}

}