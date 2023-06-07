package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SBF_ADDRESS_CODE database table.
 * 
 */
@Entity
@Table(name="SBF_ADDRESS_CODE")
@NamedQuery(name="SbfAddressCode.findAll", query="SELECT s FROM SbfAddressCode s")
public class SbfAddressCode implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal commgis;

	private String commune;

	private BigDecimal distrgis;

	private String district;

	@Column(name="KH_ADDRESS")
	private Object khAddress;

	@Column(name="KH_COMMUNE")
	private Object khCommune;

	@Column(name="KH_DISTRICT")
	private Object khDistrict;

	@Column(name="KH_PROVINCE")
	private Object khProvince;

	@Column(name="KH_VILLAGE")
	private Object khVillage;

	private BigDecimal provgis;

	private String province;

	@Column(name="VIL_ID")
	private BigDecimal vilId;

	private String village;

	public SbfAddressCode() {
	}

	public BigDecimal getCommgis() {
		return this.commgis;
	}

	public void setCommgis(BigDecimal commgis) {
		this.commgis = commgis;
	}

	public String getCommune() {
		return this.commune;
	}

	public void setCommune(String commune) {
		this.commune = commune;
	}

	public BigDecimal getDistrgis() {
		return this.distrgis;
	}

	public void setDistrgis(BigDecimal distrgis) {
		this.distrgis = distrgis;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public Object getKhAddress() {
		return this.khAddress;
	}

	public void setKhAddress(Object khAddress) {
		this.khAddress = khAddress;
	}

	public Object getKhCommune() {
		return this.khCommune;
	}

	public void setKhCommune(Object khCommune) {
		this.khCommune = khCommune;
	}

	public Object getKhDistrict() {
		return this.khDistrict;
	}

	public void setKhDistrict(Object khDistrict) {
		this.khDistrict = khDistrict;
	}

	public Object getKhProvince() {
		return this.khProvince;
	}

	public void setKhProvince(Object khProvince) {
		this.khProvince = khProvince;
	}

	public Object getKhVillage() {
		return this.khVillage;
	}

	public void setKhVillage(Object khVillage) {
		this.khVillage = khVillage;
	}

	public BigDecimal getProvgis() {
		return this.provgis;
	}

	public void setProvgis(BigDecimal provgis) {
		this.provgis = provgis;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public BigDecimal getVilId() {
		return this.vilId;
	}

	public void setVilId(BigDecimal vilId) {
		this.vilId = vilId;
	}

	public String getVillage() {
		return this.village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

}