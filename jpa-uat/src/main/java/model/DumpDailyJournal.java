package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the DUMP_DAILY_JOURNAL database table.
 * 
 */
@Entity
@Table(name="DUMP_DAILY_JOURNAL")
@NamedQuery(name="DumpDailyJournal.findAll", query="SELECT d FROM DumpDailyJournal d")
public class DumpDailyJournal implements Serializable {
	private static final long serialVersionUID = 1L;

	private String branch;

	private String ccy;

	@Column(name="CR_AMOUNT")
	private BigDecimal crAmount;

	@Column(name="DATE_DONE")
	private Object dateDone;

	private String description;

	@Column(name="DONE_BY")
	private String doneBy;

	@Column(name="DR_AMOUNT")
	private BigDecimal drAmount;

	@Column(name="GL_CODE")
	private String glCode;

	private String glname;

	@Column(name="TRANX_DETAIL_ID")
	private BigDecimal tranxDetailId;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	public DumpDailyJournal() {
	}

	public String getBranch() {
		return this.branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCcy() {
		return this.ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public BigDecimal getCrAmount() {
		return this.crAmount;
	}

	public void setCrAmount(BigDecimal crAmount) {
		this.crAmount = crAmount;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDoneBy() {
		return this.doneBy;
	}

	public void setDoneBy(String doneBy) {
		this.doneBy = doneBy;
	}

	public BigDecimal getDrAmount() {
		return this.drAmount;
	}

	public void setDrAmount(BigDecimal drAmount) {
		this.drAmount = drAmount;
	}

	public String getGlCode() {
		return this.glCode;
	}

	public void setGlCode(String glCode) {
		this.glCode = glCode;
	}

	public String getGlname() {
		return this.glname;
	}

	public void setGlname(String glname) {
		this.glname = glname;
	}

	public BigDecimal getTranxDetailId() {
		return this.tranxDetailId;
	}

	public void setTranxDetailId(BigDecimal tranxDetailId) {
		this.tranxDetailId = tranxDetailId;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

}