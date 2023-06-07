package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CUST_INFO_CUST_ACCT database table.
 * 
 */
@Entity
@Table(name="CUST_INFO_CUST_ACCT")
@NamedQuery(name="CustInfoCustAcct.findAll", query="SELECT c FROM CustInfoCustAcct c")
public class CustInfoCustAcct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CUST_KEY_CHAR")
	private String custKeyChar;

	@Column(name="JT_ID")
	private BigDecimal jtId;

	@Column(name="\"MAIN\"")
	private String main;

	private String required;

	//bi-directional many-to-one association to CustAcct
	@ManyToOne
	@JoinColumn(name="CUSTACCTID")
	private CustAcct custAcct;

	//bi-directional many-to-one association to CustInfo
	@ManyToOne
	@JoinColumn(name="CUST_KEY_NUM")
	private CustInfo custInfo;

	public CustInfoCustAcct() {
	}

	public String getCustKeyChar() {
		return this.custKeyChar;
	}

	public void setCustKeyChar(String custKeyChar) {
		this.custKeyChar = custKeyChar;
	}

	public BigDecimal getJtId() {
		return this.jtId;
	}

	public void setJtId(BigDecimal jtId) {
		this.jtId = jtId;
	}

	public String getMain() {
		return this.main;
	}

	public void setMain(String main) {
		this.main = main;
	}

	public String getRequired() {
		return this.required;
	}

	public void setRequired(String required) {
		this.required = required;
	}

	public CustAcct getCustAcct() {
		return this.custAcct;
	}

	public void setCustAcct(CustAcct custAcct) {
		this.custAcct = custAcct;
	}

	public CustInfo getCustInfo() {
		return this.custInfo;
	}

	public void setCustInfo(CustInfo custInfo) {
		this.custInfo = custInfo;
	}

}