package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CUST_INFO_LOG database table.
 * 
 */
@Entity
@Table(name="CUST_INFO_LOG")
@NamedQuery(name="CustInfoLog.findAll", query="SELECT c FROM CustInfoLog c")
public class CustInfoLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="BR_ID")
	private BigDecimal brId;

	private String city;

	private String country;

	@Column(name="CREATED_DATE")
	private Object createdDate;

	@Column(name="CTRY_ID")
	private BigDecimal ctryId;

	@Column(name="CUST_KEY_CHAR")
	private String custKeyChar;

	@Column(name="CUST_KEY_NUM")
	private BigDecimal custKeyNum;

	private String dob;

	@Column(name="DONE_BY")
	private String doneBy;

	private String fax;

	@Column(name="H_PHONE")
	private String hPhone;

	private BigDecimal income;

	@Column(name="MS_ID")
	private BigDecimal msId;

	private String name;

	private String nric;

	@Column(name="O_PHONE")
	private String oPhone;

	private String occupation;

	@Column(name="RACE_ID")
	private BigDecimal raceId;

	@Column(name="REG_DATE")
	private Object regDate;

	private String sex;

	@Column(name="\"STATE\"")
	private String state;

	private String street;

	@Column(name="ZIP_CODE")
	private String zipCode;

	public CustInfoLog() {
	}

	public BigDecimal getBrId() {
		return this.brId;
	}

	public void setBrId(BigDecimal brId) {
		this.brId = brId;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Object getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Object createdDate) {
		this.createdDate = createdDate;
	}

	public BigDecimal getCtryId() {
		return this.ctryId;
	}

	public void setCtryId(BigDecimal ctryId) {
		this.ctryId = ctryId;
	}

	public String getCustKeyChar() {
		return this.custKeyChar;
	}

	public void setCustKeyChar(String custKeyChar) {
		this.custKeyChar = custKeyChar;
	}

	public BigDecimal getCustKeyNum() {
		return this.custKeyNum;
	}

	public void setCustKeyNum(BigDecimal custKeyNum) {
		this.custKeyNum = custKeyNum;
	}

	public String getDob() {
		return this.dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getDoneBy() {
		return this.doneBy;
	}

	public void setDoneBy(String doneBy) {
		this.doneBy = doneBy;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getHPhone() {
		return this.hPhone;
	}

	public void setHPhone(String hPhone) {
		this.hPhone = hPhone;
	}

	public BigDecimal getIncome() {
		return this.income;
	}

	public void setIncome(BigDecimal income) {
		this.income = income;
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

	public String getNric() {
		return this.nric;
	}

	public void setNric(String nric) {
		this.nric = nric;
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

	public BigDecimal getRaceId() {
		return this.raceId;
	}

	public void setRaceId(BigDecimal raceId) {
		this.raceId = raceId;
	}

	public Object getRegDate() {
		return this.regDate;
	}

	public void setRegDate(Object regDate) {
		this.regDate = regDate;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
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

	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}