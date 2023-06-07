package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the HISTROY_EDIT_SCHEDULES database table.
 * 
 */
@Entity
@Table(name="HISTROY_EDIT_SCHEDULES")
@NamedQuery(name="HistroyEditSchedule.findAll", query="SELECT h FROM HistroyEditSchedule h")
public class HistroyEditSchedule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long hes;

	@Column(name="BALANCE_OLD")
	private BigDecimal balanceOld;

	private BigDecimal balancenew;

	private String balancetype;

	private Object dateedit;

	private String editby;

	@Column(name="NOST_NO")
	private BigDecimal nostNo;

	@Column(name="REF_NO")
	private String refNo;

	public HistroyEditSchedule() {
	}

	public long getHes() {
		return this.hes;
	}

	public void setHes(long hes) {
		this.hes = hes;
	}

	public BigDecimal getBalanceOld() {
		return this.balanceOld;
	}

	public void setBalanceOld(BigDecimal balanceOld) {
		this.balanceOld = balanceOld;
	}

	public BigDecimal getBalancenew() {
		return this.balancenew;
	}

	public void setBalancenew(BigDecimal balancenew) {
		this.balancenew = balancenew;
	}

	public String getBalancetype() {
		return this.balancetype;
	}

	public void setBalancetype(String balancetype) {
		this.balancetype = balancetype;
	}

	public Object getDateedit() {
		return this.dateedit;
	}

	public void setDateedit(Object dateedit) {
		this.dateedit = dateedit;
	}

	public String getEditby() {
		return this.editby;
	}

	public void setEditby(String editby) {
		this.editby = editby;
	}

	public BigDecimal getNostNo() {
		return this.nostNo;
	}

	public void setNostNo(BigDecimal nostNo) {
		this.nostNo = nostNo;
	}

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

}