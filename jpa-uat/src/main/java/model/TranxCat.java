package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TRANX_CAT database table.
 * 
 */
@Entity
@Table(name="TRANX_CAT")
@NamedQuery(name="TranxCat.findAll", query="SELECT t FROM TranxCat t")
public class TranxCat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CAT_ID")
	private long catId;

	private String description;

	//bi-directional many-to-one association to TranxType
	@OneToMany(mappedBy="tranxCat")
	private List<TranxType> tranxTypes;

	public TranxCat() {
	}

	public long getCatId() {
		return this.catId;
	}

	public void setCatId(long catId) {
		this.catId = catId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<TranxType> getTranxTypes() {
		return this.tranxTypes;
	}

	public void setTranxTypes(List<TranxType> tranxTypes) {
		this.tranxTypes = tranxTypes;
	}

	public TranxType addTranxType(TranxType tranxType) {
		getTranxTypes().add(tranxType);
		tranxType.setTranxCat(this);

		return tranxType;
	}

	public TranxType removeTranxType(TranxType tranxType) {
		getTranxTypes().remove(tranxType);
		tranxType.setTranxCat(null);

		return tranxType;
	}

}