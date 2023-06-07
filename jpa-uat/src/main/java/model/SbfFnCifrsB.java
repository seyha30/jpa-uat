package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the SBF_FN_CIFRS_BS database table.
 * 
 */
@Entity
@Table(name="SBF_FN_CIFRS_BS")
@NamedQuery(name="SbfFnCifrsB.findAll", query="SELECT s FROM SbfFnCifrsB s")
public class SbfFnCifrsB implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="GL_CODE")
	private long glCode;

	@Column(name="GL_NAME")
	private String glName;

	private String level1;

	private String level2;

	private String level3;

	private String level4;

	private String level5;

	@Column(name="REPORT_TYPE")
	private String reportType;

	private String se2;

	private String se3;

	private String se4;

	private String se5;

	private String sort1;

	private String sort2;

	private String sort3;

	private String sort4;

	private String sort5;

	private String sortless;

	public SbfFnCifrsB() {
	}

	public long getGlCode() {
		return this.glCode;
	}

	public void setGlCode(long glCode) {
		this.glCode = glCode;
	}

	public String getGlName() {
		return this.glName;
	}

	public void setGlName(String glName) {
		this.glName = glName;
	}

	public String getLevel1() {
		return this.level1;
	}

	public void setLevel1(String level1) {
		this.level1 = level1;
	}

	public String getLevel2() {
		return this.level2;
	}

	public void setLevel2(String level2) {
		this.level2 = level2;
	}

	public String getLevel3() {
		return this.level3;
	}

	public void setLevel3(String level3) {
		this.level3 = level3;
	}

	public String getLevel4() {
		return this.level4;
	}

	public void setLevel4(String level4) {
		this.level4 = level4;
	}

	public String getLevel5() {
		return this.level5;
	}

	public void setLevel5(String level5) {
		this.level5 = level5;
	}

	public String getReportType() {
		return this.reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public String getSe2() {
		return this.se2;
	}

	public void setSe2(String se2) {
		this.se2 = se2;
	}

	public String getSe3() {
		return this.se3;
	}

	public void setSe3(String se3) {
		this.se3 = se3;
	}

	public String getSe4() {
		return this.se4;
	}

	public void setSe4(String se4) {
		this.se4 = se4;
	}

	public String getSe5() {
		return this.se5;
	}

	public void setSe5(String se5) {
		this.se5 = se5;
	}

	public String getSort1() {
		return this.sort1;
	}

	public void setSort1(String sort1) {
		this.sort1 = sort1;
	}

	public String getSort2() {
		return this.sort2;
	}

	public void setSort2(String sort2) {
		this.sort2 = sort2;
	}

	public String getSort3() {
		return this.sort3;
	}

	public void setSort3(String sort3) {
		this.sort3 = sort3;
	}

	public String getSort4() {
		return this.sort4;
	}

	public void setSort4(String sort4) {
		this.sort4 = sort4;
	}

	public String getSort5() {
		return this.sort5;
	}

	public void setSort5(String sort5) {
		this.sort5 = sort5;
	}

	public String getSortless() {
		return this.sortless;
	}

	public void setSortless(String sortless) {
		this.sortless = sortless;
	}

}