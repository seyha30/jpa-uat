package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SYS_LOAN_COMPONENT database table.
 * 
 */
@Entity
@Table(name="SYS_LOAN_COMPONENT")
@NamedQuery(name="SysLoanComponent.findAll", query="SELECT s FROM SysLoanComponent s")
public class SysLoanComponent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="BRANCH_ID")
	private BigDecimal branchId;

	private String ccy;

	private String component;

	@Column(name="CUST_TYPE")
	private String custType;

	private BigDecimal gl;

	@Column(name="PRODUCT_CODE")
	private BigDecimal productCode;

	private String status;

	public SysLoanComponent() {
	}

	public BigDecimal getBranchId() {
		return this.branchId;
	}

	public void setBranchId(BigDecimal branchId) {
		this.branchId = branchId;
	}

	public String getCcy() {
		return this.ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public String getComponent() {
		return this.component;
	}

	public void setComponent(String component) {
		this.component = component;
	}

	public String getCustType() {
		return this.custType;
	}

	public void setCustType(String custType) {
		this.custType = custType;
	}

	public BigDecimal getGl() {
		return this.gl;
	}

	public void setGl(BigDecimal gl) {
		this.gl = gl;
	}

	public BigDecimal getProductCode() {
		return this.productCode;
	}

	public void setProductCode(BigDecimal productCode) {
		this.productCode = productCode;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}