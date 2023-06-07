package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ASSET_DISPOSAL database table.
 * 
 */
@Entity
@Table(name="ASSET_DISPOSAL")
@NamedQuery(name="AssetDisposal.findAll", query="SELECT a FROM AssetDisposal a")
public class AssetDisposal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ASSET_ID")
	private BigDecimal assetId;

	@Column(name="DISP_DATE")
	private Object dispDate;

	@Column(name="DISP_DEPRE")
	private BigDecimal dispDepre;

	@Column(name="DISP_NBV")
	private BigDecimal dispNbv;

	@Column(name="DISP_UNIT")
	private BigDecimal dispUnit;

	@Column(name="DISP_VALUE")
	private BigDecimal dispValue;

	public AssetDisposal() {
	}

	public BigDecimal getAssetId() {
		return this.assetId;
	}

	public void setAssetId(BigDecimal assetId) {
		this.assetId = assetId;
	}

	public Object getDispDate() {
		return this.dispDate;
	}

	public void setDispDate(Object dispDate) {
		this.dispDate = dispDate;
	}

	public BigDecimal getDispDepre() {
		return this.dispDepre;
	}

	public void setDispDepre(BigDecimal dispDepre) {
		this.dispDepre = dispDepre;
	}

	public BigDecimal getDispNbv() {
		return this.dispNbv;
	}

	public void setDispNbv(BigDecimal dispNbv) {
		this.dispNbv = dispNbv;
	}

	public BigDecimal getDispUnit() {
		return this.dispUnit;
	}

	public void setDispUnit(BigDecimal dispUnit) {
		this.dispUnit = dispUnit;
	}

	public BigDecimal getDispValue() {
		return this.dispValue;
	}

	public void setDispValue(BigDecimal dispValue) {
		this.dispValue = dispValue;
	}

}