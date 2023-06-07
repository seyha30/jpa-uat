package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CUST_ADDRESS database table.
 * 
 */
@Entity
@Table(name="CUST_ADDRESS")
@NamedQuery(name="CustAddress.findAll", query="SELECT c FROM CustAddress c")
public class CustAddress implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String address;

	@Column(name="ADDRESS_TYPE_ID")
	private BigDecimal addressTypeId;

	@Column(name="CUST_ID")
	private BigDecimal custId;

	private String deleted;

	@Column(name="VIL_ID")
	private BigDecimal vilId;

	public CustAddress() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BigDecimal getAddressTypeId() {
		return this.addressTypeId;
	}

	public void setAddressTypeId(BigDecimal addressTypeId) {
		this.addressTypeId = addressTypeId;
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

	public BigDecimal getVilId() {
		return this.vilId;
	}

	public void setVilId(BigDecimal vilId) {
		this.vilId = vilId;
	}

}