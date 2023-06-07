package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the NETWORK_INFORMATION_REPORT database table.
 * 
 */
@Entity
@Table(name="NETWORK_INFORMATION_REPORT")
@NamedQuery(name="NetworkInformationReport.findAll", query="SELECT n FROM NetworkInformationReport n")
public class NetworkInformationReport implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="DB_AMR")
	private BigDecimal dbAmr;

	@Column(name="DB_FEMALE")
	private BigDecimal dbFemale;

	@Column(name="DB_MALE")
	private BigDecimal dbMale;

	@Column(name="DB_TOTAL")
	private BigDecimal dbTotal;

	@Column(name="LO_AMR")
	private BigDecimal loAmr;

	@Column(name="LO_FEMALE")
	private BigDecimal loFemale;

	@Column(name="LO_MALE")
	private BigDecimal loMale;

	@Column(name="LO_TOTAL")
	private BigDecimal loTotal;

	@Column(name="N_COM")
	private BigDecimal nCom;

	@Column(name="N_DIST")
	private BigDecimal nDist;

	@Column(name="N_EMP_FEMALE")
	private BigDecimal nEmpFemale;

	@Column(name="N_EMP_MALE")
	private BigDecimal nEmpMale;

	@Column(name="N_EMP_TOTAL")
	private BigDecimal nEmpTotal;

	@Column(name="N_VILL")
	private BigDecimal nVill;

	private String province;

	@Column(name="USER_ID")
	private String userId;

	public NetworkInformationReport() {
	}

	public BigDecimal getDbAmr() {
		return this.dbAmr;
	}

	public void setDbAmr(BigDecimal dbAmr) {
		this.dbAmr = dbAmr;
	}

	public BigDecimal getDbFemale() {
		return this.dbFemale;
	}

	public void setDbFemale(BigDecimal dbFemale) {
		this.dbFemale = dbFemale;
	}

	public BigDecimal getDbMale() {
		return this.dbMale;
	}

	public void setDbMale(BigDecimal dbMale) {
		this.dbMale = dbMale;
	}

	public BigDecimal getDbTotal() {
		return this.dbTotal;
	}

	public void setDbTotal(BigDecimal dbTotal) {
		this.dbTotal = dbTotal;
	}

	public BigDecimal getLoAmr() {
		return this.loAmr;
	}

	public void setLoAmr(BigDecimal loAmr) {
		this.loAmr = loAmr;
	}

	public BigDecimal getLoFemale() {
		return this.loFemale;
	}

	public void setLoFemale(BigDecimal loFemale) {
		this.loFemale = loFemale;
	}

	public BigDecimal getLoMale() {
		return this.loMale;
	}

	public void setLoMale(BigDecimal loMale) {
		this.loMale = loMale;
	}

	public BigDecimal getLoTotal() {
		return this.loTotal;
	}

	public void setLoTotal(BigDecimal loTotal) {
		this.loTotal = loTotal;
	}

	public BigDecimal getNCom() {
		return this.nCom;
	}

	public void setNCom(BigDecimal nCom) {
		this.nCom = nCom;
	}

	public BigDecimal getNDist() {
		return this.nDist;
	}

	public void setNDist(BigDecimal nDist) {
		this.nDist = nDist;
	}

	public BigDecimal getNEmpFemale() {
		return this.nEmpFemale;
	}

	public void setNEmpFemale(BigDecimal nEmpFemale) {
		this.nEmpFemale = nEmpFemale;
	}

	public BigDecimal getNEmpMale() {
		return this.nEmpMale;
	}

	public void setNEmpMale(BigDecimal nEmpMale) {
		this.nEmpMale = nEmpMale;
	}

	public BigDecimal getNEmpTotal() {
		return this.nEmpTotal;
	}

	public void setNEmpTotal(BigDecimal nEmpTotal) {
		this.nEmpTotal = nEmpTotal;
	}

	public BigDecimal getNVill() {
		return this.nVill;
	}

	public void setNVill(BigDecimal nVill) {
		this.nVill = nVill;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}