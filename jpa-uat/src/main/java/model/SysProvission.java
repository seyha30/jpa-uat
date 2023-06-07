package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SYS_PROVISSION database table.
 * 
 */
@Entity
@Table(name="SYS_PROVISSION")
@NamedQuery(name="SysProvission.findAll", query="SELECT s FROM SysProvission s")
public class SysProvission implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal amt;

	@Column(name="BRANCH_ID")
	private BigDecimal branchId;

	@Column(name="CREDIT_STATUS_ID")
	private BigDecimal creditStatusId;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	@Column(name="PREV_POST_BAL")
	private BigDecimal prevPostBal;

	@Column(name="PRO_AMT")
	private BigDecimal proAmt;

	@Column(name="PRO_GL")
	private BigDecimal proGl;

	@Column(name="PROV_RATE")
	private BigDecimal provRate;

	@Column(name="REF_NO")
	private String refNo;

	@Column(name="RESERVE_GL")
	private BigDecimal reserveGl;

	@Column(name="REV_PRO_GEN_GL")
	private BigDecimal revProGenGl;

	public SysProvission() {
	}

	public BigDecimal getAmt() {
		return this.amt;
	}

	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}

	public BigDecimal getBranchId() {
		return this.branchId;
	}

	public void setBranchId(BigDecimal branchId) {
		this.branchId = branchId;
	}

	public BigDecimal getCreditStatusId() {
		return this.creditStatusId;
	}

	public void setCreditStatusId(BigDecimal creditStatusId) {
		this.creditStatusId = creditStatusId;
	}

	public BigDecimal getCurrId() {
		return this.currId;
	}

	public void setCurrId(BigDecimal currId) {
		this.currId = currId;
	}

	public BigDecimal getPrevPostBal() {
		return this.prevPostBal;
	}

	public void setPrevPostBal(BigDecimal prevPostBal) {
		this.prevPostBal = prevPostBal;
	}

	public BigDecimal getProAmt() {
		return this.proAmt;
	}

	public void setProAmt(BigDecimal proAmt) {
		this.proAmt = proAmt;
	}

	public BigDecimal getProGl() {
		return this.proGl;
	}

	public void setProGl(BigDecimal proGl) {
		this.proGl = proGl;
	}

	public BigDecimal getProvRate() {
		return this.provRate;
	}

	public void setProvRate(BigDecimal provRate) {
		this.provRate = provRate;
	}

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public BigDecimal getReserveGl() {
		return this.reserveGl;
	}

	public void setReserveGl(BigDecimal reserveGl) {
		this.reserveGl = reserveGl;
	}

	public BigDecimal getRevProGenGl() {
		return this.revProGenGl;
	}

	public void setRevProGenGl(BigDecimal revProGenGl) {
		this.revProGenGl = revProGenGl;
	}

}