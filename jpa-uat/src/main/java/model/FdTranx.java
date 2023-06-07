package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FD_TRANX database table.
 * 
 */
@Entity
@Table(name="FD_TRANX")
@NamedQuery(name="FdTranx.findAll", query="SELECT f FROM FdTranx f")
public class FdTranx implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal amount;

	@Column(name="FD_ID")
	private BigDecimal fdId;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	public FdTranx() {
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getFdId() {
		return this.fdId;
	}

	public void setFdId(BigDecimal fdId) {
		this.fdId = fdId;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

}