package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the MONBAL_DATA database table.
 * 
 */
@Entity
@Table(name="MONBAL_DATA")
@NamedQuery(name="MonbalData.findAll", query="SELECT m FROM MonbalData m")
public class MonbalData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"LINENO\"")
	private long lineno;

	private String bal;

	private String description;

	public MonbalData() {
	}

	public long getLineno() {
		return this.lineno;
	}

	public void setLineno(long lineno) {
		this.lineno = lineno;
	}

	public String getBal() {
		return this.bal;
	}

	public void setBal(String bal) {
		this.bal = bal;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}