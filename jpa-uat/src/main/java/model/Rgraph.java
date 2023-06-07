package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the RGRAPH database table.
 * 
 */
@Entity
@NamedQuery(name="Rgraph.findAll", query="SELECT r FROM Rgraph r")
public class Rgraph implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;

	@Column(name="\"VALUE\"")
	private BigDecimal value;

	public Rgraph() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getValue() {
		return this.value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

}