package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the JOINT_TYPE_CODE database table.
 * 
 */
@Entity
@Table(name="JOINT_TYPE_CODE")
@NamedQuery(name="JointTypeCode.findAll", query="SELECT j FROM JointTypeCode j")
public class JointTypeCode implements Serializable {
	private static final long serialVersionUID = 1L;

	private String deleted;

	private String description;

	@Column(name="JT_ID")
	private BigDecimal jtId;

	public JointTypeCode() {
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

	public BigDecimal getJtId() {
		return this.jtId;
	}

	public void setJtId(BigDecimal jtId) {
		this.jtId = jtId;
	}

}