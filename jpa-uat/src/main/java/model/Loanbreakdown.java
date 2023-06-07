package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the LOANBREAKDOWN database table.
 * 
 */
@Entity
@NamedQuery(name="Loanbreakdown.findAll", query="SELECT l FROM Loanbreakdown l")
public class Loanbreakdown implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal amount;

	@Column(name="BUSINEES_TYPE")
	private String busineesType;

	@Column(name="GL_N_ACCT")
	private BigDecimal glNAcct;

	private BigDecimal glamt;

	@Column(name="IL_N_ACCT")
	private BigDecimal ilNAcct;

	private BigDecimal ilamt;

	@Column(name="N_ACCT")
	private BigDecimal nAcct;

	@Column(name="SB_N_ACCT")
	private BigDecimal sbNAcct;

	private BigDecimal sbamt;

	@Column(name="USER_ID")
	private String userId;

	public Loanbreakdown() {
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getBusineesType() {
		return this.busineesType;
	}

	public void setBusineesType(String busineesType) {
		this.busineesType = busineesType;
	}

	public BigDecimal getGlNAcct() {
		return this.glNAcct;
	}

	public void setGlNAcct(BigDecimal glNAcct) {
		this.glNAcct = glNAcct;
	}

	public BigDecimal getGlamt() {
		return this.glamt;
	}

	public void setGlamt(BigDecimal glamt) {
		this.glamt = glamt;
	}

	public BigDecimal getIlNAcct() {
		return this.ilNAcct;
	}

	public void setIlNAcct(BigDecimal ilNAcct) {
		this.ilNAcct = ilNAcct;
	}

	public BigDecimal getIlamt() {
		return this.ilamt;
	}

	public void setIlamt(BigDecimal ilamt) {
		this.ilamt = ilamt;
	}

	public BigDecimal getNAcct() {
		return this.nAcct;
	}

	public void setNAcct(BigDecimal nAcct) {
		this.nAcct = nAcct;
	}

	public BigDecimal getSbNAcct() {
		return this.sbNAcct;
	}

	public void setSbNAcct(BigDecimal sbNAcct) {
		this.sbNAcct = sbNAcct;
	}

	public BigDecimal getSbamt() {
		return this.sbamt;
	}

	public void setSbamt(BigDecimal sbamt) {
		this.sbamt = sbamt;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}