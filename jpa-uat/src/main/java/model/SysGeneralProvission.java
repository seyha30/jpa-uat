package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SYS_GENERAL_PROVISSION database table.
 * 
 */
@Entity
@Table(name="SYS_GENERAL_PROVISSION")
@NamedQuery(name="SysGeneralProvission.findAll", query="SELECT s FROM SysGeneralProvission s")
public class SysGeneralProvission implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="BRANCH_ID")
	private BigDecimal branchId;

	private BigDecimal diff;

	@Column(name="GL_BAL")
	private BigDecimal glBal;

	@Column(name="LOAN_GEN_PRO")
	private BigDecimal loanGenPro;

	@Column(name="LOAN_PRO_GL")
	private BigDecimal loanProGl;

	@Column(name="LOAN_RESERVE_GL")
	private BigDecimal loanReserveGl;

	private BigDecimal outstanding;

	@Column(name="PRO_GL")
	private BigDecimal proGl;

	@Column(name="RESERVE_GL")
	private BigDecimal reserveGl;

	public SysGeneralProvission() {
	}

	public BigDecimal getBranchId() {
		return this.branchId;
	}

	public void setBranchId(BigDecimal branchId) {
		this.branchId = branchId;
	}

	public BigDecimal getDiff() {
		return this.diff;
	}

	public void setDiff(BigDecimal diff) {
		this.diff = diff;
	}

	public BigDecimal getGlBal() {
		return this.glBal;
	}

	public void setGlBal(BigDecimal glBal) {
		this.glBal = glBal;
	}

	public BigDecimal getLoanGenPro() {
		return this.loanGenPro;
	}

	public void setLoanGenPro(BigDecimal loanGenPro) {
		this.loanGenPro = loanGenPro;
	}

	public BigDecimal getLoanProGl() {
		return this.loanProGl;
	}

	public void setLoanProGl(BigDecimal loanProGl) {
		this.loanProGl = loanProGl;
	}

	public BigDecimal getLoanReserveGl() {
		return this.loanReserveGl;
	}

	public void setLoanReserveGl(BigDecimal loanReserveGl) {
		this.loanReserveGl = loanReserveGl;
	}

	public BigDecimal getOutstanding() {
		return this.outstanding;
	}

	public void setOutstanding(BigDecimal outstanding) {
		this.outstanding = outstanding;
	}

	public BigDecimal getProGl() {
		return this.proGl;
	}

	public void setProGl(BigDecimal proGl) {
		this.proGl = proGl;
	}

	public BigDecimal getReserveGl() {
		return this.reserveGl;
	}

	public void setReserveGl(BigDecimal reserveGl) {
		this.reserveGl = reserveGl;
	}

}