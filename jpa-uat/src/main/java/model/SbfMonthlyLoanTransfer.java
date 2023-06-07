package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SBF_MONTHLY_LOAN_TRANSFER database table.
 * 
 */
@Entity
@Table(name="SBF_MONTHLY_LOAN_TRANSFER")
@NamedQuery(name="SbfMonthlyLoanTransfer.findAll", query="SELECT s FROM SbfMonthlyLoanTransfer s")
public class SbfMonthlyLoanTransfer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="BRANCH_ID")
	private BigDecimal branchId;

	@Column(name="CREATE_BY")
	private String createBy;

	@Column(name="CREATE_DATE")
	private Object createDate;

	private String status;

	@Column(name="TR_FROM")
	private String trFrom;

	@Column(name="TR_TO")
	private BigDecimal trTo;

	@Column(name="TR_TO_LR")
	private BigDecimal trToLr;

	@Column(name="TR_TOLRNAME")
	private String trTolrname;

	@Column(name="TR_TONAME")
	private String trToname;

	@Column(name="UPDATE_BY")
	private String updateBy;

	@Column(name="UPDATE_DATE")
	private Object updateDate;

	public SbfMonthlyLoanTransfer() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getBranchId() {
		return this.branchId;
	}

	public void setBranchId(BigDecimal branchId) {
		this.branchId = branchId;
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTrFrom() {
		return this.trFrom;
	}

	public void setTrFrom(String trFrom) {
		this.trFrom = trFrom;
	}

	public BigDecimal getTrTo() {
		return this.trTo;
	}

	public void setTrTo(BigDecimal trTo) {
		this.trTo = trTo;
	}

	public BigDecimal getTrToLr() {
		return this.trToLr;
	}

	public void setTrToLr(BigDecimal trToLr) {
		this.trToLr = trToLr;
	}

	public String getTrTolrname() {
		return this.trTolrname;
	}

	public void setTrTolrname(String trTolrname) {
		this.trTolrname = trTolrname;
	}

	public String getTrToname() {
		return this.trToname;
	}

	public void setTrToname(String trToname) {
		this.trToname = trToname;
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