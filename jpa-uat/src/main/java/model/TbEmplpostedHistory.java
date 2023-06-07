package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TB_EMPLPOSTED_HISTORY database table.
 * 
 */
@Entity
@Table(name="TB_EMPLPOSTED_HISTORY")
@NamedQuery(name="TbEmplpostedHistory.findAll", query="SELECT t FROM TbEmplpostedHistory t")
public class TbEmplpostedHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCT_NAME")
	private String acctName;

	@Column(name="ACCT_NO")
	private String acctNo;

	@Column(name="EXCHANGE_RATE")
	private BigDecimal exchangeRate;

	@Column(name="GL_DESCRIPTION")
	private String glDescription;

	@Column(name="GL_NAME")
	private String glName;

	@Column(name="POSTED_DATE")
	private Object postedDate;

	private BigDecimal rowindex;

	@Column(name="SALARYIN_KHMER")
	private BigDecimal salaryinKhmer;

	@Column(name="SALARYIN_US")
	private BigDecimal salaryinUs;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	private BigDecimal vat;

	public TbEmplpostedHistory() {
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

	public BigDecimal getExchangeRate() {
		return this.exchangeRate;
	}

	public void setExchangeRate(BigDecimal exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public String getGlDescription() {
		return this.glDescription;
	}

	public void setGlDescription(String glDescription) {
		this.glDescription = glDescription;
	}

	public String getGlName() {
		return this.glName;
	}

	public void setGlName(String glName) {
		this.glName = glName;
	}

	public Object getPostedDate() {
		return this.postedDate;
	}

	public void setPostedDate(Object postedDate) {
		this.postedDate = postedDate;
	}

	public BigDecimal getRowindex() {
		return this.rowindex;
	}

	public void setRowindex(BigDecimal rowindex) {
		this.rowindex = rowindex;
	}

	public BigDecimal getSalaryinKhmer() {
		return this.salaryinKhmer;
	}

	public void setSalaryinKhmer(BigDecimal salaryinKhmer) {
		this.salaryinKhmer = salaryinKhmer;
	}

	public BigDecimal getSalaryinUs() {
		return this.salaryinUs;
	}

	public void setSalaryinUs(BigDecimal salaryinUs) {
		this.salaryinUs = salaryinUs;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

	public BigDecimal getVat() {
		return this.vat;
	}

	public void setVat(BigDecimal vat) {
		this.vat = vat;
	}

}