package cn.edu.hbtcm.jwc.dao.impl;

import java.util.Date;
import java.util.List;

import cn.edu.hbtcm.jwc.common.dao.impl.BaseDaoHibernate4;
import cn.edu.hbtcm.jwc.dao.AcupointDao;
import cn.edu.hbtcm.jwc.dao.Ou_registerDao;
import cn.edu.hbtcm.jwc.model.Acupoint;
import cn.edu.hbtcm.jwc.model.OuRegister;

public class Ou_registerDaoHibernate4 extends BaseDaoHibernate4<OuRegister>
implements Ou_registerDao{
	/**
	 * 根据医生ID查询
	 * @param DocID 指定的医生ID
	 * @return 该id对应的挂号信息
	 */
	public List<OuRegister> findByDocID(int DocID){
		return find("from OuRegister as a where a.registerDoctorId=?0",DocID);
	}
	/**
	 * 根据挂号流水ID查询
	 * @param registerSn 指定的挂号流水号
	 * @return 该id对应的挂号信息
	 */
	public List<OuRegister> findByRegisterID(int registerSn){
		return find("from OuRegister as a where a.registerSn=?0",registerSn);
	}
	/**
	 * 根据医生ID,就诊日期查询
	 * @param DocID，date 指定的医生ID，日期查询未检查的挂号信息
	 * @return 该id对应的挂号信息
	 */
	public List<OuRegister> findByDocIDD(int DocID,Date date){
		Date date1=new Date();
		return find("select a from OuRegister as a,Record as r "
				+ "where a.doctor.userId=?0 and a.treatDate=?1 "
				+ "and (a.registerSn<>r.registerSn or r.diagnoseTime<>?2) "
				+ "order by a.registerSn asc",DocID,date1,date1);
	}
}
