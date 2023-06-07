package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the GENDER_ANALYSIS database table.
 * 
 */
@Entity
@Table(name="GENDER_ANALYSIS")
@NamedQuery(name="GenderAnalysi.findAll", query="SELECT g FROM GenderAnalysi g")
public class GenderAnalysi implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal dis;

	private String gender;

	@Column(name="N_ACCOUNT")
	private BigDecimal nAccount;

	@Column(name="N_CLIENT")
	private BigDecimal nClient;

	@Column(name="N_CONTRACT")
	private BigDecimal nContract;

	private BigDecimal olb;

	@Column(name="USER_ID")
	private String userId;

	public GenderAnalysi() {
	}

	public BigDecimal getDis() {
		return this.dis;
	}

	public void setDis(BigDecimal dis) {
		this.dis = dis;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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