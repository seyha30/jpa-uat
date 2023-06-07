package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ACCT_TYPE_RE database table.
 * 
 */
@Entity
@Table(name="ACCT_TYPE_RE")
@NamedQuery(name="AcctTypeRe.findAll", query="SELECT a FROM AcctTypeRe a")
public class AcctTypeRe implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCT_TYPE_ID")
	private BigDecimal acctTypeId;

	@Column(name="PROFIT_ID")
	private BigDecimal profitId;

	@Column(name="SHEET_ID_1")
	private BigDecimal sheetId1;

	@Column(name="SHEET_ID_2")
	private BigDecimal sheetId2;

	@Column(name="SHEET_ID_3")
	private BigDecimal sheetId3;

	public AcctTypeRe() {
	}

	public BigDecimal getAcctTypeId() {
		return this.acctTypeId;
	}

	public void setAcctTypeId(BigDecimal acctTypeId) {
		this.acctTypeId = acctTypeId;
	}

	public BigDecimal getProfitId() {
		return this.profitId;
	}

	public void setProfitId(BigDecimal profitId) {
		this.profitId = profitId;
	}

	public BigDecimal getSheetId1() {
		return this.sheetId1;
	}

	public void setSheetId1(BigDecimal sheetId1) {
		this.sheetId1 = sheetId1;
	}

	public BigDecimal getSheetId2() {
		return this.sheetId2;
	}

	public void setSheetId2(BigDecimal sheetId2) {
		this.sheetId2 = sheetId2;
	}

	public BigDecimal getSheetId3() {
		return this.sheetId3;
	}

	public void setSheetId3(BigDecimal sheetId3) {
		this.sheetId3 = sheetId3;
	}

}