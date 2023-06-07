package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SIGNATURE database table.
 * 
 */
@Entity
@NamedQuery(name="Signature.findAll", query="SELECT s FROM Signature s")
public class Signature implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal custacctid;

	@Column(name="\"PATH\"")
	private String path;

	public Signature() {
	}

	public BigDecimal getCustacctid() {
		return this.custacctid;
	}

	public void setCustacctid(BigDecimal custacctid) {
		this.custacctid = custacctid;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}