package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the LOAN_CONTRACT_INDIVIDUAL database table.
 * 
 */
@Entity
@Table(name="LOAN_CONTRACT_INDIVIDUAL")
@NamedQuery(name="LoanContractIndividual.findAll", query="SELECT l FROM LoanContractIndividual l")
public class LoanContractIndividual implements Serializable {
	private static final long serialVersionUID = 1L;

	private String address;

	private Object dob;

	private String idno;

	@Column(name="INST_NO")
	private BigDecimal instNo;

	@Column(name="INT_RATE")
	private BigDecimal intRate;

	@Column(name="LOAN_REFNO")
	private String loanRefno;

	@Column(name="\"MAIN\"")
	private String main;

	private String name;

	@Column(name="PRIN_AMT")
	private BigDecimal prinAmt;

	private String sex;

	@Column(name="USER_ID")
	private String userId;

	public LoanContractIndividual() {
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Object getDob() {
		return this.dob;
	}

	public void setDob(Object dob) {
		this.dob = dob;
	}

	public String getIdno() {
		return this.idno;
	}

	public void setIdno(String idno) {
		this.idno = idno;
	}

	public BigDecimal getInstNo() {
		return this.instNo;
	}

	public void setInstNo(BigDecimal instNo) {
		this.instNo = instNo;
	}

	public BigDecimal getIntRate() {
		return this.intRate;
	}

	public void setIntRate(BigDecimal intRate) {
		this.intRate = intRate;
	}

	public String getLoanRefno() {
		return this.loanRefno;
	}

	public void setLoanRefno(String loanRefno) {
		this.loanRefno = loanRefno;
	}

	public String getMain() {
		return this.main;
	}

	public void setMain(String main) {
		this.main = main;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrinAmt() {
		return this.prinAmt;
	}

	public void setPrinAmt(BigDecimal prinAmt) {
		this.prinAmt = prinAmt;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}