package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TB_POSTING_LOG database table.
 * 
 */
@Entity
@Table(name="TB_POSTING_LOG")
@NamedQuery(name="TbPostingLog.findAll", query="SELECT t FROM TbPostingLog t")
public class TbPostingLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CURR_CODE")
	private String currCode;

	@Column(name="DATE_DONE")
	private Object dateDone;

	private String status;

	@Column(name="TRANX_ID")
	private BigDecimal tranxId;

	@Column(name="\"TYPE\"")
	private String type;

	public TbPostingLog() {
	}

	public String getCurrCode() {
		return this.currCode;
	}

	public void setCurrCode(String currCode) {
		this.currCode = currCode;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getTranxId() {
		return this.tranxId;
	}

	public void setTranxId(BigDecimal tranxId) {
		this.tranxId = tranxId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}