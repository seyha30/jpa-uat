package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FUNDING_TRAN database table.
 * 
 */
@Entity
@Table(name="FUNDING_TRAN")
@NamedQuery(name="FundingTran.findAll", query="SELECT f FROM FundingTran f")
public class FundingTran implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="FUN_TR_ID")
	private long funTrId;

	private BigDecimal amount;

	@Column(name="CREATE_DATE")
	private Object createDate;

	private String deleted;

	private String description;

	private String dorc;

	@Column(name="FUN_ID")
	private BigDecimal funId;

	@Column(name="\"TYPE\"")
	private String type;

	public FundingTran() {
	}

	public long getFunTrId() {
		return this.funTrId;
	}

	public void setFunTrId(long funTrId) {
		this.funTrId = funTrId;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Object getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Object createDate) {
		this.createDate = createDate;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDorc() {
		return this.dorc;
	}

	public void setDorc(String dorc) {
		this.dorc = dorc;
	}

	public BigDecimal getFunId() {
		return this.funId;
	}

	public void setFunId(BigDecimal funId) {
		this.funId = funId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}