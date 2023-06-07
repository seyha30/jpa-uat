package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PL_REPORT_CHART database table.
 * 
 */
@Entity
@Table(name="PL_REPORT_CHART")
@NamedQuery(name="PlReportChart.findAll", query="SELECT p FROM PlReportChart p")
public class PlReportChart implements Serializable {
	private static final long serialVersionUID = 1L;

	private String dorc;

	//bi-directional many-to-one association to AcctCode
	@ManyToOne
	@JoinColumn(name="ACCT_ID")
	private AcctCode acctCode;

	//bi-directional many-to-one association to NbcPl
	@ManyToOne
	@JoinColumn(name="LINE_ID")
	private NbcPl nbcPl;

	public PlReportChart() {
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

	public NbcPl getNbcPl() {
		return this.nbcPl;
	}

	public void setNbcPl(NbcPl nbcPl) {
		this.nbcPl = nbcPl;
	}

}