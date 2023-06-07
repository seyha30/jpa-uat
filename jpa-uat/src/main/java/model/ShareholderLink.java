package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SHAREHOLDER_LINK database table.
 * 
 */
@Entity
@Table(name="SHAREHOLDER_LINK")
@NamedQuery(name="ShareholderLink.findAll", query="SELECT s FROM ShareholderLink s")
public class ShareholderLink implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="CESSATION_DATE")
	private Object cessationDate;

	@Column(name="CUST_ID")
	private BigDecimal custId;

	private String deleted;

	@Column(name="SHARE_HOLDING")
	private BigDecimal shareHolding;

	@Column(name="SHAREHOLDER_ID")
	private BigDecimal shareholderId;

	public ShareholderLink() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Object getCessationDate() {
		return this.cessationDate;
	}

	public void setCessationDate(Object cessationDate) {
		this.cessationDate = cessationDate;
	}

	public BigDecimal getCustId() {
		return this.custId;
	}

	public void setCustId(BigDecimal custId) {
		this.custId = custId;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public BigDecimal getShareHolding() {
		return this.shareHolding;
	}

	public void setShareHolding(BigDecimal shareHolding) {
		this.shareHolding = shareHolding;
	}

	public BigDecimal getShareholderId() {
		return this.shareholderId;
	}

	public void setShareholderId(BigDecimal shareholderId) {
		this.shareholderId = shareholderId;
	}

}