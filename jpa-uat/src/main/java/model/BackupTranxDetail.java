package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the BACKUP_TRANX_DETAIL database table.
 * 
 */
@Entity
@Table(name="BACKUP_TRANX_DETAIL")
@NamedQuery(name="BackupTranxDetail.findAll", query="SELECT b FROM BackupTranxDetail b")
public class BackupTranxDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCT_ID")
	private BigDecimal acctId;

	private BigDecimal amt;

	private BigDecimal bal;

	private String dorc;

	@Column(name="TRANX_DETAIL_ID")
	private BigDecimal tranxDetailId;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	private BigDecimal ytdbal;

	public BackupTranxDetail() {
	}

	public BigDecimal getAcctId() {
		return this.acctId;
	}

	public void setAcctId(BigDecimal acctId) {
		this.acctId = acctId;
	}

	public BigDecimal getAmt() {
		return this.amt;
	}

	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}

	public BigDecimal getBal() {
		return this.bal;
	}

	public void setBal(BigDecimal bal) {
		this.bal = bal;
	}

	public String getDorc() {
		return this.dorc;
	}

	public void setDorc(String dorc) {
		this.dorc = dorc;
	}

	public BigDecimal getTranxDetailId() {
		return this.tranxDetailId;
	}

	public void setTranxDetailId(BigDecimal tranxDetailId) {
		this.tranxDetailId = tranxDetailId;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

	public BigDecimal getYtdbal() {
		return this.ytdbal;
	}

	public void setYtdbal(BigDecimal ytdbal) {
		this.ytdbal = ytdbal;
	}

}