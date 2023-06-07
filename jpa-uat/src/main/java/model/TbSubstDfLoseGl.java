package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TB_SUBST_DF_LOSE_GL database table.
 * 
 */
@Entity
@Table(name="TB_SUBST_DF_LOSE_GL")
@NamedQuery(name="TbSubstDfLoseGl.findAll", query="SELECT t FROM TbSubstDfLoseGl t")
public class TbSubstDfLoseGl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCT_ID_CR")
	private BigDecimal acctIdCr;

	@Column(name="ACCT_ID_DR")
	private BigDecimal acctIdDr;

	@Column(name="GL_STATUS")
	private String glStatus;

	@Column(name="NBC_CODE")
	private BigDecimal nbcCode;

	@Column(name="REF_NO")
	private String refNo;

	@Column(name="\"TYPE\"")
	private String type;

	public TbSubstDfLoseGl() {
	}

	public BigDecimal getAcctIdCr() {
		return this.acctIdCr;
	}

	public void setAcctIdCr(BigDecimal acctIdCr) {
		this.acctIdCr = acctIdCr;
	}

	public BigDecimal getAcctIdDr() {
		return this.acctIdDr;
	}

	public void setAcctIdDr(BigDecimal acctIdDr) {
		this.acctIdDr = acctIdDr;
	}

	public String getGlStatus() {
		return this.glStatus;
	}

	public void setGlStatus(String glStatus) {
		this.glStatus = glStatus;
	}

	public BigDecimal getNbcCode() {
		return this.nbcCode;
	}

	public void setNbcCode(BigDecimal nbcCode) {
		this.nbcCode = nbcCode;
	}

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}