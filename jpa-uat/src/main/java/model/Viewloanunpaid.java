package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the VIEWLOANUNPAID database table.
 * 
 */
@Entity
@NamedQuery(name="Viewloanunpaid.findAll", query="SELECT v FROM Viewloanunpaid v")
public class Viewloanunpaid implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal commission;

	@Column(name="INST_NO")
	private BigDecimal instNo;

	@Column(name="\"NAMES\"")
	private String names;

	@Column(name="REF_NO")
	private String refNo;

	@Column(name="REPAY_AMT")
	private BigDecimal repayAmt;

	@Column(name="REPAY_DATE")
	private Object repayDate;

	@Column(name="REPAY_INT")
	private BigDecimal repayInt;

	@Column(name="RP_METHOD")
	private String rpMethod;

	@Column(name="SCHEDULE_REFNO")
	private String scheduleRefno;

	public Viewloanunpaid() {
	}

	public BigDecimal getCommission() {
		return this.commission;
	}

	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}

	public BigDecimal getInstNo() {
		return this.instNo;
	}

	public void setInstNo(BigDecimal instNo) {
		this.instNo = instNo;
	}

	public String getNames() {
		return this.names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public BigDecimal getRepayAmt() {
		return this.repayAmt;
	}

	public void setRepayAmt(BigDecimal repayAmt) {
		this.repayAmt = repayAmt;
	}

	public Object getRepayDate() {
		return this.repayDate;
	}

	public void setRepayDate(Object repayDate) {
		this.repayDate = repayDate;
	}

	public BigDecimal getRepayInt() {
		return this.repayInt;
	}

	public void setRepayInt(BigDecimal repayInt) {
		this.repayInt = repayInt;
	}

	public String getRpMethod() {
		return this.rpMethod;
	}

	public void setRpMethod(String rpMethod) {
		this.rpMethod = rpMethod;
	}

	public String getScheduleRefno() {
		return this.scheduleRefno;
	}

	public void setScheduleRefno(String scheduleRefno) {
		this.scheduleRefno = scheduleRefno;
	}

}