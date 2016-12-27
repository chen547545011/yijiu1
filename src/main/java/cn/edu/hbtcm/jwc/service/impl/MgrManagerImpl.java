package cn.edu.hbtcm.jwc.service.impl;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;

import cn.edu.hbtcm.jwc.dao.AcupointDao;
import cn.edu.hbtcm.jwc.dao.BodypartDao;
import cn.edu.hbtcm.jwc.dao.DoctorDao;
import cn.edu.hbtcm.jwc.dao.ManagerDao;
import cn.edu.hbtcm.jwc.dao.MeridianDao;
import cn.edu.hbtcm.jwc.dao.Ou_registerDao;
import cn.edu.hbtcm.jwc.dao.PatientDao;
import cn.edu.hbtcm.jwc.dao.RecordDao;
import cn.edu.hbtcm.jwc.dao.TcmdiseaseDao;
import cn.edu.hbtcm.jwc.dao.WmdiseaseDao;
import cn.edu.hbtcm.jwc.model.Doctor;
import cn.edu.hbtcm.jwc.model.Manager;
import cn.edu.hbtcm.jwc.service.MgrManager;
import cn.edu.hbtcm.jwc.util.PasswordHash;

public class MgrManagerImpl implements MgrManager{
	//创建dao对应工程包en.edu.hbtcm.jwc.dao中的对象
	private AcupointDao acupointDao;
	private BodypartDao bodypartDao;
	private DoctorDao doctorDao;
	private ManagerDao managerDao;
	private MeridianDao meridianDao;
	private Ou_registerDao ou_registerDao;
	private PatientDao patientDao;
	private RecordDao recordDao;
	private TcmdiseaseDao tcmdiseaseDao;
	private WmdiseaseDao wmdiseaseDao;
	public void setAcupointDao(AcupointDao acupointDao) {
		this.acupointDao = acupointDao;
	}
	public void setBodypartDao(BodypartDao bodypartDao) {
		this.bodypartDao = bodypartDao;
	}
	public void setDoctorDao(DoctorDao doctorDao) {
		this.doctorDao = doctorDao;
	}
	public void setManagerDao(ManagerDao managerDao) {
		this.managerDao = managerDao;
	}
	/*public void setMeridian_acupointDao(Meridian_acupointDao meridian_acupointDao) {
		this.meridian_acupointDao = meridian_acupointDao;
	}*/
	public void setMeridianDao(MeridianDao meridianDao) {
		this.meridianDao = meridianDao;
	}
	public void setOu_registerDao(Ou_registerDao ou_registerDao) {
		this.ou_registerDao = ou_registerDao;
	}
	public void setPatientDao(PatientDao patientDao) {
		this.patientDao = patientDao;
	}
	public void setRecordDao(RecordDao recordDao) {
		this.recordDao = recordDao;
	}
	public void setTcmdiseaseDao(TcmdiseaseDao tcmdiseaseDao) {
		this.tcmdiseaseDao = tcmdiseaseDao;
	}
	public void setWmdiseaseDao(WmdiseaseDao wmdiseaseDao) {
		this.wmdiseaseDao = wmdiseaseDao;
	}
	
	
	/**
	 * 登陆判断
	 * @param mgr 包含指定用户名、密码的管理员
	 * @return 是否存在
	 */
	public int login(Manager mgr){
		List<Manager> m=managerDao.findByIDAndPass(mgr);
		for(Manager m1:m)
		{
			try {
				if(PasswordHash.validatePassword(mgr.getPsaaword(), m1.getPsaaword()))
					return LOGIN_MGR;
			} catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		return LOGIN_FAIL;
	}
	/**
	 * 查看所有医生
	 * @return 返回所有医生列表
	 */
	public List<Doctor> lookDoc(){
		List<Doctor> d=doctorDao.find();
		return d;
	}
	/**
	 * 查看所有医生
	 * @param doc 要更新的医生数据
	 */
	public List<Doctor> update(Doctor doc){
		doctorDao.update(doc); 
		List<Doctor> d=doctorDao.find();
		return d;
	}
	/**
	 * 查看所有医生
	 * @param doc 要删除的医生数据
	 * @return 删除后的医生数据
	 */
	public List<Doctor> delete(Doctor doc){
		doctorDao.delete(doc);
		List<Doctor> d=doctorDao.find();
		return d;
	}
	/**
	 * 查看所有医生
	 * @param doc 要增加的医生数据
	 * @return 删除医生数据
	 */
	public List<Doctor> add(Doctor doc){
		doctorDao.save(doc);
		List<Doctor> d=doctorDao.find();
		return d;
	}
	
	/**
	 * 查看该管理员数据
	 * @param mgr 该管理员
	 * @return 该管理员
	 */
	public Manager lookMgr(Manager mgr){
		Manager m=managerDao.findByID(mgr.getUserId());
		return m;
	}

	/**
	 * 更新管理员密码
	 * @param mgr 该管理员
	 * @return 该管理员
	 */
	public Manager update(Manager mgr){
		managerDao.update(mgr);
		Manager m=managerDao.findByID(mgr.getUserId());
		return m;
		 
	}

}
