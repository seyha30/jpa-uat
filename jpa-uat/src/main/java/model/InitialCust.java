package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the INITIAL_CUST database table.
 * 
 */
@Entity
@Table(name="INITIAL_CUST")
@NamedQuery(name="InitialCust.findAll", query="SELECT i FROM InitialCust i")
public class InitialCust implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long custacctid;

	@Column(name="ACCT_NUM")
	private BigDecimal acctNum;

	private BigDecimal amount;

	@Column(name="CUST_ACCT_TYPE_ID")
	private BigDecimal custAcctTypeId;

	private String dorc;

	@Column(name="\"NAMES\"")
	private String names;

	private BigDecimal odused;

	private String refno;

	private String taken;

	public InitialCust() {
	}

	public long getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(long custacctid) {
		this.custacctid = custacctid;
	}

	public BigDecimal getAcctNum() {
		return this.acctNum;
	}

	public void setAcctNum(BigDecimal acctNum) {
		this.acctNum = acctNum;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getCustAcctTypeId() {
		return this.custAcctTypeId;
	}

	public void setCustAcctTypeId(BigDecimal custAcctTypeId) {
		this.custAcctTypeId = custAcctTypeId;
	}

	public String getDorc() {
		return this.dorc;
	}

	public void setDorc(String dorc) {
		this.dorc = dorc;
	}

	public String getNames() {
		return this.names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public BigDecimal getOdused() {
		return this.odused;
	}

	public void setOdused(BigDecimal odused) {
		this.odused = odused;
	}

	public String getRefno() {
		return this.refno;
	}

	public void setRefno(String refno) {
		this.refno = refno;
	}

	public String getTaken() {
		return this.taken;
	}

	public void setTaken(String taken) {
		this.taken = taken;
	}

}