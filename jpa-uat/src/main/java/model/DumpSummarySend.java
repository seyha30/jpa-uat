package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the DUMP_SUMMARY_SEND database table.
 * 
 */
@Entity
@Table(name="DUMP_SUMMARY_SEND")
@NamedQuery(name="DumpSummarySend.findAll", query="SELECT d FROM DumpSummarySend d")
public class DumpSummarySend implements Serializable {
	private static final long serialVersionUID = 1L;

	private String branch;

	@Column(name="NUM_ACC")
	private BigDecimal numAcc;

	@Column(name="NUM_CUSTOMER")
	private BigDecimal numCustomer;

	@Column(name="OUTSTANDING_KHR")
	private BigDecimal outstandingKhr;

	@Column(name="OUTSTANDING_USD")
	private BigDecimal outstandingUsd;

	@Column(name="PAR_AMOUNT_KHR")
	private BigDecimal parAmountKhr;

	@Column(name="PAR_AMOUNT_USD")
	private BigDecimal parAmountUsd;

	@Column(name="PAR30_AMT")
	private BigDecimal par30Amt;

	@Column(name="PAR30_RATE")
	private BigDecimal par30Rate;

	@Column(name="TOTAL_OUTSTANDING")
	private BigDecimal totalOutstanding;

	public DumpSummarySend() {
	}

	public String getBranch() {
		return this.branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public BigDecimal getNumAcc() {
		return this.numAcc;
	}

	public void setNumAcc(BigDecimal numAcc) {
		this.numAcc = numAcc;
	}

	public BigDecimal getNumCustomer() {
		return this.numCustomer;
	}

	public void setNumCustomer(BigDecimal numCustomer) {
		this.numCustomer = numCustomer;
	}

	public BigDecimal getOutstandingKhr() {
		return this.outstandingKhr;
	}

	public void setOutstandingKhr(BigDecimal outstandingKhr) {
		this.outstandingKhr = outstandingKhr;
	}

	public BigDecimal getOutstandingUsd() {
		return this.outstandingUsd;
	}

	public void setOutstandingUsd(BigDecimal outstandingUsd) {
		this.outstandingUsd = outstandingUsd;
	}

	public BigDecimal getParAmountKhr() {
		return this.parAmountKhr;
	}

	public void setParAmountKhr(BigDecimal parAmountKhr) {
		this.parAmountKhr = parAmountKhr;
	}

	public BigDecimal getParAmountUsd() {
		return this.parAmountUsd;
	}

	public void setParAmountUsd(BigDecimal parAmountUsd) {
		this.parAmountUsd = parAmountUsd;
	}

	public BigDecimal getPar30Amt() {
		return this.par30Amt;
	}

	public void setPar30Amt(BigDecimal par30Amt) {
		this.par30Amt = par30Amt;
	}

	public BigDecimal getPar30Rate() {
		return this.par30Rate;
	}

	public void setPar30Rate(BigDecimal par30Rate) {
		this.par30Rate = par30Rate;
	}

	public BigDecimal getTotalOutstanding() {
		return this.totalOutstanding;
	}

	public void setTotalOutstanding(BigDecimal totalOutstanding) {
		this.totalOutstanding = totalOutstanding;
	}

}