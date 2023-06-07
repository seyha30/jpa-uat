package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SCHEDULES_REPAYMENT database table.
 * 
 */
@Entity
@Table(name="SCHEDULES_REPAYMENT")
@NamedQuery(name="SchedulesRepayment.findAll", query="SELECT s FROM SchedulesRepayment s")
public class SchedulesRepayment implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal amount;

	@Column(name="INST_NO")
	private BigDecimal instNo;

	@Column(name="\"NO\"")
	private BigDecimal no;

	@Column(name="PAID_DATE")
	private Object paidDate;

	@Column(name="PRI_INT")
	private String priInt;

	@Column(name="RECEIVED_BY")
	private String receivedBy;

	@Column(name="REF_NO")
	private String refNo;

	@Column(name="RP_METHOD")
	private String rpMethod;

	public SchedulesRepayment() {
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getInstNo() {
		return this.instNo;
	}

	public void setInstNo(BigDecimal instNo) {
		this.instNo = instNo;
	}

	public BigDecimal getNo() {
		return this.no;
	}

	public void setNo(BigDecimal no) {
		this.no = no;
	}

	public Object getPaidDate() {
		return this.paidDate;
	}

	public void setPaidDate(Object paidDate) {
		this.paidDate = paidDate;
	}

	public String getPriInt() {
		return this.priInt;
	}

	public void setPriInt(String priInt) {
		this.priInt = priInt;
	}

	public String getReceivedBy() {
		return this.receivedBy;
	}

	public void setReceivedBy(String receivedBy) {
		this.receivedBy = receivedBy;
	}

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public String getRpMethod() {
		return this.rpMethod;
	}

	public void setRpMethod(String rpMethod) {
		this.rpMethod = rpMethod;
	}

}