package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the WEB_MENU database table.
 * 
 */
@Entity
@Table(name="WEB_MENU")
@NamedQuery(name="WebMenu.findAll", query="SELECT w FROM WebMenu w")
public class WebMenu implements Serializable {
	private static final long serialVersionUID = 1L;

	private String description;

	@Column(name="\"MAIN\"")
	private BigDecimal main;

	@Column(name="MENU_ID")
	private BigDecimal menuId;

	@Column(name="MENU_NAME")
	private String menuName;

	public WebMenu() {
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getMain() {
		return this.main;
	}

	public void setMain(BigDecimal main) {
		this.main = main;
	}

	public BigDecimal getMenuId() {
		return this.menuId;
	}

	public void setMenuId(BigDecimal menuId) {
		this.menuId = menuId;
	}

	public String getMenuName() {
		return this.menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

}