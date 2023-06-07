package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the API_CHANNEL_MAPPING database table.
 * 
 */
@Entity
@Table(name="API_CHANNEL_MAPPING")
@NamedQuery(name="ApiChannelMapping.findAll", query="SELECT a FROM ApiChannelMapping a")
public class ApiChannelMapping implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="BRANCH_ID")
	private BigDecimal branchId;

	private String channel;

	@Column(name="CURR_ID")
	private BigDecimal currId;

	private BigDecimal id;

	@Column(name="POST_GL")
	private BigDecimal postGl;

	public ApiChannelMapping() {
	}

	public BigDecimal getBranchId() {
		return this.branchId;
	}

	public void setBranchId(BigDecimal branchId) {
		this.branchId = branchId;
	}

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public BigDecimal getCurrId() {
		return this.currId;
	}

	public void setCurrId(BigDecimal currId) {
		this.currId = currId;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public BigDecimal getPostGl() {
		return this.postGl;
	}

	public void setPostGl(BigDecimal postGl) {
		this.postGl = postGl;
	}

}