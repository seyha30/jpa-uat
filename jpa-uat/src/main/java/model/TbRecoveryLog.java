package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TB_RECOVERY_LOG database table.
 * 
 */
@Entity
@Table(name="TB_RECOVERY_LOG")
@NamedQuery(name="TbRecoveryLog.findAll", query="SELECT t FROM TbRecoveryLog t")
public class TbRecoveryLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"ACTION\"")
	private String action;

	@Column(name="DATE_DONE")
	private Object dateDone;

	private String description;

	@Column(name="DONE_BY")
	private String doneBy;

	private String memo;

	@Column(name="\"NO\"")
	private BigDecimal no;

	@Column(name="\"TIME\"")
	private String time;

	public TbRecoveryLog() {
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDoneBy() {
		return this.doneBy;
	}

	public void setDoneBy(String doneBy) {
		this.doneBy = doneBy;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public BigDecimal getNo() {
		return this.no;
	}

	public void setNo(BigDecimal no) {
		this.no = no;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}