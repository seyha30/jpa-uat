package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the PASSBOOKPROPERTY database table.
 * 
 */
@Entity
@NamedQuery(name="Passbookproperty.findAll", query="SELECT p FROM Passbookproperty p")
public class Passbookproperty implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long passbookpropertyid;

	@Column(name="\"LINENO\"")
	private BigDecimal lineno;

	private BigDecimal linespaceno;

	private BigDecimal pageno;

	public Passbookproperty() {
	}

	public long getPassbookpropertyid() {
		return this.passbookpropertyid;
	}

	public void setPassbookpropertyid(long passbookpropertyid) {
		this.passbookpropertyid = passbookpropertyid;
	}

	public BigDecimal getLineno() {
		return this.lineno;
	}

	public void setLineno(BigDecimal lineno) {
		this.lineno = lineno;
	}

	public BigDecimal getLinespaceno() {
		return this.linespaceno;
	}

	public void setLinespaceno(BigDecimal linespaceno) {
		this.linespaceno = linespaceno;
	}

	public BigDecimal getPageno() {
		return this.pageno;
	}

	public void setPageno(BigDecimal pageno) {
		this.pageno = pageno;
	}

}