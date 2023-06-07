package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PARAM database table.
 * 
 */
@Entity
@NamedQuery(name="Param.findAll", query="SELECT p FROM Param p")
public class Param implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PARAM_CODE")
	private String paramCode;

	private String deleted;

	@Column(name="PARAM_NAME")
	private String paramName;

	@Column(name="PARAM_VAL")
	private String paramVal;

	public Param() {
	}

	public String getParamCode() {
		return this.paramCode;
	}

	public void setParamCode(String paramCode) {
		this.paramCode = paramCode;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getParamName() {
		return this.paramName;
	}

	public void setParamName(String paramName) {
		this.paramName = paramName;
	}

	public String getParamVal() {
		return this.paramVal;
	}

	public void setParamVal(String paramVal) {
		this.paramVal = paramVal;
	}

}