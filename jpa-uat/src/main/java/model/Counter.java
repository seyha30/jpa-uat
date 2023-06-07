package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the COUNTER database table.
 * 
 */
@Entity
@NamedQuery(name="Counter.findAll", query="SELECT c FROM Counter c")
public class Counter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="COUNTER_ID")
	private long counterId;

	private String deleted;

	private String description;

	private String ipaddress;

	public Counter() {
	}

	public long getCounterId() {
		return this.counterId;
	}

	public void setCounterId(long counterId) {
		this.counterId = counterId;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIpaddress() {
		return this.ipaddress;
	}

	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}

}