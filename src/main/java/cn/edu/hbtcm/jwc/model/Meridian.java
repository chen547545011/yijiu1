package cn.edu.hbtcm.jwc.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Meridian entity. @author MyEclipse Persistence Tools
 */

public class Meridian implements java.io.Serializable {

	// Fields

	private Integer meridianId;
	private String meridianName;
	private String meridianDetail;
	private String py;
	private String code;
	private Set acupoints = new HashSet(0);

	// Constructors

	/** default constructor */
	public Meridian() {
	}

	/** minimal constructor */
	public Meridian(String meridianName, String meridianDetail, String py) {
		this.meridianName = meridianName;
		this.meridianDetail = meridianDetail;
		this.py = py;
	}

	/** full constructor */
	public Meridian(String meridianName, String meridianDetail, String py,
			String code, Set acupoints) {
		this.meridianName = meridianName;
		this.meridianDetail = meridianDetail;
		this.py = py;
		this.code = code;
		this.acupoints = acupoints;
	}

	// Property accessors

	public Integer getMeridianId() {
		return this.meridianId;
	}

	public void setMeridianId(Integer meridianId) {
		this.meridianId = meridianId;
	}

	public String getMeridianName() {
		return this.meridianName;
	}

	public void setMeridianName(String meridianName) {
		this.meridianName = meridianName;
	}

	public String getMeridianDetail() {
		return this.meridianDetail;
	}

	public void setMeridianDetail(String meridianDetail) {
		this.meridianDetail = meridianDetail;
	}

	public String getPy() {
		return this.py;
	}

	public void setPy(String py) {
		this.py = py;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Set getAcupoints() {
		return this.acupoints;
	}

	public void setAcupoints(Set acupoints) {
		this.acupoints = acupoints;
	}

}