package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SBF_BIZ_CODE_OLD database table.
 * 
 */
@Entity
@Table(name="SBF_BIZ_CODE_OLD")
@NamedQuery(name="SbfBizCodeOld.findAll", query="SELECT s FROM SbfBizCodeOld s")
public class SbfBizCodeOld implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="BIZ_CODE")
	private BigDecimal bizCode;

	@Column(name="BIZ_ID")
	private BigDecimal bizId;

	private String description;

	@Column(name="DESCRIPTION_KH")
	private Object descriptionKh;

	private String sector;

	@Column(name="SUB_SECTOR")
	private String subSector;

	public SbfBizCodeOld() {
	}

	public BigDecimal getBizCode() {
		return this.bizCode;
	}

	public void setBizCode(BigDecimal bizCode) {
		this.bizCode = bizCode;
	}

	public BigDecimal getBizId() {
		return this.bizId;
	}

	public void setBizId(BigDecimal bizId) {
		this.bizId = bizId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Object getDescriptionKh() {
		return this.descriptionKh;
	}

	public void setDescriptionKh(Object descriptionKh) {
		this.descriptionKh = descriptionKh;
	}

	public String getSector() {
		return this.sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getSubSector() {
		return this.subSector;
	}

	public void setSubSector(String subSector) {
		this.subSector = subSector;
	}

}