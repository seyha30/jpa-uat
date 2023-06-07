package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the DOCUMENTS database table.
 * 
 */
@Entity
@Table(name="DOCUMENTS")
@NamedQuery(name="Document.findAll", query="SELECT d FROM Document d")
public class Document implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CUST_INFO_ID")
	private BigDecimal custInfoId;

	private String description;

	@Column(name="DOCUMENT_ID")
	private BigDecimal documentId;

	private String name;

	@Column(name="UPLOAD_ERROR")
	private BigDecimal uploadError;

	public Document() {
	}

	public BigDecimal getCustInfoId() {
		return this.custInfoId;
	}

	public void setCustInfoId(BigDecimal custInfoId) {
		this.custInfoId = custInfoId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getDocumentId() {
		return this.documentId;
	}

	public void setDocumentId(BigDecimal documentId) {
		this.documentId = documentId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getUploadError() {
		return this.uploadError;
	}

	public void setUploadError(BigDecimal uploadError) {
		this.uploadError = uploadError;
	}

}