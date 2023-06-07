package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the WEBLINK database table.
 * 
 */
@Entity
@NamedQuery(name="Weblink.findAll", query="SELECT w FROM Weblink w")
public class Weblink implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal linkid;

	@Column(name="\"PATH\"")
	private String path;

	public Weblink() {
	}

	public BigDecimal getLinkid() {
		return this.linkid;
	}

	public void setLinkid(BigDecimal linkid) {
		this.linkid = linkid;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}