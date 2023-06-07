package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FA_POSTING database table.
 * 
 */
@Entity
@Table(name="FA_POSTING")
@NamedQuery(name="FaPosting.findAll", query="SELECT f FROM FaPosting f")
public class FaPosting implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal amt;

	@Column(name="ASSET_ID")
	private BigDecimal assetId;

	private BigDecimal daystillnow;

	@Column(name="DEPR_FROM")
	private Object deprFrom;

	@Column(name="DEPR_TO")
	private Object deprTo;

	@Column(name="FAGL_ID")
	private BigDecimal faglId;

	private BigDecimal pid;

	@Column(name="POST_DATE")
	private Object postDate;

	@Column(name="TOTAL_DEPRE")
	private BigDecimal totalDepre;

	public FaPosting() {
	}

	public BigDecimal getAmt() {
		return this.amt;
	}

	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}

	public BigDecimal getAssetId() {
		return this.assetId;
	}

	public void setAssetId(BigDecimal assetId) {
		this.assetId = assetId;
	}

	public BigDecimal getDaystillnow() {
		return this.daystillnow;
	}

	public void setDaystillnow(BigDecimal daystillnow) {
		this.daystillnow = daystillnow;
	}

	public Object getDeprFrom() {
		return this.deprFrom;
	}

	public void setDeprFrom(Object deprFrom) {
		this.deprFrom = deprFrom;
	}

	public Object getDeprTo() {
		return this.deprTo;
	}

	public void setDeprTo(Object deprTo) {
		this.deprTo = deprTo;
	}

	public BigDecimal getFaglId() {
		return this.faglId;
	}

	public void setFaglId(BigDecimal faglId) {
		this.faglId = faglId;
	}

	public BigDecimal getPid() {
		return this.pid;
	}

	public void setPid(BigDecimal pid) {
		this.pid = pid;
	}

	public Object getPostDate() {
		return this.postDate;
	}

	public void setPostDate(Object postDate) {
		this.postDate = postDate;
	}

	public BigDecimal getTotalDepre() {
		return this.totalDepre;
	}

	public void setTotalDepre(BigDecimal totalDepre) {
		this.totalDepre = totalDepre;
	}

}