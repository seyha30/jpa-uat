package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the WO_TRANX database table.
 * 
 */
@Entity
@Table(name="WO_TRANX")
@NamedQuery(name="WoTranx.findAll", query="SELECT w FROM WoTranx w")
public class WoTranx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AUTH_BY")
	private String authBy;

	@Column(name="AUTH_DATE")
	private Object authDate;

	@Column(name="CREATE_BY")
	private String createBy;

	@Column(name="CREATE_DATE")
	private Object createDate;

	@Column(name="DATE_DONE")
	private Object dateDone;

	private String description;

	@Column(name="FEE_PAID")
	private BigDecimal feePaid;

	@Column(name="INT_PAID")
	private BigDecimal intPaid;

	@Column(name="PEN_PAID")
	private BigDecimal penPaid;

	@Column(name="PRIN_PAID")
	private BigDecimal prinPaid;

	@Column(name="REF_NO")
	private String refNo;

	@Column(name="RELATED_ACCT")
	private String relatedAcct;

	@Column(name="TRANX_ID")
	private String tranxId;

	@Column(name="TRN_STATUS")
	private String trnStatus;

	@Column(name="UPDATE_BY")
	private String updateBy;

	@Column(name="UPDATE_DATE")
	private Object updateDate;

	@Column(name="WO_TRANX_ID")
	private BigDecimal woTranxId;

	public WoTranx() {
	}

	public String getAuthBy() {
		return this.authBy;
	}

	public void setAuthBy(String authBy) {
		this.authBy = authBy;
	}

	public Object getAuthDate() {
		return this.authDate;
	}

	public void setAuthDate(Object authDate) {
		this.authDate = authDate;
	}

	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Object getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Object createDate) {
		this.createDate = createDate;
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

	public BigDecimal getFeePaid() {
		return this.feePaid;
	}

	public void setFeePaid(BigDecimal feePaid) {
		this.feePaid = feePaid;
	}

	public BigDecimal getIntPaid() {
		return this.intPaid;
	}

	public void setIntPaid(BigDecimal intPaid) {
		this.intPaid = intPaid;
	}

	public BigDecimal getPenPaid() {
		return this.penPaid;
	}

	public void setPenPaid(BigDecimal penPaid) {
		this.penPaid = penPaid;
	}

	public BigDecimal getPrinPaid() {
		return this.prinPaid;
	}

	public void setPrinPaid(BigDecimal prinPaid) {
		this.prinPaid = prinPaid;
	}

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public String getRelatedAcct() {
		return this.relatedAcct;
	}

	public void setRelatedAcct(String relatedAcct) {
		this.relatedAcct = relatedAcct;
	}

	public String getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(String tranxId) {
		this.tranxId = tranxId;
	}

	public String getTrnStatus() {
		return this.trnStatus;
	}

	public void setTrnStatus(String trnStatus) {
		this.trnStatus = trnStatus;
	}

	public String getUpdateBy() {
		return this.updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Object getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Object updateDate) {
		this.updateDate = updateDate;
	}

	public BigDecimal getWoTranxId() {
		return this.woTranxId;
	}

	public void setWoTranxId(BigDecimal woTranxId) {
		this.woTranxId = woTranxId;
	}

}