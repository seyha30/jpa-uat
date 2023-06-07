package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the VCUST_TRANX_TYPE database table.
 * 
 */
@Entity
@Table(name="VCUST_TRANX_TYPE")
@NamedQuery(name="VcustTranxType.findAll", query="SELECT v FROM VcustTranxType v")
public class VcustTranxType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CUST_ACCT_TYPE_ID")
	private BigDecimal custAcctTypeId;

	private String custtype;

	private String tranxtype;

	@Column(name="TT_ID")
	private BigDecimal ttId;

	public VcustTranxType() {
	}

	public BigDecimal getCustAcctTypeId() {
		return this.custAcctTypeId;
	}

	public void setCustAcctTypeId(BigDecimal custAcctTypeId) {
		this.custAcctTypeId = custAcctTypeId;
	}

	public String getCusttype() {
		return this.custtype;
	}

	public void setCusttype(String custtype) {
		this.custtype = custtype;
	}

	public String getTranxtype() {
		return this.tranxtype;
	}

	public void setTranxtype(String tranxtype) {
		this.tranxtype = tranxtype;
	}

	public BigDecimal getTtId() {
		return this.ttId;
	}

	public void setTtId(BigDecimal ttId) {
		this.ttId = ttId;
	}

}