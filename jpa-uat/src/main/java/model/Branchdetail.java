package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the BRANCHDETAIL database table.
 * 
 */
@Entity
@NamedQuery(name="Branchdetail.findAll", query="SELECT b FROM Branchdetail b")
public class Branchdetail implements Serializable {
	private static final long serialVersionUID = 1L;

	private String address;

	@Column(name="BRANCH_ID")
	private BigDecimal branchId;

	@Column(name="CASH_GL")
	private BigDecimal cashGl;

	private BigDecimal currid;

	private String email;

	@Column(name="EXCHANGE_GL")
	private BigDecimal exchangeGl;

	@Column(name="GAND_GL")
	private BigDecimal gandGl;

	@Column(name="INT_GL")
	private BigDecimal intGl;

	@Column(name="NOS_GL")
	private BigDecimal nosGl;

	private String phone;

	private String website;

	@Column(name="WO_GL")
	private BigDecimal woGl;

	public Branchdetail() {
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BigDecimal getBranchId() {
		return this.branchId;
	}

	public void setBranchId(BigDecimal branchId) {
		this.branchId = branchId;
	}

	public BigDecimal getCashGl() {
		return this.cashGl;
	}

	public void setCashGl(BigDecimal cashGl) {
		this.cashGl = cashGl;
	}

	public BigDecimal getCurrid() {
		return this.currid;
	}

	public void setCurrid(BigDecimal currid) {
		this.currid = currid;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigDecimal getExchangeGl() {
		return this.exchangeGl;
	}

	public void setExchangeGl(BigDecimal exchangeGl) {
		this.exchangeGl = exchangeGl;
	}

	public BigDecimal getGandGl() {
		return this.gandGl;
	}

	public void setGandGl(BigDecimal gandGl) {
		this.gandGl = gandGl;
	}

	public BigDecimal getIntGl() {
		return this.intGl;
	}

	public void setIntGl(BigDecimal intGl) {
		this.intGl = intGl;
	}

	public BigDecimal getNosGl() {
		return this.nosGl;
	}

	public void setNosGl(BigDecimal nosGl) {
		this.nosGl = nosGl;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public BigDecimal getWoGl() {
		return this.woGl;
	}

	public void setWoGl(BigDecimal woGl) {
		this.woGl = woGl;
	}

}