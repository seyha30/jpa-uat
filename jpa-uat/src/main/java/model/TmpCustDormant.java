package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TMP_CUST_DORMANT database table.
 * 
 */
@Entity
@Table(name="TMP_CUST_DORMANT")
@NamedQuery(name="TmpCustDormant.findAll", query="SELECT t FROM TmpCustDormant t")
public class TmpCustDormant implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal amount;

	private BigDecimal balance;

	@Column(name="CUST_TRANX_ID")
	private BigDecimal custTranxId;

	private BigDecimal custacctid;

	@Column(name="DATE_DONE")
	private Object dateDone;

	private String description;

	private String dorc;

	@Column(name="TRAN_CODE")
	private String tranCode;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	public TmpCustDormant() {
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getBalance() {
		return this.balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public BigDecimal getCustTranxId() {
		return this.custTranxId;
	}

	public void setCustTranxId(BigDecimal custTranxId) {
		this.custTranxId = custTranxId;
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

	public String getDorc() {
		return this.dorc;
	}

	public void setDorc(String dorc) {
		this.dorc = dorc;
	}

	public String getTranCode() {
		return this.tranCode;
	}

	public void setTranCode(String tranCode) {
		this.tranCode = tranCode;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

}