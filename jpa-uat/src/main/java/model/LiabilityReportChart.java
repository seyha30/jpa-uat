package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the LIABILITY_REPORT_CHART database table.
 * 
 */
@Entity
@Table(name="LIABILITY_REPORT_CHART")
@NamedQuery(name="LiabilityReportChart.findAll", query="SELECT l FROM LiabilityReportChart l")
public class LiabilityReportChart implements Serializable {
	private static final long serialVersionUID = 1L;

	private String dorc;

	@Column(name="LINE_ID")
	private BigDecimal lineId;

	//bi-directional many-to-one association to AcctCode
	@ManyToOne
	@JoinColumn(name="ACCT_ID")
	private AcctCode acctCode;

	public LiabilityReportChart() {
	}

	public String getDorc() {
		return this.dorc;
	}

	public void setDorc(String dorc) {
		this.dorc = dorc;
	}

	public BigDecimal getLineId() {
		return this.lineId;
	}

	public void setLineId(BigDecimal lineId) {
		this.lineId = lineId;
	}

	public AcctCode getAcctCode() {
		return this.acctCode;
	}

	public void setAcctCode(AcctCode acctCode) {
		this.acctCode = acctCode;
	}

}