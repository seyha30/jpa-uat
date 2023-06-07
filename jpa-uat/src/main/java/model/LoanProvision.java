package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the LOAN_PROVISION database table.
 * 
 */
@Entity
@Table(name="LOAN_PROVISION")
@NamedQuery(name="LoanProvision.findAll", query="SELECT l FROM LoanProvision l")
public class LoanProvision implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal branch;

	private String deleted;

	@Column(name="EXP_DATE")
	private Object expDate;

	@Column(name="LN_STATUS_CODE")
	private BigDecimal lnStatusCode;

	@Column(name="REF_NO")
	private String refNo;

	private String remarks;

	@Column(name="STA_DATE")
	private Object staDate;

	public LoanProvision() {
	}

	public BigDecimal getBranch() {
		return this.branch;
	}

	public void setBranch(BigDecimal branch) {
		this.branch = branch;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public Object getExpDate() {
		return this.expDate;
	}

	public void setExpDate(Object expDate) {
		this.expDate = expDate;
	}

	public BigDecimal getLnStatusCode() {
		return this.lnStatusCode;
	}

	public void setLnStatusCode(BigDecimal lnStatusCode) {
		this.lnStatusCode = lnStatusCode;
	}

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Object getStaDate() {
		return this.staDate;
	}

	public void setStaDate(Object staDate) {
		this.staDate = staDate;
	}

}