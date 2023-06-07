package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ID_ISSUER_ID_TYPE database table.
 * 
 */
@Entity
@Table(name="ID_ISSUER_ID_TYPE")
@NamedQuery(name="IdIssuerIdType.findAll", query="SELECT i FROM IdIssuerIdType i")
public class IdIssuerIdType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ID_ISSUER")
	private BigDecimal idIssuer;

	@Column(name="ID_TYPE")
	private BigDecimal idType;

	public IdIssuerIdType() {
	}

	public BigDecimal getIdIssuer() {
		return this.idIssuer;
	}

	public void setIdIssuer(BigDecimal idIssuer) {
		this.idIssuer = idIssuer;
	}

	public BigDecimal getIdType() {
		return this.idType;
	}

	public void setIdType(BigDecimal idType) {
		this.idType = idType;
	}

}