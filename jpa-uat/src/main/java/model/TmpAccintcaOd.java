package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TMP_ACCINTCA_OD database table.
 * 
 */
@Entity
@Table(name="TMP_ACCINTCA_OD")
@NamedQuery(name="TmpAccintcaOd.findAll", query="SELECT t FROM TmpAccintcaOd t")
public class TmpAccintcaOd implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal amtcr;

	private BigDecimal amtdr;

	private BigDecimal bal;

	private BigDecimal custacctid;

	private String custno;

	private BigDecimal id;

	@Column(name="INT_R")
	private String intR;

	private String name;

	private BigDecimal pbal;

	private BigDecimal prbal;

	private String refno;

	public TmpAccintcaOd() {
	}

	public BigDecimal getAmtcr() {
		return this.amtcr;
	}

	public void setAmtcr(BigDecimal amtcr) {
		this.amtcr = amtcr;
	}

	public BigDecimal getAmtdr() {
		return this.amtdr;
	}

	public void setAmtdr(BigDecimal amtdr) {
		this.amtdr = amtdr;
	}

	public BigDecimal getBal() {
		return this.bal;
	}

	public void setBal(BigDecimal bal) {
		this.bal = bal;
	}

	public BigDecimal getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(BigDecimal custacctid) {
		this.custacctid = custacctid;
	}

	public String getCustno() {
		return this.custno;
	}

	public void setCustno(String custno) {
		this.custno = custno;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getIntR() {
		return this.intR;
	}

	public void setIntR(String intR) {
		this.intR = intR;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPbal() {
		return this.pbal;
	}

	public void setPbal(BigDecimal pbal) {
		this.pbal = pbal;
	}

	public BigDecimal getPrbal() {
		return this.prbal;
	}

	public void setPrbal(BigDecimal prbal) {
		this.prbal = prbal;
	}

	public String getRefno() {
		return this.refno;
	}

	public void setRefno(String refno) {
		this.refno = refno;
	}

}