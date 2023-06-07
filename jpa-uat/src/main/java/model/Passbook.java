package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the PASSBOOK database table.
 * 
 */
@Entity
@NamedQuery(name="Passbook.findAll", query="SELECT p FROM Passbook p")
public class Passbook implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal bal;

	private String deleted;

	@Column(name="LAST_UPDATED_DATE")
	private Object lastUpdatedDate;

	@Column(name="LINE_NO")
	private BigDecimal lineNo;

	@Column(name="PAGE_NO")
	private BigDecimal pageNo;

	@Column(name="PASSBOOK_IDX")
	private BigDecimal passbookIdx;

	private String sno;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	//bi-directional many-to-one association to Sa
	@ManyToOne
	@JoinColumn(name="CUSTACCTID")
	private Sa sa;

	public Passbook() {
	}

	public BigDecimal getBal() {
		return this.bal;
	}

	public void setBal(BigDecimal bal) {
		this.bal = bal;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public Object getLastUpdatedDate() {
		return this.lastUpdatedDate;
	}

	public void setLastUpdatedDate(Object lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public BigDecimal getLineNo() {
		return this.lineNo;
	}

	public void setLineNo(BigDecimal lineNo) {
		this.lineNo = lineNo;
	}

	public BigDecimal getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(BigDecimal pageNo) {
		this.pageNo = pageNo;
	}

	public BigDecimal getPassbookIdx() {
		return this.passbookIdx;
	}

	public void setPassbookIdx(BigDecimal passbookIdx) {
		this.passbookIdx = passbookIdx;
	}

	public String getSno() {
		return this.sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Sa getSa() {
		return this.sa;
	}

	public void setSa(Sa sa) {
		this.sa = sa;
	}

}