package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TB_ACCR_CBAL_ZERO database table.
 * 
 */
@Entity
@Table(name="TB_ACCR_CBAL_ZERO")
@NamedQuery(name="TbAccrCbalZero.findAll", query="SELECT t FROM TbAccrCbalZero t")
public class TbAccrCbalZero implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCOUNT_NO")
	private String accountNo;

	@Column(name="REF_NO")
	private String refNo;

	public TbAccrCbalZero() {
	}

	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

}