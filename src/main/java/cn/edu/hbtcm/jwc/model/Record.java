package cn.edu.hbtcm.jwc.model;

import java.util.Date;

/**
 * Record entity. @author MyEclipse Persistence Tools
 */

public class Record implements java.io.Serializable {

	// Fields

	private Integer recordId;
	private Doctor doctor;
	private Patient patient;
	private Date diagnoseTime;
	private String complain;
	private String currentIllness;
	private String historyIllness;
	private String threeDiagnose;
	private String tongue;
	private String dialectial;
	private String diagnose;
	private String therapy;
	private String acupoints;
	private String prescription;
	private String advice;
	private Integer registerSn;
	private String other;

	// Constructors

	/** default constructor */
	public Record() {
	}

	/** minimal constructor */
	public Record(Date diagnoseTime, String complain, String currentIllness,
			String historyIllness, String threeDiagnose, String tongue,
			String dialectial, String diagnose, String therapy,
			String acupoints, String prescription, String advice,
			Integer registerSn, String other) {
		this.diagnoseTime = diagnoseTime;
		this.complain = complain;
		this.currentIllness = currentIllness;
		this.historyIllness = historyIllness;
		this.threeDiagnose = threeDiagnose;
		this.tongue = tongue;
		this.dialectial = dialectial;
		this.diagnose = diagnose;
		this.therapy = therapy;
		this.acupoints = acupoints;
		this.prescription = prescription;
		this.advice = advice;
		this.registerSn = registerSn;
		this.other = other;
	}

	/** full constructor */
	public Record(Doctor doctor, Patient patient, Date diagnoseTime,
			String complain, String currentIllness, String historyIllness,
			String threeDiagnose, String tongue, String dialectial,
			String diagnose, String therapy, String acupoints,
			String prescription, String advice, Integer registerSn, String other) {
		this.doctor = doctor;
		this.patient = patient;
		this.diagnoseTime = diagnoseTime;
		this.complain = complain;
		this.currentIllness = currentIllness;
		this.historyIllness = historyIllness;
		this.threeDiagnose = threeDiagnose;
		this.tongue = tongue;
		this.dialectial = dialectial;
		this.diagnose = diagnose;
		this.therapy = therapy;
		this.acupoints = acupoints;
		this.prescription = prescription;
		this.advice = advice;
		this.registerSn = registerSn;
		this.other = other;
	}

	// Property accessors

	public Integer getRecordId() {
		return this.recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}

	public Doctor getDoctor() {
		return this.doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Patient getPatient() {
		return this.patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Date getDiagnoseTime() {
		return this.diagnoseTime;
	}

	public void setDiagnoseTime(Date diagnoseTime) {
		this.diagnoseTime = diagnoseTime;
	}

	public String getComplain() {
		return this.complain;
	}

	public void setComplain(String complain) {
		this.complain = complain;
	}

	public String getCurrentIllness() {
		return this.currentIllness;
	}

	public void setCurrentIllness(String currentIllness) {
		this.currentIllness = currentIllness;
	}

	public String getHistoryIllness() {
		return this.historyIllness;
	}

	public void setHistoryIllness(String historyIllness) {
		this.historyIllness = historyIllness;
	}

	public String getThreeDiagnose() {
		return this.threeDiagnose;
	}

	public void setThreeDiagnose(String threeDiagnose) {
		this.threeDiagnose = threeDiagnose;
	}

	public String getTongue() {
		return this.tongue;
	}

	public void setTongue(String tongue) {
		this.tongue = tongue;
	}

	public String getDialectial() {
		return this.dialectial;
	}

	public void setDialectial(String dialectial) {
		this.dialectial = dialectial;
	}

	public String getDiagnose() {
		return this.diagnose;
	}

	public void setDiagnose(String diagnose) {
		this.diagnose = diagnose;
	}

	public String getTherapy() {
		return this.therapy;
	}

	public void setTherapy(String therapy) {
		this.therapy = therapy;
	}

	public String getAcupoints() {
		return this.acupoints;
	}

	public void setAcupoints(String acupoints) {
		this.acupoints = acupoints;
	}

	public String getPrescription() {
		return this.prescription;
	}

	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}

	public String getAdvice() {
		return this.advice;
	}

	public void setAdvice(String advice) {
		this.advice = advice;
	}

	public Integer getRegisterSn() {
		return this.registerSn;
	}

	public void setRegisterSn(Integer registerSn) {
		this.registerSn = registerSn;
	}

	public String getOther() {
		return this.other;
	}

	public void setOther(String other) {
		this.other = other;
	}

}