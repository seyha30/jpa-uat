package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CLVW_LOAN_TRANSFERED database table.
 * 
 */
@Entity
@Table(name="CLVW_LOAN_TRANSFERED")
@NamedQuery(name="ClvwLoanTransfered.findAll", query="SELECT c FROM ClvwLoanTransfered c")
public class ClvwLoanTransfered implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CREDIT_OFFICER")
	private String creditOfficer;

	@Column(name="DATE_DONE")
	private Object dateDone;

	private BigDecimal num;

	@Column(name="REF_NO")
	private String refNo;

	public ClvwLoanTransfered() {
	}

	public String getCreditOfficer() {
		return this.creditOfficer;
	}

	public void setCreditOfficer(String creditOfficer) {
		this.creditOfficer = creditOfficer;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public BigDecimal getNum() {
		return this.num;
	}

	public void setNum(BigDecimal num) {
		this.num = num;
	}

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

}