package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the LOGIN_LOG database table.
 * 
 */
@Entity
@Table(name="LOGIN_LOG")
@NamedQuery(name="LoginLog.findAll", query="SELECT l FROM LoginLog l")
public class LoginLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="LOGIN_LOG_ID")
	private long loginLogId;

	@Column(name="CLOSE_DATE")
	private Object closeDate;

	@Column(name="COUNTER_ID")
	private BigDecimal counterId;

	@Column(name="OPEN_DATE")
	private Object openDate;

	@Column(name="RIGHTS_ID")
	private String rightsId;

	private String sclose;

	private String sopen;

	@Column(name="VERSION_CODE")
	private String versionCode;

	//bi-directional many-to-one association to Branch
	@ManyToOne
	@JoinColumn(name="BRANCH_ID")
	private Branch branch;

	public LoginLog() {
	}

	public long getLoginLogId() {
		return this.loginLogId;
	}

	public void setLoginLogId(long loginLogId) {
		this.loginLogId = loginLogId;
	}

	public Object getCloseDate() {
		return this.closeDate;
	}

	public void setCloseDate(Object closeDate) {
		this.closeDate = closeDate;
	}

	public BigDecimal getCounterId() {
		return this.counterId;
	}

	public void setCounterId(BigDecimal counterId) {
		this.counterId = counterId;
	}

	public Object getOpenDate() {
		return this.openDate;
	}

	public void setOpenDate(Object openDate) {
		this.openDate = openDate;
	}

	public String getRightsId() {
		return this.rightsId;
	}

	public void setRightsId(String rightsId) {
		this.rightsId = rightsId;
	}

	public String getSclose() {
		return this.sclose;
	}

	public void setSclose(String sclose) {
		this.sclose = sclose;
	}

	public String getSopen() {
		return this.sopen;
	}

	public void setSopen(String sopen) {
		this.sopen = sopen;
	}

	public String getVersionCode() {
		return this.versionCode;
	}

	public void setVersionCode(String versionCode) {
		this.versionCode = versionCode;
	}

	public Branch getBranch() {
		return this.branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

}