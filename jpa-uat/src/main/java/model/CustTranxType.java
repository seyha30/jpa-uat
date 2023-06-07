package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CUST_TRANX_TYPE database table.
 * 
 */
@Entity
@Table(name="CUST_TRANX_TYPE")
@NamedQuery(name="CustTranxType.findAll", query="SELECT c FROM CustTranxType c")
public class CustTranxType implements Serializable {
	private static final long serialVersionUID = 1L;

	private Object createdate;

	@Column(name="CUST_ACCT_TYPE_ID")
	private BigDecimal custAcctTypeId;

	private String deleted;

	@Column(name="TT_ID")
	private BigDecimal ttId;

	public CustTranxType() {
	}

	public Object getCreatedate() {
		return this.createdate;
	}

	public void setCreatedate(Object createdate) {
		this.createdate = createdate;
	}

	public BigDecimal getCustAcctTypeId() {
		return this.custAcctTypeId;
	}

	public void setCustAcctTypeId(BigDecimal custAcctTypeId) {
		this.custAcctTypeId = custAcctTypeId;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public BigDecimal getTtId() {
		return this.ttId;
	}

	public void setTtId(BigDecimal ttId) {
		this.ttId = ttId;
	}

}