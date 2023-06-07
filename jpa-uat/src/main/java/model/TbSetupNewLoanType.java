package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TB_SETUP_NEW_LOAN_TYPE database table.
 * 
 */
@Entity
@Table(name="TB_SETUP_NEW_LOAN_TYPE")
@NamedQuery(name="TbSetupNewLoanType.findAll", query="SELECT t FROM TbSetupNewLoanType t")
public class TbSetupNewLoanType implements Serializable {
	private static final long serialVersionUID = 1L;

	private String description;

	@Column(name="TYPE_ID")
	private String typeId;

	public TbSetupNewLoanType() {
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTypeId() {
		return this.typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

}