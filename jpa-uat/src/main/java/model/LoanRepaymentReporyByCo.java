package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the LOAN_REPAYMENT_REPORY_BY_CO database table.
 * 
 */
@Entity
@Table(name="LOAN_REPAYMENT_REPORY_BY_CO")
@NamedQuery(name="LoanRepaymentReporyByCo.findAll", query="SELECT l FROM LoanRepaymentReporyByCo l")
public class LoanRepaymentReporyByCo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACC_NO")
	private String accNo;

	private BigDecimal amount;

	@Column(name="BRANCH_ID")
	private String branchId;

	@Column(name="DATE_DONE")
	private Object dateDone;

	@Column(name="DIS_AMT")
	private BigDecimal disAmt;

	@Column(name="EMPREP_ID")
	private String emprepId;

	@Column(name="EMPREP_NAME")
	private String emprepName;

	@Column(name="KH_NAME")
	private String khName;

	@Column(name="LOAN_FAC_ID")
	private BigDecimal loanFacId;

	@Column(name="LOAN_REFNO")
	private String loanRefno;

	@Column(name="LOAN_TRAN_ID")
	private BigDecimal loanTranId;

	private BigDecimal msg;

	@Column(name="\"NAMES\"")
	private String names;

	@Column(name="PRINCIPAL_INT")
	private String principalInt;

	private String refno;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	@Column(name="USER_ID")
	private String userId;

	public LoanRepaymentReporyByCo() {
	}

	public String getAccNo() {
		return this.accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getBranchId() {
		return this.branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public BigDecimal getDisAmt() {
		return this.disAmt;
	}

	public void setDisAmt(BigDecimal disAmt) {
		this.disAmt = disAmt;
	}

	public String getEmprepId() {
		return this.emprepId;
	}

	public void setEmprepId(String emprepId) {
		this.emprepId = emprepId;
	}

	public String getEmprepName() {
		return this.emprepName;
	}

	public void setEmprepName(String emprepName) {
		this.emprepName = emprepName;
	}

	public String getKhName() {
		return this.khName;
	}

	public void setKhName(String khName) {
		this.khName = khName;
	}

	public BigDecimal getLoanFacId() {
		return this.loanFacId;
	}

	public void setLoanFacId(BigDecimal loanFacId) {
		this.loanFacId = loanFacId;
	}

	public String getLoanRefno() {
		return this.loanRefno;
	}

	public void setLoanRefno(String loanRefno) {
		this.loanRefno = loanRefno;
	}

	public BigDecimal getLoanTranId() {
		return this.loanTranId;
	}

	public void setLoanTranId(BigDecimal loanTranId) {
		this.loanTranId = loanTranId;
	}

	public BigDecimal getMsg() {
		return this.msg;
	}

	public void setMsg(BigDecimal msg) {
		this.msg = msg;
	}

	public String getNames() {
		return this.names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getPrincipalInt() {
		return this.principalInt;
	}

	public void setPrincipalInt(String principalInt) {
		this.principalInt = principalInt;
	}

	public String getRefno() {
		return this.refno;
	}

	public void setRefno(String refno) {
		this.refno = refno;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}