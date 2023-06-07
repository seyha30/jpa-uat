package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SBF_ACHIEVEMENT_RATE database table.
 * 
 */
@Entity
@Table(name="SBF_ACHIEVEMENT_RATE")
@NamedQuery(name="SbfAchievementRate.findAll", query="SELECT s FROM SbfAchievementRate s")
public class SbfAchievementRate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACHIEVMENT_ID")
	private BigDecimal achievmentId;

	@Column(name="MAX_RATE")
	private BigDecimal maxRate;

	@Column(name="MIN_RATE")
	private BigDecimal minRate;

	@Column(name="SPECIALIZE_CODE")
	private BigDecimal specializeCode;

	@Column(name="VARIABLE_RATE")
	private BigDecimal variableRate;

	public SbfAchievementRate() {
	}

	public BigDecimal getAchievmentId() {
		return this.achievmentId;
	}

	public void setAchievmentId(BigDecimal achievmentId) {
		this.achievmentId = achievmentId;
	}

	public BigDecimal getMaxRate() {
		return this.maxRate;
	}

	public void setMaxRate(BigDecimal maxRate) {
		this.maxRate = maxRate;
	}

	public BigDecimal getMinRate() {
		return this.minRate;
	}

	public void setMinRate(BigDecimal minRate) {
		this.minRate = minRate;
	}

	public BigDecimal getSpecializeCode() {
		return this.specializeCode;
	}

	public void setSpecializeCode(BigDecimal specializeCode) {
		this.specializeCode = specializeCode;
	}

	public BigDecimal getVariableRate() {
		return this.variableRate;
	}

	public void setVariableRate(BigDecimal variableRate) {
		this.variableRate = variableRate;
	}

}