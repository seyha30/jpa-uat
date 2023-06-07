package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the PRODUCT_ANALYSIS database table.
 * 
 */
@Entity
@Table(name="PRODUCT_ANALYSIS")
@NamedQuery(name="ProductAnalysi.findAll", query="SELECT p FROM ProductAnalysi p")
public class ProductAnalysi implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal dis;

	@Column(name="N_ACCOUNT")
	private BigDecimal nAccount;

	@Column(name="N_CLIENT")
	private BigDecimal nClient;

	@Column(name="N_CONTRACT")
	private BigDecimal nContract;

	private BigDecimal olb;

	private String product;

	@Column(name="USER_ID")
	private String userId;

	public ProductAnalysi() {
	}

	public BigDecimal getDis() {
		return this.dis;
	}

	public void setDis(BigDecimal dis) {
		this.dis = dis;
	}

	public BigDecimal getNAccount() {
		return this.nAccount;
	}

	public void setNAccount(BigDecimal nAccount) {
		this.nAccount = nAccount;
	}

	public BigDecimal getNClient() {
		return this.nClient;
	}

	public void setNClient(BigDecimal nClient) {
		this.nClient = nClient;
	}

	public BigDecimal getNContract() {
		return this.nContract;
	}

	public void setNContract(BigDecimal nContract) {
		this.nContract = nContract;
	}

	public BigDecimal getOlb() {
		return this.olb;
	}

	public void setOlb(BigDecimal olb) {
		this.olb = olb;
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}