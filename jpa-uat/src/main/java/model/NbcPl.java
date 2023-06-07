package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the NBC_PL database table.
 * 
 */
@Entity
@Table(name="NBC_PL")
@NamedQuery(name="NbcPl.findAll", query="SELECT n FROM NbcPl n")
public class NbcPl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="LINE_ID")
	private long lineId;

	private String desceng;

	private String desckmr;

	//bi-directional many-to-one association to PlReportChart
	@OneToMany(mappedBy="nbcPl")
	private List<PlReportChart> plReportCharts;

	public NbcPl() {
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

	public List<PlReportChart> getPlReportCharts() {
		return this.plReportCharts;
	}

	public void setPlReportCharts(List<PlReportChart> plReportCharts) {
		this.plReportCharts = plReportCharts;
	}

	public PlReportChart addPlReportChart(PlReportChart plReportChart) {
		getPlReportCharts().add(plReportChart);
		plReportChart.setNbcPl(this);

		return plReportChart;
	}

	public PlReportChart removePlReportChart(PlReportChart plReportChart) {
		getPlReportCharts().remove(plReportChart);
		plReportChart.setNbcPl(null);

		return plReportChart;
	}

}