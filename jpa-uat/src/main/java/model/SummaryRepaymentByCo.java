package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SUMMARY_REPAYMENT_BY_CO database table.
 * 
 */
@Entity
@Table(name="SUMMARY_REPAYMENT_BY_CO")
@NamedQuery(name="SummaryRepaymentByCo.findAll", query="SELECT s FROM SummaryRepaymentByCo s")
public class SummaryRepaymentByCo implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal amt;

	@Column(name="EMPREP_ID")
	private String emprepId;

	@Column(name="EMPREP_NAME")
	private String emprepName;

	private BigDecimal par;

	@Column(name="PRI_INT_PE")
	private String priIntPe;

	@Column(name="USER_ID")
	private String userId;

	public SummaryRepaymentByCo() {
	}

	public BigDecimal getAmt() {
		return this.amt;
	}

	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}

	public String getEmprepId() {
		return this.emprepId;
	}

	public void setEmprepId(String emprepId) {
		this.emprepId = emprepId;
	}

	public String getEmprepName() {
		return this.emprepName;
	}

	public void setEmprepName(String emprepName) {
		this.emprepName = emprepName;
	}

	public BigDecimal getPar() {
		return this.par;
	}

	public void setPar(BigDecimal par) {
		this.par = par;
	}

	public String getPriIntPe() {
		return this.priIntPe;
	}

	public void setPriIntPe(String priIntPe) {
		this.priIntPe = priIntPe;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}