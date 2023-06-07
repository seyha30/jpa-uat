package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the OVERDUR_LOAN_REPORT_TMP database table.
 * 
 */
@Entity
@Table(name="OVERDUR_LOAN_REPORT_TMP")
@NamedQuery(name="OverdurLoanReportTmp.findAll", query="SELECT o FROM OverdurLoanReportTmp o")
public class OverdurLoanReportTmp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACC_NO")
	private String accNo;

	@Column(name="KH_NAME")
	private String khName;

	@Column(name="LOAN_FAC_ID")
	private BigDecimal loanFacId;

	private BigDecimal lt;

	@Column(name="MATURITY_DATE")
	private Object maturityDate;

	@Column(name="N_DAY")
	private BigDecimal nDay;

	@Column(name="\"NAMES\"")
	private String names;

	@Column(name="NO_TYPE")
	private BigDecimal noType;

	private BigDecimal olb;

	@Column(name="PRINCIPAL_AMT")
	private BigDecimal principalAmt;

	private String refno;

	@Column(name="START_DATE")
	private Object startDate;

	@Column(name="TOTAL_LATE")
	private BigDecimal totalLate;

	@Column(name="TOTAL_PAID_AMT")
	private BigDecimal totalPaidAmt;

	@Column(name="TYPE_OF_LATE")
	private String typeOfLate;

	private String userid;

	public OverdurLoanReportTmp() {
	}

	public String getAccNo() {
		return this.accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getKhName() {
		return this.khName;
	}

	public void setKhName(String khName) {
		this.khName = khName;
	}

	public BigDecimal getLoanFacId() {
		return this.loanFacId;
	}

	public void setLoanFacId(BigDecimal loanFacId) {
		this.loanFacId = loanFacId;
	}

	public BigDecimal getLt() {
		return this.lt;
	}

	public void setLt(BigDecimal lt) {
		this.lt = lt;
	}

	public Object getMaturityDate() {
		return this.maturityDate;
	}

	public void setMaturityDate(Object maturityDate) {
		this.maturityDate = maturityDate;
	}

	public BigDecimal getNDay() {
		return this.nDay;
	}

	public void setNDay(BigDecimal nDay) {
		this.nDay = nDay;
	}

	public String getNames() {
		return this.names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public BigDecimal getNoType() {
		return this.noType;
	}

	public void setNoType(BigDecimal noType) {
		this.noType = noType;
	}

	public BigDecimal getOlb() {
		return this.olb;
	}

	public void setOlb(BigDecimal olb) {
		this.olb = olb;
	}

	public BigDecimal getPrincipalAmt() {
		return this.principalAmt;
	}

	public void setPrincipalAmt(BigDecimal principalAmt) {
		this.principalAmt = principalAmt;
	}

	public String getRefno() {
		return this.refno;
	}

	public void setRefno(String refno) {
		this.refno = refno;
	}

	public Object getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Object startDate) {
		this.startDate = startDate;
	}

	public BigDecimal getTotalLate() {
		return this.totalLate;
	}

	public void setTotalLate(BigDecimal totalLate) {
		this.totalLate = totalLate;
	}

	public BigDecimal getTotalPaidAmt() {
		return this.totalPaidAmt;
	}

	public void setTotalPaidAmt(BigDecimal totalPaidAmt) {
		this.totalPaidAmt = totalPaidAmt;
	}

	public String getTypeOfLate() {
		return this.typeOfLate;
	}

	public void setTypeOfLate(String typeOfLate) {
		this.typeOfLate = typeOfLate;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

}