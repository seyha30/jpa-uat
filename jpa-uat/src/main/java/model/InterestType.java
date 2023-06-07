package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the INTEREST_TYPE database table.
 * 
 */
@Entity
@Table(name="INTEREST_TYPE")
@NamedQuery(name="InterestType.findAll", query="SELECT i FROM InterestType i")
public class InterestType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String acct;

	private String accural;

	private String calculate;

	private String deleted;

	private String description;

	private BigDecimal rate;

	private Object setdate;

	//bi-directional many-to-one association to FixedDepositMaster
	@OneToMany(mappedBy="interestType")
	private List<FixedDepositMaster> fixedDepositMasters;

	public InterestType() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAcct() {
		return this.acct;
	}

	public void setAcct(String acct) {
		this.acct = acct;
	}

	public String getAccural() {
		return this.accural;
	}

	public void setAccural(String accural) {
		this.accural = accural;
	}

	public String getCalculate() {
		return this.calculate;
	}

	public void setCalculate(String calculate) {
		this.calculate = calculate;
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

	public BigDecimal getRate() {
		return this.rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public Object getSetdate() {
		return this.setdate;
	}

	public void setSetdate(Object setdate) {
		this.setdate = setdate;
	}

	public List<FixedDepositMaster> getFixedDepositMasters() {
		return this.fixedDepositMasters;
	}

	public void setFixedDepositMasters(List<FixedDepositMaster> fixedDepositMasters) {
		this.fixedDepositMasters = fixedDepositMasters;
	}

	public FixedDepositMaster addFixedDepositMaster(FixedDepositMaster fixedDepositMaster) {
		getFixedDepositMasters().add(fixedDepositMaster);
		fixedDepositMaster.setInterestType(this);

		return fixedDepositMaster;
	}

	public FixedDepositMaster removeFixedDepositMaster(FixedDepositMaster fixedDepositMaster) {
		getFixedDepositMasters().remove(fixedDepositMaster);
		fixedDepositMaster.setInterestType(null);

		return fixedDepositMaster;
	}

}