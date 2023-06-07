package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the NBC_LINK database table.
 * 
 */
@Entity
@Table(name="NBC_LINK")
@NamedQuery(name="NbcLink.findAll", query="SELECT n FROM NbcLink n")
public class NbcLink implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CUST_ACCT_TYPE_ID")
	private BigDecimal custAcctTypeId;

	@Column(name="JT_ID")
	private BigDecimal jtId;

	@Column(name="NBC_CODE")
	private BigDecimal nbcCode;

	private String rorn;

	private String special;

	public NbcLink() {
	}

	public BigDecimal getCustAcctTypeId() {
		return this.custAcctTypeId;
	}

	public void setCustAcctTypeId(BigDecimal custAcctTypeId) {
		this.custAcctTypeId = custAcctTypeId;
	}

	public BigDecimal getJtId() {
		return this.jtId;
	}

	public void setJtId(BigDecimal jtId) {
		this.jtId = jtId;
	}

	public BigDecimal getNbcCode() {
		return this.nbcCode;
	}

	public void setNbcCode(BigDecimal nbcCode) {
		this.nbcCode = nbcCode;
	}

	public String getRorn() {
		return this.rorn;
	}

	public void setRorn(String rorn) {
		this.rorn = rorn;
	}

	public String getSpecial() {
		return this.special;
	}

	public void setSpecial(String special) {
		this.special = special;
	}

}