package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ACTIVITY_ANALYSIS database table.
 * 
 */
@Entity
@Table(name="ACTIVITY_ANALYSIS")
@NamedQuery(name="ActivityAnalysi.findAll", query="SELECT a FROM ActivityAnalysi a")
public class ActivityAnalysi implements Serializable {
	private static final long serialVersionUID = 1L;

	private String activity;

	private BigDecimal dis;

	@Column(name="N_ACCOUNT")
	private BigDecimal nAccount;

	@Column(name="N_CLIENT")
	private BigDecimal nClient;

	@Column(name="N_CONTRACT")
	private BigDecimal nContract;

	private BigDecimal olb;

	@Column(name="USER_ID")
	private String userId;

	public ActivityAnalysi() {
	}

	public String getActivity() {
		return this.activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
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