package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TRANX_CHART database table.
 * 
 */
@Entity
@Table(name="TRANX_CHART")
@NamedQuery(name="TranxChart.findAll", query="SELECT t FROM TranxChart t")
public class TranxChart implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TranxChartPK id;

	//bi-directional many-to-one association to TranxType
	@ManyToOne
	@JoinColumn(name="TT_ID")
	private TranxType tranxType;

	public TranxChart() {
	}

	public TranxChartPK getId() {
		return this.id;
	}

	public void setId(TranxChartPK id) {
		this.id = id;
	}

	public TranxType getTranxType() {
		return this.tranxType;
	}

	public void setTranxType(TranxType tranxType) {
		this.tranxType = tranxType;
	}

}