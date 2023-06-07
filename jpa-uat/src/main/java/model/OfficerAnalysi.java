package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the OFFICER_ANALYSIS database table.
 * 
 */
@Entity
@Table(name="OFFICER_ANALYSIS")
@NamedQuery(name="OfficerAnalysi.findAll", query="SELECT o FROM OfficerAnalysi o")
public class OfficerAnalysi implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal dis;

	@Column(name="N_ACCOUNT")
	private BigDecimal nAccount;

	@Column(name="N_CLIENT")
	private BigDecimal nClient;

	@Column(name="N_CONTRACT")
	private BigDecimal nContract;

	private String officer;

	private BigDecimal olb;

	@Column(name="USER_ID")
	private String userId;

	public OfficerAnalysi() {
	}

	public BigDecimal getDis() {
		return this.dis;
	}

	public void setDis(BigDecimal dis) {
		this.dis = dis;
	}

	public BigDecimal getNAccount() {
		return this.nAccount;
	}

	public void setNAccount(BigDecimal nAccount) {
		this.nAccount = nAccount;
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

	public String getOfficer() {
		return this.officer;
	}

	public void setOfficer(String officer) {
		this.officer = officer;
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