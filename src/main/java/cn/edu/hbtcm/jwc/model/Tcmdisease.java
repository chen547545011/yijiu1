package cn.edu.hbtcm.jwc.model;

/**
 * Tcmdisease entity. @author MyEclipse Persistence Tools
 */

public class Tcmdisease implements java.io.Serializable {

	// Fields

	private Integer tcmdiseaseId;
	private Bodypart bodypart;
	private String tcmdiseaseName;
	private String acupointName;

	// Constructors

	/** default constructor */
	public Tcmdisease() {
	}

	/** minimal constructor */
	public Tcmdisease(Bodypart bodypart, String tcmdiseaseName) {
		this.bodypart = bodypart;
		this.tcmdiseaseName = tcmdiseaseName;
	}

	/** full constructor */
	public Tcmdisease(Bodypart bodypart, String tcmdiseaseName,
			String acupointName) {
		this.bodypart = bodypart;
		this.tcmdiseaseName = tcmdiseaseName;
		this.acupointName = acupointName;
	}

	// Property accessors

	public Integer getTcmdiseaseId() {
		return this.tcmdiseaseId;
	}

	public void setTcmdiseaseId(Integer tcmdiseaseId) {
		this.tcmdiseaseId = tcmdiseaseId;
	}

	public Bodypart getBodypart() {
		return this.bodypart;
	}

	public void setBodypart(Bodypart bodypart) {
		this.bodypart = bodypart;
	}

	public String getTcmdiseaseName() {
		return this.tcmdiseaseName;
	}

	public void setTcmdiseaseName(String tcmdiseaseName) {
		this.tcmdiseaseName = tcmdiseaseName;
	}

	public String getAcupointName() {
		return this.acupointName;
	}

	public void setAcupointName(String acupointName) {
		this.acupointName = acupointName;
	}

}