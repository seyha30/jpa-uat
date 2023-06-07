package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the MONPL_DATA database table.
 * 
 */
@Entity
@Table(name="MONPL_DATA")
@NamedQuery(name="MonplData.findAll", query="SELECT m FROM MonplData m")
public class MonplData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"LINENO\"")
	private long lineno;

	private String bal;

	private String description;

	private String ytdbal;

	public MonplData() {
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

	public String getYtdbal() {
		return this.ytdbal;
	}

	public void setYtdbal(String ytdbal) {
		this.ytdbal = ytdbal;
	}

}