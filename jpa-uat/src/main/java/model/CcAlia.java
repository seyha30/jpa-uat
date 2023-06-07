package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CC_ALIAS database table.
 * 
 */
@Entity
@Table(name="CC_ALIAS")
@NamedQuery(name="CcAlia.findAll", query="SELECT c FROM CcAlia c")
public class CcAlia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCT_NUM")
	private String acctNum;

	@Column(name="\"ALIAS\"")
	private String alias;

	@Column(name="REC_TYPE")
	private String recType;

	private BigDecimal transeq;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	public CcAlia() {
	}

	public String getAcctNum() {
		return this.acctNum;
	}

	public void setAcctNum(String acctNum) {
		this.acctNum = acctNum;
	}

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getRecType() {
		return this.recType;
	}

	public void setRecType(String recType) {
		this.recType = recType;
	}

	public BigDecimal getTranseq() {
		return this.transeq;
	}

	public void setTranseq(BigDecimal transeq) {
		this.transeq = transeq;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

}