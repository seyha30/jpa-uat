package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ASSET_REPORT_CHART database table.
 * 
 */
@Entity
@Table(name="ASSET_REPORT_CHART")
@NamedQuery(name="AssetReportChart.findAll", query="SELECT a FROM AssetReportChart a")
public class AssetReportChart implements Serializable {
	private static final long serialVersionUID = 1L;

	private String dorc;

	//bi-directional many-to-one association to AcctCode
	@ManyToOne
	@JoinColumn(name="ACCT_ID")
	private AcctCode acctCode;

	//bi-directional many-to-one association to NbcAsset
	@ManyToOne
	@JoinColumn(name="LINE_ID")
	private NbcAsset nbcAsset;

	public AssetReportChart() {
	}

	public String getDorc() {
		return this.dorc;
	}

	public void setDorc(String dorc) {
		this.dorc = dorc;
	}

	public AcctCode getAcctCode() {
		return this.acctCode;
	}

	public void setAcctCode(AcctCode acctCode) {
		this.acctCode = acctCode;
	}

	public NbcAsset getNbcAsset() {
		return this.nbcAsset;
	}

	public void setNbcAsset(NbcAsset nbcAsset) {
		this.nbcAsset = nbcAsset;
	}

}