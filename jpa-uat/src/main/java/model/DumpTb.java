package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the DUMP_TB database table.
 * 
 */
@Entity
@Table(name="DUMP_TB")
@NamedQuery(name="DumpTb.findAll", query="SELECT d FROM DumpTb d")
public class DumpTb implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal branch;

	private String ccy;

	private Object credit;

	private Object debit;

	@Column(name="ENDING_BALANCE")
	private Object endingBalance;

	@Column(name="GL_CODE")
	private String glCode;

	@Column(name="GL_DESCRIPTION")
	private String glDescription;

	@Column(name="GROUP_DESCRIPTION")
	private String groupDescription;

	@Column(name="GROUP_NO")
	private String groupNo;

	@Column(name="NBC_CODE")
	private BigDecimal nbcCode;

	@Column(name="PREVIOUS_BALANCE")
	private Object previousBalance;

	@Column(name="REPORT_DATE")
	private Object reportDate;

	public DumpTb() {
	}

	public BigDecimal getBranch() {
		return this.branch;
	}

	public void setBranch(BigDecimal branch) {
		this.branch = branch;
	}

	public String getCcy() {
		return this.ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public Object getCredit() {
		return this.credit;
	}

	public void setCredit(Object credit) {
		this.credit = credit;
	}

	public Object getDebit() {
		return this.debit;
	}

	public void setDebit(Object debit) {
		this.debit = debit;
	}

	public Object getEndingBalance() {
		return this.endingBalance;
	}

	public void setEndingBalance(Object endingBalance) {
		this.endingBalance = endingBalance;
	}

	public String getGlCode() {
		return this.glCode;
	}

	public void setGlCode(String glCode) {
		this.glCode = glCode;
	}

	public String getGlDescription() {
		return this.glDescription;
	}

	public void setGlDescription(String glDescription) {
		this.glDescription = glDescription;
	}

	public String getGroupDescription() {
		return this.groupDescription;
	}

	public void setGroupDescription(String groupDescription) {
		this.groupDescription = groupDescription;
	}

	public String getGroupNo() {
		return this.groupNo;
	}

	public void setGroupNo(String groupNo) {
		this.groupNo = groupNo;
	}

	public BigDecimal getNbcCode() {
		return this.nbcCode;
	}

	public void setNbcCode(BigDecimal nbcCode) {
		this.nbcCode = nbcCode;
	}

	public Object getPreviousBalance() {
		return this.previousBalance;
	}

	public void setPreviousBalance(Object previousBalance) {
		this.previousBalance = previousBalance;
	}

	public Object getReportDate() {
		return this.reportDate;
	}

	public void setReportDate(Object reportDate) {
		this.reportDate = reportDate;
	}

}