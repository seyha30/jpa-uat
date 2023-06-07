package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ACCTOPENED database table.
 * 
 */
@Entity
@NamedQuery(name="Acctopened.findAll", query="SELECT a FROM Acctopened a")
public class Acctopened implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long recnum;

	private String acctno;

	private String accttype;

	private String act;

	private String custkey;

	@Column(name="\"NAMES\"")
	private String names;

	private String opendate;

	public Acctopened() {
	}

	public long getRecnum() {
		return this.recnum;
	}

	public void setRecnum(long recnum) {
		this.recnum = recnum;
	}

	public String getAcctno() {
		return this.acctno;
	}

	public void setAcctno(String acctno) {
		this.acctno = acctno;
	}

	public String getAccttype() {
		return this.accttype;
	}

	public void setAccttype(String accttype) {
		this.accttype = accttype;
	}

	public String getAct() {
		return this.act;
	}

	public void setAct(String act) {
		this.act = act;
	}

	public String getCustkey() {
		return this.custkey;
	}

	public void setCustkey(String custkey) {
		this.custkey = custkey;
	}

	public String getNames() {
		return this.names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getOpendate() {
		return this.opendate;
	}

	public void setOpendate(String opendate) {
		this.opendate = opendate;
	}

}