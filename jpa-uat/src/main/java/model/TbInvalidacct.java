package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TB_INVALIDACCT database table.
 * 
 */
@Entity
@Table(name="TB_INVALIDACCT")
@NamedQuery(name="TbInvalidacct.findAll", query="SELECT t FROM TbInvalidacct t")
public class TbInvalidacct implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal amount;

	private String custacct;

	@Column(name="DATE_DONE")
	private Object dateDone;

	private BigDecimal id;

	private String name;

	@Column(name="POSTED_TYPE")
	private String postedType;

	@Column(name="ROW_INDEX")
	private BigDecimal rowIndex;

	private BigDecimal validtype;

	public TbInvalidacct() {
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCustacct() {
		return this.custacct;
	}

	public void setCustacct(String custacct) {
		this.custacct = custacct;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPostedType() {
		return this.postedType;
	}

	public void setPostedType(String postedType) {
		this.postedType = postedType;
	}

	public BigDecimal getRowIndex() {
		return this.rowIndex;
	}

	public void setRowIndex(BigDecimal rowIndex) {
		this.rowIndex = rowIndex;
	}

	public BigDecimal getValidtype() {
		return this.validtype;
	}

	public void setValidtype(BigDecimal validtype) {
		this.validtype = validtype;
	}

}