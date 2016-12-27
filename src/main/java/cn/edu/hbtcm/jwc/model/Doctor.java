package cn.edu.hbtcm.jwc.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Doctor entity. @author MyEclipse Persistence Tools
 */

public class Doctor implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String password;
	private String doctorName;
	private String py;
	private String deptCode;
	private String deptName;
	private String dutyName;
	private String description;
	private Boolean sex;
	private String idcardCode;
	private Date dataOfBirth;
	private String nationality;
	private Boolean marriageStatus;
	private String mobilePhone;
	private String email;
	private String homeAddress;
	private String remark;
	private Set ouRegisters = new HashSet(0);
	private Set records = new HashSet(0);
	private Set records_1 = new HashSet(0);

	// Constructors

	/** default constructor */
	public Doctor() {
	}

	/** minimal constructor */
	public Doctor(String doctorName, String py, String deptCode,
			String deptName, String dutyName, String description, Boolean sex,
			String idcardCode, Date dataOfBirth, String nationality,
			Boolean marriageStatus, String mobilePhone, String email,
			String homeAddress, String remark) {
		this.doctorName = doctorName;
		this.py = py;
		this.deptCode = deptCode;
		this.deptName = deptName;
		this.dutyName = dutyName;
		this.description = description;
		this.sex = sex;
		this.idcardCode = idcardCode;
		this.dataOfBirth = dataOfBirth;
		this.nationality = nationality;
		this.marriageStatus = marriageStatus;
		this.mobilePhone = mobilePhone;
		this.email = email;
		this.homeAddress = homeAddress;
		this.remark = remark;
	}

	/** full constructor */
	public Doctor(String password, String doctorName, String py,
			String deptCode, String deptName, String dutyName,
			String description, Boolean sex, String idcardCode,
			Date dataOfBirth, String nationality, Boolean marriageStatus,
			String mobilePhone, String email, String homeAddress,
			String remark, Set ouRegisters, Set records, Set records_1) {
		this.password = password;
		this.doctorName = doctorName;
		this.py = py;
		this.deptCode = deptCode;
		this.deptName = deptName;
		this.dutyName = dutyName;
		this.description = description;
		this.sex = sex;
		this.idcardCode = idcardCode;
		this.dataOfBirth = dataOfBirth;
		this.nationality = nationality;
		this.marriageStatus = marriageStatus;
		this.mobilePhone = mobilePhone;
		this.email = email;
		this.homeAddress = homeAddress;
		this.remark = remark;
		this.ouRegisters = ouRegisters;
		this.records = records;
		this.records_1 = records_1;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDoctorName() {
		return this.doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getPy() {
		return this.py;
	}

	public void setPy(String py) {
		this.py = py;
	}

	public String getDeptCode() {
		return this.deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getDeptName() {
		return this.deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDutyName() {
		return this.dutyName;
	}

	public void setDutyName(String dutyName) {
		this.dutyName = dutyName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getSex() {
		return this.sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	public String getIdcardCode() {
		return this.idcardCode;
	}

	public void setIdcardCode(String idcardCode) {
		this.idcardCode = idcardCode;
	}

	public Date getDataOfBirth() {
		return this.dataOfBirth;
	}

	public void setDataOfBirth(Date dataOfBirth) {
		this.dataOfBirth = dataOfBirth;
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Boolean getMarriageStatus() {
		return this.marriageStatus;
	}

	public void setMarriageStatus(Boolean marriageStatus) {
		this.marriageStatus = marriageStatus;
	}

	public String getMobilePhone() {
		return this.mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHomeAddress() {
		return this.homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set getOuRegisters() {
		return this.ouRegisters;
	}

	public void setOuRegisters(Set ouRegisters) {
		this.ouRegisters = ouRegisters;
	}

	public Set getRecords() {
		return this.records;
	}

	public void setRecords(Set records) {
		this.records = records;
	}

	public Set getRecords_1() {
		return this.records_1;
	}

	public void setRecords_1(Set records_1) {
		this.records_1 = records_1;
	}

}