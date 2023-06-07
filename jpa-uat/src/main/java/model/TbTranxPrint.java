package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TB_TRANX_PRINT database table.
 * 
 */
@Entity
@Table(name="TB_TRANX_PRINT")
@NamedQuery(name="TbTranxPrint.findAll", query="SELECT t FROM TbTranxPrint t")
public class TbTranxPrint implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCT_ID")
	private BigDecimal acctId;

	public TbTranxPrint() {
	}

	public BigDecimal getAcctId() {
		return this.acctId;
	}

	public void setAcctId(BigDecimal acctId) {
		this.acctId = acctId;
	}

}