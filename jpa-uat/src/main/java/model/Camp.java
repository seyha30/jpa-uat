package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CAMP database table.
 * 
 */
@Entity
@NamedQuery(name="Camp.findAll", query="SELECT c FROM Camp c")
public class Camp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CAMP_ID")
	private BigDecimal campId;

	@Column(name="CUR_SYMBOLE")
	private String curSymbole;

	@Column(name="DATE_DONE")
	private Object dateDone;

	public Camp() {
	}

	public BigDecimal getCampId() {
		return this.campId;
	}

	public void setCampId(BigDecimal campId) {
		this.campId = campId;
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

}