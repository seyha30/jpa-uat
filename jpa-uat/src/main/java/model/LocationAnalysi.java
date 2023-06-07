package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the LOCATION_ANALYSIS database table.
 * 
 */
@Entity
@Table(name="LOCATION_ANALYSIS")
@NamedQuery(name="LocationAnalysi.findAll", query="SELECT l FROM LocationAnalysi l")
public class LocationAnalysi implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal disbursement;

	private String location;

	@Column(name="N_ACCT")
	private BigDecimal nAcct;

	@Column(name="N_CLIENT")
	private BigDecimal nClient;

	@Column(name="N_CONTRACT")
	private BigDecimal nContract;

	private BigDecimal olb;

	@Column(name="USER_ID")
	private String userId;

	public LocationAnalysi() {
	}

	public BigDecimal getDisbursement() {
		return this.disbursement;
	}

	public void setDisbursement(BigDecimal disbursement) {
		this.disbursement = disbursement;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public BigDecimal getNAcct() {
		return this.nAcct;
	}

	public void setNAcct(BigDecimal nAcct) {
		this.nAcct = nAcct;
	}

	public BigDecimal getNClient() {
		return this.nClient;
	}

	public void setNClient(BigDecimal nClient) {
		this.nClient = nClient;
	}

	public BigDecimal getNContract() {
		return this.nContract;
	}

	public void setNContract(BigDecimal nContract) {
		this.nContract = nContract;
	}

	public BigDecimal getOlb() {
		return this.olb;
	}

	public void setOlb(BigDecimal olb) {
		this.olb = olb;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}