package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the AUDIT_TRIAL database table.
 * 
 */
@Entity
@Table(name="AUDIT_TRIAL")
@NamedQuery(name="AuditTrial.findAll", query="SELECT a FROM AuditTrial a")
public class AuditTrial implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal actionid;

	private BigDecimal audittrailid;

	private Object datetime;

	@Column(name="DONE_BY")
	private String doneBy;

	private String fieldname;

	private String formname;

	private BigDecimal keyvalue;

	@Column(name="M_STATUS_ID")
	private BigDecimal mStatusId;

	private String newvalue;

	private String oldvalue;

	@Column(name="TABLE_NAME")
	private String tableName;

	public AuditTrial() {
	}

	public BigDecimal getActionid() {
		return this.actionid;
	}

	public void setActionid(BigDecimal actionid) {
		this.actionid = actionid;
	}

	public BigDecimal getAudittrailid() {
		return this.audittrailid;
	}

	public void setAudittrailid(BigDecimal audittrailid) {
		this.audittrailid = audittrailid;
	}

	public Object getDatetime() {
		return this.datetime;
	}

	public void setDatetime(Object datetime) {
		this.datetime = datetime;
	}

	public String getDoneBy() {
		return this.doneBy;
	}

	public void setDoneBy(String doneBy) {
		this.doneBy = doneBy;
	}

	public String getFieldname() {
		return this.fieldname;
	}

	public void setFieldname(String fieldname) {
		this.fieldname = fieldname;
	}

	public String getFormname() {
		return this.formname;
	}

	public void setFormname(String formname) {
		this.formname = formname;
	}

	public BigDecimal getKeyvalue() {
		return this.keyvalue;
	}

	public void setKeyvalue(BigDecimal keyvalue) {
		this.keyvalue = keyvalue;
	}

	public BigDecimal getMStatusId() {
		return this.mStatusId;
	}

	public void setMStatusId(BigDecimal mStatusId) {
		this.mStatusId = mStatusId;
	}

	public String getNewvalue() {
		return this.newvalue;
	}

	public void setNewvalue(String newvalue) {
		this.newvalue = newvalue;
	}

	public String getOldvalue() {
		return this.oldvalue;
	}

	public void setOldvalue(String oldvalue) {
		this.oldvalue = oldvalue;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

}