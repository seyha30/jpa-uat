package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TB_GLPOSTING database table.
 * 
 */
@Entity
@Table(name="TB_GLPOSTING")
@NamedQuery(name="TbGlposting.findAll", query="SELECT t FROM TbGlposting t")
public class TbGlposting implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCT_NAME")
	private String acctName;

	@Column(name="ACCT_NO")
	private String acctNo;

	@Column(name="ACCU_BAL")
	private BigDecimal accuBal;

	@Column(name="INT_RATE")
	private BigDecimal intRate;

	@Column(name="INT_RECEIVABLE")
	private BigDecimal intReceivable;

	@Column(name="POSTING_DATE")
	private Object postingDate;

	@Column(name="PREV_BAL")
	private BigDecimal prevBal;

	@Column(name="PRICIPAL_AMT")
	private BigDecimal pricipalAmt;

	private String status;

	public TbGlposting() {
	}

	public String getAcctName() {
		return this.acctName;
	}

	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}

	public String getAcctNo() {
		return this.acctNo;
	}

	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}

	public BigDecimal getAccuBal() {
		return this.accuBal;
	}

	public void setAccuBal(BigDecimal accuBal) {
		this.accuBal = accuBal;
	}

	public BigDecimal getIntRate() {
		return this.intRate;
	}

	public void setIntRate(BigDecimal intRate) {
		this.intRate = intRate;
	}

	public BigDecimal getIntReceivable() {
		return this.intReceivable;
	}

	public void setIntReceivable(BigDecimal intReceivable) {
		this.intReceivable = intReceivable;
	}

	public Object getPostingDate() {
		return this.postingDate;
	}

	public void setPostingDate(Object postingDate) {
		this.postingDate = postingDate;
	}

	public BigDecimal getPrevBal() {
		return this.prevBal;
	}

	public void setPrevBal(BigDecimal prevBal) {
		this.prevBal = prevBal;
	}

	public BigDecimal getPricipalAmt() {
		return this.pricipalAmt;
	}

	public void setPricipalAmt(BigDecimal pricipalAmt) {
		this.pricipalAmt = pricipalAmt;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}