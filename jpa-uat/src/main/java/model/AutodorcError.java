package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the AUTODORC_ERROR database table.
 * 
 */
@Entity
@Table(name="AUTODORC_ERROR")
@NamedQuery(name="AutodorcError.findAll", query="SELECT a FROM AutodorcError a")
public class AutodorcError implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal amount;

	private BigDecimal checksum;

	@Column(name="CUST_ACCT_NO")
	private String custAcctNo;

	private BigDecimal custacctid;

	private String dorc;

	@Column(name="ERROR_DATE")
	private Object errorDate;

	@Column(name="ERROR_DESCRIPTION")
	private String errorDescription;

	@Column(name="ERROR_ID")
	private BigDecimal errorId;

	@Column(name="NBC_CODE")
	private BigDecimal nbcCode;

	@Column(name="REF_NUMBER")
	private String refNumber;

	public AutodorcError() {
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getChecksum() {
		return this.checksum;
	}

	public void setChecksum(BigDecimal checksum) {
		this.checksum = checksum;
	}

	public String getCustAcctNo() {
		return this.custAcctNo;
	}

	public void setCustAcctNo(String custAcctNo) {
		this.custAcctNo = custAcctNo;
	}

	public BigDecimal getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(BigDecimal custacctid) {
		this.custacctid = custacctid;
	}

	public String getDorc() {
		return this.dorc;
	}

	public void setDorc(String dorc) {
		this.dorc = dorc;
	}

	public Object getErrorDate() {
		return this.errorDate;
	}

	public void setErrorDate(Object errorDate) {
		this.errorDate = errorDate;
	}

	public String getErrorDescription() {
		return this.errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	public BigDecimal getErrorId() {
		return this.errorId;
	}

	public void setErrorId(BigDecimal errorId) {
		this.errorId = errorId;
	}

	public BigDecimal getNbcCode() {
		return this.nbcCode;
	}

	public void setNbcCode(BigDecimal nbcCode) {
		this.nbcCode = nbcCode;
	}

	public String getRefNumber() {
		return this.refNumber;
	}

	public void setRefNumber(String refNumber) {
		this.refNumber = refNumber;
	}

}