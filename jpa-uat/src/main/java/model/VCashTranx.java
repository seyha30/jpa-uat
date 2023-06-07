package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the V_CASH_TRANX database table.
 * 
 */
@Entity
@Table(name="V_CASH_TRANX")
@NamedQuery(name="VCashTranx.findAll", query="SELECT v FROM VCashTranx v")
public class VCashTranx implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal amt;

	private BigDecimal bal;

	@Column(name="CASH_MGT_ID")
	private BigDecimal cashMgtId;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	@Column(name="DATE_DONE")
	private Object dateDone;

	private String description;

	@Column(name="IN_OR_OUT")
	private String inOrOut;

	@Column(name="LOG_ID")
	private BigDecimal logId;

	@Column(name="SA_NO")
	private String saNo;

	@Column(name="TELL_ID")
	private String tellId;

	@Column(name="TT_ID")
	private BigDecimal ttId;

	public VCashTranx() {
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getInOrOut() {
		return this.inOrOut;
	}

	public void setInOrOut(String inOrOut) {
		this.inOrOut = inOrOut;
	}

	public BigDecimal getLogId() {
		return this.logId;
	}

	public void setLogId(BigDecimal logId) {
		this.logId = logId;
	}

	public String getSaNo() {
		return this.saNo;
	}

	public void setSaNo(String saNo) {
		this.saNo = saNo;
	}

	public String getTellId() {
		return this.tellId;
	}

	public void setTellId(String tellId) {
		this.tellId = tellId;
	}

	public BigDecimal getTtId() {
		return this.ttId;
	}

	public void setTtId(BigDecimal ttId) {
		this.ttId = ttId;
	}

}