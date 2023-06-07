package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ACCT_STATUS database table.
 * 
 */
@Entity
@Table(name="ACCT_STATUS")
@NamedQuery(name="AcctStatus.findAll", query="SELECT a FROM AcctStatus a")
public class AcctStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ACCT_STATUS_ID")
	private long acctStatusId;

	private String cat;

	private String deleted;

	private String description;

	//bi-directional many-to-one association to CustAcct
	@OneToMany(mappedBy="acctStatus")
	private List<CustAcct> custAccts;

	//bi-directional many-to-one association to FixedDepositMaster
	@OneToMany(mappedBy="acctStatus")
	private List<FixedDepositMaster> fixedDepositMasters;

	public AcctStatus() {
	}

	public long getAcctStatusId() {
		return this.acctStatusId;
	}

	public void setAcctStatusId(long acctStatusId) {
		this.acctStatusId = acctStatusId;
	}

	public String getCat() {
		return this.cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<CustAcct> getCustAccts() {
		return this.custAccts;
	}

	public void setCustAccts(List<CustAcct> custAccts) {
		this.custAccts = custAccts;
	}

	public CustAcct addCustAcct(CustAcct custAcct) {
		getCustAccts().add(custAcct);
		custAcct.setAcctStatus(this);

		return custAcct;
	}

	public CustAcct removeCustAcct(CustAcct custAcct) {
		getCustAccts().remove(custAcct);
		custAcct.setAcctStatus(null);

		return custAcct;
	}

	public List<FixedDepositMaster> getFixedDepositMasters() {
		return this.fixedDepositMasters;
	}

	public void setFixedDepositMasters(List<FixedDepositMaster> fixedDepositMasters) {
		this.fixedDepositMasters = fixedDepositMasters;
	}

	public FixedDepositMaster addFixedDepositMaster(FixedDepositMaster fixedDepositMaster) {
		getFixedDepositMasters().add(fixedDepositMaster);
		fixedDepositMaster.setAcctStatus(this);

		return fixedDepositMaster;
	}

	public FixedDepositMaster removeFixedDepositMaster(FixedDepositMaster fixedDepositMaster) {
		getFixedDepositMasters().remove(fixedDepositMaster);
		fixedDepositMaster.setAcctStatus(null);

		return fixedDepositMaster;
	}

}