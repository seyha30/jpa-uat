package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CUST_INFO_DETAIL database table.
 * 
 */
@Entity
@Table(name="CUST_INFO_DETAIL")
@NamedQuery(name="CustInfoDetail.findAll", query="SELECT c FROM CustInfoDetail c")
public class CustInfoDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CUST_INFO_ID")
	private long custInfoId;

	@Column(name="ADD_TYPE")
	private String addType;

	private String address1;

	private String address2;

	@Column(name="APPLI_TYPE")
	private BigDecimal appliType;

	@Column(name="AVG_MONTHLY_INCOME")
	private BigDecimal avgMonthlyIncome;

	@Column(name="AVG_STAFF_TURN_OVER_RATE")
	private BigDecimal avgStaffTurnOverRate;

	@Column(name="BIZ_INCOME_TYPE")
	private String bizIncomeType;

	@Column(name="BIZ_TOTAL_ASSET")
	private BigDecimal bizTotalAsset;

	@Column(name="BIZ_TOTAL_LIABILITY")
	private BigDecimal bizTotalLiability;

	@Column(name="BIZ_TOTAL_REGISTERD_CAPITAL")
	private BigDecimal bizTotalRegisterdCapital;

	@Column(name="BR_ID")
	private BigDecimal brId;

	@Column(name="BUS_TYPE_ID")
	private BigDecimal busTypeId;

	@Column(name="CASH_CARD_ID")
	private String cashCardId;

	@Column(name="COM_ID")
	private BigDecimal comId;

	@Column(name="COMMENCE_DATE")
	private Object commenceDate;

	@Column(name="COMMITTEE_ID")
	private String committeeId;

	@Column(name="COMPANY_TYPE_ID")
	private String companyTypeId;

	@Column(name="CORR_ADDRESS")
	private String corrAddress;

	@Column(name="CORR_VIL_ID")
	private String corrVilId;

	@Column(name="CREATE_BY")
	private String createBy;

	@Column(name="CREATE_DATE")
	private Object createDate;

	@Column(name="CUST_ID")
	private BigDecimal custId;

	@Column(name="CUSTOMER_TYPE")
	private BigDecimal customerType;

	@Column(name="DIS_ID")
	private BigDecimal disId;

	@Column(name="E_MAIL")
	private String eMail;

	@Column(name="ECONOMIC_SECTOR")
	private String economicSector;

	@Column(name="EMPLOYER_ID")
	private String employerId;

	@Column(name="EMPLOYER_NAME")
	private String employerName;

	@Column(name="EMPLOYMENT_STATUS")
	private String employmentStatus;

	private BigDecimal emprep;

	@Column(name="F_NAME")
	private String fName;

	@Column(name="FAMILY_NAME_KH")
	private String familyNameKh;

	@Column(name="FIRST_NAME_KH")
	private String firstNameKh;

	@Column(name="ID_EXP_DATE")
	private Object idExpDate;

	@Column(name="ID_ISSUE_BY")
	private String idIssueBy;

	@Column(name="ID_ISSUE_DATE")
	private Object idIssueDate;

	@Column(name="ID_ISSUER")
	private BigDecimal idIssuer;

	private String idno;

	@Column(name="L_NAME")
	private String lName;

	@Column(name="LICENSE_DATE")
	private Object licenseDate;

	@Column(name="LICENSE_EXPIRY_DATE")
	private Object licenseExpiryDate;

	@Column(name="LICENSE_ISSUED_BY")
	private String licenseIssuedBy;

	@Column(name="LICENSE_NO")
	private String licenseNo;

	@Column(name="LIMIT_AMOUNT")
	private BigDecimal limitAmount;

	@Column(name="MAIN_OPERATED_CURRENCY")
	private String mainOperatedCurrency;

	@Column(name="MAIN_SUPPLIERS")
	private String mainSuppliers;

	private String name;

	@Column(name="NO_FOREIGNERS_EMPLOYEES")
	private BigDecimal noForeignersEmployees;

	@Column(name="NO_FULL_TIME_EMPLOYEES")
	private BigDecimal noFullTimeEmployees;

	@Column(name="NO_SUPPLIERS")
	private BigDecimal noSuppliers;

	@Column(name="NUMBER_OF_EMPLOYEES")
	private BigDecimal numberOfEmployees;

	private BigDecimal occupation;

	@Column(name="PHONE_NUMBER")
	private String phoneNumber;

	@Column(name="PRO_ID")
	private BigDecimal proId;

	private String registype;

	@Column(name="RESI_ADDRESS")
	private String resiAddress;

	@Column(name="SEC_TYPE")
	private String secType;

	@Column(name="STAFF_CONTRACT_TYPE")
	private String staffContractType;

	@Column(name="TAX_NUMBER")
	private String taxNumber;

	@Column(name="TRADE_NAME")
	private String tradeName;

	@Column(name="TRADE_NAME_KH")
	private String tradeNameKh;

	@Column(name="UPDATE_BY")
	private String updateBy;

	@Column(name="UPDATE_DATE")
	private Object updateDate;

	@Column(name="VIL_ID")
	private BigDecimal vilId;

	@Column(name="WORK_ADDRESS")
	private String workAddress;

	@Column(name="WORK_VIL_ID")
	private String workVilId;

	public CustInfoDetail() {
	}

	public long getCustInfoId() {
		return this.custInfoId;
	}

	public void setCustInfoId(long custInfoId) {
		this.custInfoId = custInfoId;
	}

	public String getAddType() {
		return this.addType;
	}

	public void setAddType(String addType) {
		this.addType = addType;
	}

	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public BigDecimal getAppliType() {
		return this.appliType;
	}

	public void setAppliType(BigDecimal appliType) {
		this.appliType = appliType;
	}

	public BigDecimal getAvgMonthlyIncome() {
		return this.avgMonthlyIncome;
	}

	public void setAvgMonthlyIncome(BigDecimal avgMonthlyIncome) {
		this.avgMonthlyIncome = avgMonthlyIncome;
	}

	public BigDecimal getAvgStaffTurnOverRate() {
		return this.avgStaffTurnOverRate;
	}

	public void setAvgStaffTurnOverRate(BigDecimal avgStaffTurnOverRate) {
		this.avgStaffTurnOverRate = avgStaffTurnOverRate;
	}

	public String getBizIncomeType() {
		return this.bizIncomeType;
	}

	public void setBizIncomeType(String bizIncomeType) {
		this.bizIncomeType = bizIncomeType;
	}

	public BigDecimal getBizTotalAsset() {
		return this.bizTotalAsset;
	}

	public void setBizTotalAsset(BigDecimal bizTotalAsset) {
		this.bizTotalAsset = bizTotalAsset;
	}

	public BigDecimal getBizTotalLiability() {
		return this.bizTotalLiability;
	}

	public void setBizTotalLiability(BigDecimal bizTotalLiability) {
		this.bizTotalLiability = bizTotalLiability;
	}

	public BigDecimal getBizTotalRegisterdCapital() {
		return this.bizTotalRegisterdCapital;
	}

	public void setBizTotalRegisterdCapital(BigDecimal bizTotalRegisterdCapital) {
		this.bizTotalRegisterdCapital = bizTotalRegisterdCapital;
	}

	public BigDecimal getBrId() {
		return this.brId;
	}

	public void setBrId(BigDecimal brId) {
		this.brId = brId;
	}

	public BigDecimal getBusTypeId() {
		return this.busTypeId;
	}

	public void setBusTypeId(BigDecimal busTypeId) {
		this.busTypeId = busTypeId;
	}

	public String getCashCardId() {
		return this.cashCardId;
	}

	public void setCashCardId(String cashCardId) {
		this.cashCardId = cashCardId;
	}

	public BigDecimal getComId() {
		return this.comId;
	}

	public void setComId(BigDecimal comId) {
		this.comId = comId;
	}

	public Object getCommenceDate() {
		return this.commenceDate;
	}

	public void setCommenceDate(Object commenceDate) {
		this.commenceDate = commenceDate;
	}

	public String getCommitteeId() {
		return this.committeeId;
	}

	public void setCommitteeId(String committeeId) {
		this.committeeId = committeeId;
	}

	public String getCompanyTypeId() {
		return this.companyTypeId;
	}

	public void setCompanyTypeId(String companyTypeId) {
		this.companyTypeId = companyTypeId;
	}

	public String getCorrAddress() {
		return this.corrAddress;
	}

	public void setCorrAddress(String corrAddress) {
		this.corrAddress = corrAddress;
	}

	public String getCorrVilId() {
		return this.corrVilId;
	}

	public void setCorrVilId(String corrVilId) {
		this.corrVilId = corrVilId;
	}

	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Object getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Object createDate) {
		this.createDate = createDate;
	}

	public BigDecimal getCustId() {
		return this.custId;
	}

	public void setCustId(BigDecimal custId) {
		this.custId = custId;
	}

	public BigDecimal getCustomerType() {
		return this.customerType;
	}

	public void setCustomerType(BigDecimal customerType) {
		this.customerType = customerType;
	}

	public BigDecimal getDisId() {
		return this.disId;
	}

	public void setDisId(BigDecimal disId) {
		this.disId = disId;
	}

	public String getEMail() {
		return this.eMail;
	}

	public void setEMail(String eMail) {
		this.eMail = eMail;
	}

	public String getEconomicSector() {
		return this.economicSector;
	}

	public void setEconomicSector(String economicSector) {
		this.economicSector = economicSector;
	}

	public String getEmployerId() {
		return this.employerId;
	}

	public void setEmployerId(String employerId) {
		this.employerId = employerId;
	}

	public String getEmployerName() {
		return this.employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public String getEmploymentStatus() {
		return this.employmentStatus;
	}

	public void setEmploymentStatus(String employmentStatus) {
		this.employmentStatus = employmentStatus;
	}

	public BigDecimal getEmprep() {
		return this.emprep;
	}

	public void setEmprep(BigDecimal emprep) {
		this.emprep = emprep;
	}

	public String getFName() {
		return this.fName;
	}

	public void setFName(String fName) {
		this.fName = fName;
	}

	public String getFamilyNameKh() {
		return this.familyNameKh;
	}

	public void setFamilyNameKh(String familyNameKh) {
		this.familyNameKh = familyNameKh;
	}

	public String getFirstNameKh() {
		return this.firstNameKh;
	}

	public void setFirstNameKh(String firstNameKh) {
		this.firstNameKh = firstNameKh;
	}

	public Object getIdExpDate() {
		return this.idExpDate;
	}

	public void setIdExpDate(Object idExpDate) {
		this.idExpDate = idExpDate;
	}

	public String getIdIssueBy() {
		return this.idIssueBy;
	}

	public void setIdIssueBy(String idIssueBy) {
		this.idIssueBy = idIssueBy;
	}

	public Object getIdIssueDate() {
		return this.idIssueDate;
	}

	public void setIdIssueDate(Object idIssueDate) {
		this.idIssueDate = idIssueDate;
	}

	public BigDecimal getIdIssuer() {
		return this.idIssuer;
	}

	public void setIdIssuer(BigDecimal idIssuer) {
		this.idIssuer = idIssuer;
	}

	public String getIdno() {
		return this.idno;
	}

	public void setIdno(String idno) {
		this.idno = idno;
	}

	public String getLName() {
		return this.lName;
	}

	public void setLName(String lName) {
		this.lName = lName;
	}

	public Object getLicenseDate() {
		return this.licenseDate;
	}

	public void setLicenseDate(Object licenseDate) {
		this.licenseDate = licenseDate;
	}

	public Object getLicenseExpiryDate() {
		return this.licenseExpiryDate;
	}

	public void setLicenseExpiryDate(Object licenseExpiryDate) {
		this.licenseExpiryDate = licenseExpiryDate;
	}

	public String getLicenseIssuedBy() {
		return this.licenseIssuedBy;
	}

	public void setLicenseIssuedBy(String licenseIssuedBy) {
		this.licenseIssuedBy = licenseIssuedBy;
	}

	public String getLicenseNo() {
		return this.licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public BigDecimal getLimitAmount() {
		return this.limitAmount;
	}

	public void setLimitAmount(BigDecimal limitAmount) {
		this.limitAmount = limitAmount;
	}

	public String getMainOperatedCurrency() {
		return this.mainOperatedCurrency;
	}

	public void setMainOperatedCurrency(String mainOperatedCurrency) {
		this.mainOperatedCurrency = mainOperatedCurrency;
	}

	public String getMainSuppliers() {
		return this.mainSuppliers;
	}

	public void setMainSuppliers(String mainSuppliers) {
		this.mainSuppliers = mainSuppliers;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getNoForeignersEmployees() {
		return this.noForeignersEmployees;
	}

	public void setNoForeignersEmployees(BigDecimal noForeignersEmployees) {
		this.noForeignersEmployees = noForeignersEmployees;
	}

	public BigDecimal getNoFullTimeEmployees() {
		return this.noFullTimeEmployees;
	}

	public void setNoFullTimeEmployees(BigDecimal noFullTimeEmployees) {
		this.noFullTimeEmployees = noFullTimeEmployees;
	}

	public BigDecimal getNoSuppliers() {
		return this.noSuppliers;
	}

	public void setNoSuppliers(BigDecimal noSuppliers) {
		this.noSuppliers = noSuppliers;
	}

	public BigDecimal getNumberOfEmployees() {
		return this.numberOfEmployees;
	}

	public void setNumberOfEmployees(BigDecimal numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	public BigDecimal getOccupation() {
		return this.occupation;
	}

	public void setOccupation(BigDecimal occupation) {
		this.occupation = occupation;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public BigDecimal getProId() {
		return this.proId;
	}

	public void setProId(BigDecimal proId) {
		this.proId = proId;
	}

	public String getRegistype() {
		return this.registype;
	}

	public void setRegistype(String registype) {
		this.registype = registype;
	}

	public String getResiAddress() {
		return this.resiAddress;
	}

	public void setResiAddress(String resiAddress) {
		this.resiAddress = resiAddress;
	}

	public String getSecType() {
		return this.secType;
	}

	public void setSecType(String secType) {
		this.secType = secType;
	}

	public String getStaffContractType() {
		return this.staffContractType;
	}

	public void setStaffContractType(String staffContractType) {
		this.staffContractType = staffContractType;
	}

	public String getTaxNumber() {
		return this.taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

	public String getTradeName() {
		return this.tradeName;
	}

	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}

	public String getTradeNameKh() {
		return this.tradeNameKh;
	}

	public void setTradeNameKh(String tradeNameKh) {
		this.tradeNameKh = tradeNameKh;
	}

	public String getUpdateBy() {
		return this.updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Object getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Object updateDate) {
		this.updateDate = updateDate;
	}

	public BigDecimal getVilId() {
		return this.vilId;
	}

	public void setVilId(BigDecimal vilId) {
		this.vilId = vilId;
	}

	public String getWorkAddress() {
		return this.workAddress;
	}

	public void setWorkAddress(String workAddress) {
		this.workAddress = workAddress;
	}

	public String getWorkVilId() {
		return this.workVilId;
	}

	public void setWorkVilId(String workVilId) {
		this.workVilId = workVilId;
	}

}