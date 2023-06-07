package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the CHQ_STATUS database table.
 * 
 */
@Entity
@Table(name="CHQ_STATUS")
@NamedQuery(name="ChqStatus.findAll", query="SELECT c FROM ChqStatus c")
public class ChqStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CHQ_STATUS_ID")
	private long chqStatusId;

	private String cat;

	private String description;

	//bi-directional many-to-one association to Chq
	@OneToMany(mappedBy="chqStatus")
	private List<Chq> chqs;

	//bi-directional many-to-one association to ChqDeposited
	@OneToMany(mappedBy="chqStatus")
	private List<ChqDeposited> chqDepositeds;

	public ChqStatus() {
	}

	public long getChqStatusId() {
		return this.chqStatusId;
	}

	public void setChqStatusId(long chqStatusId) {
		this.chqStatusId = chqStatusId;
	}

	public String getCat() {
		return this.cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Chq> getChqs() {
		return this.chqs;
	}

	public void setChqs(List<Chq> chqs) {
		this.chqs = chqs;
	}

	public Chq addChq(Chq chq) {
		getChqs().add(chq);
		chq.setChqStatus(this);

		return chq;
	}

	public Chq removeChq(Chq chq) {
		getChqs().remove(chq);
		chq.setChqStatus(null);

		return chq;
	}

	public List<ChqDeposited> getChqDepositeds() {
		return this.chqDepositeds;
	}

	public void setChqDepositeds(List<ChqDeposited> chqDepositeds) {
		this.chqDepositeds = chqDepositeds;
	}

	public ChqDeposited addChqDeposited(ChqDeposited chqDeposited) {
		getChqDepositeds().add(chqDeposited);
		chqDeposited.setChqStatus(this);

		return chqDeposited;
	}

	public ChqDeposited removeChqDeposited(ChqDeposited chqDeposited) {
		getChqDepositeds().remove(chqDeposited);
		chqDeposited.setChqStatus(null);

		return chqDeposited;
	}

}