package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CLVW_LOAN_DISBURSEMENT_VOCHER database table.
 * 
 */
@Entity
@Table(name="CLVW_LOAN_DISBURSEMENT_VOCHER")
@NamedQuery(name="ClvwLoanDisbursementVocher.findAll", query="SELECT c FROM ClvwLoanDisbursementVocher c")
public class ClvwLoanDisbursementVocher implements Serializable {
	private static final long serialVersionUID = 1L;

	private String address;

	@Column(name="CREDIT_FAC_REF_NO")
	private String creditFacRefNo;

	private String currency;

	@Column(name="CURRENCY_EN")
	private String currencyEn;

	@Column(name="CUST_KEY_NUM")
	private String custKeyNum;

	private String custrefno;

	@Column(name="DESCRIPTION_KH")
	private String descriptionKh;

	@Column(name="FAC_REF_NO")
	private String facRefNo;

	@Column(name="LOAN_FAC_REF_NO")
	private String loanFacRefNo;

	@Column(name="LOAN_FEE")
	private BigDecimal loanFee;

	private String name;

	@Column(name="PRINCIPAL_AMT")
	private BigDecimal principalAmt;

	@Column(name="PRINCIPAL_AMT_WORD")
	private String principalAmtWord;

	@Column(name="RECEIVED_AMT")
	private BigDecimal receivedAmt;

	private String refno;

	private String sex;

	@Column(name="START_DATE")
	private Object startDate;

	@Column(name="TRANX_ID")
	private String tranxId;

	public ClvwLoanDisbursementVocher() {
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCreditFacRefNo() {
		return this.creditFacRefNo;
	}

	public void setCreditFacRefNo(String creditFacRefNo) {
		this.creditFacRefNo = creditFacRefNo;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCurrencyEn() {
		return this.currencyEn;
	}

	public void setCurrencyEn(String currencyEn) {
		this.currencyEn = currencyEn;
	}

	public String getCustKeyNum() {
		return this.custKeyNum;
	}

	public void setCustKeyNum(String custKeyNum) {
		this.custKeyNum = custKeyNum;
	}

	public String getCustrefno() {
		return this.custrefno;
	}

	public void setCustrefno(String custrefno) {
		this.custrefno = custrefno;
	}

	public String getDescriptionKh() {
		return this.descriptionKh;
	}

	public void setDescriptionKh(String descriptionKh) {
		this.descriptionKh = descriptionKh;
	}

	public String getFacRefNo() {
		return this.facRefNo;
	}

	public void setFacRefNo(String facRefNo) {
		this.facRefNo = facRefNo;
	}

	public String getLoanFacRefNo() {
		return this.loanFacRefNo;
	}

	public void setLoanFacRefNo(String loanFacRefNo) {
		this.loanFacRefNo = loanFacRefNo;
	}

	public BigDecimal getLoanFee() {
		return this.loanFee;
	}

	public void setLoanFee(BigDecimal loanFee) {
		this.loanFee = loanFee;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrincipalAmt() {
		return this.principalAmt;
	}

	public void setPrincipalAmt(BigDecimal principalAmt) {
		this.principalAmt = principalAmt;
	}

	public String getPrincipalAmtWord() {
		return this.principalAmtWord;
	}

	public void setPrincipalAmtWord(String principalAmtWord) {
		this.principalAmtWord = principalAmtWord;
	}

	public BigDecimal getReceivedAmt() {
		return this.receivedAmt;
	}

	public void setReceivedAmt(BigDecimal receivedAmt) {
		this.receivedAmt = receivedAmt;
	}

	public String getRefno() {
		return this.refno;
	}

	public void setRefno(String refno) {
		this.refno = refno;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Object getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Object startDate) {
		this.startDate = startDate;
	}

	public String getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(String tranxId) {
		this.tranxId = tranxId;
	}

}