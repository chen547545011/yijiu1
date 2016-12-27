package cn.edu.hbtcm.jwc.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Acupoint entity. @author MyEclipse Persistence Tools
 */

public class Acupoint implements java.io.Serializable {

	// Fields

	private Integer acupointId;
	private String acupointName;
	private String py;
	private String codeManila1989;
	private String codeGeneva1989;
	private String position;
	private String dissect;
	private String effect;
	private String operation;
	private String diagram;
	private String report;
	private String excerpt;
	private Set meridians = new HashSet(0);

	// Constructors

	/** default constructor */
	public Acupoint() {
	}

	/** minimal constructor */
	public Acupoint(String acupointName, String py) {
		this.acupointName = acupointName;
		this.py = py;
	}

	/** full constructor */
	public Acupoint(String acupointName, String py, String codeManila1989,
			String codeGeneva1989, String position, String dissect,
			String effect, String operation, String diagram, String report,
			String excerpt, Set meridians) {
		this.acupointName = acupointName;
		this.py = py;
		this.codeManila1989 = codeManila1989;
		this.codeGeneva1989 = codeGeneva1989;
		this.position = position;
		this.dissect = dissect;
		this.effect = effect;
		this.operation = operation;
		this.diagram = diagram;
		this.report = report;
		this.excerpt = excerpt;
		this.meridians = meridians;
	}

	// Property accessors

	public Integer getAcupointId() {
		return this.acupointId;
	}

	public void setAcupointId(Integer acupointId) {
		this.acupointId = acupointId;
	}

	public String getAcupointName() {
		return this.acupointName;
	}

	public void setAcupointName(String acupointName) {
		this.acupointName = acupointName;
	}

	public String getPy() {
		return this.py;
	}

	public void setPy(String py) {
		this.py = py;
	}

	public String getCodeManila1989() {
		return this.codeManila1989;
	}

	public void setCodeManila1989(String codeManila1989) {
		this.codeManila1989 = codeManila1989;
	}

	public String getCodeGeneva1989() {
		return this.codeGeneva1989;
	}

	public void setCodeGeneva1989(String codeGeneva1989) {
		this.codeGeneva1989 = codeGeneva1989;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDissect() {
		return this.dissect;
	}

	public void setDissect(String dissect) {
		this.dissect = dissect;
	}

	public String getEffect() {
		return this.effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	public String getOperation() {
		return this.operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getDiagram() {
		return this.diagram;
	}

	public void setDiagram(String diagram) {
		this.diagram = diagram;
	}

	public String getReport() {
		return this.report;
	}

	public void setReport(String report) {
		this.report = report;
	}

	public String getExcerpt() {
		return this.excerpt;
	}

	public void setExcerpt(String excerpt) {
		this.excerpt = excerpt;
	}

	public Set getMeridians() {
		return this.meridians;
	}

	public void setMeridians(Set meridians) {
		this.meridians = meridians;
	}

}