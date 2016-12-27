package cn.edu.hbtcm.jwc.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Bodypart entity. @author MyEclipse Persistence Tools
 */

public class Bodypart implements java.io.Serializable {

	// Fields

	private Integer bid;
	private String part;
	private Set tcmdiseases = new HashSet(0);

	// Constructors

	/** default constructor */
	public Bodypart() {
	}

	/** minimal constructor */
	public Bodypart(String part) {
		this.part = part;
	}

	/** full constructor */
	public Bodypart(String part, Set tcmdiseases) {
		this.part = part;
		this.tcmdiseases = tcmdiseases;
	}

	// Property accessors

	public Integer getBid() {
		return this.bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getPart() {
		return this.part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public Set getTcmdiseases() {
		return this.tcmdiseases;
	}

	public void setTcmdiseases(Set tcmdiseases) {
		this.tcmdiseases = tcmdiseases;
	}

}