package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TMP_CONSOLIDATE_RPT database table.
 * 
 */
@Entity
@Table(name="TMP_CONSOLIDATE_RPT")
@NamedQuery(name="TmpConsolidateRpt.findAll", query="SELECT t FROM TmpConsolidateRpt t")
public class TmpConsolidateRpt implements Serializable {
	private static final long serialVersionUID = 1L;

	private String acno;

	private String description;

	private BigDecimal khrcr;

	private BigDecimal khrdr;

	private BigDecimal totcr;

	private BigDecimal totdr;

	private BigDecimal usdcr;

	private BigDecimal usddr;

	public TmpConsolidateRpt() {
	}

	public String getAcno() {
		return this.acno;
	}

	public void setAcno(String acno) {
		this.acno = acno;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getKhrcr() {
		return this.khrcr;
	}

	public void setKhrcr(BigDecimal khrcr) {
		this.khrcr = khrcr;
	}

	public BigDecimal getKhrdr() {
		return this.khrdr;
	}

	public void setKhrdr(BigDecimal khrdr) {
		this.khrdr = khrdr;
	}

	public BigDecimal getTotcr() {
		return this.totcr;
	}

	public void setTotcr(BigDecimal totcr) {
		this.totcr = totcr;
	}

	public BigDecimal getTotdr() {
		return this.totdr;
	}

	public void setTotdr(BigDecimal totdr) {
		this.totdr = totdr;
	}

	public BigDecimal getUsdcr() {
		return this.usdcr;
	}

	public void setUsdcr(BigDecimal usdcr) {
		this.usdcr = usdcr;
	}

	public BigDecimal getUsddr() {
		return this.usddr;
	}

	public void setUsddr(BigDecimal usddr) {
		this.usddr = usddr;
	}

}