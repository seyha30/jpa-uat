package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TMP_SACA database table.
 * 
 */
@Entity
@Table(name="TMP_SACA")
@NamedQuery(name="TmpSaca.findAll", query="SELECT t FROM TmpSaca t")
public class TmpSaca implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCT_TYPE")
	private String acctType;

	private BigDecimal balance;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	private BigDecimal custacctid;

	private String custname;

	private String custno;

	private String custrefno;

	@Column(name="DATE_DONE")
	private Object dateDone;

	private BigDecimal prevcramt;

	private BigDecimal prevdramt;

	private BigDecimal recnum;

	private BigDecimal sumc;

	private BigDecimal sumd;

	@Column(name="TRAN_CODE")
	private String tranCode;

	public TmpSaca() {
	}

	public String getAcctType() {
		return this.acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}

	public BigDecimal getBalance() {
		return this.balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public BigDecimal getCurrId() {
		return this.currId;
	}

	public void setCurrId(BigDecimal currId) {
		this.currId = currId;
	}

	public BigDecimal getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(BigDecimal custacctid) {
		this.custacctid = custacctid;
	}

	public String getCustname() {
		return this.custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getCustno() {
		return this.custno;
	}

	public void setCustno(String custno) {
		this.custno = custno;
	}

	public String getCustrefno() {
		return this.custrefno;
	}

	public void setCustrefno(String custrefno) {
		this.custrefno = custrefno;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public BigDecimal getPrevcramt() {
		return this.prevcramt;
	}

	public void setPrevcramt(BigDecimal prevcramt) {
		this.prevcramt = prevcramt;
	}

	public BigDecimal getPrevdramt() {
		return this.prevdramt;
	}

	public void setPrevdramt(BigDecimal prevdramt) {
		this.prevdramt = prevdramt;
	}

	public BigDecimal getRecnum() {
		return this.recnum;
	}

	public void setRecnum(BigDecimal recnum) {
		this.recnum = recnum;
	}

	public BigDecimal getSumc() {
		return this.sumc;
	}

	public void setSumc(BigDecimal sumc) {
		this.sumc = sumc;
	}

	public BigDecimal getSumd() {
		return this.sumd;
	}

	public void setSumd(BigDecimal sumd) {
		this.sumd = sumd;
	}

	public String getTranCode() {
		return this.tranCode;
	}

	public void setTranCode(String tranCode) {
		this.tranCode = tranCode;
	}

}