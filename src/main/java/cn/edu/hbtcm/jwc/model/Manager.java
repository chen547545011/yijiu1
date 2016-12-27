package cn.edu.hbtcm.jwc.model;

/**
 * Manager entity. @author MyEclipse Persistence Tools
 */

public class Manager implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String psaaword;

	// Constructors

	/** default constructor */
	public Manager() {
	}

	/** full constructor */
	public Manager(String psaaword) {
		this.psaaword = psaaword;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getPsaaword() {
		return this.psaaword;
	}

	public void setPsaaword(String psaaword) {
		this.psaaword = psaaword;
	}

}