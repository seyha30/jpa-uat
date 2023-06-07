package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CHQ_BANKCODE database table.
 * 
 */
@Entity
@Table(name="CHQ_BANKCODE")
@NamedQuery(name="ChqBankcode.findAll", query="SELECT c FROM ChqBankcode c")
public class ChqBankcode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="BANK_CODE")
	private String bankCode;

	private BigDecimal bankid;

	private String checksum;

	private String name;

	public ChqBankcode() {
	}

	public String getBankCode() {
		return this.bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public BigDecimal getBankid() {
		return this.bankid;
	}

	public void setBankid(BigDecimal bankid) {
		this.bankid = bankid;
	}

	public String getChecksum() {
		return this.checksum;
	}

	public void setChecksum(String checksum) {
		this.checksum = checksum;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}