package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the NBC_ASSETS database table.
 * 
 */
@Entity
@Table(name="NBC_ASSETS")
@NamedQuery(name="NbcAsset.findAll", query="SELECT n FROM NbcAsset n")
public class NbcAsset implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="LINE_ID")
	private long lineId;

	private String desceng;

	private String desckmr;

	//bi-directional many-to-one association to AssetReportChart
	@OneToMany(mappedBy="nbcAsset")
	private List<AssetReportChart> assetReportCharts;

	public NbcAsset() {
	}

	public long getLineId() {
		return this.lineId;
	}

	public void setLineId(long lineId) {
		this.lineId = lineId;
	}

	public String getDesceng() {
		return this.desceng;
	}

	public void setDesceng(String desceng) {
		this.desceng = desceng;
	}

	public String getDesckmr() {
		return this.desckmr;
	}

	public void setDesckmr(String desckmr) {
		this.desckmr = desckmr;
	}

	public List<AssetReportChart> getAssetReportCharts() {
		return this.assetReportCharts;
	}

	public void setAssetReportCharts(List<AssetReportChart> assetReportCharts) {
		this.assetReportCharts = assetReportCharts;
	}

	public AssetReportChart addAssetReportChart(AssetReportChart assetReportChart) {
		getAssetReportCharts().add(assetReportChart);
		assetReportChart.setNbcAsset(this);

		return assetReportChart;
	}

	public AssetReportChart removeAssetReportChart(AssetReportChart assetReportChart) {
		getAssetReportCharts().remove(assetReportChart);
		assetReportChart.setNbcAsset(null);

		return assetReportChart;
	}

}