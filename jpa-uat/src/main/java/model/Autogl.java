package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the AUTOGL database table.
 * 
 */
@Entity
@NamedQuery(name="Autogl.findAll", query="SELECT a FROM Autogl a")
public class Autogl implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal cracct;

	private BigDecimal crlastbal;

	private BigDecimal crlastytd;

	private BigDecimal crtranxid;

	private BigDecimal dracct;

	private BigDecimal drlastbal;

	private BigDecimal drlastytd;

	private BigDecimal drtranxid;

	private Object lastupdate;

	public Autogl() {
	}

	public BigDecimal getCracct() {
		return this.cracct;
	}

	public void setCracct(BigDecimal cracct) {
		this.cracct = cracct;
	}

	public BigDecimal getCrlastbal() {
		return this.crlastbal;
	}

	public void setCrlastbal(BigDecimal crlastbal) {
		this.crlastbal = crlastbal;
	}

	public BigDecimal getCrlastytd() {
		return this.crlastytd;
	}

	public void setCrlastytd(BigDecimal crlastytd) {
		this.crlastytd = crlastytd;
	}

	public BigDecimal getCrtranxid() {
		return this.crtranxid;
	}

	public void setCrtranxid(BigDecimal crtranxid) {
		this.crtranxid = crtranxid;
	}

	public BigDecimal getDracct() {
		return this.dracct;
	}

	public void setDracct(BigDecimal dracct) {
		this.dracct = dracct;
	}

	public BigDecimal getDrlastbal() {
		return this.drlastbal;
	}

	public void setDrlastbal(BigDecimal drlastbal) {
		this.drlastbal = drlastbal;
	}

	public BigDecimal getDrlastytd() {
		return this.drlastytd;
	}

	public void setDrlastytd(BigDecimal drlastytd) {
		this.drlastytd = drlastytd;
	}

	public BigDecimal getDrtranxid() {
		return this.drtranxid;
	}

	public void setDrtranxid(BigDecimal drtranxid) {
		this.drtranxid = drtranxid;
	}

	public Object getLastupdate() {
		return this.lastupdate;
	}

	public void setLastupdate(Object lastupdate) {
		this.lastupdate = lastupdate;
	}

}