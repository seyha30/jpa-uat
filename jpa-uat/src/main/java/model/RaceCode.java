package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the RACE_CODE database table.
 * 
 */
@Entity
@Table(name="RACE_CODE")
@NamedQuery(name="RaceCode.findAll", query="SELECT r FROM RaceCode r")
public class RaceCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="RACE_ID")
	private long raceId;

	private String deleted;

	private String description;

	//bi-directional many-to-one association to CustInfo
	@OneToMany(mappedBy="raceCode")
	private List<CustInfo> custInfos;

	public RaceCode() {
	}

	public long getRaceId() {
		return this.raceId;
	}

	public void setRaceId(long raceId) {
		this.raceId = raceId;
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
		custInfo.setRaceCode(this);

		return custInfo;
	}

	public CustInfo removeCustInfo(CustInfo custInfo) {
		getCustInfos().remove(custInfo);
		custInfo.setRaceCode(null);

		return custInfo;
	}

}