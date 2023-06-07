package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TB_ACTION database table.
 * 
 */
@Entity
@Table(name="TB_ACTION")
@NamedQuery(name="TbAction.findAll", query="SELECT t FROM TbAction t")
public class TbAction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCTION_DECRIPTION")
	private String acctionDecription;

	@Column(name="ACTION_CODE")
	private String actionCode;

	@Column(name="ACTION_ID")
	private BigDecimal actionId;

	@Column(name="DATE_DONE")
	private Object dateDone;

	private String deleted;

	@Column(name="DONE_BY")
	private String doneBy;

	public TbAction() {
	}

	public String getAcctionDecription() {
		return this.acctionDecription;
	}

	public void setAcctionDecription(String acctionDecription) {
		this.acctionDecription = acctionDecription;
	}

	public String getActionCode() {
		return this.actionCode;
	}

	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}

	public BigDecimal getActionId() {
		return this.actionId;
	}

	public void setActionId(BigDecimal actionId) {
		this.actionId = actionId;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getDoneBy() {
		return this.doneBy;
	}

	public void setDoneBy(String doneBy) {
		this.doneBy = doneBy;
	}

}