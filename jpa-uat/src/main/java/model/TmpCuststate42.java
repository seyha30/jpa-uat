package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TMP_CUSTSTATE42 database table.
 * 
 */
@Entity
@Table(name="TMP_CUSTSTATE42")
@NamedQuery(name="TmpCuststate42.findAll", query="SELECT t FROM TmpCuststate42 t")
public class TmpCuststate42 implements Serializable {
	private static final long serialVersionUID = 1L;

	private String acctno;

	private BigDecimal balance;

	private BigDecimal cramt;

	private String curr;

	private BigDecimal custacctid;

	private String custstr;

	@Column(name="DATE_DONE")
	private String dateDone;

	private String description;

	private BigDecimal dramt;

	@Column(name="\"NAMES\"")
	private String names;

	private BigDecimal openbal;

	private String refno;

	private BigDecimal sno;

	@Column(name="\"STATE\"")
	private String state;

	private String street;

	@Column(name="TRANX_NO")
	private BigDecimal tranxNo;

	private String zip;

	public TmpCuststate42() {
	}

	public String getAcctno() {
		return this.acctno;
	}

	public void setAcctno(String acctno) {
		this.acctno = acctno;
	}

	public BigDecimal getBalance() {
		return this.balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public BigDecimal getCramt() {
		return this.cramt;
	}

	public void setCramt(BigDecimal cramt) {
		this.cramt = cramt;
	}

	public String getCurr() {
		return this.curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}

	public BigDecimal getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(BigDecimal custacctid) {
		this.custacctid = custacctid;
	}

	public String getCuststr() {
		return this.custstr;
	}

	public void setCuststr(String custstr) {
		this.custstr = custstr;
	}

	public String getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(String dateDone) {
		this.dateDone = dateDone;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getDramt() {
		return this.dramt;
	}

	public void setDramt(BigDecimal dramt) {
		this.dramt = dramt;
	}

	public String getNames() {
		return this.names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public BigDecimal getOpenbal() {
		return this.openbal;
	}

	public void setOpenbal(BigDecimal openbal) {
		this.openbal = openbal;
	}

	public String getRefno() {
		return this.refno;
	}

	public void setRefno(String refno) {
		this.refno = refno;
	}

	public BigDecimal getSno() {
		return this.sno;
	}

	public void setSno(BigDecimal sno) {
		this.sno = sno;
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

	public BigDecimal getTranxNo() {
		return this.tranxNo;
	}

	public void setTranxNo(BigDecimal tranxNo) {
		this.tranxNo = tranxNo;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}