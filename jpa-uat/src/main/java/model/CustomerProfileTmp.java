package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CUSTOMER_PROFILE_TMP database table.
 * 
 */
@Entity
@Table(name="CUSTOMER_PROFILE_TMP")
@NamedQuery(name="CustomerProfileTmp.findAll", query="SELECT c FROM CustomerProfileTmp c")
public class CustomerProfileTmp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACC_TYPE")
	private String accType;

	private String account;

	private String addr;

	private String branch;

	@Column(name="CAD_AVG")
	private BigDecimal cadAvg;

	@Column(name="CAW_AVG")
	private BigDecimal cawAvg;

	private Object dob;

	@Column(name="\"NAMES\"")
	private String names;

	private BigDecimal olb;

	@Column(name="OPEN_DATE")
	private Object openDate;

	@Column(name="USER_ID")
	private String userId;

	public CustomerProfileTmp() {
	}

	public String getAccType() {
		return this.accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getAddr() {
		return this.addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getBranch() {
		return this.branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public BigDecimal getCadAvg() {
		return this.cadAvg;
	}

	public void setCadAvg(BigDecimal cadAvg) {
		this.cadAvg = cadAvg;
	}

	public BigDecimal getCawAvg() {
		return this.cawAvg;
	}

	public void setCawAvg(BigDecimal cawAvg) {
		this.cawAvg = cawAvg;
	}

	public Object getDob() {
		return this.dob;
	}

	public void setDob(Object dob) {
		this.dob = dob;
	}

	public String getNames() {
		return this.names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public BigDecimal getOlb() {
		return this.olb;
	}

	public void setOlb(BigDecimal olb) {
		this.olb = olb;
	}

	public Object getOpenDate() {
		return this.openDate;
	}

	public void setOpenDate(Object openDate) {
		this.openDate = openDate;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}