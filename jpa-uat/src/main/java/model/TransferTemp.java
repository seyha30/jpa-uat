package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TRANSFER_TEMP database table.
 * 
 */
@Entity
@Table(name="TRANSFER_TEMP")
@NamedQuery(name="TransferTemp.findAll", query="SELECT t FROM TransferTemp t")
public class TransferTemp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="DATE_DONE")
	private Object dateDone;

	private BigDecimal fcustacctid;

	private BigDecimal tcustacctid;

	@Column(name="TEMP_TRANXID")
	private BigDecimal tempTranxid;

	@Column(name="TIME_DONE")
	private String timeDone;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	public TransferTemp() {
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public BigDecimal getFcustacctid() {
		return this.fcustacctid;
	}

	public void setFcustacctid(BigDecimal fcustacctid) {
		this.fcustacctid = fcustacctid;
	}

	public BigDecimal getTcustacctid() {
		return this.tcustacctid;
	}

	public void setTcustacctid(BigDecimal tcustacctid) {
		this.tcustacctid = tcustacctid;
	}

	public BigDecimal getTempTranxid() {
		return this.tempTranxid;
	}

	public void setTempTranxid(BigDecimal tempTranxid) {
		this.tempTranxid = tempTranxid;
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