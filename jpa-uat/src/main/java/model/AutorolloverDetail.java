package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the AUTOROLLOVER_DETAIL database table.
 * 
 */
@Entity
@Table(name="AUTOROLLOVER_DETAIL")
@NamedQuery(name="AutorolloverDetail.findAll", query="SELECT a FROM AutorolloverDetail a")
public class AutorolloverDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AUTOROLLOVER_ID")
	private BigDecimal autorolloverId;

	@Column(name="DATE_DONE")
	private Object dateDone;

	@Column(name="FD_ID")
	private BigDecimal fdId;

	@Column(name="INT_ADDED_WITH_PRINCIPAL")
	private BigDecimal intAddedWithPrincipal;

	@Column(name="MATURITY_DATE_AFTER_ROLLOVER")
	private Object maturityDateAfterRollover;

	@Column(name="MATURITY_DATE_BEFORE_ROLLOVER")
	private Object maturityDateBeforeRollover;

	@Column(name="TOTAL_PRINCIPAL")
	private BigDecimal totalPrincipal;

	public AutorolloverDetail() {
	}

	public BigDecimal getAutorolloverId() {
		return this.autorolloverId;
	}

	public void setAutorolloverId(BigDecimal autorolloverId) {
		this.autorolloverId = autorolloverId;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public BigDecimal getFdId() {
		return this.fdId;
	}

	public void setFdId(BigDecimal fdId) {
		this.fdId = fdId;
	}

	public BigDecimal getIntAddedWithPrincipal() {
		return this.intAddedWithPrincipal;
	}

	public void setIntAddedWithPrincipal(BigDecimal intAddedWithPrincipal) {
		this.intAddedWithPrincipal = intAddedWithPrincipal;
	}

	public Object getMaturityDateAfterRollover() {
		return this.maturityDateAfterRollover;
	}

	public void setMaturityDateAfterRollover(Object maturityDateAfterRollover) {
		this.maturityDateAfterRollover = maturityDateAfterRollover;
	}

	public Object getMaturityDateBeforeRollover() {
		return this.maturityDateBeforeRollover;
	}

	public void setMaturityDateBeforeRollover(Object maturityDateBeforeRollover) {
		this.maturityDateBeforeRollover = maturityDateBeforeRollover;
	}

	public BigDecimal getTotalPrincipal() {
		return this.totalPrincipal;
	}

	public void setTotalPrincipal(BigDecimal totalPrincipal) {
		this.totalPrincipal = totalPrincipal;
	}

}