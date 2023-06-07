package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SBF_SHAREHOLDER_INFO database table.
 * 
 */
@Entity
@Table(name="SBF_SHAREHOLDER_INFO")
@NamedQuery(name="SbfShareholderInfo.findAll", query="SELECT s FROM SbfShareholderInfo s")
public class SbfShareholderInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CESSATION_DATE")
	private Object cessationDate;

	@Column(name="CUST_ID")
	private BigDecimal custId;

	private Object dob;

	@Column(name="F_NAME")
	private String fName;

	private BigDecimal id;

	private String idno;

	@Column(name="L_NAME")
	private String lName;

	private String name;

	@Column(name="SHARE_HOLDING")
	private BigDecimal shareHolding;

	@Column(name="SHAREHOLDER_ID")
	private BigDecimal shareholderId;

	public SbfShareholderInfo() {
	}

	public Object getCessationDate() {
		return this.cessationDate;
	}

	public void setCessationDate(Object cessationDate) {
		this.cessationDate = cessationDate;
	}

	public BigDecimal getCustId() {
		return this.custId;
	}

	public void setCustId(BigDecimal custId) {
		this.custId = custId;
	}

	public Object getDob() {
		return this.dob;
	}

	public void setDob(Object dob) {
		this.dob = dob;
	}

	public String getFName() {
		return this.fName;
	}

	public void setFName(String fName) {
		this.fName = fName;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getShareHolding() {
		return this.shareHolding;
	}

	public void setShareHolding(BigDecimal shareHolding) {
		this.shareHolding = shareHolding;
	}

	public BigDecimal getShareholderId() {
		return this.shareholderId;
	}

	public void setShareholderId(BigDecimal shareholderId) {
		this.shareholderId = shareholderId;
	}

}