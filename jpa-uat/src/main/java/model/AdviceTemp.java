package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ADVICE_TEMP database table.
 * 
 */
@Entity
@Table(name="ADVICE_TEMP")
@NamedQuery(name="AdviceTemp.findAll", query="SELECT a FROM AdviceTemp a")
public class AdviceTemp implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal custacctid;

	@Column(name="DATE_DONE")
	private Object dateDone;

	private String description;

	private String rate;

	@Column(name="RIGHTS_ID")
	private String rightsId;

	@Column(name="TEMP_TRANXID")
	private BigDecimal tempTranxid;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	public AdviceTemp() {
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRate() {
		return this.rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getRightsId() {
		return this.rightsId;
	}

	public void setRightsId(String rightsId) {
		this.rightsId = rightsId;
	}

	public BigDecimal getTempTranxid() {
		return this.tempTranxid;
	}

	public void setTempTranxid(BigDecimal tempTranxid) {
		this.tempTranxid = tempTranxid;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

}