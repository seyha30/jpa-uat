package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SBF_SPE_GROWTH_PLAN database table.
 * 
 */
@Entity
@Table(name="SBF_SPE_GROWTH_PLAN")
@NamedQuery(name="SbfSpeGrowthPlan.findAll", query="SELECT s FROM SbfSpeGrowthPlan s")
public class SbfSpeGrowthPlan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="LO_MAX_RANGE")
	private BigDecimal loMaxRange;

	@Column(name="LO_MIN_RANGE")
	private BigDecimal loMinRange;

	@Column(name="M_CLIENT_GROWTH")
	private BigDecimal mClientGrowth;

	@Column(name="M_GROWTH_AMT")
	private BigDecimal mGrowthAmt;

	@Column(name="SPECIALIZE_CODE")
	private BigDecimal specializeCode;

	public SbfSpeGrowthPlan() {
	}

	public BigDecimal getLoMaxRange() {
		return this.loMaxRange;
	}

	public void setLoMaxRange(BigDecimal loMaxRange) {
		this.loMaxRange = loMaxRange;
	}

	public BigDecimal getLoMinRange() {
		return this.loMinRange;
	}

	public void setLoMinRange(BigDecimal loMinRange) {
		this.loMinRange = loMinRange;
	}

	public BigDecimal getMClientGrowth() {
		return this.mClientGrowth;
	}

	public void setMClientGrowth(BigDecimal mClientGrowth) {
		this.mClientGrowth = mClientGrowth;
	}

	public BigDecimal getMGrowthAmt() {
		return this.mGrowthAmt;
	}

	public void setMGrowthAmt(BigDecimal mGrowthAmt) {
		this.mGrowthAmt = mGrowthAmt;
	}

	public BigDecimal getSpecializeCode() {
		return this.specializeCode;
	}

	public void setSpecializeCode(BigDecimal specializeCode) {
		this.specializeCode = specializeCode;
	}

}