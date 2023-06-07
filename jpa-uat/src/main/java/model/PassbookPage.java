package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the PASSBOOK_PAGE database table.
 * 
 */
@Entity
@Table(name="PASSBOOK_PAGE")
@NamedQuery(name="PassbookPage.findAll", query="SELECT p FROM PassbookPage p")
public class PassbookPage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PASSBOOK_PAGE_ID")
	private long passbookPageId;

	@Column(name="BALANCE_A")
	private BigDecimal balanceA;

	@Column(name="BANKREF_A")
	private BigDecimal bankrefA;

	@Column(name="DEPOSIT_A")
	private BigDecimal depositA;

	@Column(name="PASSBOOK_SIZE")
	private BigDecimal passbookSize;

	@Column(name="PRINTDATE_A")
	private BigDecimal printdateA;

	@Column(name="TC_A")
	private BigDecimal tcA;

	@Column(name="WITHDRAWAL_A")
	private BigDecimal withdrawalA;

	public PassbookPage() {
	}

	public long getPassbookPageId() {
		return this.passbookPageId;
	}

	public void setPassbookPageId(long passbookPageId) {
		this.passbookPageId = passbookPageId;
	}

	public BigDecimal getBalanceA() {
		return this.balanceA;
	}

	public void setBalanceA(BigDecimal balanceA) {
		this.balanceA = balanceA;
	}

	public BigDecimal getBankrefA() {
		return this.bankrefA;
	}

	public void setBankrefA(BigDecimal bankrefA) {
		this.bankrefA = bankrefA;
	}

	public BigDecimal getDepositA() {
		return this.depositA;
	}

	public void setDepositA(BigDecimal depositA) {
		this.depositA = depositA;
	}

	public BigDecimal getPassbookSize() {
		return this.passbookSize;
	}

	public void setPassbookSize(BigDecimal passbookSize) {
		this.passbookSize = passbookSize;
	}

	public BigDecimal getPrintdateA() {
		return this.printdateA;
	}

	public void setPrintdateA(BigDecimal printdateA) {
		this.printdateA = printdateA;
	}

	public BigDecimal getTcA() {
		return this.tcA;
	}

	public void setTcA(BigDecimal tcA) {
		this.tcA = tcA;
	}

	public BigDecimal getWithdrawalA() {
		return this.withdrawalA;
	}

	public void setWithdrawalA(BigDecimal withdrawalA) {
		this.withdrawalA = withdrawalA;
	}

}