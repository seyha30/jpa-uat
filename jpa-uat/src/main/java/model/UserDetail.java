package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the USER_DETAIL database table.
 * 
 */
@Entity
@Table(name="USER_DETAIL")
@NamedQuery(name="UserDetail.findAll", query="SELECT u FROM UserDetail u")
public class UserDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	private String email;

	@Column(name="EXPIRED_DATE")
	private Object expiredDate;

	@Column(name="USER_ID")
	private BigDecimal userId;

	public UserDetail() {
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Object getExpiredDate() {
		return this.expiredDate;
	}

	public void setExpiredDate(Object expiredDate) {
		this.expiredDate = expiredDate;
	}

	public BigDecimal getUserId() {
		return this.userId;
	}

	public void setUserId(BigDecimal userId) {
		this.userId = userId;
	}

}