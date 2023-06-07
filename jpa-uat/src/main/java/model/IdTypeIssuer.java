package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ID_TYPE_ISSUER database table.
 * 
 */
@Entity
@Table(name="ID_TYPE_ISSUER")
@NamedQuery(name="IdTypeIssuer.findAll", query="SELECT i FROM IdTypeIssuer i")
public class IdTypeIssuer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ID_CODE")
	private String idCode;

	@Column(name="ID_TYPE")
	private BigDecimal idType;

	@Column(name="ISSUER_ID")
	private BigDecimal issuerId;

	@Column(name="REG_DESCRIPTION")
	private String regDescription;

	@Column(name="VALUE_EN")
	private String valueEn;

	@Column(name="VALUE_KH")
	private String valueKh;

	public IdTypeIssuer() {
	}

	public String getIdCode() {
		return this.idCode;
	}

	public void setIdCode(String idCode) {
		this.idCode = idCode;
	}

	public BigDecimal getIdType() {
		return this.idType;
	}

	public void setIdType(BigDecimal idType) {
		this.idType = idType;
	}

	public BigDecimal getIssuerId() {
		return this.issuerId;
	}

	public void setIssuerId(BigDecimal issuerId) {
		this.issuerId = issuerId;
	}

	public String getRegDescription() {
		return this.regDescription;
	}

	public void setRegDescription(String regDescription) {
		this.regDescription = regDescription;
	}

	public String getValueEn() {
		return this.valueEn;
	}

	public void setValueEn(String valueEn) {
		this.valueEn = valueEn;
	}

	public String getValueKh() {
		return this.valueKh;
	}

	public void setValueKh(String valueKh) {
		this.valueKh = valueKh;
	}

}