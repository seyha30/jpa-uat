package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the AUTOSTART database table.
 * 
 */
@Entity
@NamedQuery(name="Autostart.findAll", query="SELECT a FROM Autostart a")
public class Autostart implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="FORM_NAME")
	private String formName;

	@Column(name="USER_DESC")
	private String userDesc;

	public Autostart() {
	}

	public String getFormName() {
		return this.formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}

	public String getUserDesc() {
		return this.userDesc;
	}

	public void setUserDesc(String userDesc) {
		this.userDesc = userDesc;
	}

}