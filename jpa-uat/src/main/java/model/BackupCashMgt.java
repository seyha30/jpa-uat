package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the BACKUP_CASH_MGT database table.
 * 
 */
@Entity
@Table(name="BACKUP_CASH_MGT")
@NamedQuery(name="BackupCashMgt.findAll", query="SELECT b FROM BackupCashMgt b")
public class BackupCashMgt implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal amt;

	private BigDecimal bal;

	@Column(name="CASH_MGT_ID")
	private BigDecimal cashMgtId;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	@Column(name="DATE_DONE")
	private Object dateDone;

	@Column(name="IN_OR_OUT")
	private String inOrOut;

	@Column(name="LOGIN_LOG_ID")
	private BigDecimal loginLogId;

	@Column(name="TELL_ID")
	private String tellId;

	private String towho;

	@Column(name="TT_ID")
	private BigDecimal ttId;

	public BackupCashMgt() {
	}

	public BigDecimal getAmt() {
		return this.amt;
	}

	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}

	public BigDecimal getBal() {
		return this.bal;
	}

	public void setBal(BigDecimal bal) {
		this.bal = bal;
	}

	public BigDecimal getCashMgtId() {
		return this.cashMgtId;
	}

	public void setCashMgtId(BigDecimal cashMgtId) {
		this.cashMgtId = cashMgtId;
	}

	public BigDecimal getCurrId() {
		return this.currId;
	}

	public void setCurrId(BigDecimal currId) {
		this.currId = currId;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public String getInOrOut() {
		return this.inOrOut;
	}

	public void setInOrOut(String inOrOut) {
		this.inOrOut = inOrOut;
	}

	public BigDecimal getLoginLogId() {
		return this.loginLogId;
	}

	public void setLoginLogId(BigDecimal loginLogId) {
		this.loginLogId = loginLogId;
	}

	public String getTellId() {
		return this.tellId;
	}

	public void setTellId(String tellId) {
		this.tellId = tellId;
	}

	public String getTowho() {
		return this.towho;
	}

	public void setTowho(String towho) {
		this.towho = towho;
	}

	public BigDecimal getTtId() {
		return this.ttId;
	}

	public void setTtId(BigDecimal ttId) {
		this.ttId = ttId;
	}

}