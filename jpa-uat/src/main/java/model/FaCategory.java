package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FA_CATEGORY database table.
 * 
 */
@Entity
@Table(name="FA_CATEGORY")
@NamedQuery(name="FaCategory.findAll", query="SELECT f FROM FaCategory f")
public class FaCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ASSETGL_ID")
	private BigDecimal assetglId;

	private String category;

	@Column(name="CURRENT_DEPRE_AMOUNT")
	private BigDecimal currentDepreAmount;

	@Column(name="EXGL_ID")
	private BigDecimal exglId;

	@Column(name="FAGL_ID")
	private BigDecimal faglId;

	@Column(name="LAST_DEPRE_DATE")
	private Object lastDepreDate;

	@Column(name="\"STATE\"")
	private String state;

	@Column(name="TOTAL_DEPRE")
	private BigDecimal totalDepre;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	public FaCategory() {
	}

	public BigDecimal getAssetglId() {
		return this.assetglId;
	}

	public void setAssetglId(BigDecimal assetglId) {
		this.assetglId = assetglId;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public BigDecimal getCurrentDepreAmount() {
		return this.currentDepreAmount;
	}

	public void setCurrentDepreAmount(BigDecimal currentDepreAmount) {
		this.currentDepreAmount = currentDepreAmount;
	}

	public BigDecimal getExglId() {
		return this.exglId;
	}

	public void setExglId(BigDecimal exglId) {
		this.exglId = exglId;
	}

	public BigDecimal getFaglId() {
		return this.faglId;
	}

	public void setFaglId(BigDecimal faglId) {
		this.faglId = faglId;
	}

	public Object getLastDepreDate() {
		return this.lastDepreDate;
	}

	public void setLastDepreDate(Object lastDepreDate) {
		this.lastDepreDate = lastDepreDate;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
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