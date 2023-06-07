package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TB_UPDATE_ST_MATURITY database table.
 * 
 */
@Entity
@Table(name="TB_UPDATE_ST_MATURITY")
@NamedQuery(name="TbUpdateStMaturity.findAll", query="SELECT t FROM TbUpdateStMaturity t")
public class TbUpdateStMaturity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCOUNT_NO")
	private String accountNo;

	@Column(name="CUSTOMER_NAME")
	private String customerName;

	@Column(name="MATURITY_DATE")
	private String maturityDate;

	@Column(name="REF_NO")
	private String refNo;

	@Column(name="START_DATE")
	private String startDate;

	public TbUpdateStMaturity() {
	}

	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMaturityDate() {
		return this.maturityDate;
	}

	public void setMaturityDate(String maturityDate) {
		this.maturityDate = maturityDate;
	}

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}