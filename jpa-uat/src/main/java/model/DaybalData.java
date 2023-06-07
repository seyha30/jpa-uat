package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DAYBAL_DATA database table.
 * 
 */
@Entity
@Table(name="DAYBAL_DATA")
@NamedQuery(name="DaybalData.findAll", query="SELECT d FROM DaybalData d")
public class DaybalData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"LINENO\"")
	private long lineno;

	private String bal;

	private String description;

	public DaybalData() {
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