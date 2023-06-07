package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ADDRESS_TYPE database table.
 * 
 */
@Entity
@Table(name="ADDRESS_TYPE")
@NamedQuery(name="AddressType.findAll", query="SELECT a FROM AddressType a")
public class AddressType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ADDRESS_TYPE_ID")
	private BigDecimal addressTypeId;

	private String code;

	private String description;

	public AddressType() {
	}

	public BigDecimal getAddressTypeId() {
		return this.addressTypeId;
	}

	public void setAddressTypeId(BigDecimal addressTypeId) {
		this.addressTypeId = addressTypeId;
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