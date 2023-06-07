package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TMP_MTH_CUSTBAL database table.
 * 
 */
@Entity
@Table(name="TMP_MTH_CUSTBAL")
@NamedQuery(name="TmpMthCustbal.findAll", query="SELECT t FROM TmpMthCustbal t")
public class TmpMthCustbal implements Serializable {
	private static final long serialVersionUID = 1L;

	private String acctid;

	private BigDecimal amtapr;

	private BigDecimal amtaug;

	private BigDecimal amtdec;

	private BigDecimal amtfeb;

	private BigDecimal amtjan;

	private BigDecimal amtjul;

	private BigDecimal amtjun;

	private BigDecimal amtmar;

	private BigDecimal amtmay;

	private BigDecimal amtnov;

	private BigDecimal amtoct;

	private BigDecimal amtsep;

	private BigDecimal amttotal;

	public TmpMthCustbal() {
	}

	public String getAcctid() {
		return this.acctid;
	}

	public void setAcctid(String acctid) {
		this.acctid = acctid;
	}

	public BigDecimal getAmtapr() {
		return this.amtapr;
	}

	public void setAmtapr(BigDecimal amtapr) {
		this.amtapr = amtapr;
	}

	public BigDecimal getAmtaug() {
		return this.amtaug;
	}

	public void setAmtaug(BigDecimal amtaug) {
		this.amtaug = amtaug;
	}

	public BigDecimal getAmtdec() {
		return this.amtdec;
	}

	public void setAmtdec(BigDecimal amtdec) {
		this.amtdec = amtdec;
	}

	public BigDecimal getAmtfeb() {
		return this.amtfeb;
	}

	public void setAmtfeb(BigDecimal amtfeb) {
		this.amtfeb = amtfeb;
	}

	public BigDecimal getAmtjan() {
		return this.amtjan;
	}

	public void setAmtjan(BigDecimal amtjan) {
		this.amtjan = amtjan;
	}

	public BigDecimal getAmtjul() {
		return this.amtjul;
	}

	public void setAmtjul(BigDecimal amtjul) {
		this.amtjul = amtjul;
	}

	public BigDecimal getAmtjun() {
		return this.amtjun;
	}

	public void setAmtjun(BigDecimal amtjun) {
		this.amtjun = amtjun;
	}

	public BigDecimal getAmtmar() {
		return this.amtmar;
	}

	public void setAmtmar(BigDecimal amtmar) {
		this.amtmar = amtmar;
	}

	public BigDecimal getAmtmay() {
		return this.amtmay;
	}

	public void setAmtmay(BigDecimal amtmay) {
		this.amtmay = amtmay;
	}

	public BigDecimal getAmtnov() {
		return this.amtnov;
	}

	public void setAmtnov(BigDecimal amtnov) {
		this.amtnov = amtnov;
	}

	public BigDecimal getAmtoct() {
		return this.amtoct;
	}

	public void setAmtoct(BigDecimal amtoct) {
		this.amtoct = amtoct;
	}

	public BigDecimal getAmtsep() {
		return this.amtsep;
	}

	public void setAmtsep(BigDecimal amtsep) {
		this.amtsep = amtsep;
	}

	public BigDecimal getAmttotal() {
		return this.amttotal;
	}

	public void setAmttotal(BigDecimal amttotal) {
		this.amttotal = amttotal;
	}

}