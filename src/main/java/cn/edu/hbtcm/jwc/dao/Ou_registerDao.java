package cn.edu.hbtcm.jwc.dao;

import java.util.Date;
import java.util.List;

import cn.edu.hbtcm.jwc.common.dao.BaseDao;
import cn.edu.hbtcm.jwc.model.OuRegister;

public interface Ou_registerDao extends BaseDao<OuRegister>{
	/**
	 * 根据医生ID查询
	 * @param DocID 指定的医生ID
	 * @return 该id对应的挂号信息
	 */
	List<OuRegister> findByDocID(int DocID);
	/**
	 * 根据挂号流水ID查询
	 * @param registerSn 指定的挂号流水号
	 * @return 该id对应的挂号信息
	 */
    List<OuRegister> findByRegisterID(int registerSn);
	/**
	 * 根据医生ID,就诊日期查询
	 * @param DocID，date 指定的医生ID，日期查询未检查的挂号信息
	 * @return 该id对应的挂号信息
	 */
	List<OuRegister> findByDocIDD(int DocID,Date date);

}
