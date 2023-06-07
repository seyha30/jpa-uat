package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CLVW_LOAN_CYCLE database table.
 * 
 */
@Entity
@Table(name="CLVW_LOAN_CYCLE")
@NamedQuery(name="ClvwLoanCycle.findAll", query="SELECT c FROM ClvwLoanCycle c")
public class ClvwLoanCycle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CUST_KEY_NUM")
	private BigDecimal custKeyNum;

	@Column(name="\"CYCLE\"")
	private BigDecimal cycle;

	@Column(name="LOAN_FAC_ID")
	private BigDecimal loanFacId;

	@Column(name="LOAN_FAC_REF_NO")
	private String loanFacRefNo;

	public ClvwLoanCycle() {
	}

	public BigDecimal getCustKeyNum() {
		return this.custKeyNum;
	}

	public void setCustKeyNum(BigDecimal custKeyNum) {
		this.custKeyNum = custKeyNum;
	}

	public BigDecimal getCycle() {
		return this.cycle;
	}

	public void setCycle(BigDecimal cycle) {
		this.cycle = cycle;
	}

	public BigDecimal getLoanFacId() {
		return this.loanFacId;
	}

	public void setLoanFacId(BigDecimal loanFacId) {
		this.loanFacId = loanFacId;
	}

	public String getLoanFacRefNo() {
		return this.loanFacRefNo;
	}

	public void setLoanFacRefNo(String loanFacRefNo) {
		this.loanFacRefNo = loanFacRefNo;
	}

}