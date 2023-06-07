package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ID_ISSUER database table.
 * 
 */
@Entity
@Table(name="ID_ISSUER")
@NamedQuery(name="IdIssuer.findAll", query="SELECT i FROM IdIssuer i")
public class IdIssuer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="VALUE_EN")
	private String valueEn;

	@Column(name="VALUE_KH")
	private String valueKh;

	public IdIssuer() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
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