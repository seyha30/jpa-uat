package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TB_CHECK_ACCR_STATUS database table.
 * 
 */
@Entity
@Table(name="TB_CHECK_ACCR_STATUS")
@NamedQuery(name="TbCheckAccrStatus.findAll", query="SELECT t FROM TbCheckAccrStatus t")
public class TbCheckAccrStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="D_T_A")
	private String dTA;

	@Column(name="D_T_B")
	private String dTB;

	private BigDecimal id;

	private String name;

	public TbCheckAccrStatus() {
	}

	public String getDTA() {
		return this.dTA;
	}

	public void setDTA(String dTA) {
		this.dTA = dTA;
	}

	public String getDTB() {
		return this.dTB;
	}

	public void setDTB(String dTB) {
		this.dTB = dTB;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}