package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the MONTHLY_DEPRECIATION_SLIP database table.
 * 
 */
@Entity
@Table(name="MONTHLY_DEPRECIATION_SLIP")
@NamedQuery(name="MonthlyDepreciationSlip.findAll", query="SELECT m FROM MonthlyDepreciationSlip m")
public class MonthlyDepreciationSlip implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCT_ID")
	private BigDecimal acctId;

	@Column(name="AMOUNT_IN_WORD")
	private String amountInWord;

	@Column(name="ASSET_GL_NAMECR")
	private String assetGlNamecr;

	@Column(name="ASSET_GL_NAMEDB")
	private String assetGlNamedb;

	@Column(name="ASSET_GL_NUMBECAB")
	private String assetGlNumbecab;

	@Column(name="ASSET_GL_NUMBERCR")
	private String assetGlNumbercr;

	@Column(name="CRACCT_ID")
	private BigDecimal cracctId;

	@Column(name="DEPRE_AMOUNT")
	private BigDecimal depreAmount;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	public MonthlyDepreciationSlip() {
	}

	public BigDecimal getAcctId() {
		return this.acctId;
	}

	public void setAcctId(BigDecimal acctId) {
		this.acctId = acctId;
	}

	public String getAmountInWord() {
		return this.amountInWord;
	}

	public void setAmountInWord(String amountInWord) {
		this.amountInWord = amountInWord;
	}

	public String getAssetGlNamecr() {
		return this.assetGlNamecr;
	}

	public void setAssetGlNamecr(String assetGlNamecr) {
		this.assetGlNamecr = assetGlNamecr;
	}

	public String getAssetGlNamedb() {
		return this.assetGlNamedb;
	}

	public void setAssetGlNamedb(String assetGlNamedb) {
		this.assetGlNamedb = assetGlNamedb;
	}

	public String getAssetGlNumbecab() {
		return this.assetGlNumbecab;
	}

	public void setAssetGlNumbecab(String assetGlNumbecab) {
		this.assetGlNumbecab = assetGlNumbecab;
	}

	public String getAssetGlNumbercr() {
		return this.assetGlNumbercr;
	}

	public void setAssetGlNumbercr(String assetGlNumbercr) {
		this.assetGlNumbercr = assetGlNumbercr;
	}

	public BigDecimal getCracctId() {
		return this.cracctId;
	}

	public void setCracctId(BigDecimal cracctId) {
		this.cracctId = cracctId;
	}

	public BigDecimal getDepreAmount() {
		return this.depreAmount;
	}

	public void setDepreAmount(BigDecimal depreAmount) {
		this.depreAmount = depreAmount;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

}