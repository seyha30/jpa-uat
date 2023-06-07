package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the MONBALTHB_DATA database table.
 * 
 */
@Entity
@Table(name="MONBALTHB_DATA")
@NamedQuery(name="MonbalthbData.findAll", query="SELECT m FROM MonbalthbData m")
public class MonbalthbData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"LINENO\"")
	private long lineno;

	private String bal;

	private String description;

	public MonbalthbData() {
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