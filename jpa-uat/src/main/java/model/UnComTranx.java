package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the UN_COM_TRANX database table.
 * 
 */
@Entity
@Table(name="UN_COM_TRANX")
@NamedQuery(name="UnComTranx.findAll", query="SELECT u FROM UnComTranx u")
public class UnComTranx implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal amount;

	@Column(name="DAILY_AMORTIZE_AMT")
	private BigDecimal dailyAmortizeAmt;

	@Column(name="DATE_DONE")
	private Object dateDone;

	@Column(name="DONE_BY")
	private String doneBy;

	@Column(name="INC_GL")
	private BigDecimal incGl;

	@Column(name="LOAN_FAC_ID")
	private BigDecimal loanFacId;

	@Column(name="REF_NO")
	private String refNo;

	@Column(name="UN_COM_TRANX_ID")
	private BigDecimal unComTranxId;

	@Column(name="UNE_GL")
	private BigDecimal uneGl;

	public UnComTranx() {
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getDailyAmortizeAmt() {
		return this.dailyAmortizeAmt;
	}

	public void setDailyAmortizeAmt(BigDecimal dailyAmortizeAmt) {
		this.dailyAmortizeAmt = dailyAmortizeAmt;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public String getDoneBy() {
		return this.doneBy;
	}

	public void setDoneBy(String doneBy) {
		this.doneBy = doneBy;
	}

	public BigDecimal getIncGl() {
		return this.incGl;
	}

	public void setIncGl(BigDecimal incGl) {
		this.incGl = incGl;
	}

	public BigDecimal getLoanFacId() {
		return this.loanFacId;
	}

	public void setLoanFacId(BigDecimal loanFacId) {
		this.loanFacId = loanFacId;
	}

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public BigDecimal getUnComTranxId() {
		return this.unComTranxId;
	}

	public void setUnComTranxId(BigDecimal unComTranxId) {
		this.unComTranxId = unComTranxId;
	}

	public BigDecimal getUneGl() {
		return this.uneGl;
	}

	public void setUneGl(BigDecimal uneGl) {
		this.uneGl = uneGl;
	}

}