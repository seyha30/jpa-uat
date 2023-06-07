package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TB_SUBST_DEBTMASTER database table.
 * 
 */
@Entity
@Table(name="TB_SUBST_DEBTMASTER")
@NamedQuery(name="TbSubstDebtmaster.findAll", query="SELECT t FROM TbSubstDebtmaster t")
public class TbSubstDebtmaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCT_NAME")
	private String acctName;

	@Column(name="ACCT_NO")
	private String acctNo;

	@Column(name="ACCT_TYPE")
	private String acctType;

	@Column(name="DATE_DONE")
	private String dateDone;

	@Column(name="GL_DESCRIPTION")
	private String glDescription;

	@Column(name="INT_RATE")
	private String intRate;

	@Column(name="MATURITY_DATE")
	private String maturityDate;

	@Column(name="PRICIPAL_AMT")
	private BigDecimal pricipalAmt;

	@Column(name="REF_NO")
	private String refNo;

	@Column(name="START_DATE")
	private String startDate;

	@Column(name="\"TYPE\"")
	private String type;

	public TbSubstDebtmaster() {
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

	public String getAcctType() {
		return this.acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}

	public String getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(String dateDone) {
		this.dateDone = dateDone;
	}

	public String getGlDescription() {
		return this.glDescription;
	}

	public void setGlDescription(String glDescription) {
		this.glDescription = glDescription;
	}

	public String getIntRate() {
		return this.intRate;
	}

	public void setIntRate(String intRate) {
		this.intRate = intRate;
	}

	public String getMaturityDate() {
		return this.maturityDate;
	}

	public void setMaturityDate(String maturityDate) {
		this.maturityDate = maturityDate;
	}

	public BigDecimal getPricipalAmt() {
		return this.pricipalAmt;
	}

	public void setPricipalAmt(BigDecimal pricipalAmt) {
		this.pricipalAmt = pricipalAmt;
	}

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}