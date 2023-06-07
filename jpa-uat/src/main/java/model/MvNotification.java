package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the MV_NOTIFICATION database table.
 * 
 */
@Entity
@Table(name="MV_NOTIFICATION")
@NamedQuery(name="MvNotification.findAll", query="SELECT m FROM MvNotification m")
public class MvNotification implements Serializable {
	private static final long serialVersionUID = 1L;

	private String email;

	@Column(name="MAIL_DESC")
	private String mailDesc;

	private String subject;

	public MvNotification() {
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMailDesc() {
		return this.mailDesc;
	}

	public void setMailDesc(String mailDesc) {
		this.mailDesc = mailDesc;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}