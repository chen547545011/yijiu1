package cn.edu.hbtcm.jwc.dao;

import java.util.List;

import cn.edu.hbtcm.jwc.common.dao.BaseDao;
import cn.edu.hbtcm.jwc.model.Patient;

public interface PatientDao extends BaseDao<Patient>{
	/**
	 * 根据id查询
	 * @param id 指定的病人id
	 * @return 病人对象
	 */
	Patient findByID(int id);
	/**
	 * 根据name查询
	 * @param name 指定的病人name
	 * @return 病人对象列表
	 */
	List<Patient> findByName(String name);
	
	/**
	 * 根据py查询
	 * @param py 指定的病人py
	 * @return 病人对象
	 */
	List<Patient> findByPy(String py);
	

}
