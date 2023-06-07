package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TB_GLMASTER database table.
 * 
 */
@Entity
@Table(name="TB_GLMASTER")
@NamedQuery(name="TbGlmaster.findAll", query="SELECT t FROM TbGlmaster t")
public class TbGlmaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCT_NAME")
	private String acctName;

	@Column(name="ACCT_NO")
	private String acctNo;

	@Column(name="DATE_DONE")
	private String dateDone;

	@Column(name="INT_RATE")
	private BigDecimal intRate;

	@Column(name="PRICIPAL_AMT")
	private BigDecimal pricipalAmt;

	public TbGlmaster() {
	}

	public String getAcctName() {
		return this.acctName;
	}

	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}

	public String getAcctNo() {
		return this.acctNo;
	}

	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}

	public String getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(String dateDone) {
		this.dateDone = dateDone;
	}

	public BigDecimal getIntRate() {
		return this.intRate;
	}

	public void setIntRate(BigDecimal intRate) {
		this.intRate = intRate;
	}

	public BigDecimal getPricipalAmt() {
		return this.pricipalAmt;
	}

	public void setPricipalAmt(BigDecimal pricipalAmt) {
		this.pricipalAmt = pricipalAmt;
	}

}