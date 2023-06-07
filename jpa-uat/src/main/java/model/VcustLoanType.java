package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the VCUST_LOAN_TYPE database table.
 * 
 */
@Entity
@Table(name="VCUST_LOAN_TYPE")
@NamedQuery(name="VcustLoanType.findAll", query="SELECT v FROM VcustLoanType v")
public class VcustLoanType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CREDIT_TYPE_ID")
	private BigDecimal creditTypeId;

	private String credittype;

	@Column(name="CUST_ACCT_TYPE_ID")
	private BigDecimal custAcctTypeId;

	private String custaccttype;

	public VcustLoanType() {
	}

	public BigDecimal getCreditTypeId() {
		return this.creditTypeId;
	}

	public void setCreditTypeId(BigDecimal creditTypeId) {
		this.creditTypeId = creditTypeId;
	}

	public String getCredittype() {
		return this.credittype;
	}

	public void setCredittype(String credittype) {
		this.credittype = credittype;
	}

	public BigDecimal getCustAcctTypeId() {
		return this.custAcctTypeId;
	}

	public void setCustAcctTypeId(BigDecimal custAcctTypeId) {
		this.custAcctTypeId = custAcctTypeId;
	}

	public String getCustaccttype() {
		return this.custaccttype;
	}

	public void setCustaccttype(String custaccttype) {
		this.custaccttype = custaccttype;
	}

}