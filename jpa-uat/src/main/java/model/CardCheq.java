package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CARD_CHEQ database table.
 * 
 */
@Entity
@Table(name="CARD_CHEQ")
@NamedQuery(name="CardCheq.findAll", query="SELECT c FROM CardCheq c")
public class CardCheq implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CC_CUST_NO")
	private String ccCustNo;

	@Column(name="CHEQ_AMT")
	private BigDecimal cheqAmt;

	@Column(name="CHEQ_NO")
	private String cheqNo;

	@Column(name="CHEQ_TRANX_ID")
	private BigDecimal cheqTranxId;

	private String cleared;

	@Column(name="CREDIT_CARD_N")
	private String creditCardN;

	@Column(name="DP_DATE")
	private Object dpDate;

	@Column(name="STATUS_ID")
	private String statusId;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	public CardCheq() {
	}

	public String getCcCustNo() {
		return this.ccCustNo;
	}

	public void setCcCustNo(String ccCustNo) {
		this.ccCustNo = ccCustNo;
	}

	public BigDecimal getCheqAmt() {
		return this.cheqAmt;
	}

	public void setCheqAmt(BigDecimal cheqAmt) {
		this.cheqAmt = cheqAmt;
	}

	public String getCheqNo() {
		return this.cheqNo;
	}

	public void setCheqNo(String cheqNo) {
		this.cheqNo = cheqNo;
	}

	public BigDecimal getCheqTranxId() {
		return this.cheqTranxId;
	}

	public void setCheqTranxId(BigDecimal cheqTranxId) {
		this.cheqTranxId = cheqTranxId;
	}

	public String getCleared() {
		return this.cleared;
	}

	public void setCleared(String cleared) {
		this.cleared = cleared;
	}

	public String getCreditCardN() {
		return this.creditCardN;
	}

	public void setCreditCardN(String creditCardN) {
		this.creditCardN = creditCardN;
	}

	public Object getDpDate() {
		return this.dpDate;
	}

	public void setDpDate(Object dpDate) {
		this.dpDate = dpDate;
	}

	public String getStatusId() {
		return this.statusId;
	}

	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

}