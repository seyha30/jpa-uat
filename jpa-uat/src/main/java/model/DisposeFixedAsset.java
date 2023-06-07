package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the DISPOSE_FIXED_ASSET database table.
 * 
 */
@Entity
@Table(name="DISPOSE_FIXED_ASSET")
@NamedQuery(name="DisposeFixedAsset.findAll", query="SELECT d FROM DisposeFixedAsset d")
public class DisposeFixedAsset implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ASSET_GL_NAME")
	private String assetGlName;

	@Column(name="ASSET_ID")
	private BigDecimal assetId;

	@Column(name="DATE_DISPOSED")
	private Object dateDisposed;

	@Column(name="DISPOSAL_DEPRE")
	private BigDecimal disposalDepre;

	@Column(name="DISPOSAL_MARGIN")
	private BigDecimal disposalMargin;

	@Column(name="DISPOSAL_VALUE")
	private BigDecimal disposalValue;

	public DisposeFixedAsset() {
	}

	public String getAssetGlName() {
		return this.assetGlName;
	}

	public void setAssetGlName(String assetGlName) {
		this.assetGlName = assetGlName;
	}

	public BigDecimal getAssetId() {
		return this.assetId;
	}

	public void setAssetId(BigDecimal assetId) {
		this.assetId = assetId;
	}

	public Object getDateDisposed() {
		return this.dateDisposed;
	}

	public void setDateDisposed(Object dateDisposed) {
		this.dateDisposed = dateDisposed;
	}

	public BigDecimal getDisposalDepre() {
		return this.disposalDepre;
	}

	public void setDisposalDepre(BigDecimal disposalDepre) {
		this.disposalDepre = disposalDepre;
	}

	public BigDecimal getDisposalMargin() {
		return this.disposalMargin;
	}

	public void setDisposalMargin(BigDecimal disposalMargin) {
		this.disposalMargin = disposalMargin;
	}

	public BigDecimal getDisposalValue() {
		return this.disposalValue;
	}

	public void setDisposalValue(BigDecimal disposalValue) {
		this.disposalValue = disposalValue;
	}

}