package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FIXED_ASSET_CATEGORIES database table.
 * 
 */
@Entity
@Table(name="FIXED_ASSET_CATEGORIES")
@NamedQuery(name="FixedAssetCategory.findAll", query="SELECT f FROM FixedAssetCategory f")
public class FixedAssetCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCT_ID")
	private BigDecimal acctId;

	@Column(name="ASSET_GL_NAME")
	private String assetGlName;

	@Column(name="CURRENT_DEPRE_AMOUNT")
	private BigDecimal currentDepreAmount;

	@Column(name="EXP_GL")
	private BigDecimal expGl;

	@Column(name="LAST_DEPRE_DATE")
	private Object lastDepreDate;

	@Column(name="NET_BOOK_VALUE")
	private BigDecimal netBookValue;

	@Column(name="\"STATE\"")
	private String state;

	@Column(name="TOTAL_COST")
	private BigDecimal totalCost;

	@Column(name="TOTAL_DEPRE")
	private BigDecimal totalDepre;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	public FixedAssetCategory() {
	}

	public BigDecimal getAcctId() {
		return this.acctId;
	}

	public void setAcctId(BigDecimal acctId) {
		this.acctId = acctId;
	}

	public String getAssetGlName() {
		return this.assetGlName;
	}

	public void setAssetGlName(String assetGlName) {
		this.assetGlName = assetGlName;
	}

	public BigDecimal getCurrentDepreAmount() {
		return this.currentDepreAmount;
	}

	public void setCurrentDepreAmount(BigDecimal currentDepreAmount) {
		this.currentDepreAmount = currentDepreAmount;
	}

	public BigDecimal getExpGl() {
		return this.expGl;
	}

	public void setExpGl(BigDecimal expGl) {
		this.expGl = expGl;
	}

	public Object getLastDepreDate() {
		return this.lastDepreDate;
	}

	public void setLastDepreDate(Object lastDepreDate) {
		this.lastDepreDate = lastDepreDate;
	}

	public BigDecimal getNetBookValue() {
		return this.netBookValue;
	}

	public void setNetBookValue(BigDecimal netBookValue) {
		this.netBookValue = netBookValue;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public BigDecimal getTotalCost() {
		return this.totalCost;
	}

	public void setTotalCost(BigDecimal totalCost) {
		this.totalCost = totalCost;
	}

	public BigDecimal getTotalDepre() {
		return this.totalDepre;
	}

	public void setTotalDepre(BigDecimal totalDepre) {
		this.totalDepre = totalDepre;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

}