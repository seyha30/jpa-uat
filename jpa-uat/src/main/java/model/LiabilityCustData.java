package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the LIABILITY_CUST_DATA database table.
 * 
 */
@Entity
@Table(name="LIABILITY_CUST_DATA")
@NamedQuery(name="LiabilityCustData.findAll", query="SELECT l FROM LiabilityCustData l")
public class LiabilityCustData implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal value1;

	private BigDecimal value2;

	private BigDecimal value3;

	//bi-directional many-to-one association to NbcLiability
	@ManyToOne
	@JoinColumn(name="LINE_ID")
	private NbcLiability nbcLiability;

	public LiabilityCustData() {
	}

	public BigDecimal getValue1() {
		return this.value1;
	}

	public void setValue1(BigDecimal value1) {
		this.value1 = value1;
	}

	public BigDecimal getValue2() {
		return this.value2;
	}

	public void setValue2(BigDecimal value2) {
		this.value2 = value2;
	}

	public BigDecimal getValue3() {
		return this.value3;
	}

	public void setValue3(BigDecimal value3) {
		this.value3 = value3;
	}

	public NbcLiability getNbcLiability() {
		return this.nbcLiability;
	}

	public void setNbcLiability(NbcLiability nbcLiability) {
		this.nbcLiability = nbcLiability;
	}

}