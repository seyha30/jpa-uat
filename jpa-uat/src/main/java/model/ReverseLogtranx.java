package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the REVERSE_LOGTRANX database table.
 * 
 */
@Entity
@Table(name="REVERSE_LOGTRANX")
@NamedQuery(name="ReverseLogtranx.findAll", query="SELECT r FROM ReverseLogtranx r")
public class ReverseLogtranx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CARD_NO")
	private String cardNo;

	private String cardname;

	@Column(name="DONE_BY")
	private String doneBy;

	private String resion;

	@Column(name="REVERSE_BY")
	private String reverseBy;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	@Column(name="TRX_AMOUNT")
	private BigDecimal trxAmount;

	@Column(name="TRX_DATE")
	private Object trxDate;

	public ReverseLogtranx() {
	}

	public String getCardNo() {
		return this.cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardname() {
		return this.cardname;
	}

	public void setCardname(String cardname) {
		this.cardname = cardname;
	}

	public String getDoneBy() {
		return this.doneBy;
	}

	public void setDoneBy(String doneBy) {
		this.doneBy = doneBy;
	}

	public String getResion() {
		return this.resion;
	}

	public void setResion(String resion) {
		this.resion = resion;
	}

	public String getReverseBy() {
		return this.reverseBy;
	}

	public void setReverseBy(String reverseBy) {
		this.reverseBy = reverseBy;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

	public BigDecimal getTrxAmount() {
		return this.trxAmount;
	}

	public void setTrxAmount(BigDecimal trxAmount) {
		this.trxAmount = trxAmount;
	}

	public Object getTrxDate() {
		return this.trxDate;
	}

	public void setTrxDate(Object trxDate) {
		this.trxDate = trxDate;
	}

}