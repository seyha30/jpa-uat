package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ERROR_LIST database table.
 * 
 */
@Entity
@Table(name="ERROR_LIST")
@NamedQuery(name="ErrorList.findAll", query="SELECT e FROM ErrorList e")
public class ErrorList implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal amount;

	@Column(name="DATE_DONE")
	private Object dateDone;

	private String description;

	@Column(name="RIGHTS_ID")
	private String rightsId;

	public ErrorList() {
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRightsId() {
		return this.rightsId;
	}

	public void setRightsId(String rightsId) {
		this.rightsId = rightsId;
	}

}