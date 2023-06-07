package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ECONOMIC_SECTOR database table.
 * 
 */
@Entity
@Table(name="ECONOMIC_SECTOR")
@NamedQuery(name="EconomicSector.findAll", query="SELECT e FROM EconomicSector e")
public class EconomicSector implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ECO_CODE")
	private String ecoCode;

	@Column(name="DETAILED_KH")
	private String detailedKh;

	@Column(name="DETAILED_SECTOR")
	private String detailedSector;

	private String industry;

	@Column(name="INDUSTRY_SECTOR")
	private String industrySector;

	public EconomicSector() {
	}

	public String getEcoCode() {
		return this.ecoCode;
	}

	public void setEcoCode(String ecoCode) {
		this.ecoCode = ecoCode;
	}

	public String getDetailedKh() {
		return this.detailedKh;
	}

	public void setDetailedKh(String detailedKh) {
		this.detailedKh = detailedKh;
	}

	public String getDetailedSector() {
		return this.detailedSector;
	}

	public void setDetailedSector(String detailedSector) {
		this.detailedSector = detailedSector;
	}

	public String getIndustry() {
		return this.industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getIndustrySector() {
		return this.industrySector;
	}

	public void setIndustrySector(String industrySector) {
		this.industrySector = industrySector;
	}

}