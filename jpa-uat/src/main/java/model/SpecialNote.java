package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SPECIAL_NOTE database table.
 * 
 */
@Entity
@Table(name="SPECIAL_NOTE")
@NamedQuery(name="SpecialNote.findAll", query="SELECT s FROM SpecialNote s")
public class SpecialNote implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="DATE_DONE")
	private Object dateDone;

	private String deleted;

	private String description;

	@Column(name="DONE_BY")
	private String doneBy;

	@Column(name="SPECIAL_NOTE_CODE")
	private String specialNoteCode;

	@Column(name="SPECIAL_NOTE_ID")
	private BigDecimal specialNoteId;

	@Column(name="SPECIAL_NOTE_NAME")
	private String specialNoteName;

	public SpecialNote() {
	}

	public Object getDateDone() {
		return this.dateDone;
	}

	public void setDateDone(Object dateDone) {
		this.dateDone = dateDone;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
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

	public String getSpecialNoteCode() {
		return this.specialNoteCode;
	}

	public void setSpecialNoteCode(String specialNoteCode) {
		this.specialNoteCode = specialNoteCode;
	}

	public BigDecimal getSpecialNoteId() {
		return this.specialNoteId;
	}

	public void setSpecialNoteId(BigDecimal specialNoteId) {
		this.specialNoteId = specialNoteId;
	}

	public String getSpecialNoteName() {
		return this.specialNoteName;
	}

	public void setSpecialNoteName(String specialNoteName) {
		this.specialNoteName = specialNoteName;
	}

}