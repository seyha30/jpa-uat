package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TMP_LOGIN_LOG database table.
 * 
 */
@Entity
@Table(name="TMP_LOGIN_LOG")
@NamedQuery(name="TmpLoginLog.findAll", query="SELECT t FROM TmpLoginLog t")
public class TmpLoginLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="BRANCH_ID")
	private BigDecimal branchId;

	@Column(name="CLOSE_DATE")
	private String closeDate;

	@Column(name="COUNTER_ID")
	private BigDecimal counterId;

	@Column(name="LOGIN_LOG_ID")
	private BigDecimal loginLogId;

	@Column(name="OPEN_DATE")
	private String openDate;

	@Column(name="RIGHTS_ID")
	private String rightsId;

	public TmpLoginLog() {
	}

	public BigDecimal getBranchId() {
		return this.branchId;
	}

	public void setBranchId(BigDecimal branchId) {
		this.branchId = branchId;
	}

	public String getCloseDate() {
		return this.closeDate;
	}

	public void setCloseDate(String closeDate) {
		this.closeDate = closeDate;
	}

	public BigDecimal getCounterId() {
		return this.counterId;
	}

	public void setCounterId(BigDecimal counterId) {
		this.counterId = counterId;
	}

	public BigDecimal getLoginLogId() {
		return this.loginLogId;
	}

	public void setLoginLogId(BigDecimal loginLogId) {
		this.loginLogId = loginLogId;
	}

	public String getOpenDate() {
		return this.openDate;
	}

	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}

	public String getRightsId() {
		return this.rightsId;
	}

	public void setRightsId(String rightsId) {
		this.rightsId = rightsId;
	}

}