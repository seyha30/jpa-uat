package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TB_ACCR_TRANX database table.
 * 
 */
@Entity
@Table(name="TB_ACCR_TRANX")
@NamedQuery(name="TbAccrTranx.findAll", query="SELECT t FROM TbAccrTranx t")
public class TbAccrTranx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCOUNT_NO")
	private String accountNo;

	private BigDecimal amount;

	@Column(name="DATE_DONE")
	private Object dateDone;

	@Column(name="DONE_BY")
	private String doneBy;

	@Column(name="PRE_BAL")
	private BigDecimal preBal;

	@Column(name="REF_NO")
	private String refNo;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	public TbAccrTranx() {
	}

	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public String getDoneBy() {
		return this.doneBy;
	}

	public void setDoneBy(String doneBy) {
		this.doneBy = doneBy;
	}

	public BigDecimal getPreBal() {
		return this.preBal;
	}

	public void setPreBal(BigDecimal preBal) {
		this.preBal = preBal;
	}

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

}