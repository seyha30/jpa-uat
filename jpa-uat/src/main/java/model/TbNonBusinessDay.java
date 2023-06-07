package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TB_NON_BUSINESS_DAY database table.
 * 
 */
@Entity
@Table(name="TB_NON_BUSINESS_DAY")
@NamedQuery(name="TbNonBusinessDay.findAll", query="SELECT t FROM TbNonBusinessDay t")
public class TbNonBusinessDay implements Serializable {
	private static final long serialVersionUID = 1L;

	private String description;

	@Column(name="HOLI_DATE")
	private Object holiDate;

	@Column(name="\"MONTHS\"")
	private String months;

	private String status;

	@Column(name="\"YEARS\"")
	private BigDecimal years;

	public TbNonBusinessDay() {
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Object getHoliDate() {
		return this.holiDate;
	}

	public void setHoliDate(Object holiDate) {
		this.holiDate = holiDate;
	}

	public String getMonths() {
		return this.months;
	}

	public void setMonths(String months) {
		this.months = months;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getYears() {
		return this.years;
	}

	public void setYears(BigDecimal years) {
		this.years = years;
	}

}