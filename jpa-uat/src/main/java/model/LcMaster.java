package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the LC_MASTER database table.
 * 
 */
@Entity
@Table(name="LC_MASTER")
@NamedQuery(name="LcMaster.findAll", query="SELECT l FROM LcMaster l")
public class LcMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="LC_AMOUNT")
	private double lcAmount;

	@Column(name="LC_BP_DATE")
	private Object lcBpDate;

	@Column(name="LC_CUST_ID")
	private String lcCustId;

	@Column(name="LC_CUST_NAME")
	private String lcCustName;

	@Column(name="LC_DATE_DONE")
	private Object lcDateDone;

	@Column(name="LC_LC_DONE_BY")
	private String lcLcDoneBy;

	@Column(name="LC_MATURITY_DATE")
	private Object lcMaturityDate;

	@Column(name="LC_PYMT_STATUS")
	private String lcPymtStatus;

	@Column(name="LC_REF_NO")
	private String lcRefNo;

	@Column(name="LC_SERVICE_CHARGE")
	private double lcServiceCharge;

	public LcMaster() {
	}

	public double getLcAmount() {
		return this.lcAmount;
	}

	public void setLcAmount(double lcAmount) {
		this.lcAmount = lcAmount;
	}

	public Object getLcBpDate() {
		return this.lcBpDate;
	}

	public void setLcBpDate(Object lcBpDate) {
		this.lcBpDate = lcBpDate;
	}

	public String getLcCustId() {
		return this.lcCustId;
	}

	public void setLcCustId(String lcCustId) {
		this.lcCustId = lcCustId;
	}

	public String getLcCustName() {
		return this.lcCustName;
	}

	public void setLcCustName(String lcCustName) {
		this.lcCustName = lcCustName;
	}

	public Object getLcDateDone() {
		return this.lcDateDone;
	}

	public void setLcDateDone(Object lcDateDone) {
		this.lcDateDone = lcDateDone;
	}

	public String getLcLcDoneBy() {
		return this.lcLcDoneBy;
	}

	public void setLcLcDoneBy(String lcLcDoneBy) {
		this.lcLcDoneBy = lcLcDoneBy;
	}

	public Object getLcMaturityDate() {
		return this.lcMaturityDate;
	}

	public void setLcMaturityDate(Object lcMaturityDate) {
		this.lcMaturityDate = lcMaturityDate;
	}

	public String getLcPymtStatus() {
		return this.lcPymtStatus;
	}

	public void setLcPymtStatus(String lcPymtStatus) {
		this.lcPymtStatus = lcPymtStatus;
	}

	public String getLcRefNo() {
		return this.lcRefNo;
	}

	public void setLcRefNo(String lcRefNo) {
		this.lcRefNo = lcRefNo;
	}

	public double getLcServiceCharge() {
		return this.lcServiceCharge;
	}

	public void setLcServiceCharge(double lcServiceCharge) {
		this.lcServiceCharge = lcServiceCharge;
	}

}