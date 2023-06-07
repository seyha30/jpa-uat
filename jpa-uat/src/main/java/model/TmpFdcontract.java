package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TMP_FDCONTRACT database table.
 * 
 */
@Entity
@Table(name="TMP_FDCONTRACT")
@NamedQuery(name="TmpFdcontract.findAll", query="SELECT t FROM TmpFdcontract t")
public class TmpFdcontract implements Serializable {
	private static final long serialVersionUID = 1L;

	private String acctno;

	@Column(name="CURR_CODE")
	private String currCode;

	private BigDecimal custacctid;

	private String custname;

	@Column(name="INT_RATE")
	private BigDecimal intRate;

	@Column(name="JOINT_NAME")
	private String jointName;

	@Column(name="MATURE_DATE")
	private String matureDate;

	@Column(name="MATURE_INT")
	private BigDecimal matureInt;

	private String period;

	private BigDecimal principal;

	private String refno;

	@Column(name="VALUE_DATE")
	private String valueDate;

	public TmpFdcontract() {
	}

	public String getAcctno() {
		return this.acctno;
	}

	public void setAcctno(String acctno) {
		this.acctno = acctno;
	}

	public String getCurrCode() {
		return this.currCode;
	}

	public void setCurrCode(String currCode) {
		this.currCode = currCode;
	}

	public BigDecimal getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(BigDecimal custacctid) {
		this.custacctid = custacctid;
	}

	public String getCustname() {
		return this.custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public BigDecimal getIntRate() {
		return this.intRate;
	}

	public void setIntRate(BigDecimal intRate) {
		this.intRate = intRate;
	}

	public String getJointName() {
		return this.jointName;
	}

	public void setJointName(String jointName) {
		this.jointName = jointName;
	}

	public String getMatureDate() {
		return this.matureDate;
	}

	public void setMatureDate(String matureDate) {
		this.matureDate = matureDate;
	}

	public BigDecimal getMatureInt() {
		return this.matureInt;
	}

	public void setMatureInt(BigDecimal matureInt) {
		this.matureInt = matureInt;
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public BigDecimal getPrincipal() {
		return this.principal;
	}

	public void setPrincipal(BigDecimal principal) {
		this.principal = principal;
	}

	public String getRefno() {
		return this.refno;
	}

	public void setRefno(String refno) {
		this.refno = refno;
	}

	public String getValueDate() {
		return this.valueDate;
	}

	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}

}