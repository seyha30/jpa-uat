package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TB_BANK_ACCT_INFO database table.
 * 
 */
@Entity
@Table(name="TB_BANK_ACCT_INFO")
@NamedQuery(name="TbBankAcctInfo.findAll", query="SELECT t FROM TbBankAcctInfo t")
public class TbBankAcctInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="B_ID")
	private long bId;

	@Column(name="B_ACCT_CCY")
	private BigDecimal bAcctCcy;

	@Column(name="B_ACCT_NAME")
	private String bAcctName;

	@Column(name="B_ACCT_NUMBER")
	private String bAcctNumber;

	@Column(name="B_NAME")
	private String bName;

	@Column(name="COM_ID")
	private String comId;

	@Column(name="CREATE_BY")
	private String createBy;

	@Column(name="CREATE_DATE")
	private Object createDate;

	private BigDecimal custacctid;

	@Column(name="DEALER_NAME")
	private String dealerName;

	private String related;

	@Column(name="UPDATE_BY")
	private String updateBy;

	@Column(name="UPDATE_DATE")
	private Object updateDate;

	public TbBankAcctInfo() {
	}

	public long getBId() {
		return this.bId;
	}

	public void setBId(long bId) {
		this.bId = bId;
	}

	public BigDecimal getBAcctCcy() {
		return this.bAcctCcy;
	}

	public void setBAcctCcy(BigDecimal bAcctCcy) {
		this.bAcctCcy = bAcctCcy;
	}

	public String getBAcctName() {
		return this.bAcctName;
	}

	public void setBAcctName(String bAcctName) {
		this.bAcctName = bAcctName;
	}

	public String getBAcctNumber() {
		return this.bAcctNumber;
	}

	public void setBAcctNumber(String bAcctNumber) {
		this.bAcctNumber = bAcctNumber;
	}

	public String getBName() {
		return this.bName;
	}

	public void setBName(String bName) {
		this.bName = bName;
	}

	public String getComId() {
		return this.comId;
	}

	public void setComId(String comId) {
		this.comId = comId;
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

	public BigDecimal getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(BigDecimal custacctid) {
		this.custacctid = custacctid;
	}

	public String getDealerName() {
		return this.dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public String getRelated() {
		return this.related;
	}

	public void setRelated(String related) {
		this.related = related;
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

}