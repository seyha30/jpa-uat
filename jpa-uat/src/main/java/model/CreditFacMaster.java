package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the CREDIT_FAC_MASTER database table.
 * 
 */
@Entity
@Table(name="CREDIT_FAC_MASTER")
@NamedQuery(name="CreditFacMaster.findAll", query="SELECT c FROM CreditFacMaster c")
public class CreditFacMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CREDIT_FAC_ID")
	private long creditFacId;

	@Column(name="AMT_LIMIT")
	private BigDecimal amtLimit;

	@Column(name="APPL_DATE")
	private Object applDate;

	@Column(name="CREATED_DATE")
	private Object createdDate;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	private BigDecimal custacctid;

	private String deleted;

	@Column(name="DONE_BY")
	private String doneBy;

	@Column(name="EXPIRY_DATE")
	private Object expiryDate;

	@Column(name="FAC_REF_NO")
	private String facRefNo;

	@Column(name="GRANTED_BY")
	private String grantedBy;

	@Column(name="REL_REF_NO")
	private String relRefNo;

	@Column(name="REVIEW_DATE")
	private Object reviewDate;

	//bi-directional many-to-one association to BusinessType
	@ManyToOne
	@JoinColumn(name="BUS_TYPE_ID")
	private BusinessType businessType;

	//bi-directional many-to-one association to CreditStatus
	@ManyToOne
	@JoinColumn(name="CREDIT_STATUS_ID")
	private CreditStatus creditStatus;

	//bi-directional many-to-one association to Merchant
	@OneToMany(mappedBy="creditFacMaster")
	private List<Merchant> merchants;

	public CreditFacMaster() {
	}

	public long getCreditFacId() {
		return this.creditFacId;
	}

	public void setCreditFacId(long creditFacId) {
		this.creditFacId = creditFacId;
	}

	public BigDecimal getAmtLimit() {
		return this.amtLimit;
	}

	public void setAmtLimit(BigDecimal amtLimit) {
		this.amtLimit = amtLimit;
	}

	public Object getApplDate() {
		return this.applDate;
	}

	public void setApplDate(Object applDate) {
		this.applDate = applDate;
	}

	public Object getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Object createdDate) {
		this.createdDate = createdDate;
	}

	public BigDecimal getCurrId() {
		return this.currId;
	}

	public void setCurrId(BigDecimal currId) {
		this.currId = currId;
	}

	public BigDecimal getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(BigDecimal custacctid) {
		this.custacctid = custacctid;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getDoneBy() {
		return this.doneBy;
	}

	public void setDoneBy(String doneBy) {
		this.doneBy = doneBy;
	}

	public Object getExpiryDate() {
		return this.expiryDate;
	}

	public void setExpiryDate(Object expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getFacRefNo() {
		return this.facRefNo;
	}

	public void setFacRefNo(String facRefNo) {
		this.facRefNo = facRefNo;
	}

	public String getGrantedBy() {
		return this.grantedBy;
	}

	public void setGrantedBy(String grantedBy) {
		this.grantedBy = grantedBy;
	}

	public String getRelRefNo() {
		return this.relRefNo;
	}

	public void setRelRefNo(String relRefNo) {
		this.relRefNo = relRefNo;
	}

	public Object getReviewDate() {
		return this.reviewDate;
	}

	public void setReviewDate(Object reviewDate) {
		this.reviewDate = reviewDate;
	}

	public BusinessType getBusinessType() {
		return this.businessType;
	}

	public void setBusinessType(BusinessType businessType) {
		this.businessType = businessType;
	}

	public CreditStatus getCreditStatus() {
		return this.creditStatus;
	}

	public void setCreditStatus(CreditStatus creditStatus) {
		this.creditStatus = creditStatus;
	}

	public List<Merchant> getMerchants() {
		return this.merchants;
	}

	public void setMerchants(List<Merchant> merchants) {
		this.merchants = merchants;
	}

	public Merchant addMerchant(Merchant merchant) {
		getMerchants().add(merchant);
		merchant.setCreditFacMaster(this);

		return merchant;
	}

	public Merchant removeMerchant(Merchant merchant) {
		getMerchants().remove(merchant);
		merchant.setCreditFacMaster(null);

		return merchant;
	}

}