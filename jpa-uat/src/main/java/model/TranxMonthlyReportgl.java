package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TRANX_MONTHLY_REPORTGL database table.
 * 
 */
@Entity
@Table(name="TRANX_MONTHLY_REPORTGL")
@NamedQuery(name="TranxMonthlyReportgl.findAll", query="SELECT t FROM TranxMonthlyReportgl t")
public class TranxMonthlyReportgl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCT_ID_C")
	private String acctIdC;

	@Column(name="ACCT_ID_D")
	private String acctIdD;

	private BigDecimal amt;

	@Column(name="AMT_WORD")
	private String amtWord;

	private String curr;

	@Column(name="DATE_DONE")
	private String dateDone;

	private String desription;

	private String dorc;

	@Column(name="NAME_C")
	private String nameC;

	@Column(name="NAME_D")
	private String nameD;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	public TranxMonthlyReportgl() {
	}

	public String getAcctIdC() {
		return this.acctIdC;
	}

	public void setAcctIdC(String acctIdC) {
		this.acctIdC = acctIdC;
	}

	public String getAcctIdD() {
		return this.acctIdD;
	}

	public void setAcctIdD(String acctIdD) {
		this.acctIdD = acctIdD;
	}

	public BigDecimal getAmt() {
		return this.amt;
	}

	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}

	public String getAmtWord() {
		return this.amtWord;
	}

	public void setAmtWord(String amtWord) {
		this.amtWord = amtWord;
	}

	public String getCurr() {
		return this.curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}

	public String getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(String dateDone) {
		this.dateDone = dateDone;
	}

	public String getDesription() {
		return this.desription;
	}

	public void setDesription(String desription) {
		this.desription = desription;
	}

	public String getDorc() {
		return this.dorc;
	}

	public void setDorc(String dorc) {
		this.dorc = dorc;
	}

	public String getNameC() {
		return this.nameC;
	}

	public void setNameC(String nameC) {
		this.nameC = nameC;
	}

	public String getNameD() {
		return this.nameD;
	}

	public void setNameD(String nameD) {
		this.nameD = nameD;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

}