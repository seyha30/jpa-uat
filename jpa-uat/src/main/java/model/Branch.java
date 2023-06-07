package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the BRANCH database table.
 * 
 */
@Entity
@NamedQuery(name="Branch.findAll", query="SELECT b FROM Branch b")
public class Branch implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="BRANCH_ID")
	private long branchId;

	private String address;

	private String code;

	private String deleted;

	private String description;

	@Column(name="DESCRIPTION_KH")
	private String descriptionKh;

	@Column(name="DIS_CODE")
	private String disCode;

	private String dsn;

	private String email;

	@Column(name="\"NAMES\"")
	private String names;

	@Column(name="NAMES_KH")
	private String namesKh;

	private String phone;

	@Column(name="SBF_DESC")
	private String sbfDesc;

	private String website;

	//bi-directional many-to-one association to CustAcct
	@OneToMany(mappedBy="branch")
	private List<CustAcct> custAccts;

	//bi-directional many-to-one association to LoginLog
	@OneToMany(mappedBy="branch")
	private List<LoginLog> loginLogs;

	public Branch() {
	}

	public long getBranchId() {
		return this.branchId;
	}

	public void setBranchId(long branchId) {
		this.branchId = branchId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescriptionKh() {
		return this.descriptionKh;
	}

	public void setDescriptionKh(String descriptionKh) {
		this.descriptionKh = descriptionKh;
	}

	public String getDisCode() {
		return this.disCode;
	}

	public void setDisCode(String disCode) {
		this.disCode = disCode;
	}

	public String getDsn() {
		return this.dsn;
	}

	public void setDsn(String dsn) {
		this.dsn = dsn;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNames() {
		return this.names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getNamesKh() {
		return this.namesKh;
	}

	public void setNamesKh(String namesKh) {
		this.namesKh = namesKh;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSbfDesc() {
		return this.sbfDesc;
	}

	public void setSbfDesc(String sbfDesc) {
		this.sbfDesc = sbfDesc;
	}

	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public List<CustAcct> getCustAccts() {
		return this.custAccts;
	}

	public void setCustAccts(List<CustAcct> custAccts) {
		this.custAccts = custAccts;
	}

	public CustAcct addCustAcct(CustAcct custAcct) {
		getCustAccts().add(custAcct);
		custAcct.setBranch(this);

		return custAcct;
	}

	public CustAcct removeCustAcct(CustAcct custAcct) {
		getCustAccts().remove(custAcct);
		custAcct.setBranch(null);

		return custAcct;
	}

	public List<LoginLog> getLoginLogs() {
		return this.loginLogs;
	}

	public void setLoginLogs(List<LoginLog> loginLogs) {
		this.loginLogs = loginLogs;
	}

	public LoginLog addLoginLog(LoginLog loginLog) {
		getLoginLogs().add(loginLog);
		loginLog.setBranch(this);

		return loginLog;
	}

	public LoginLog removeLoginLog(LoginLog loginLog) {
		getLoginLogs().remove(loginLog);
		loginLog.setBranch(null);

		return loginLog;
	}

}