package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CUST_INFORMATION database table.
 * 
 */
@Entity
@Table(name="CUST_INFORMATION")
@NamedQuery(name="CustInformation.findAll", query="SELECT c FROM CustInformation c")
public class CustInformation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ADD_TYPE")
	private String addType;

	private String address1;

	private String address2;

	@Column(name="APPLI_TYPE")
	private BigDecimal appliType;

	@Column(name="AVG_MONTHLY_INCOME")
	private BigDecimal avgMonthlyIncome;

	@Column(name="BR_ID")
	private BigDecimal brId;

	@Column(name="BUS_TYPE_ID")
	private BigDecimal busTypeId;

	@Column(name="CASH_CARD_ID")
	private String cashCardId;

	private String city;

	@Column(name="COM_ID")
	private BigDecimal comId;

	@Column(name="COMMENCE_DATE")
	private Object commenceDate;

	@Column(name="COMMITTEE_ID")
	private String committeeId;

	@Column(name="CORR_ADDRESS")
	private String corrAddress;

	@Column(name="CORR_VIL_ID")
	private String corrVilId;

	private String country;

	@Column(name="CREATE_BY")
	private String createBy;

	@Column(name="CREATE_DATE")
	private Object createDate;

	@Column(name="CTRY_ID")
	private BigDecimal ctryId;

	@Column(name="CUST_INFO_ID")
	private BigDecimal custInfoId;

	@Column(name="CUST_KEY_NUM")
	private BigDecimal custKeyNum;

	@Column(name="DIS_ID")
	private BigDecimal disId;

	private Object dob;

	@Column(name="E_MAIL")
	private String eMail;

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

	private String fax;

	@Column(name="FIRST_NAME_KH")
	private String firstNameKh;

	@Column(name="H_PHONE")
	private String hPhone;

	@Column(name="ID_EXP_DATE")
	private Object idExpDate;

	@Column(name="ID_ISSUE_BY")
	private BigDecimal idIssueBy;

	@Column(name="ID_ISSUE_DATE")
	private Object idIssueDate;

	private String idno;

	private BigDecimal income;

	@Column(name="KH_NAME")
	private String khName;

	@Column(name="L_NAME")
	private String lName;

	@Column(name="LIMIT_AMOUNT")
	private BigDecimal limitAmount;

	@Column(name="MAIN_OPERATED_CURRENCY")
	private String mainOperatedCurrency;

	@Column(name="MS_ID")
	private BigDecimal msId;

	private String name;

	@Column(name="NUMBER_OF_EMPLOYEES")
	private BigDecimal numberOfEmployees;

	@Column(name="O_PHONE")
	private String oPhone;

	private String occupation;

	@Column(name="OCCUPATION_ID")
	private BigDecimal occupationId;

	@Column(name="PHONE_NUMBER")
	private String phoneNumber;

	@Column(name="PRO_ID")
	private BigDecimal proId;

	@Column(name="RACE_ID")
	private BigDecimal raceId;

	private String registype;

	@Column(name="RESI_ADDRESS")
	private String resiAddress;

	@Column(name="SEC_TYPE")
	private String secType;

	private String sex;

	@Column(name="STAFF_CONTRACT_TYPE")
	private String staffContractType;

	@Column(name="\"STATE\"")
	private String state;

	private String street;

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

	@Column(name="ZIP_CODE")
	private String zipCode;

	public CustInformation() {
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

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
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

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	public BigDecimal getCtryId() {
		return this.ctryId;
	}

	public void setCtryId(BigDecimal ctryId) {
		this.ctryId = ctryId;
	}

	public BigDecimal getCustInfoId() {
		return this.custInfoId;
	}

	public void setCustInfoId(BigDecimal custInfoId) {
		this.custInfoId = custInfoId;
	}

	public BigDecimal getCustKeyNum() {
		return this.custKeyNum;
	}

	public void setCustKeyNum(BigDecimal custKeyNum) {
		this.custKeyNum = custKeyNum;
	}

	public BigDecimal getDisId() {
		return this.disId;
	}

	public void setDisId(BigDecimal disId) {
		this.disId = disId;
	}

	public Object getDob() {
		return this.dob;
	}

	public void setDob(Object dob) {
		this.dob = dob;
	}

	public String getEMail() {
		return this.eMail;
	}

	public void setEMail(String eMail) {
		this.eMail = eMail;
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

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getFirstNameKh() {
		return this.firstNameKh;
	}

	public void setFirstNameKh(String firstNameKh) {
		this.firstNameKh = firstNameKh;
	}

	public String getHPhone() {
		return this.hPhone;
	}

	public void setHPhone(String hPhone) {
		this.hPhone = hPhone;
	}

	public Object getIdExpDate() {
		return this.idExpDate;
	}

	public void setIdExpDate(Object idExpDate) {
		this.idExpDate = idExpDate;
	}

	public BigDecimal getIdIssueBy() {
		return this.idIssueBy;
	}

	public void setIdIssueBy(BigDecimal idIssueBy) {
		this.idIssueBy = idIssueBy;
	}

	public Object getIdIssueDate() {
		return this.idIssueDate;
	}

	public void setIdIssueDate(Object idIssueDate) {
		this.idIssueDate = idIssueDate;
	}

	public String getIdno() {
		return this.idno;
	}

	public void setIdno(String idno) {
		this.idno = idno;
	}

	public BigDecimal getIncome() {
		return this.income;
	}

	public void setIncome(BigDecimal income) {
		this.income = income;
	}

	public String getKhName() {
		return this.khName;
	}

	public void setKhName(String khName) {
		this.khName = khName;
	}

	public String getLName() {
		return this.lName;
	}

	public void setLName(String lName) {
		this.lName = lName;
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

	public BigDecimal getMsId() {
		return this.msId;
	}

	public void setMsId(BigDecimal msId) {
		this.msId = msId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getNumberOfEmployees() {
		return this.numberOfEmployees;
	}

	public void setNumberOfEmployees(BigDecimal numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	public String getOPhone() {
		return this.oPhone;
	}

	public void setOPhone(String oPhone) {
		this.oPhone = oPhone;
	}

	public String getOccupation() {
		return this.occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public BigDecimal getOccupationId() {
		return this.occupationId;
	}

	public void setOccupationId(BigDecimal occupationId) {
		this.occupationId = occupationId;
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

	public BigDecimal getRaceId() {
		return this.raceId;
	}

	public void setRaceId(BigDecimal raceId) {
		this.raceId = raceId;
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

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getStaffContractType() {
		return this.staffContractType;
	}

	public void setStaffContractType(String staffContractType) {
		this.staffContractType = staffContractType;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
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

	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}