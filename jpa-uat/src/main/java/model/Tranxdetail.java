package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TRANXDETAIL database table.
 * 
 */
@Entity
@NamedQuery(name="Tranxdetail.findAll", query="SELECT t FROM Tranxdetail t")
public class Tranxdetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long sno;

	private String acctdesc;

	private String acctname;

	private BigDecimal bal;

	private BigDecimal bal1;

	private BigDecimal bal2;

	private String currcode;

	public Tranxdetail() {
	}

	public long getSno() {
		return this.sno;
	}

	public void setSno(long sno) {
		this.sno = sno;
	}

	public String getAcctdesc() {
		return this.acctdesc;
	}

	public void setAcctdesc(String acctdesc) {
		this.acctdesc = acctdesc;
	}

	public String getAcctname() {
		return this.acctname;
	}

	public void setAcctname(String acctname) {
		this.acctname = acctname;
	}

	public BigDecimal getBal() {
		return this.bal;
	}

	public void setBal(BigDecimal bal) {
		this.bal = bal;
	}

	public BigDecimal getBal1() {
		return this.bal1;
	}

	public void setBal1(BigDecimal bal1) {
		this.bal1 = bal1;
	}

	public BigDecimal getBal2() {
		return this.bal2;
	}

	public void setBal2(BigDecimal bal2) {
		this.bal2 = bal2;
	}

	public String getCurrcode() {
		return this.currcode;
	}

	public void setCurrcode(String currcode) {
		this.currcode = currcode;
	}

}