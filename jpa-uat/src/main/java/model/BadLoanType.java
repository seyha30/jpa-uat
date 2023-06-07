package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the BAD_LOAN_TYPE database table.
 * 
 */
@Entity
@Table(name="BAD_LOAN_TYPE")
@NamedQuery(name="BadLoanType.findAll", query="SELECT b FROM BadLoanType b")
public class BadLoanType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="BAD_LOAN_TYPE_ID")
	private BigDecimal badLoanTypeId;

	private String description;

	@Column(name="NBC_CODE")
	private String nbcCode;

	public BadLoanType() {
	}

	public BigDecimal getBadLoanTypeId() {
		return this.badLoanTypeId;
	}

	public void setBadLoanTypeId(BigDecimal badLoanTypeId) {
		this.badLoanTypeId = badLoanTypeId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNbcCode() {
		return this.nbcCode;
	}

	public void setNbcCode(String nbcCode) {
		this.nbcCode = nbcCode;
	}

}