package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the PENALTY_HIS database table.
 * 
 */
@Entity
@Table(name="PENALTY_HIS")
@NamedQuery(name="PenaltyHi.findAll", query="SELECT p FROM PenaltyHi p")
public class PenaltyHi implements Serializable {
	private static final long serialVersionUID = 1L;

	private String deleted;

	@Column(name="F_DATE")
	private Object fDate;

	@Column(name="INST_NO")
	private BigDecimal instNo;

	@Column(name="LOAN_FAC_ID")
	private BigDecimal loanFacId;

	@Column(name="NO_DAY")
	private BigDecimal noDay;

	@Column(name="PEN_AMT")
	private BigDecimal penAmt;

	@Column(name="PEN_BAL")
	private BigDecimal penBal;

	@Column(name="PEN_ID")
	private BigDecimal penId;

	@Column(name="PRE_PEN")
	private BigDecimal prePen;

	@Column(name="SCHEDULE_ID")
	private BigDecimal scheduleId;

	@Column(name="T_DATE")
	private Object tDate;

	public PenaltyHi() {
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public Object getFDate() {
		return this.fDate;
	}

	public void setFDate(Object fDate) {
		this.fDate = fDate;
	}

	public BigDecimal getInstNo() {
		return this.instNo;
	}

	public void setInstNo(BigDecimal instNo) {
		this.instNo = instNo;
	}

	public BigDecimal getLoanFacId() {
		return this.loanFacId;
	}

	public void setLoanFacId(BigDecimal loanFacId) {
		this.loanFacId = loanFacId;
	}

	public BigDecimal getNoDay() {
		return this.noDay;
	}

	public void setNoDay(BigDecimal noDay) {
		this.noDay = noDay;
	}

	public BigDecimal getPenAmt() {
		return this.penAmt;
	}

	public void setPenAmt(BigDecimal penAmt) {
		this.penAmt = penAmt;
	}

	public BigDecimal getPenBal() {
		return this.penBal;
	}

	public void setPenBal(BigDecimal penBal) {
		this.penBal = penBal;
	}

	public BigDecimal getPenId() {
		return this.penId;
	}

	public void setPenId(BigDecimal penId) {
		this.penId = penId;
	}

	public BigDecimal getPrePen() {
		return this.prePen;
	}

	public void setPrePen(BigDecimal prePen) {
		this.prePen = prePen;
	}

	public BigDecimal getScheduleId() {
		return this.scheduleId;
	}

	public void setScheduleId(BigDecimal scheduleId) {
		this.scheduleId = scheduleId;
	}

	public Object getTDate() {
		return this.tDate;
	}

	public void setTDate(Object tDate) {
		this.tDate = tDate;
	}

}