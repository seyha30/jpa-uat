package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CHQ_CLEARING database table.
 * 
 */
@Entity
@Table(name="CHQ_CLEARING")
@NamedQuery(name="ChqClearing.findAll", query="SELECT c FROM ChqClearing c")
public class ChqClearing implements Serializable {
	private static final long serialVersionUID = 1L;

	private String amount;

	@Column(name="CHQDPT_ID")
	private BigDecimal chqdptId;

	private String chqgenerated;

	private String currencycode;

	private String inputbatchno;

	private String inputdate;

	private String outputbatchno;

	private String payeeaccountno;

	private String payeebank;

	private String payeecheckdigit;

	private String payeename;

	private String payeeref;

	private String payeraccountno;

	private String payerbank;

	private String payercheckdigit;

	private String payername;

	private String payerref;

	private String paymentdate;

	private String paymenttypecode;

	private String processingdate;

	private String returncode;

	private String securitycode;

	private String serialno;

	public ChqClearing() {
	}

	public String getAmount() {
		return this.amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public BigDecimal getChqdptId() {
		return this.chqdptId;
	}

	public void setChqdptId(BigDecimal chqdptId) {
		this.chqdptId = chqdptId;
	}

	public String getChqgenerated() {
		return this.chqgenerated;
	}

	public void setChqgenerated(String chqgenerated) {
		this.chqgenerated = chqgenerated;
	}

	public String getCurrencycode() {
		return this.currencycode;
	}

	public void setCurrencycode(String currencycode) {
		this.currencycode = currencycode;
	}

	public String getInputbatchno() {
		return this.inputbatchno;
	}

	public void setInputbatchno(String inputbatchno) {
		this.inputbatchno = inputbatchno;
	}

	public String getInputdate() {
		return this.inputdate;
	}

	public void setInputdate(String inputdate) {
		this.inputdate = inputdate;
	}

	public String getOutputbatchno() {
		return this.outputbatchno;
	}

	public void setOutputbatchno(String outputbatchno) {
		this.outputbatchno = outputbatchno;
	}

	public String getPayeeaccountno() {
		return this.payeeaccountno;
	}

	public void setPayeeaccountno(String payeeaccountno) {
		this.payeeaccountno = payeeaccountno;
	}

	public String getPayeebank() {
		return this.payeebank;
	}

	public void setPayeebank(String payeebank) {
		this.payeebank = payeebank;
	}

	public String getPayeecheckdigit() {
		return this.payeecheckdigit;
	}

	public void setPayeecheckdigit(String payeecheckdigit) {
		this.payeecheckdigit = payeecheckdigit;
	}

	public String getPayeename() {
		return this.payeename;
	}

	public void setPayeename(String payeename) {
		this.payeename = payeename;
	}

	public String getPayeeref() {
		return this.payeeref;
	}

	public void setPayeeref(String payeeref) {
		this.payeeref = payeeref;
	}

	public String getPayeraccountno() {
		return this.payeraccountno;
	}

	public void setPayeraccountno(String payeraccountno) {
		this.payeraccountno = payeraccountno;
	}

	public String getPayerbank() {
		return this.payerbank;
	}

	public void setPayerbank(String payerbank) {
		this.payerbank = payerbank;
	}

	public String getPayercheckdigit() {
		return this.payercheckdigit;
	}

	public void setPayercheckdigit(String payercheckdigit) {
		this.payercheckdigit = payercheckdigit;
	}

	public String getPayername() {
		return this.payername;
	}

	public void setPayername(String payername) {
		this.payername = payername;
	}

	public String getPayerref() {
		return this.payerref;
	}

	public void setPayerref(String payerref) {
		this.payerref = payerref;
	}

	public String getPaymentdate() {
		return this.paymentdate;
	}

	public void setPaymentdate(String paymentdate) {
		this.paymentdate = paymentdate;
	}

	public String getPaymenttypecode() {
		return this.paymenttypecode;
	}

	public void setPaymenttypecode(String paymenttypecode) {
		this.paymenttypecode = paymenttypecode;
	}

	public String getProcessingdate() {
		return this.processingdate;
	}

	public void setProcessingdate(String processingdate) {
		this.processingdate = processingdate;
	}

	public String getReturncode() {
		return this.returncode;
	}

	public void setReturncode(String returncode) {
		this.returncode = returncode;
	}

	public String getSecuritycode() {
		return this.securitycode;
	}

	public void setSecuritycode(String securitycode) {
		this.securitycode = securitycode;
	}

	public String getSerialno() {
		return this.serialno;
	}

	public void setSerialno(String serialno) {
		this.serialno = serialno;
	}

}