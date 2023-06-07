package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the NOSTRO_MASTER database table.
 * 
 */
@Entity
@Table(name="NOSTRO_MASTER")
@NamedQuery(name="NostroMaster.findAll", query="SELECT n FROM NostroMaster n")
public class NostroMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="NOSTRO_ID")
	private long nostroId;

	@Column(name="COUNTRY_ID")
	private BigDecimal countryId;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	@Column(name="NOSTRO_ACCTNO")
	private String nostroAcctno;

	@Column(name="NOSTRO_ADDRESS")
	private String nostroAddress;

	@Column(name="NOSTRO_CITY")
	private String nostroCity;

	@Column(name="NOSTRO_EMAIL")
	private String nostroEmail;

	@Column(name="NOSTRO_FAX")
	private String nostroFax;

	@Column(name="NOSTRO_GLCODE")
	private BigDecimal nostroGlcode;

	@Column(name="NOSTRO_NAME")
	private String nostroName;

	@Column(name="NOSTRO_PHONE")
	private String nostroPhone;

	@Column(name="NOSTRO_REFERENCENO")
	private String nostroReferenceno;

	@Column(name="NOSTRO_STATE")
	private String nostroState;

	@Column(name="NOSTRO_SWIFT")
	private String nostroSwift;

	@Column(name="NOSTRO_TELEX")
	private String nostroTelex;

	@Column(name="NOSTRO_ZIPCODE")
	private String nostroZipcode;

	public NostroMaster() {
	}

	public long getNostroId() {
		return this.nostroId;
	}

	public void setNostroId(long nostroId) {
		this.nostroId = nostroId;
	}

	public BigDecimal getCountryId() {
		return this.countryId;
	}

	public void setCountryId(BigDecimal countryId) {
		this.countryId = countryId;
	}

	public BigDecimal getCurrId() {
		return this.currId;
	}

	public void setCurrId(BigDecimal currId) {
		this.currId = currId;
	}

	public String getNostroAcctno() {
		return this.nostroAcctno;
	}

	public void setNostroAcctno(String nostroAcctno) {
		this.nostroAcctno = nostroAcctno;
	}

	public String getNostroAddress() {
		return this.nostroAddress;
	}

	public void setNostroAddress(String nostroAddress) {
		this.nostroAddress = nostroAddress;
	}

	public String getNostroCity() {
		return this.nostroCity;
	}

	public void setNostroCity(String nostroCity) {
		this.nostroCity = nostroCity;
	}

	public String getNostroEmail() {
		return this.nostroEmail;
	}

	public void setNostroEmail(String nostroEmail) {
		this.nostroEmail = nostroEmail;
	}

	public String getNostroFax() {
		return this.nostroFax;
	}

	public void setNostroFax(String nostroFax) {
		this.nostroFax = nostroFax;
	}

	public BigDecimal getNostroGlcode() {
		return this.nostroGlcode;
	}

	public void setNostroGlcode(BigDecimal nostroGlcode) {
		this.nostroGlcode = nostroGlcode;
	}

	public String getNostroName() {
		return this.nostroName;
	}

	public void setNostroName(String nostroName) {
		this.nostroName = nostroName;
	}

	public String getNostroPhone() {
		return this.nostroPhone;
	}

	public void setNostroPhone(String nostroPhone) {
		this.nostroPhone = nostroPhone;
	}

	public String getNostroReferenceno() {
		return this.nostroReferenceno;
	}

	public void setNostroReferenceno(String nostroReferenceno) {
		this.nostroReferenceno = nostroReferenceno;
	}

	public String getNostroState() {
		return this.nostroState;
	}

	public void setNostroState(String nostroState) {
		this.nostroState = nostroState;
	}

	public String getNostroSwift() {
		return this.nostroSwift;
	}

	public void setNostroSwift(String nostroSwift) {
		this.nostroSwift = nostroSwift;
	}

	public String getNostroTelex() {
		return this.nostroTelex;
	}

	public void setNostroTelex(String nostroTelex) {
		this.nostroTelex = nostroTelex;
	}

	public String getNostroZipcode() {
		return this.nostroZipcode;
	}

	public void setNostroZipcode(String nostroZipcode) {
		this.nostroZipcode = nostroZipcode;
	}

}