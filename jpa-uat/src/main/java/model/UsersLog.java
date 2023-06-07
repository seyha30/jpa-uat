package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the USERS_LOG database table.
 * 
 */
@Entity
@Table(name="USERS_LOG")
@NamedQuery(name="UsersLog.findAll", query="SELECT u FROM UsersLog u")
public class UsersLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ALLOW_WORK_NON_BZ_DAYS")
	private String allowWorkNonBzDays;

	@Column(name="CREATE_BY")
	private BigDecimal createBy;

	@Column(name="CREATE_DATE")
	private Object createDate;

	private String deleted;

	private String description;

	@Column(name="LAST_PWD_CHANGE_DATE")
	private Object lastPwdChangeDate;

	private String password;

	@Column(name="PWD_EXP_DATE")
	private Object pwdExpDate;

	@Column(name="USER_ID")
	private BigDecimal userId;

	public UsersLog() {
	}

	public String getAllowWorkNonBzDays() {
		return this.allowWorkNonBzDays;
	}

	public void setAllowWorkNonBzDays(String allowWorkNonBzDays) {
		this.allowWorkNonBzDays = allowWorkNonBzDays;
	}

	public BigDecimal getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(BigDecimal createBy) {
		this.createBy = createBy;
	}

	public Object getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Object createDate) {
		this.createDate = createDate;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Object getLastPwdChangeDate() {
		return this.lastPwdChangeDate;
	}

	public void setLastPwdChangeDate(Object lastPwdChangeDate) {
		this.lastPwdChangeDate = lastPwdChangeDate;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Object getPwdExpDate() {
		return this.pwdExpDate;
	}

	public void setPwdExpDate(Object pwdExpDate) {
		this.pwdExpDate = pwdExpDate;
	}

	public BigDecimal getUserId() {
		return this.userId;
	}

	public void setUserId(BigDecimal userId) {
		this.userId = userId;
	}

}