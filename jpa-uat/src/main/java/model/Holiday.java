package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the HOLIDAYS database table.
 * 
 */
@Entity
@Table(name="HOLIDAYS")
@NamedQuery(name="Holiday.findAll", query="SELECT h FROM Holiday h")
public class Holiday implements Serializable {
	private static final long serialVersionUID = 1L;

	private String dayweek;

	private String description;

	private Object holiday;

	private String recur;

	public Holiday() {
	}

	public String getDayweek() {
		return this.dayweek;
	}

	public void setDayweek(String dayweek) {
		this.dayweek = dayweek;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Object getHoliday() {
		return this.holiday;
	}

	public void setHoliday(Object holiday) {
		this.holiday = holiday;
	}

	public String getRecur() {
		return this.recur;
	}

	public void setRecur(String recur) {
		this.recur = recur;
	}

}