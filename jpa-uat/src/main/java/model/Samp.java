package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SAMP database table.
 * 
 */
@Entity
@NamedQuery(name="Samp.findAll", query="SELECT s FROM Samp s")
public class Samp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CUR_SYMBOLE")
	private String curSymbole;

	@Column(name="DATE_DONE")
	private Object dateDone;

	@Column(name="SAMP_ID")
	private BigDecimal sampId;

	public Samp() {
	}

	public String getCurSymbole() {
		return this.curSymbole;
	}

	public void setCurSymbole(String curSymbole) {
		this.curSymbole = curSymbole;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public BigDecimal getSampId() {
		return this.sampId;
	}

	public void setSampId(BigDecimal sampId) {
		this.sampId = sampId;
	}

}