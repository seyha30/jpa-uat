package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CA_ACCRUED database table.
 * 
 */
@Entity
@Table(name="CA_ACCRUED")
@NamedQuery(name="CaAccrued.findAll", query="SELECT c FROM CaAccrued c")
public class CaAccrued implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal balance;

	private BigDecimal custacctid;

	@Column(name="REF_NO")
	private String refNo;

	public CaAccrued() {
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

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

}