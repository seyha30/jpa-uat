package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the REPORT_MASTER database table.
 * 
 */
@Entity
@Table(name="REPORT_MASTER")
@NamedQuery(name="ReportMaster.findAll", query="SELECT r FROM ReportMaster r")
public class ReportMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="REPORT_ID")
	private long reportId;

	@Column(name="REPORT_COLS")
	private BigDecimal reportCols;

	@Column(name="REPORT_NAME")
	private String reportName;

	public ReportMaster() {
	}

	public long getReportId() {
		return this.reportId;
	}

	public void setReportId(long reportId) {
		this.reportId = reportId;
	}

	public BigDecimal getReportCols() {
		return this.reportCols;
	}

	public void setReportCols(BigDecimal reportCols) {
		this.reportCols = reportCols;
	}

	public String getReportName() {
		return this.reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

}