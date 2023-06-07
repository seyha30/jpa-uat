package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the NBC_CODE_MASTER database table.
 * 
 */
@Entity
@Table(name="NBC_CODE_MASTER")
@NamedQuery(name="NbcCodeMaster.findAll", query="SELECT n FROM NbcCodeMaster n")
public class NbcCodeMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCT_TYPE")
	private String acctType;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	private String description;

	@Column(name="NBC_CODE")
	private BigDecimal nbcCode;

	@Column(name="NBC_ID")
	private BigDecimal nbcId;

	public NbcCodeMaster() {
	}

	public String getAcctType() {
		return this.acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}

	public BigDecimal getCurrId() {
		return this.currId;
	}

	public void setCurrId(BigDecimal currId) {
		this.currId = currId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getNbcCode() {
		return this.nbcCode;
	}

	public void setNbcCode(BigDecimal nbcCode) {
		this.nbcCode = nbcCode;
	}

	public BigDecimal getNbcId() {
		return this.nbcId;
	}

	public void setNbcId(BigDecimal nbcId) {
		this.nbcId = nbcId;
	}

}