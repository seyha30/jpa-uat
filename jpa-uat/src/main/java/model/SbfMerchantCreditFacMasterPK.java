package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the SBF_MERCHANT_CREDIT_FAC_MASTER database table.
 * 
 */
@Embeddable
public class SbfMerchantCreditFacMasterPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="MERCHANT_ID", insertable=false, updatable=false)
	private long merchantId;

	@Column(name="CREDITFACMASTER_CREDIT_FAC_ID")
	private long creditfacmasterCreditFacId;

	public SbfMerchantCreditFacMasterPK() {
	}
	public long getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(long merchantId) {
		this.merchantId = merchantId;
	}
	public long getCreditfacmasterCreditFacId() {
		return this.creditfacmasterCreditFacId;
	}
	public void setCreditfacmasterCreditFacId(long creditfacmasterCreditFacId) {
		this.creditfacmasterCreditFacId = creditfacmasterCreditFacId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SbfMerchantCreditFacMasterPK)) {
			return false;
		}
		SbfMerchantCreditFacMasterPK castOther = (SbfMerchantCreditFacMasterPK)other;
		return 
			(this.merchantId == castOther.merchantId)
			&& (this.creditfacmasterCreditFacId == castOther.creditfacmasterCreditFacId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.merchantId ^ (this.merchantId >>> 32)));
		hash = hash * prime + ((int) (this.creditfacmasterCreditFacId ^ (this.creditfacmasterCreditFacId >>> 32)));
		
		return hash;
	}
}