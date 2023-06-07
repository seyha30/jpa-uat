package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the NA_ADVANCE database table.
 * 
 */
@Entity
@Table(name="NA_ADVANCE")
@NamedQuery(name="NaAdvance.findAll", query="SELECT n FROM NaAdvance n")
public class NaAdvance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCOUNT_NAME")
	private String accountName;

	@Column(name="ACCOUNT_NO")
	private String accountNo;

	@Column(name="ACCT_ID")
	private BigDecimal acctId;

	private BigDecimal bal;

	@Column(name="CR_ACCT_ID")
	private BigDecimal crAcctId;

	@Column(name="CURR_CODE")
	private String currCode;

	private BigDecimal installmentno;

	private BigDecimal installmenttype;

	private Object maturitydate;

	private BigDecimal rate;

	private BigDecimal repaymentamt;

	public NaAdvance() {
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public BigDecimal getAcctId() {
		return this.acctId;
	}

	public void setAcctId(BigDecimal acctId) {
		this.acctId = acctId;
	}

	public BigDecimal getBal() {
		return this.bal;
	}

	public void setBal(BigDecimal bal) {
		this.bal = bal;
	}

	public BigDecimal getCrAcctId() {
		return this.crAcctId;
	}

	public void setCrAcctId(BigDecimal crAcctId) {
		this.crAcctId = crAcctId;
	}

	public String getCurrCode() {
		return this.currCode;
	}

	public void setCurrCode(String currCode) {
		this.currCode = currCode;
	}

	public BigDecimal getInstallmentno() {
		return this.installmentno;
	}

	public void setInstallmentno(BigDecimal installmentno) {
		this.installmentno = installmentno;
	}

	public BigDecimal getInstallmenttype() {
		return this.installmenttype;
	}

	public void setInstallmenttype(BigDecimal installmenttype) {
		this.installmenttype = installmenttype;
	}

	public Object getMaturitydate() {
		return this.maturitydate;
	}

	public void setMaturitydate(Object maturitydate) {
		this.maturitydate = maturitydate;
	}

	public BigDecimal getRate() {
		return this.rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public BigDecimal getRepaymentamt() {
		return this.repaymentamt;
	}

	public void setRepaymentamt(BigDecimal repaymentamt) {
		this.repaymentamt = repaymentamt;
	}

}