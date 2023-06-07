package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TRANX_TYPE database table.
 * 
 */
@Entity
@Table(name="TRANX_TYPE")
@NamedQuery(name="TranxType.findAll", query="SELECT t FROM TranxType t")
public class TranxType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TT_ID")
	private long ttId;

	private String deleted;

	private String description;

	@Column(name="TT_CODE")
	private String ttCode;

	//bi-directional many-to-one association to TranxChart
	@OneToMany(mappedBy="tranxType")
	private List<TranxChart> tranxCharts;

	//bi-directional many-to-one association to TranxCat
	@ManyToOne
	@JoinColumn(name="CAT_ID")
	private TranxCat tranxCat;

	//bi-directional many-to-many association to Module
	@ManyToMany
	@JoinTable(
		name="TTM"
		, joinColumns={
			@JoinColumn(name="TT_ID")
			}
		, inverseJoinColumns={
			@JoinColumn(name="MODULE_ID")
			}
		)
	private List<Module> modules;

	public TranxType() {
	}

	public long getTtId() {
		return this.ttId;
	}

	public void setTtId(long ttId) {
		this.ttId = ttId;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTtCode() {
		return this.ttCode;
	}

	public void setTtCode(String ttCode) {
		this.ttCode = ttCode;
	}

	public List<TranxChart> getTranxCharts() {
		return this.tranxCharts;
	}

	public void setTranxCharts(List<TranxChart> tranxCharts) {
		this.tranxCharts = tranxCharts;
	}

	public TranxChart addTranxChart(TranxChart tranxChart) {
		getTranxCharts().add(tranxChart);
		tranxChart.setTranxType(this);

		return tranxChart;
	}

	public TranxChart removeTranxChart(TranxChart tranxChart) {
		getTranxCharts().remove(tranxChart);
		tranxChart.setTranxType(null);

		return tranxChart;
	}

	public TranxCat getTranxCat() {
		return this.tranxCat;
	}

	public void setTranxCat(TranxCat tranxCat) {
		this.tranxCat = tranxCat;
	}

	public List<Module> getModules() {
		return this.modules;
	}

	public void setModules(List<Module> modules) {
		this.modules = modules;
	}

}