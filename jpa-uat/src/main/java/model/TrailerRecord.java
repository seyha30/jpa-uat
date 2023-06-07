package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TRAILER_RECORD database table.
 * 
 */
@Entity
@Table(name="TRAILER_RECORD")
@NamedQuery(name="TrailerRecord.findAll", query="SELECT t FROM TrailerRecord t")
public class TrailerRecord implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="NUMBER_OF_RECORDS")
	private BigDecimal numberOfRecords;

	@Column(name="RECORD_TYPE")
	private String recordType;

	@Column(name="TOTAL_TRANSACTION_AMT")
	private BigDecimal totalTransactionAmt;

	public TrailerRecord() {
	}

	public BigDecimal getNumberOfRecords() {
		return this.numberOfRecords;
	}

	public void setNumberOfRecords(BigDecimal numberOfRecords) {
		this.numberOfRecords = numberOfRecords;
	}

	public String getRecordType() {
		return this.recordType;
	}

	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

	public BigDecimal getTotalTransactionAmt() {
		return this.totalTransactionAmt;
	}

	public void setTotalTransactionAmt(BigDecimal totalTransactionAmt) {
		this.totalTransactionAmt = totalTransactionAmt;
	}

}