package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the NBC_LIABILITY database table.
 * 
 */
@Entity
@Table(name="NBC_LIABILITY")
@NamedQuery(name="NbcLiability.findAll", query="SELECT n FROM NbcLiability n")
public class NbcLiability implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="LINE_ID")
	private long lineId;

	private String desceng;

	private String desckmr;

	//bi-directional many-to-one association to LiabilityCustData
	@OneToMany(mappedBy="nbcLiability")
	private List<LiabilityCustData> liabilityCustData;

	public NbcLiability() {
	}

	public long getLineId() {
		return this.lineId;
	}

	public void setLineId(long lineId) {
		this.lineId = lineId;
	}

	public String getDesceng() {
		return this.desceng;
	}

	public void setDesceng(String desceng) {
		this.desceng = desceng;
	}

	public String getDesckmr() {
		return this.desckmr;
	}

	public void setDesckmr(String desckmr) {
		this.desckmr = desckmr;
	}

	public List<LiabilityCustData> getLiabilityCustData() {
		return this.liabilityCustData;
	}

	public void setLiabilityCustData(List<LiabilityCustData> liabilityCustData) {
		this.liabilityCustData = liabilityCustData;
	}

	public LiabilityCustData addLiabilityCustData(LiabilityCustData liabilityCustData) {
		getLiabilityCustData().add(liabilityCustData);
		liabilityCustData.setNbcLiability(this);

		return liabilityCustData;
	}

	public LiabilityCustData removeLiabilityCustData(LiabilityCustData liabilityCustData) {
		getLiabilityCustData().remove(liabilityCustData);
		liabilityCustData.setNbcLiability(null);

		return liabilityCustData;
	}

}