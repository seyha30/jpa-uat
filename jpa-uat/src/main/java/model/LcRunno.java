package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the LC_RUNNO database table.
 * 
 */
@Entity
@Table(name="LC_RUNNO")
@NamedQuery(name="LcRunno.findAll", query="SELECT l FROM LcRunno l")
public class LcRunno implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal ab;

	private BigDecimal lc;

	private BigDecimal tr;

	public LcRunno() {
	}

	public BigDecimal getAb() {
		return this.ab;
	}

	public void setAb(BigDecimal ab) {
		this.ab = ab;
	}

	public BigDecimal getLc() {
		return this.lc;
	}

	public void setLc(BigDecimal lc) {
		this.lc = lc;
	}

	public BigDecimal getTr() {
		return this.tr;
	}

	public void setTr(BigDecimal tr) {
		this.tr = tr;
	}

}