package cn.edu.hbtcm.jwc.service.impl;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cn.edu.hbtcm.jwc.dao.*;
import cn.edu.hbtcm.jwc.model.*;
import cn.edu.hbtcm.jwc.service.DocManager;
import cn.edu.hbtcm.jwc.util.PasswordHash;

public class DocManagerImpl implements DocManager{
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
		//登陆验证
		public int login(Doctor doc){
			List<Doctor> d=doctorDao.findByIDAndPass(doc);
			for(Doctor d1:d){
				try {
					if(PasswordHash.validatePassword(doc.getPassword(), d1.getPassword())){
						return LOGIN_DOC;
					}
				} catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return LOGIN_FAIL;
		}
			/**
			 * 根据疾病查询
			 * @param TCMDISEASE_NAME 指定的疾病名
			 * @return Tcmdisease对象
			 */
			public Tcmdisease querybyName(String TCMDISEASE_NAME){
				Tcmdisease tcm=tcmdiseaseDao.findByName(TCMDISEASE_NAME).get(0);
				if(tcm.equals(null))
				{
					return null;
				}
				else{
					return tcm;
				}		
			}
			/**
			 * 根据部门名查询
			 * @param part 指定的部门名
			 * @return List<Tcmdisease>对象
			 */
			public List<Tcmdisease> querybyPart(String BODYPART_NAME){
				List<Tcmdisease> tcm=tcmdiseaseDao.findByBody(BODYPART_NAME);
				return tcm;		
			}
			
			/**
			 * 根据部门号查询
			 * @param bid 指定的部门号
			 * @return List<Tcmdisease>对象
			 */
			public List<Tcmdisease> querybyBid(int bid){
				List<Tcmdisease> tcm=tcmdiseaseDao.findByBid(bid);
				if(tcm.isEmpty())
				{
					return null;
				}
				else{
					return tcm;
				}		
				
			}
			/**
			 * 根据经络Id查询
			 * @param MERIDIAN_Id 指定的经络ID
			 * @return List<Acupoint>对象并且按照py的递增排序
			 */
			public List<Acupoint> querybyM_Id(int MERIDIAN_ID){
				List<Acupoint> acu=acupointDao.findByMid(MERIDIAN_ID);
				if(acu.isEmpty())
				{
					return null;
				}
				else{
					return acu;
				}	
				
			}
			/**
			 * 根据经络名字查询
			 * @param MERIDIAN_NAME 指定的经络名字
			 * @return List<Acupoint>对象并且按照py的递增排序
			 */
			public List<Acupoint> querybyMname(String MERIDIAN_NAME){
				Meridian mer=meridianDao.findByName(MERIDIAN_NAME).get(0);
				return querybyM_Id(mer.getMeridianId());		
			}
			/**
			 * 根据穴位ID查询
			 * @param Acupoint_ID 指定的穴位ID
			 * @return Acupoint对象
			 */
			public Acupoint querybyA_Id(int Acupoint_ID){
				Acupoint acu=acupointDao.findByID(Acupoint_ID);
				if(acu.equals(null))
				{
					return null;
				}
				else{
					return acu;
				}	
				
			}
			/**
			 * 根据穴位名字查询
			 * @param Acupoint_NAME 指定的穴位名字
			 * @return 
			 * @return Acupoint对象
			 */
			public  Acupoint querybyAname(String Acupoint_NAME){
				Acupoint acu=acupointDao.findByName(Acupoint_NAME);
				if(acu.equals(null))
				{
					return null;
				}
				else{
					return acu;
				}
				
			}
			/**
			 * 根据py查询
			 * @param py 指定的穴位名拼音
			 * @return Acupoint对象并且按照py的递增排序
			 */
			public List<Acupoint> findByPy(String Py){				
				return acupointDao.findByPy(Py);
//				order by 递增;
			}
			/**
			 * 根据经络py查询
			 * @param py 指定的经络名拼音
			 * @return 该部位对应的经络对象并且按照py的递增排序
			 */
			public List<Meridian> meridianFindByPY (String py){
				return meridianDao.meridianFindByPY(py);
//				order by 递增;

			}
			/**
			 * 根据医生id,日期查询
			 * @param doc_id,date 指定的医生id，日期
			 * @return List<Ou_register>对象
			 */
			public List<OuRegister> Ou_registerFind (int doc_id,Date date){				
				return  ou_registerDao.findByDocIDD(doc_id, date);
				
		}
			/**
			 * 根据医生id
			 * @param doc_id指定的医生id
			 * @return List<Record>对象并且按照时间的递减排序
			 */
			public List<Record> RecordFindBydoc_id1 (int doc_id){
				return recordDao.findByDocID(doc_id);
				
			}
			/**
			 * 根据医生id
			 * @param doc_id指定的医生id
			 * @return List<Record>对象并且按照病人Id的递增排序
			 */
			public List<Record> RecordFindBydoc_id2 (int doc_id){
				return null;
				
			}
			/**
			 * 根据医生id
			 * @param doc_id指定的医生id
			 * @return List<Record>对象并且按照病人姓名的递增排序
			 */
			public List<Record> RecordFindBydoc_id3 (int doc_id){
				return null;
				
			}
			/**
			 * 根据病人id，病人id
			 * @param Pid，doc_id指定的病人id，医生id
			 * 给Record添加数据，并且封装
			 * @return Record
			 */
			public Record Recordadd(int Pid,int doc_id){
				Record record=new Record();
				Patient patient=patientDao.findByID(Pid);
				Doctor doc=doctorDao.findByID(doc_id);
				record.setPatient(patient);
				record.setDoctor(doc);
				record.setDiagnoseTime(new Date());
				return record;
			
			}
			/**
			 * add增加一条记录
			 * @param record指定的病例记录
			 * @return boolean
			 */
			public boolean AddRecord (Record record){
				recordDao.save(record);
				List<Record> d=recordDao.findAll(Record.class);
				return true;
			}
			/**
			 * update修改一条记录
			 * @param record指定的病例记录
			 * @return boolean
			 */
			public boolean UpdateRecord (Record record){
				recordDao.update(record);
				List<Record> d=recordDao.findAll(Record.class);
				return true;
			}
			
			
}
