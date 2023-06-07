package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the LOAN_CAT_CBC_CODE database table.
 * 
 */
@Entity
@Table(name="LOAN_CAT_CBC_CODE")
@NamedQuery(name="LoanCatCbcCode.findAll", query="SELECT l FROM LoanCatCbcCode l")
public class LoanCatCbcCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CAT_ID")
	private String catId;

	@Column(name="CBC_CODE")
	private String cbcCode;

	public LoanCatCbcCode() {
	}

	public String getCatId() {
		return this.catId;
	}

	public void setCatId(String catId) {
		this.catId = catId;
	}

	public String getCbcCode() {
		return this.cbcCode;
	}

	public void setCbcCode(String cbcCode) {
		this.cbcCode = cbcCode;
	}

}