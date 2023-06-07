package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CLVW_SCHEDULS_NOTICE database table.
 * 
 */
@Entity
@Table(name="CLVW_SCHEDULS_NOTICE")
@NamedQuery(name="ClvwSchedulsNotice.findAll", query="SELECT c FROM ClvwSchedulsNotice c")
public class ClvwSchedulsNotice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SCHEDULE_ID")
	private long scheduleId;

	private BigDecimal custacctid;

	@Column(name="DUE_DATE")
	private Object dueDate;

	@Column(name="FEE_DUE")
	private BigDecimal feeDue;

	@Column(name="INST_NO")
	private BigDecimal instNo;

	@Column(name="INT_DUE")
	private BigDecimal intDue;

	@Column(name="LOAN_FAC_ID")
	private BigDecimal loanFacId;

	private BigDecimal num;

	@Column(name="PRIN_DUE")
	private BigDecimal prinDue;

	@Column(name="REF_NO")
	private String refNo;

	public ClvwSchedulsNotice() {
	}

	public long getScheduleId() {
		return this.scheduleId;
	}

	public void setScheduleId(long scheduleId) {
		this.scheduleId = scheduleId;
	}

	public BigDecimal getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(BigDecimal custacctid) {
		this.custacctid = custacctid;
	}

	public Object getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(Object dueDate) {
		this.dueDate = dueDate;
	}

	public BigDecimal getFeeDue() {
		return this.feeDue;
	}

	public void setFeeDue(BigDecimal feeDue) {
		this.feeDue = feeDue;
	}

	public BigDecimal getInstNo() {
		return this.instNo;
	}

	public void setInstNo(BigDecimal instNo) {
		this.instNo = instNo;
	}

	public BigDecimal getIntDue() {
		return this.intDue;
	}

	public void setIntDue(BigDecimal intDue) {
		this.intDue = intDue;
	}

	public BigDecimal getLoanFacId() {
		return this.loanFacId;
	}

	public void setLoanFacId(BigDecimal loanFacId) {
		this.loanFacId = loanFacId;
	}

	public BigDecimal getNum() {
		return this.num;
	}

	public void setNum(BigDecimal num) {
		this.num = num;
	}

	public BigDecimal getPrinDue() {
		return this.prinDue;
	}

	public void setPrinDue(BigDecimal prinDue) {
		this.prinDue = prinDue;
	}

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

}