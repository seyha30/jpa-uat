package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TMP_CUST_TRANX database table.
 * 
 */
@Entity
@Table(name="TMP_CUST_TRANX")
@NamedQuery(name="TmpCustTranx.findAll", query="SELECT t FROM TmpCustTranx t")
public class TmpCustTranx implements Serializable {
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

	private String custstr;

	@Column(name="DATE_DONE")
	private Object dateDone;

	private BigDecimal prevcramt;

	private BigDecimal prevdramt;

	private BigDecimal recnum;

	private BigDecimal sumc;

	private BigDecimal sumd;

	public TmpCustTranx() {
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

	public String getCuststr() {
		return this.custstr;
	}

	public void setCuststr(String custstr) {
		this.custstr = custstr;
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

}