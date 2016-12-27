package cn.edu.hbtcm.jwc.model;

import java.sql.Time;
import java.util.Date;

/**
 * OuRegister entity. @author MyEclipse Persistence Tools
 */

public class OuRegister implements java.io.Serializable {

	// Fields

	private Integer registerSn;
	private Patient patientByPid;
	private Doctor doctor;
	private Patient patientByPatPid;
	private Date treatDate;
	private String registerDeptCode;
	private String registerDeptName;
	private Integer registerDoctorId;
	private String registerDoctorName;
	private String feeTypeName;
	private Time registerDateTime;
	private Integer registerUserId;
	private String registerUserName;

	// Constructors

	/** default constructor */
	public OuRegister() {
	}

	/** minimal constructor */
	public OuRegister(Patient patientByPid, Date treatDate,
			String registerDeptCode, String registerDeptName,
			Integer registerDoctorId, String registerDoctorName,
			String feeTypeName, Time registerDateTime, Integer registerUserId,
			String registerUserName) {
		this.patientByPid = patientByPid;
		this.treatDate = treatDate;
		this.registerDeptCode = registerDeptCode;
		this.registerDeptName = registerDeptName;
		this.registerDoctorId = registerDoctorId;
		this.registerDoctorName = registerDoctorName;
		this.feeTypeName = feeTypeName;
		this.registerDateTime = registerDateTime;
		this.registerUserId = registerUserId;
		this.registerUserName = registerUserName;
	}

	/** full constructor */
	public OuRegister(Patient patientByPid, Doctor doctor,
			Patient patientByPatPid, Date treatDate, String registerDeptCode,
			String registerDeptName, Integer registerDoctorId,
			String registerDoctorName, String feeTypeName,
			Time registerDateTime, Integer registerUserId,
			String registerUserName) {
		this.patientByPid = patientByPid;
		this.doctor = doctor;
		this.patientByPatPid = patientByPatPid;
		this.treatDate = treatDate;
		this.registerDeptCode = registerDeptCode;
		this.registerDeptName = registerDeptName;
		this.registerDoctorId = registerDoctorId;
		this.registerDoctorName = registerDoctorName;
		this.feeTypeName = feeTypeName;
		this.registerDateTime = registerDateTime;
		this.registerUserId = registerUserId;
		this.registerUserName = registerUserName;
	}

	// Property accessors

	public Integer getRegisterSn() {
		return this.registerSn;
	}

	public void setRegisterSn(Integer registerSn) {
		this.registerSn = registerSn;
	}

	public Patient getPatientByPid() {
		return this.patientByPid;
	}

	public void setPatientByPid(Patient patientByPid) {
		this.patientByPid = patientByPid;
	}

	public Doctor getDoctor() {
		return this.doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Patient getPatientByPatPid() {
		return this.patientByPatPid;
	}

	public void setPatientByPatPid(Patient patientByPatPid) {
		this.patientByPatPid = patientByPatPid;
	}

	public Date getTreatDate() {
		return this.treatDate;
	}

	public void setTreatDate(Date treatDate) {
		this.treatDate = treatDate;
	}

	public String getRegisterDeptCode() {
		return this.registerDeptCode;
	}

	public void setRegisterDeptCode(String registerDeptCode) {
		this.registerDeptCode = registerDeptCode;
	}

	public String getRegisterDeptName() {
		return this.registerDeptName;
	}

	public void setRegisterDeptName(String registerDeptName) {
		this.registerDeptName = registerDeptName;
	}

	public Integer getRegisterDoctorId() {
		return this.registerDoctorId;
	}

	public void setRegisterDoctorId(Integer registerDoctorId) {
		this.registerDoctorId = registerDoctorId;
	}

	public String getRegisterDoctorName() {
		return this.registerDoctorName;
	}

	public void setRegisterDoctorName(String registerDoctorName) {
		this.registerDoctorName = registerDoctorName;
	}

	public String getFeeTypeName() {
		return this.feeTypeName;
	}

	public void setFeeTypeName(String feeTypeName) {
		this.feeTypeName = feeTypeName;
	}

	public Time getRegisterDateTime() {
		return this.registerDateTime;
	}

	public void setRegisterDateTime(Time registerDateTime) {
		this.registerDateTime = registerDateTime;
	}

	public Integer getRegisterUserId() {
		return this.registerUserId;
	}

	public void setRegisterUserId(Integer registerUserId) {
		this.registerUserId = registerUserId;
	}

	public String getRegisterUserName() {
		return this.registerUserName;
	}

	public void setRegisterUserName(String registerUserName) {
		this.registerUserName = registerUserName;
	}

}