package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the T_GETCUST_PAYACCR database table.
 * 
 */
@Entity
@Table(name="T_GETCUST_PAYACCR")
@NamedQuery(name="TGetcustPayaccr.findAll", query="SELECT t FROM TGetcustPayaccr t")
public class TGetcustPayaccr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCOUNT_NO")
	private String accountNo;

	private BigDecimal amt;

	@Column(name="DATE_PAID")
	private Object datePaid;

	private String iorp;

	@Column(name="REF_NO")
	private String refNo;

	private String status;

	public TGetcustPayaccr() {
	}

	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public BigDecimal getAmt() {
		return this.amt;
	}

	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}

	public Object getDatePaid() {
		return this.datePaid;
	}

	public void setDatePaid(Object datePaid) {
		this.datePaid = datePaid;
	}

	public String getIorp() {
		return this.iorp;
	}

	public void setIorp(String iorp) {
		this.iorp = iorp;
	}

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}