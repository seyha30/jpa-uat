package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the CURRENCY_CODE database table.
 * 
 */
@Entity
@Table(name="CURRENCY_CODE")
@NamedQuery(name="CurrencyCode.findAll", query="SELECT c FROM CurrencyCode c")
public class CurrencyCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CURR_ID")
	private long currId;

	@Column(name="AVERAGE_RATE")
	private BigDecimal averageRate;

	@Column(name="CURR_CODE")
	private String currCode;

	private String deleted;

	private String description;

	@Column(name="DESCRIPTION_KH")
	private String descriptionKh;

	private BigDecimal rate;

	@Column(name="SALE_RATE")
	private BigDecimal saleRate;

	@Column(name="VISA_ST_CODE")
	private BigDecimal visaStCode;

	//bi-directional many-to-one association to AcctCode
	@OneToMany(mappedBy="currencyCode")
	private List<AcctCode> acctCodes;

	//bi-directional many-to-one association to CustAcct
	@OneToMany(mappedBy="currencyCode")
	private List<CustAcct> custAccts;

	//bi-directional many-to-one association to FixedDepositMaster
	@OneToMany(mappedBy="currencyCode")
	private List<FixedDepositMaster> fixedDepositMasters;

	public CurrencyCode() {
	}

	public long getCurrId() {
		return this.currId;
	}

	public void setCurrId(long currId) {
		this.currId = currId;
	}

	public BigDecimal getAverageRate() {
		return this.averageRate;
	}

	public void setAverageRate(BigDecimal averageRate) {
		this.averageRate = averageRate;
	}

	public String getCurrCode() {
		return this.currCode;
	}

	public void setCurrCode(String currCode) {
		this.currCode = currCode;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescriptionKh() {
		return this.descriptionKh;
	}

	public void setDescriptionKh(String descriptionKh) {
		this.descriptionKh = descriptionKh;
	}

	public BigDecimal getRate() {
		return this.rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public BigDecimal getSaleRate() {
		return this.saleRate;
	}

	public void setSaleRate(BigDecimal saleRate) {
		this.saleRate = saleRate;
	}

	public BigDecimal getVisaStCode() {
		return this.visaStCode;
	}

	public void setVisaStCode(BigDecimal visaStCode) {
		this.visaStCode = visaStCode;
	}

	public List<AcctCode> getAcctCodes() {
		return this.acctCodes;
	}

	public void setAcctCodes(List<AcctCode> acctCodes) {
		this.acctCodes = acctCodes;
	}

	public AcctCode addAcctCode(AcctCode acctCode) {
		getAcctCodes().add(acctCode);
		acctCode.setCurrencyCode(this);

		return acctCode;
	}

	public AcctCode removeAcctCode(AcctCode acctCode) {
		getAcctCodes().remove(acctCode);
		acctCode.setCurrencyCode(null);

		return acctCode;
	}

	public List<CustAcct> getCustAccts() {
		return this.custAccts;
	}

	public void setCustAccts(List<CustAcct> custAccts) {
		this.custAccts = custAccts;
	}

	public CustAcct addCustAcct(CustAcct custAcct) {
		getCustAccts().add(custAcct);
		custAcct.setCurrencyCode(this);

		return custAcct;
	}

	public CustAcct removeCustAcct(CustAcct custAcct) {
		getCustAccts().remove(custAcct);
		custAcct.setCurrencyCode(null);

		return custAcct;
	}

	public List<FixedDepositMaster> getFixedDepositMasters() {
		return this.fixedDepositMasters;
	}

	public void setFixedDepositMasters(List<FixedDepositMaster> fixedDepositMasters) {
		this.fixedDepositMasters = fixedDepositMasters;
	}

	public FixedDepositMaster addFixedDepositMaster(FixedDepositMaster fixedDepositMaster) {
		getFixedDepositMasters().add(fixedDepositMaster);
		fixedDepositMaster.setCurrencyCode(this);

		return fixedDepositMaster;
	}

	public FixedDepositMaster removeFixedDepositMaster(FixedDepositMaster fixedDepositMaster) {
		getFixedDepositMasters().remove(fixedDepositMaster);
		fixedDepositMaster.setCurrencyCode(null);

		return fixedDepositMaster;
	}

}