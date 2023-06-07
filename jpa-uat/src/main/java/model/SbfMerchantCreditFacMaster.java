package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the SBF_MERCHANT_CREDIT_FAC_MASTER database table.
 * 
 */
@Entity
@Table(name="SBF_MERCHANT_CREDIT_FAC_MASTER")
@NamedQuery(name="SbfMerchantCreditFacMaster.findAll", query="SELECT s FROM SbfMerchantCreditFacMaster s")
public class SbfMerchantCreditFacMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SbfMerchantCreditFacMasterPK id;

	//bi-directional many-to-one association to SbfMerchant
	@ManyToOne
	@JoinColumn(name="MERCHANT_ID")
	private SbfMerchant sbfMerchant;

	public SbfMerchantCreditFacMaster() {
	}

	public SbfMerchantCreditFacMasterPK getId() {
		return this.id;
	}

	public void setId(SbfMerchantCreditFacMasterPK id) {
		this.id = id;
	}

	public SbfMerchant getSbfMerchant() {
		return this.sbfMerchant;
	}

	public void setSbfMerchant(SbfMerchant sbfMerchant) {
		this.sbfMerchant = sbfMerchant;
	}

}