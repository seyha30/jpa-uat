package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CMV_CASH_MGT database table.
 * 
 */
@Entity
@Table(name="CMV_CASH_MGT")
@NamedQuery(name="CmvCashMgt.findAll", query="SELECT c FROM CmvCashMgt c")
public class CmvCashMgt implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal bal;

	@Column(name="BEGIN_BAL")
	private BigDecimal beginBal;

	@Column(name="CASH_MGT_ID")
	private BigDecimal cashMgtId;

	@Column(name="CURR_CODE")
	private String currCode;

	@Column(name="DATE_DONE")
	private Object dateDone;

	@Column(name="IN_AMT")
	private BigDecimal inAmt;

	@Column(name="LOGIN_LOG_ID")
	private BigDecimal loginLogId;

	@Column(name="OUT_AMT")
	private BigDecimal outAmt;

	@Column(name="TELL_ID")
	private String tellId;

	public CmvCashMgt() {
	}

	public BigDecimal getBal() {
		return this.bal;
	}

	public void setBal(BigDecimal bal) {
		this.bal = bal;
	}

	public BigDecimal getBeginBal() {
		return this.beginBal;
	}

	public void setBeginBal(BigDecimal beginBal) {
		this.beginBal = beginBal;
	}

	public BigDecimal getCashMgtId() {
		return this.cashMgtId;
	}

	public void setCashMgtId(BigDecimal cashMgtId) {
		this.cashMgtId = cashMgtId;
	}

	public String getCurrCode() {
		return this.currCode;
	}

	public void setCurrCode(String currCode) {
		this.currCode = currCode;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public BigDecimal getInAmt() {
		return this.inAmt;
	}

	public void setInAmt(BigDecimal inAmt) {
		this.inAmt = inAmt;
	}

	public BigDecimal getLoginLogId() {
		return this.loginLogId;
	}

	public void setLoginLogId(BigDecimal loginLogId) {
		this.loginLogId = loginLogId;
	}

	public BigDecimal getOutAmt() {
		return this.outAmt;
	}

	public void setOutAmt(BigDecimal outAmt) {
		this.outAmt = outAmt;
	}

	public String getTellId() {
		return this.tellId;
	}

	public void setTellId(String tellId) {
		this.tellId = tellId;
	}

}