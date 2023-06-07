package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SBF_COMMITTEE database table.
 * 
 */
@Entity
@Table(name="SBF_COMMITTEE")
@NamedQuery(name="SbfCommittee.findAll", query="SELECT s FROM SbfCommittee s")
public class SbfCommittee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CM_ID")
	private String cmId;

	@Column(name="COM_METHOD")
	private String comMethod;

	@Column(name="COM_TYPE")
	private String comType;

	@Column(name="COMPANY_ID")
	private String companyId;

	@Column(name="CONDITION_COLLECTION")
	private String conditionCollection;

	@Column(name="M1_ADDRESS")
	private String m1Address;

	@Column(name="M1_CONTACT")
	private String m1Contact;

	@Column(name="M1_POSITION")
	private String m1Position;

	@Column(name="M1_SEX")
	private String m1Sex;

	@Column(name="M2_ADDRESS")
	private String m2Address;

	@Column(name="M2_CONTACT")
	private String m2Contact;

	@Column(name="M2_POSITION")
	private String m2Position;

	@Column(name="M2_SEX")
	private String m2Sex;

	private String member1;

	private String member2;

	@Column(name="MOU_COMMISSION")
	private BigDecimal mouCommission;

	@Column(name="MOU_DATE")
	private Object mouDate;

	@Column(name="MOU_PERIOD")
	private BigDecimal mouPeriod;

	@Column(name="OTHER_COMM_FEE")
	private BigDecimal otherCommFee;

	private String udf1;

	public SbfCommittee() {
	}

	public String getCmId() {
		return this.cmId;
	}

	public void setCmId(String cmId) {
		this.cmId = cmId;
	}

	public String getComMethod() {
		return this.comMethod;
	}

	public void setComMethod(String comMethod) {
		this.comMethod = comMethod;
	}

	public String getComType() {
		return this.comType;
	}

	public void setComType(String comType) {
		this.comType = comType;
	}

	public String getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getConditionCollection() {
		return this.conditionCollection;
	}

	public void setConditionCollection(String conditionCollection) {
		this.conditionCollection = conditionCollection;
	}

	public String getM1Address() {
		return this.m1Address;
	}

	public void setM1Address(String m1Address) {
		this.m1Address = m1Address;
	}

	public String getM1Contact() {
		return this.m1Contact;
	}

	public void setM1Contact(String m1Contact) {
		this.m1Contact = m1Contact;
	}

	public String getM1Position() {
		return this.m1Position;
	}

	public void setM1Position(String m1Position) {
		this.m1Position = m1Position;
	}

	public String getM1Sex() {
		return this.m1Sex;
	}

	public void setM1Sex(String m1Sex) {
		this.m1Sex = m1Sex;
	}

	public String getM2Address() {
		return this.m2Address;
	}

	public void setM2Address(String m2Address) {
		this.m2Address = m2Address;
	}

	public String getM2Contact() {
		return this.m2Contact;
	}

	public void setM2Contact(String m2Contact) {
		this.m2Contact = m2Contact;
	}

	public String getM2Position() {
		return this.m2Position;
	}

	public void setM2Position(String m2Position) {
		this.m2Position = m2Position;
	}

	public String getM2Sex() {
		return this.m2Sex;
	}

	public void setM2Sex(String m2Sex) {
		this.m2Sex = m2Sex;
	}

	public String getMember1() {
		return this.member1;
	}

	public void setMember1(String member1) {
		this.member1 = member1;
	}

	public String getMember2() {
		return this.member2;
	}

	public void setMember2(String member2) {
		this.member2 = member2;
	}

	public BigDecimal getMouCommission() {
		return this.mouCommission;
	}

	public void setMouCommission(BigDecimal mouCommission) {
		this.mouCommission = mouCommission;
	}

	public Object getMouDate() {
		return this.mouDate;
	}

	public void setMouDate(Object mouDate) {
		this.mouDate = mouDate;
	}

	public BigDecimal getMouPeriod() {
		return this.mouPeriod;
	}

	public void setMouPeriod(BigDecimal mouPeriod) {
		this.mouPeriod = mouPeriod;
	}

	public BigDecimal getOtherCommFee() {
		return this.otherCommFee;
	}

	public void setOtherCommFee(BigDecimal otherCommFee) {
		this.otherCommFee = otherCommFee;
	}

	public String getUdf1() {
		return this.udf1;
	}

	public void setUdf1(String udf1) {
		this.udf1 = udf1;
	}

}