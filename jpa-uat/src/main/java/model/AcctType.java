package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ACCT_TYPE database table.
 * 
 */
@Entity
@Table(name="ACCT_TYPE")
@NamedQuery(name="AcctType.findAll", query="SELECT a FROM AcctType a")
public class AcctType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ACCT_TYPE_ID")
	private long acctTypeId;

	private String description;

	private String dorc;

	//bi-directional many-to-one association to AcctCode
	@OneToMany(mappedBy="acctType")
	private List<AcctCode> acctCodes;

	public AcctType() {
	}

	public long getAcctTypeId() {
		return this.acctTypeId;
	}

	public void setAcctTypeId(long acctTypeId) {
		this.acctTypeId = acctTypeId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDorc() {
		return this.dorc;
	}

	public void setDorc(String dorc) {
		this.dorc = dorc;
	}

	public List<AcctCode> getAcctCodes() {
		return this.acctCodes;
	}

	public void setAcctCodes(List<AcctCode> acctCodes) {
		this.acctCodes = acctCodes;
	}

	public AcctCode addAcctCode(AcctCode acctCode) {
		getAcctCodes().add(acctCode);
		acctCode.setAcctType(this);

		return acctCode;
	}

	public AcctCode removeAcctCode(AcctCode acctCode) {
		getAcctCodes().remove(acctCode);
		acctCode.setAcctType(null);

		return acctCode;
	}

}