package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CHQ_TEMP database table.
 * 
 */
@Entity
@Table(name="CHQ_TEMP")
@NamedQuery(name="ChqTemp.findAll", query="SELECT c FROM ChqTemp c")
public class ChqTemp implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal amount;

	private BigDecimal custacctid;

	@Column(name="DATE_DONE")
	private Object dateDone;

	@Column(name="TEMP_CHQID")
	private BigDecimal tempChqid;

	private BigDecimal thismodule;

	@Column(name="TIME_DONE")
	private String timeDone;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	public ChqTemp() {
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(BigDecimal custacctid) {
		this.custacctid = custacctid;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public BigDecimal getTempChqid() {
		return this.tempChqid;
	}

	public void setTempChqid(BigDecimal tempChqid) {
		this.tempChqid = tempChqid;
	}

	public BigDecimal getThismodule() {
		return this.thismodule;
	}

	public void setThismodule(BigDecimal thismodule) {
		this.thismodule = thismodule;
	}

	public String getTimeDone() {
		return this.timeDone;
	}

	public void setTimeDone(String timeDone) {
		this.timeDone = timeDone;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

}