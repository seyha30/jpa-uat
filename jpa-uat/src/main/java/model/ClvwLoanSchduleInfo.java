package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CLVW_LOAN_SCHDULE_INFO database table.
 * 
 */
@Entity
@Table(name="CLVW_LOAN_SCHDULE_INFO")
@NamedQuery(name="ClvwLoanSchduleInfo.findAll", query="SELECT c FROM ClvwLoanSchduleInfo c")
public class ClvwLoanSchduleInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	@Column(name="BRANCH_DESCRIPTION")
	private String branchDescription;

	private String ccy;

	@Column(name="CUST_INFO_H_PHONE")
	private String custInfoHPhone;

	@Column(name="CUST_INFO_O_PHONE")
	private String custInfoOPhone;

	@Column(name="CUSTOMER_NO")
	private String customerNo;

	private String dd;

	@Column(name="DISB_DATE")
	private Object disbDate;

	@Column(name="EMPREP_NAME_KH")
	private String emprepNameKh;

	@Column(name="GROUP_ID")
	private String groupId;

	@Column(name="GROUP_REF")
	private String groupRef;

	@Column(name="INT_RATE")
	private BigDecimal intRate;

	@Column(name="KH_ADDRESS")
	private Object khAddress;

	@Column(name="KH_FULL_NAME")
	private String khFullName;

	@Column(name="LOAN_ACC_NO")
	private String loanAccNo;

	@Column(name="LOAN_FAC_REF_NO")
	private String loanFacRefNo;

	@Column(name="LOAN_PRINCIPAL")
	private BigDecimal loanPrincipal;

	@Column(name="MATURITY_DATE")
	private Object maturityDate;

	private String mm;

	@Column(name="NET_FEE")
	private BigDecimal netFee;

	@Column(name="NO_OF_INST")
	private BigDecimal noOfInst;

	private String phone;

	@Column(name="PHONE_NUMBER")
	private String phoneNumber;

	@Column(name="SAVING_ACCT")
	private String savingAcct;

	@Column(name="USD_CCY")
	private String usdCcy;

	private String wing;

	private String yy;

	public ClvwLoanSchduleInfo() {
	}

	public String getBranchCode() {
		return this.branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getBranchDescription() {
		return this.branchDescription;
	}

	public void setBranchDescription(String branchDescription) {
		this.branchDescription = branchDescription;
	}

	public String getCcy() {
		return this.ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public String getCustInfoHPhone() {
		return this.custInfoHPhone;
	}

	public void setCustInfoHPhone(String custInfoHPhone) {
		this.custInfoHPhone = custInfoHPhone;
	}

	public String getCustInfoOPhone() {
		return this.custInfoOPhone;
	}

	public void setCustInfoOPhone(String custInfoOPhone) {
		this.custInfoOPhone = custInfoOPhone;
	}

	public String getCustomerNo() {
		return this.customerNo;
	}

	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}

	public String getDd() {
		return this.dd;
	}

	public void setDd(String dd) {
		this.dd = dd;
	}

	public Object getDisbDate() {
		return this.disbDate;
	}

	public void setDisbDate(Object disbDate) {
		this.disbDate = disbDate;
	}

	public String getEmprepNameKh() {
		return this.emprepNameKh;
	}

	public void setEmprepNameKh(String emprepNameKh) {
		this.emprepNameKh = emprepNameKh;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupRef() {
		return this.groupRef;
	}

	public void setGroupRef(String groupRef) {
		this.groupRef = groupRef;
	}

	public BigDecimal getIntRate() {
		return this.intRate;
	}

	public void setIntRate(BigDecimal intRate) {
		this.intRate = intRate;
	}

	public Object getKhAddress() {
		return this.khAddress;
	}

	public void setKhAddress(Object khAddress) {
		this.khAddress = khAddress;
	}

	public String getKhFullName() {
		return this.khFullName;
	}

	public void setKhFullName(String khFullName) {
		this.khFullName = khFullName;
	}

	public String getLoanAccNo() {
		return this.loanAccNo;
	}

	public void setLoanAccNo(String loanAccNo) {
		this.loanAccNo = loanAccNo;
	}

	public String getLoanFacRefNo() {
		return this.loanFacRefNo;
	}

	public void setLoanFacRefNo(String loanFacRefNo) {
		this.loanFacRefNo = loanFacRefNo;
	}

	public BigDecimal getLoanPrincipal() {
		return this.loanPrincipal;
	}

	public void setLoanPrincipal(BigDecimal loanPrincipal) {
		this.loanPrincipal = loanPrincipal;
	}

	public Object getMaturityDate() {
		return this.maturityDate;
	}

	public void setMaturityDate(Object maturityDate) {
		this.maturityDate = maturityDate;
	}

	public String getMm() {
		return this.mm;
	}

	public void setMm(String mm) {
		this.mm = mm;
	}

	public BigDecimal getNetFee() {
		return this.netFee;
	}

	public void setNetFee(BigDecimal netFee) {
		this.netFee = netFee;
	}

	public BigDecimal getNoOfInst() {
		return this.noOfInst;
	}

	public void setNoOfInst(BigDecimal noOfInst) {
		this.noOfInst = noOfInst;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getSavingAcct() {
		return this.savingAcct;
	}

	public void setSavingAcct(String savingAcct) {
		this.savingAcct = savingAcct;
	}

	public String getUsdCcy() {
		return this.usdCcy;
	}

	public void setUsdCcy(String usdCcy) {
		this.usdCcy = usdCcy;
	}

	public String getWing() {
		return this.wing;
	}

	public void setWing(String wing) {
		this.wing = wing;
	}

	public String getYy() {
		return this.yy;
	}

	public void setYy(String yy) {
		this.yy = yy;
	}

}