package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CUST_LOAN_TYPE database table.
 * 
 */
@Entity
@Table(name="CUST_LOAN_TYPE")
@NamedQuery(name="CustLoanType.findAll", query="SELECT c FROM CustLoanType c")
public class CustLoanType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CREDIT_TYPE_ID")
	private BigDecimal creditTypeId;

	@Column(name="CUST_ACCT_TYPE_ID")
	private BigDecimal custAcctTypeId;

	public CustLoanType() {
	}

	public BigDecimal getCreditTypeId() {
		return this.creditTypeId;
	}

	public void setCreditTypeId(BigDecimal creditTypeId) {
		this.creditTypeId = creditTypeId;
	}

	public BigDecimal getCustAcctTypeId() {
		return this.custAcctTypeId;
	}

	public void setCustAcctTypeId(BigDecimal custAcctTypeId) {
		this.custAcctTypeId = custAcctTypeId;
	}

}