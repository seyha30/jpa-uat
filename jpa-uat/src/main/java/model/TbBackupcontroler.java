package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TB_BACKUPCONTROLER database table.
 * 
 */
@Entity
@Table(name="TB_BACKUPCONTROLER")
@NamedQuery(name="TbBackupcontroler.findAll", query="SELECT t FROM TbBackupcontroler t")
public class TbBackupcontroler implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="BACKUP_BY")
	private String backupBy;

	@Column(name="DATE_DONE")
	private Object dateDone;

	private String status;

	public TbBackupcontroler() {
	}

	public String getBackupBy() {
		return this.backupBy;
	}

	public void setBackupBy(String backupBy) {
		this.backupBy = backupBy;
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

}