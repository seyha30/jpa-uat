package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the DUMP_SEND_REPORT database table.
 * 
 */
@Entity
@Table(name="DUMP_SEND_REPORT")
@NamedQuery(name="DumpSendReport.findAll", query="SELECT d FROM DumpSendReport d")
public class DumpSendReport implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACT_ACC")
	private BigDecimal actAcc;

	private String branch;

	@Column(name="COL_AMT")
	private BigDecimal colAmt;

	private String currency;

	@Column(name="DATE_DONE")
	private Object dateDone;

	@Column(name="NO_COL")
	private BigDecimal noCol;

	@Column(name="NO_DIS")
	private BigDecimal noDis;

	@Column(name="NO_PO")
	private BigDecimal noPo;

	private BigDecimal os;

	private BigDecimal par30;

	@Column(name="\"PAR30%\"")
	private BigDecimal par30_;

	@Column(name="PO_AMT")
	private BigDecimal poAmt;

	@Column(name="PRIN_DIS")
	private BigDecimal prinDis;

	@Column(name="PRIN_PAID")
	private BigDecimal prinPaid;

	public DumpSendReport() {
	}

	public BigDecimal getActAcc() {
		return this.actAcc;
	}

	public void setActAcc(BigDecimal actAcc) {
		this.actAcc = actAcc;
	}

	public String getBranch() {
		return this.branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public BigDecimal getColAmt() {
		return this.colAmt;
	}

	public void setColAmt(BigDecimal colAmt) {
		this.colAmt = colAmt;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public BigDecimal getNoCol() {
		return this.noCol;
	}

	public void setNoCol(BigDecimal noCol) {
		this.noCol = noCol;
	}

	public BigDecimal getNoDis() {
		return this.noDis;
	}

	public void setNoDis(BigDecimal noDis) {
		this.noDis = noDis;
	}

	public BigDecimal getNoPo() {
		return this.noPo;
	}

	public void setNoPo(BigDecimal noPo) {
		this.noPo = noPo;
	}

	public BigDecimal getOs() {
		return this.os;
	}

	public void setOs(BigDecimal os) {
		this.os = os;
	}

	public BigDecimal getPar30() {
		return this.par30;
	}

	public void setPar30(BigDecimal par30) {
		this.par30 = par30;
	}

	public BigDecimal getPar30_() {
		return this.par30_;
	}

	public void setPar30_(BigDecimal par30_) {
		this.par30_ = par30_;
	}

	public BigDecimal getPoAmt() {
		return this.poAmt;
	}

	public void setPoAmt(BigDecimal poAmt) {
		this.poAmt = poAmt;
	}

	public BigDecimal getPrinDis() {
		return this.prinDis;
	}

	public void setPrinDis(BigDecimal prinDis) {
		this.prinDis = prinDis;
	}

	public BigDecimal getPrinPaid() {
		return this.prinPaid;
	}

	public void setPrinPaid(BigDecimal prinPaid) {
		this.prinPaid = prinPaid;
	}

}