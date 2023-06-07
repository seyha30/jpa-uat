package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SECURITY_TYPE database table.
 * 
 */
@Entity
@Table(name="SECURITY_TYPE")
@NamedQuery(name="SecurityType.findAll", query="SELECT s FROM SecurityType s")
public class SecurityType implements Serializable {
	private static final long serialVersionUID = 1L;

	private String code;

	private String description;

	@Column(name="SECURITY_TYPE_ID")
	private BigDecimal securityTypeId;

	public SecurityType() {
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getSecurityTypeId() {
		return this.securityTypeId;
	}

	public void setSecurityTypeId(BigDecimal securityTypeId) {
		this.securityTypeId = securityTypeId;
	}

}