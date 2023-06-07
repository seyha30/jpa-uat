package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the AUTH_APPROVED database table.
 * 
 */
@Entity
@Table(name="AUTH_APPROVED")
@NamedQuery(name="AuthApproved.findAll", query="SELECT a FROM AuthApproved a")
public class AuthApproved implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="AUTH_APPROVED_ID")
	private long authApprovedId;

	@Column(name="AUTH_REQ_ID")
	private BigDecimal authReqId;

	@Column(name="COMPLETED_STATUS")
	private String completedStatus;

	public AuthApproved() {
	}

	public long getAuthApprovedId() {
		return this.authApprovedId;
	}

	public void setAuthApprovedId(long authApprovedId) {
		this.authApprovedId = authApprovedId;
	}

	public BigDecimal getAuthReqId() {
		return this.authReqId;
	}

	public void setAuthReqId(BigDecimal authReqId) {
		this.authReqId = authReqId;
	}

	public String getCompletedStatus() {
		return this.completedStatus;
	}

	public void setCompletedStatus(String completedStatus) {
		this.completedStatus = completedStatus;
	}

}