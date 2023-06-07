package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the ACCT_CODE database table.
 * 
 */
@Entity
@Table(name="ACCT_CODE")
@NamedQuery(name="AcctCode.findAll", query="SELECT a FROM AcctCode a")
public class AcctCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ACCT_ID")
	private long acctId;

	private String description;

	@Column(name="GROUP_ID")
	private BigDecimal groupId;

	@Column(name="GROUP_NO")
	private BigDecimal groupNo;

	private String name;

	//bi-directional many-to-one association to AcctType
	@ManyToOne
	@JoinColumn(name="ACCT_TYPE_ID")
	private AcctType acctType;

	//bi-directional many-to-one association to CurrencyCode
	@ManyToOne
	@JoinColumn(name="CURR_ID")
	private CurrencyCode currencyCode;

	//bi-directional many-to-one association to AssetReportChart
	@OneToMany(mappedBy="acctCode")
	private List<AssetReportChart> assetReportCharts;

	//bi-directional many-to-one association to LiabilityReportChart
	@OneToMany(mappedBy="acctCode")
	private List<LiabilityReportChart> liabilityReportCharts;

	//bi-directional many-to-one association to PlReportChart
	@OneToMany(mappedBy="acctCode")
	private List<PlReportChart> plReportCharts;

	public AcctCode() {
	}

	public long getAcctId() {
		return this.acctId;
	}

	public void setAcctId(long acctId) {
		this.acctId = acctId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getGroupId() {
		return this.groupId;
	}

	public void setGroupId(BigDecimal groupId) {
		this.groupId = groupId;
	}

	public BigDecimal getGroupNo() {
		return this.groupNo;
	}

	public void setGroupNo(BigDecimal groupNo) {
		this.groupNo = groupNo;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AcctType getAcctType() {
		return this.acctType;
	}

	public void setAcctType(AcctType acctType) {
		this.acctType = acctType;
	}

	public CurrencyCode getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(CurrencyCode currencyCode) {
		this.currencyCode = currencyCode;
	}

	public List<AssetReportChart> getAssetReportCharts() {
		return this.assetReportCharts;
	}

	public void setAssetReportCharts(List<AssetReportChart> assetReportCharts) {
		this.assetReportCharts = assetReportCharts;
	}

	public AssetReportChart addAssetReportChart(AssetReportChart assetReportChart) {
		getAssetReportCharts().add(assetReportChart);
		assetReportChart.setAcctCode(this);

		return assetReportChart;
	}

	public AssetReportChart removeAssetReportChart(AssetReportChart assetReportChart) {
		getAssetReportCharts().remove(assetReportChart);
		assetReportChart.setAcctCode(null);

		return assetReportChart;
	}

	public List<LiabilityReportChart> getLiabilityReportCharts() {
		return this.liabilityReportCharts;
	}

	public void setLiabilityReportCharts(List<LiabilityReportChart> liabilityReportCharts) {
		this.liabilityReportCharts = liabilityReportCharts;
	}

	public LiabilityReportChart addLiabilityReportChart(LiabilityReportChart liabilityReportChart) {
		getLiabilityReportCharts().add(liabilityReportChart);
		liabilityReportChart.setAcctCode(this);

		return liabilityReportChart;
	}

	public LiabilityReportChart removeLiabilityReportChart(LiabilityReportChart liabilityReportChart) {
		getLiabilityReportCharts().remove(liabilityReportChart);
		liabilityReportChart.setAcctCode(null);

		return liabilityReportChart;
	}

	public List<PlReportChart> getPlReportCharts() {
		return this.plReportCharts;
	}

	public void setPlReportCharts(List<PlReportChart> plReportCharts) {
		this.plReportCharts = plReportCharts;
	}

	public PlReportChart addPlReportChart(PlReportChart plReportChart) {
		getPlReportCharts().add(plReportChart);
		plReportChart.setAcctCode(this);

		return plReportChart;
	}

	public PlReportChart removePlReportChart(PlReportChart plReportChart) {
		getPlReportCharts().remove(plReportChart);
		plReportChart.setAcctCode(null);

		return plReportChart;
	}

}