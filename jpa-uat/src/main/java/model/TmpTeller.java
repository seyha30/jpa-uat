package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TMP_TELLER database table.
 * 
 */
@Entity
@Table(name="TMP_TELLER")
@NamedQuery(name="TmpTeller.findAll", query="SELECT t FROM TmpTeller t")
public class TmpTeller implements Serializable {
	private static final long serialVersionUID = 1L;

	private String acctno;

	private BigDecimal amt;

	private BigDecimal balance;

	private String description;

	private String dorc;

	private String glcode;

	private String name;

	private String override;

	private BigDecimal recnum;

	private String refno;

	private String teller;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	public TmpTeller() {
	}

	public String getAcctno() {
		return this.acctno;
	}

	public void setAcctno(String acctno) {
		this.acctno = acctno;
	}

	public BigDecimal getAmt() {
		return this.amt;
	}

	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}

	public BigDecimal getBalance() {
		return this.balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDorc() {
		return this.dorc;
	}

	public void setDorc(String dorc) {
		this.dorc = dorc;
	}

	public String getGlcode() {
		return this.glcode;
	}

	public void setGlcode(String glcode) {
		this.glcode = glcode;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOverride() {
		return this.override;
	}

	public void setOverride(String override) {
		this.override = override;
	}

	public BigDecimal getRecnum() {
		return this.recnum;
	}

	public void setRecnum(BigDecimal recnum) {
		this.recnum = recnum;
	}

	public String getRefno() {
		return this.refno;
	}

	public void setRefno(String refno) {
		this.refno = refno;
	}

	public String getTeller() {
		return this.teller;
	}

	public void setTeller(String teller) {
		this.teller = teller;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

}