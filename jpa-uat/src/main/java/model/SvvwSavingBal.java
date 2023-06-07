package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SVVW_SAVING_BAL database table.
 * 
 */
@Entity
@Table(name="SVVW_SAVING_BAL")
@NamedQuery(name="SvvwSavingBal.findAll", query="SELECT s FROM SvvwSavingBal s")
public class SvvwSavingBal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACC_STATUS")
	private String accStatus;

	@Column(name="ACCOUNT_NO")
	private String accountNo;

	private BigDecimal balance;

	@Column(name="BRANCH_ID")
	private BigDecimal branchId;

	private String ccy;

	@Column(name="CIF_NAME")
	private String cifName;

	@Column(name="CIF_NO")
	private BigDecimal cifNo;

	private BigDecimal custacctid;

	private BigDecimal freezedamt;

	@Column(name="INT_RATE")
	private BigDecimal intRate;

	@Column(name="JOINT_TYPE")
	private String jointType;

	@Column(name="\"NAMES\"")
	private String names;

	@Column(name="OPEN_DATE")
	private Object openDate;

	private String product;

	private String sex;

	@Column(name="VAL_BALANCE")
	private BigDecimal valBalance;

	public SvvwSavingBal() {
	}

	public String getAccStatus() {
		return this.accStatus;
	}

	public void setAccStatus(String accStatus) {
		this.accStatus = accStatus;
	}

	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public BigDecimal getBalance() {
		return this.balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public BigDecimal getBranchId() {
		return this.branchId;
	}

	public void setBranchId(BigDecimal branchId) {
		this.branchId = branchId;
	}

	public String getCcy() {
		return this.ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public String getCifName() {
		return this.cifName;
	}

	public void setCifName(String cifName) {
		this.cifName = cifName;
	}

	public BigDecimal getCifNo() {
		return this.cifNo;
	}

	public void setCifNo(BigDecimal cifNo) {
		this.cifNo = cifNo;
	}

	public BigDecimal getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(BigDecimal custacctid) {
		this.custacctid = custacctid;
	}

	public BigDecimal getFreezedamt() {
		return this.freezedamt;
	}

	public void setFreezedamt(BigDecimal freezedamt) {
		this.freezedamt = freezedamt;
	}

	public BigDecimal getIntRate() {
		return this.intRate;
	}

	public void setIntRate(BigDecimal intRate) {
		this.intRate = intRate;
	}

	public String getJointType() {
		return this.jointType;
	}

	public void setJointType(String jointType) {
		this.jointType = jointType;
	}

	public String getNames() {
		return this.names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public Object getOpenDate() {
		return this.openDate;
	}

	public void setOpenDate(Object openDate) {
		this.openDate = openDate;
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public BigDecimal getValBalance() {
		return this.valBalance;
	}

	public void setValBalance(BigDecimal valBalance) {
		this.valBalance = valBalance;
	}

}