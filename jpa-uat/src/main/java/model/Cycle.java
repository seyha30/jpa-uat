package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "CYCLE" database table.
 * 
 */
@Entity
@Table(name="\"CYCLE\"")
@NamedQuery(name="Cycle.findAll", query="SELECT c FROM Cycle c")
public class Cycle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CYCLE_ID")
	private long cycleId;

	private String deleted;

	private String name;

	public Cycle() {
	}

	public long getCycleId() {
		return this.cycleId;
	}

	public void setCycleId(long cycleId) {
		this.cycleId = cycleId;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}