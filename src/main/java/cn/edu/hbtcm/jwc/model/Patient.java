package cn.edu.hbtcm.jwc.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Patient entity. @author MyEclipse Persistence Tools
 */

public class Patient implements java.io.Serializable {

	// Fields

	private Integer pid;
	private String insuranceNo;
	private String patientName;
	private String py;
	private Boolean sex;
	private Date dataOfBirth;
	private Boolean marriageStatus;
	private String occupation;
	private String nationality;
	private String country;
	private String birthplace;
	private String idcardCode;
	private String mobilePhone;
	private String email;
	private String homeAddress;
	private String remark;
	private Set records = new HashSet(0);
	private Set ouRegistersForPatPid = new HashSet(0);
	private Set ouRegistersForPid = new HashSet(0);
	private Set records_1 = new HashSet(0);

	// Constructors

	/** default constructor */
	public Patient() {
	}

	/** minimal constructor */
	public Patient(String insuranceNo, String patientName, String py,
			Boolean sex, Date dataOfBirth, Boolean marriageStatus,
			String occupation, String nationality, String country,
			String birthplace, String idcardCode, String mobilePhone,
			String email, String homeAddress, String remark) {
		this.insuranceNo = insuranceNo;
		this.patientName = patientName;
		this.py = py;
		this.sex = sex;
		this.dataOfBirth = dataOfBirth;
		this.marriageStatus = marriageStatus;
		this.occupation = occupation;
		this.nationality = nationality;
		this.country = country;
		this.birthplace = birthplace;
		this.idcardCode = idcardCode;
		this.mobilePhone = mobilePhone;
		this.email = email;
		this.homeAddress = homeAddress;
		this.remark = remark;
	}

	/** full constructor */
	public Patient(String insuranceNo, String patientName, String py,
			Boolean sex, Date dataOfBirth, Boolean marriageStatus,
			String occupation, String nationality, String country,
			String birthplace, String idcardCode, String mobilePhone,
			String email, String homeAddress, String remark, Set records,
			Set ouRegistersForPatPid, Set ouRegistersForPid, Set records_1) {
		this.insuranceNo = insuranceNo;
		this.patientName = patientName;
		this.py = py;
		this.sex = sex;
		this.dataOfBirth = dataOfBirth;
		this.marriageStatus = marriageStatus;
		this.occupation = occupation;
		this.nationality = nationality;
		this.country = country;
		this.birthplace = birthplace;
		this.idcardCode = idcardCode;
		this.mobilePhone = mobilePhone;
		this.email = email;
		this.homeAddress = homeAddress;
		this.remark = remark;
		this.records = records;
		this.ouRegistersForPatPid = ouRegistersForPatPid;
		this.ouRegistersForPid = ouRegistersForPid;
		this.records_1 = records_1;
	}

	// Property accessors

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getInsuranceNo() {
		return this.insuranceNo;
	}

	public void setInsuranceNo(String insuranceNo) {
		this.insuranceNo = insuranceNo;
	}

	public String getPatientName() {
		return this.patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPy() {
		return this.py;
	}

	public void setPy(String py) {
		this.py = py;
	}

	public Boolean getSex() {
		return this.sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	public Date getDataOfBirth() {
		return this.dataOfBirth;
	}

	public void setDataOfBirth(Date dataOfBirth) {
		this.dataOfBirth = dataOfBirth;
	}

	public Boolean getMarriageStatus() {
		return this.marriageStatus;
	}

	public void setMarriageStatus(Boolean marriageStatus) {
		this.marriageStatus = marriageStatus;
	}

	public String getOccupation() {
		return this.occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getBirthplace() {
		return this.birthplace;
	}

	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}

	public String getIdcardCode() {
		return this.idcardCode;
	}

	public void setIdcardCode(String idcardCode) {
		this.idcardCode = idcardCode;
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

	public Set getRecords() {
		return this.records;
	}

	public void setRecords(Set records) {
		this.records = records;
	}

	public Set getOuRegistersForPatPid() {
		return this.ouRegistersForPatPid;
	}

	public void setOuRegistersForPatPid(Set ouRegistersForPatPid) {
		this.ouRegistersForPatPid = ouRegistersForPatPid;
	}

	public Set getOuRegistersForPid() {
		return this.ouRegistersForPid;
	}

	public void setOuRegistersForPid(Set ouRegistersForPid) {
		this.ouRegistersForPid = ouRegistersForPid;
	}

	public Set getRecords_1() {
		return this.records_1;
	}

	public void setRecords_1(Set records_1) {
		this.records_1 = records_1;
	}

}