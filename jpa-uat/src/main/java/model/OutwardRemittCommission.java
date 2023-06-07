package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the OUTWARD_REMITT_COMMISSION database table.
 * 
 */
@Entity
@Table(name="OUTWARD_REMITT_COMMISSION")
@NamedQuery(name="OutwardRemittCommission.findAll", query="SELECT o FROM OutwardRemittCommission o")
public class OutwardRemittCommission implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal amount;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	@Column(name="MODULE_ID")
	private BigDecimal moduleId;

	private String rate;

	@Column(name="REFERENCE_NO")
	private String referenceNo;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	public OutwardRemittCommission() {
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getCurrId() {
		return this.currId;
	}

	public void setCurrId(BigDecimal currId) {
		this.currId = currId;
	}

	public BigDecimal getModuleId() {
		return this.moduleId;
	}

	public void setModuleId(BigDecimal moduleId) {
		this.moduleId = moduleId;
	}

	public String getRate() {
		return this.rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getReferenceNo() {
		return this.referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

}