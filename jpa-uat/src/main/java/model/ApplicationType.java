package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the APPLICATION_TYPE database table.
 * 
 */
@Entity
@Table(name="APPLICATION_TYPE")
@NamedQuery(name="ApplicationType.findAll", query="SELECT a FROM ApplicationType a")
public class ApplicationType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="APPLICATION_TYPE_ID")
	private BigDecimal applicationTypeId;

	private String code;

	private String description;

	public ApplicationType() {
	}

	public BigDecimal getApplicationTypeId() {
		return this.applicationTypeId;
	}

	public void setApplicationTypeId(BigDecimal applicationTypeId) {
		this.applicationTypeId = applicationTypeId;
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

}