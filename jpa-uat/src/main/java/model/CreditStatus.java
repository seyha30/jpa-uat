package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the CREDIT_STATUS database table.
 * 
 */
@Entity
@Table(name="CREDIT_STATUS")
@NamedQuery(name="CreditStatus.findAll", query="SELECT c FROM CreditStatus c")
public class CreditStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CREDIT_STATUS_ID")
	private long creditStatusId;

	@Column(name="CREATE_DATE")
	private Object createDate;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CREDIT_STATUS_CODE")
	private String creditStatusCode;

	private String description;

	private String period;

	private String remarks;

	//bi-directional many-to-one association to CreditFacMaster
	@OneToMany(mappedBy="creditStatus")
	private List<CreditFacMaster> creditFacMasters;

	//bi-directional many-to-one association to LoanFacility
	@OneToMany(mappedBy="creditStatus")
	private List<LoanFacility> loanFacilities;

	public CreditStatus() {
	}

	public long getCreditStatusId() {
		return this.creditStatusId;
	}

	public void setCreditStatusId(long creditStatusId) {
		this.creditStatusId = creditStatusId;
	}

	public Object getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Object createDate) {
		this.createDate = createDate;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreditStatusCode() {
		return this.creditStatusCode;
	}

	public void setCreditStatusCode(String creditStatusCode) {
		this.creditStatusCode = creditStatusCode;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public List<CreditFacMaster> getCreditFacMasters() {
		return this.creditFacMasters;
	}

	public void setCreditFacMasters(List<CreditFacMaster> creditFacMasters) {
		this.creditFacMasters = creditFacMasters;
	}

	public CreditFacMaster addCreditFacMaster(CreditFacMaster creditFacMaster) {
		getCreditFacMasters().add(creditFacMaster);
		creditFacMaster.setCreditStatus(this);

		return creditFacMaster;
	}

	public CreditFacMaster removeCreditFacMaster(CreditFacMaster creditFacMaster) {
		getCreditFacMasters().remove(creditFacMaster);
		creditFacMaster.setCreditStatus(null);

		return creditFacMaster;
	}

	public List<LoanFacility> getLoanFacilities() {
		return this.loanFacilities;
	}

	public void setLoanFacilities(List<LoanFacility> loanFacilities) {
		this.loanFacilities = loanFacilities;
	}

	public LoanFacility addLoanFacility(LoanFacility loanFacility) {
		getLoanFacilities().add(loanFacility);
		loanFacility.setCreditStatus(this);

		return loanFacility;
	}

	public LoanFacility removeLoanFacility(LoanFacility loanFacility) {
		getLoanFacilities().remove(loanFacility);
		loanFacility.setCreditStatus(null);

		return loanFacility;
	}

}