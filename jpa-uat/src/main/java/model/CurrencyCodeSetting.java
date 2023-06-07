package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CURRENCY_CODE_SETTING database table.
 * 
 */
@Entity
@Table(name="CURRENCY_CODE_SETTING")
@NamedQuery(name="CurrencyCodeSetting.findAll", query="SELECT c FROM CurrencyCodeSetting c")
public class CurrencyCodeSetting implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	private BigDecimal decimals;

	private String isbase;

	public CurrencyCodeSetting() {
	}

	public BigDecimal getCurrId() {
		return this.currId;
	}

	public void setCurrId(BigDecimal currId) {
		this.currId = currId;
	}

	public BigDecimal getDecimals() {
		return this.decimals;
	}

	public void setDecimals(BigDecimal decimals) {
		this.decimals = decimals;
	}

	public String getIsbase() {
		return this.isbase;
	}

	public void setIsbase(String isbase) {
		this.isbase = isbase;
	}

}