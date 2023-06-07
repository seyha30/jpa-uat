package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the JOURAUDIT database table.
 * 
 */
@Entity
@NamedQuery(name="Jouraudit.findAll", query="SELECT j FROM Jouraudit j")
public class Jouraudit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long recnum;

	@Column(name="ACCT_DESC")
	private String acctDesc;

	@Column(name="ACCT_NAME")
	private String acctName;

	private BigDecimal balance;

	private String ccy;

	private BigDecimal crsum;

	private String dorc;

	private BigDecimal drsum;

	private BigDecimal numb;

	private BigDecimal sno;

	private String tdate;

	@Column(name="TRANX_DESC")
	private String tranxDesc;

	@Column(name="TRANX_NO")
	private BigDecimal tranxNo;

	public Jouraudit() {
	}

	public long getRecnum() {
		return this.recnum;
	}

	public void setRecnum(long recnum) {
		this.recnum = recnum;
	}

	public String getAcctDesc() {
		return this.acctDesc;
	}

	public void setAcctDesc(String acctDesc) {
		this.acctDesc = acctDesc;
	}

	public String getAcctName() {
		return this.acctName;
	}

	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}

	public BigDecimal getBalance() {
		return this.balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public String getCcy() {
		return this.ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public BigDecimal getCrsum() {
		return this.crsum;
	}

	public void setCrsum(BigDecimal crsum) {
		this.crsum = crsum;
	}

	public String getDorc() {
		return this.dorc;
	}

	public void setDorc(String dorc) {
		this.dorc = dorc;
	}

	public BigDecimal getDrsum() {
		return this.drsum;
	}

	public void setDrsum(BigDecimal drsum) {
		this.drsum = drsum;
	}

	public BigDecimal getNumb() {
		return this.numb;
	}

	public void setNumb(BigDecimal numb) {
		this.numb = numb;
	}

	public BigDecimal getSno() {
		return this.sno;
	}

	public void setSno(BigDecimal sno) {
		this.sno = sno;
	}

	public String getTdate() {
		return this.tdate;
	}

	public void setTdate(String tdate) {
		this.tdate = tdate;
	}

	public String getTranxDesc() {
		return this.tranxDesc;
	}

	public void setTranxDesc(String tranxDesc) {
		this.tranxDesc = tranxDesc;
	}

	public BigDecimal getTranxNo() {
		return this.tranxNo;
	}

	public void setTranxNo(BigDecimal tranxNo) {
		this.tranxNo = tranxNo;
	}

}