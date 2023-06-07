package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the VALIDATION_FORM database table.
 * 
 */
@Entity
@Table(name="VALIDATION_FORM")
@NamedQuery(name="ValidationForm.findAll", query="SELECT v FROM ValidationForm v")
public class ValidationForm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TRANX_ID")
	private long tranxId;

	@Column(name="ACC_NUM")
	private String accNum;

	private BigDecimal amount;

	private String ccy;

	@Column(name="CREATE_BY")
	private String createBy;

	@Column(name="DATE_DONE")
	private Object dateDone;

	@Column(name="TRAN_TYPE")
	private String tranType;

	public ValidationForm() {
	}

	public long getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(long tranxId) {
		this.tranxId = tranxId;
	}

	public String getAccNum() {
		return this.accNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCcy() {
		return this.ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public String getTranType() {
		return this.tranType;
	}

	public void setTranType(String tranType) {
		this.tranType = tranType;
	}

}