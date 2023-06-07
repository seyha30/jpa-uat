package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TMP_SAINT database table.
 * 
 */
@Entity
@Table(name="TMP_SAINT")
@NamedQuery(name="TmpSaint.findAll", query="SELECT t FROM TmpSaint t")
public class TmpSaint implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCRUED_INT")
	private BigDecimal accruedInt;

	private String acctno;

	private BigDecimal balance;

	private BigDecimal custacctid;

	private String name;

	private BigDecimal prevaccr;

	private String refno;

	public TmpSaint() {
	}

	public BigDecimal getAccruedInt() {
		return this.accruedInt;
	}

	public void setAccruedInt(BigDecimal accruedInt) {
		this.accruedInt = accruedInt;
	}

	public String getAcctno() {
		return this.acctno;
	}

	public void setAcctno(String acctno) {
		this.acctno = acctno;
	}

	public BigDecimal getBalance() {
		return this.balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public BigDecimal getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(BigDecimal custacctid) {
		this.custacctid = custacctid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrevaccr() {
		return this.prevaccr;
	}

	public void setPrevaccr(BigDecimal prevaccr) {
		this.prevaccr = prevaccr;
	}

	public String getRefno() {
		return this.refno;
	}

	public void setRefno(String refno) {
		this.refno = refno;
	}

}