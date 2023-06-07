package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SBF_PROVISION_TRANX database table.
 * 
 */
@Entity
@Table(name="SBF_PROVISION_TRANX")
@NamedQuery(name="SbfProvisionTranx.findAll", query="SELECT s FROM SbfProvisionTranx s")
public class SbfProvisionTranx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="BRANCH_ID")
	private BigDecimal branchId;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	@Column(name="DATE_DONE")
	private Object dateDone;

	@Column(name="PREV_POST_BAL")
	private BigDecimal prevPostBal;

	@Column(name="PRO_AMT")
	private BigDecimal proAmt;

	@Column(name="REF_NO")
	private String refNo;

	@Column(name="TRN_AMT")
	private BigDecimal trnAmt;

	public SbfProvisionTranx() {
	}

	public BigDecimal getBranchId() {
		return this.branchId;
	}

	public void setBranchId(BigDecimal branchId) {
		this.branchId = branchId;
	}

	public BigDecimal getCurrId() {
		return this.currId;
	}

	public void setCurrId(BigDecimal currId) {
		this.currId = currId;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
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

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public BigDecimal getTrnAmt() {
		return this.trnAmt;
	}

	public void setTrnAmt(BigDecimal trnAmt) {
		this.trnAmt = trnAmt;
	}

}