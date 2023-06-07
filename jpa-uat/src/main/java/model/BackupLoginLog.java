package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the BACKUP_LOGIN_LOG database table.
 * 
 */
@Entity
@Table(name="BACKUP_LOGIN_LOG")
@NamedQuery(name="BackupLoginLog.findAll", query="SELECT b FROM BackupLoginLog b")
public class BackupLoginLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="LOGIN_LOG_ID")
	private long loginLogId;

	@Column(name="BRANCH_ID")
	private BigDecimal branchId;

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

	public BackupLoginLog() {
	}

	public long getLoginLogId() {
		return this.loginLogId;
	}

	public void setLoginLogId(long loginLogId) {
		this.loginLogId = loginLogId;
	}

	public BigDecimal getBranchId() {
		return this.branchId;
	}

	public void setBranchId(BigDecimal branchId) {
		this.branchId = branchId;
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

}