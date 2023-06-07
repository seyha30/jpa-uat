package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the PAR_TMP database table.
 * 
 */
@Entity
@Table(name="PAR_TMP")
@NamedQuery(name="ParTmp.findAll", query="SELECT p FROM ParTmp p")
public class ParTmp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="DIS_AMT")
	private BigDecimal disAmt;

	@Column(name="EMPREP_NAME")
	private String emprepName;

	private BigDecimal late;

	@Column(name="LOAN_FAC_ID")
	private BigDecimal loanFacId;

	@Column(name="\"NAMES\"")
	private String names;

	private String refno;

	@Column(name="USER_ID")
	private String userId;

	public ParTmp() {
	}

	public BigDecimal getDisAmt() {
		return this.disAmt;
	}

	public void setDisAmt(BigDecimal disAmt) {
		this.disAmt = disAmt;
	}

	public String getEmprepName() {
		return this.emprepName;
	}

	public void setEmprepName(String emprepName) {
		this.emprepName = emprepName;
	}

	public BigDecimal getLate() {
		return this.late;
	}

	public void setLate(BigDecimal late) {
		this.late = late;
	}

	public BigDecimal getLoanFacId() {
		return this.loanFacId;
	}

	public void setLoanFacId(BigDecimal loanFacId) {
		this.loanFacId = loanFacId;
	}

	public String getNames() {
		return this.names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getRefno() {
		return this.refno;
	}

	public void setRefno(String refno) {
		this.refno = refno;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}