package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TRANX_DETAIL_DESCRIPTION database table.
 * 
 */
@Entity
@Table(name="TRANX_DETAIL_DESCRIPTION")
@NamedQuery(name="TranxDetailDescription.findAll", query="SELECT t FROM TranxDetailDescription t")
public class TranxDetailDescription implements Serializable {
	private static final long serialVersionUID = 1L;

	private String description;

	//bi-directional many-to-one association to TranxDetail
	@ManyToOne
	@JoinColumn(name="TRANX_DETAIL_ID")
	private TranxDetail tranxDetail;

	public TranxDetailDescription() {
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public TranxDetail getTranxDetail() {
		return this.tranxDetail;
	}

	public void setTranxDetail(TranxDetail tranxDetail) {
		this.tranxDetail = tranxDetail;
	}

}