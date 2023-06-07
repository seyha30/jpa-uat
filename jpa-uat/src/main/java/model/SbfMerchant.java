package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the SBF_MERCHANT database table.
 * 
 */
@Entity
@Table(name="SBF_MERCHANT")
@NamedQuery(name="SbfMerchant.findAll", query="SELECT s FROM SbfMerchant s")
public class SbfMerchant implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String address;

	@Column(name="BANK_ACCOUNT_NO")
	private String bankAccountNo;

	@Column(name="BANK_BENIFITCIARY_NAME")
	private String bankBenifitciaryName;

	@Column(name="BANK_NAME")
	private String bankName;

	@Column(name="BIZ_SECTOR_CODE")
	private String bizSectorCode;

	private String category;

	@Column(name="CONTACT_PERSION")
	private String contactPersion;

	@Column(name="CONTACT_PERSION_ID")
	private String contactPersionId;

	@Column(name="CONTACT_PERSION_PHONE")
	private String contactPersionPhone;

	@Column(name="CONTACT_PERSION_POSITION")
	private String contactPersionPosition;

	@Column(name="CREATE_BY")
	private String createBy;

	@Column(name="CREATE_DATE")
	private Object createDate;

	private String email;

	@Column(name="IS_ACTIVE")
	private BigDecimal isActive;

	@Column(name="MAX_NOTE_AMOUNT_LIMIT")
	private BigDecimal maxNoteAmountLimit;

	@Column(name="MERCHANT_CODE")
	private String merchantCode;

	@Column(name="MERCHANT_NAME")
	private String merchantName;

	@Column(name="MERCHANT_NAME_KH")
	private String merchantNameKh;

	@Column(name="MERCHANT_SETTLEMENT_NO")
	private String merchantSettlementNo;

	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Column(name="MODIFIED_DATE")
	private Object modifiedDate;

	@Column(name="MOU_DATE")
	private Object mouDate;

	@Column(name="PAR_LIMIT")
	private BigDecimal parLimit;

	private String phonenumer;

	@Column(name="RESPONSIBLE_BRANCH")
	private String responsibleBranch;

	@Column(name="TOTAL_EXPOSERE_LIMIT")
	private BigDecimal totalExposereLimit;

	//bi-directional many-to-one association to SbfMerchantCreditFacMaster
	@OneToMany(mappedBy="sbfMerchant")
	private List<SbfMerchantCreditFacMaster> sbfMerchantCreditFacMasters;

	public SbfMerchant() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBankAccountNo() {
		return this.bankAccountNo;
	}

	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	public String getBankBenifitciaryName() {
		return this.bankBenifitciaryName;
	}

	public void setBankBenifitciaryName(String bankBenifitciaryName) {
		this.bankBenifitciaryName = bankBenifitciaryName;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBizSectorCode() {
		return this.bizSectorCode;
	}

	public void setBizSectorCode(String bizSectorCode) {
		this.bizSectorCode = bizSectorCode;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getContactPersion() {
		return this.contactPersion;
	}

	public void setContactPersion(String contactPersion) {
		this.contactPersion = contactPersion;
	}

	public String getContactPersionId() {
		return this.contactPersionId;
	}

	public void setContactPersionId(String contactPersionId) {
		this.contactPersionId = contactPersionId;
	}

	public String getContactPersionPhone() {
		return this.contactPersionPhone;
	}

	public void setContactPersionPhone(String contactPersionPhone) {
		this.contactPersionPhone = contactPersionPhone;
	}

	public String getContactPersionPosition() {
		return this.contactPersionPosition;
	}

	public void setContactPersionPosition(String contactPersionPosition) {
		this.contactPersionPosition = contactPersionPosition;
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

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigDecimal getIsActive() {
		return this.isActive;
	}

	public void setIsActive(BigDecimal isActive) {
		this.isActive = isActive;
	}

	public BigDecimal getMaxNoteAmountLimit() {
		return this.maxNoteAmountLimit;
	}

	public void setMaxNoteAmountLimit(BigDecimal maxNoteAmountLimit) {
		this.maxNoteAmountLimit = maxNoteAmountLimit;
	}

	public String getMerchantCode() {
		return this.merchantCode;
	}

	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}

	public String getMerchantName() {
		return this.merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantNameKh() {
		return this.merchantNameKh;
	}

	public void setMerchantNameKh(String merchantNameKh) {
		this.merchantNameKh = merchantNameKh;
	}

	public String getMerchantSettlementNo() {
		return this.merchantSettlementNo;
	}

	public void setMerchantSettlementNo(String merchantSettlementNo) {
		this.merchantSettlementNo = merchantSettlementNo;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Object getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Object modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Object getMouDate() {
		return this.mouDate;
	}

	public void setMouDate(Object mouDate) {
		this.mouDate = mouDate;
	}

	public BigDecimal getParLimit() {
		return this.parLimit;
	}

	public void setParLimit(BigDecimal parLimit) {
		this.parLimit = parLimit;
	}

	public String getPhonenumer() {
		return this.phonenumer;
	}

	public void setPhonenumer(String phonenumer) {
		this.phonenumer = phonenumer;
	}

	public String getResponsibleBranch() {
		return this.responsibleBranch;
	}

	public void setResponsibleBranch(String responsibleBranch) {
		this.responsibleBranch = responsibleBranch;
	}

	public BigDecimal getTotalExposereLimit() {
		return this.totalExposereLimit;
	}

	public void setTotalExposereLimit(BigDecimal totalExposereLimit) {
		this.totalExposereLimit = totalExposereLimit;
	}

	public List<SbfMerchantCreditFacMaster> getSbfMerchantCreditFacMasters() {
		return this.sbfMerchantCreditFacMasters;
	}

	public void setSbfMerchantCreditFacMasters(List<SbfMerchantCreditFacMaster> sbfMerchantCreditFacMasters) {
		this.sbfMerchantCreditFacMasters = sbfMerchantCreditFacMasters;
	}

	public SbfMerchantCreditFacMaster addSbfMerchantCreditFacMaster(SbfMerchantCreditFacMaster sbfMerchantCreditFacMaster) {
		getSbfMerchantCreditFacMasters().add(sbfMerchantCreditFacMaster);
		sbfMerchantCreditFacMaster.setSbfMerchant(this);

		return sbfMerchantCreditFacMaster;
	}

	public SbfMerchantCreditFacMaster removeSbfMerchantCreditFacMaster(SbfMerchantCreditFacMaster sbfMerchantCreditFacMaster) {
		getSbfMerchantCreditFacMasters().remove(sbfMerchantCreditFacMaster);
		sbfMerchantCreditFacMaster.setSbfMerchant(null);

		return sbfMerchantCreditFacMaster;
	}

}