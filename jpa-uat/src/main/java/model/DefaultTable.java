package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DEFAULT_TABLES database table.
 * 
 */
@Entity
@Table(name="DEFAULT_TABLES")
@NamedQuery(name="DefaultTable.findAll", query="SELECT d FROM DefaultTable d")
public class DefaultTable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="TABLE_NAME")
	private String tableName;

	public DefaultTable() {
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

}