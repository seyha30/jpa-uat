package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the NA_MATCHGL database table.
 * 
 */
@Entity
@Table(name="NA_MATCHGL")
@NamedQuery(name="NaMatchgl.findAll", query="SELECT n FROM NaMatchgl n")
public class NaMatchgl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCT_ID_C")
	private BigDecimal acctIdC;

	@Column(name="ACCT_ID_D")
	private BigDecimal acctIdD;

	@Column(name="ACCT_ID_INTER_BR")
	private BigDecimal acctIdInterBr;

	private String active;

	@Column(name="CURR_ID")
	private String currId;

	@Column(name="DATE_DONE")
	private Object dateDone;

	private String description;

	@Column(name="FEE_GL")
	private BigDecimal feeGl;

	@Column(name="PRINCIPAL_GL")
	private BigDecimal principalGl;

	@Column(name="PRO_ID")
	private BigDecimal proId;

	private String status;

	public NaMatchgl() {
	}

	public BigDecimal getAcctIdC() {
		return this.acctIdC;
	}

	public void setAcctIdC(BigDecimal acctIdC) {
		this.acctIdC = acctIdC;
	}

	public BigDecimal getAcctIdD() {
		return this.acctIdD;
	}

	public void setAcctIdD(BigDecimal acctIdD) {
		this.acctIdD = acctIdD;
	}

	public BigDecimal getAcctIdInterBr() {
		return this.acctIdInterBr;
	}

	public void setAcctIdInterBr(BigDecimal acctIdInterBr) {
		this.acctIdInterBr = acctIdInterBr;
	}

	public String getActive() {
		return this.active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getCurrId() {
		return this.currId;
	}

	public void setCurrId(String currId) {
		this.currId = currId;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getFeeGl() {
		return this.feeGl;
	}

	public void setFeeGl(BigDecimal feeGl) {
		this.feeGl = feeGl;
	}

	public BigDecimal getPrincipalGl() {
		return this.principalGl;
	}

	public void setPrincipalGl(BigDecimal principalGl) {
		this.principalGl = principalGl;
	}

	public BigDecimal getProId() {
		return this.proId;
	}

	public void setProId(BigDecimal proId) {
		this.proId = proId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}