package cn.edu.hbtcm.jwc.model;

/**
 * Wmdisease entity. @author MyEclipse Persistence Tools
 */

public class Wmdisease implements java.io.Serializable {

	// Fields

	private Integer wmdiseaseId;
	private String acupointName;
	private String wmdiseaseName;

	// Constructors

	/** default constructor */
	public Wmdisease() {
	}

	/** full constructor */
	public Wmdisease(String acupointName, String wmdiseaseName) {
		this.acupointName = acupointName;
		this.wmdiseaseName = wmdiseaseName;
	}

	// Property accessors

	public Integer getWmdiseaseId() {
		return this.wmdiseaseId;
	}

	public void setWmdiseaseId(Integer wmdiseaseId) {
		this.wmdiseaseId = wmdiseaseId;
	}

	public String getAcupointName() {
		return this.acupointName;
	}

	public void setAcupointName(String acupointName) {
		this.acupointName = acupointName;
	}

	public String getWmdiseaseName() {
		return this.wmdiseaseName;
	}

	public void setWmdiseaseName(String wmdiseaseName) {
		this.wmdiseaseName = wmdiseaseName;
	}

}