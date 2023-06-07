package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the COUNTRY_CODE database table.
 * 
 */
@Entity
@Table(name="COUNTRY_CODE")
@NamedQuery(name="CountryCode.findAll", query="SELECT c FROM CountryCode c")
public class CountryCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CTRY_ID")
	private long ctryId;

	private String deleted;

	private String description;

	//bi-directional many-to-one association to CustInfo
	@OneToMany(mappedBy="countryCode")
	private List<CustInfo> custInfos;

	public CountryCode() {
	}

	public long getCtryId() {
		return this.ctryId;
	}

	public void setCtryId(long ctryId) {
		this.ctryId = ctryId;
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

	public List<CustInfo> getCustInfos() {
		return this.custInfos;
	}

	public void setCustInfos(List<CustInfo> custInfos) {
		this.custInfos = custInfos;
	}

	public CustInfo addCustInfo(CustInfo custInfo) {
		getCustInfos().add(custInfo);
		custInfo.setCountryCode(this);

		return custInfo;
	}

	public CustInfo removeCustInfo(CustInfo custInfo) {
		getCustInfos().remove(custInfo);
		custInfo.setCountryCode(null);

		return custInfo;
	}

}