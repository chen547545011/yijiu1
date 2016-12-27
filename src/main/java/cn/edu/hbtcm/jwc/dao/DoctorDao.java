package cn.edu.hbtcm.jwc.dao;

import java.util.List;

import cn.edu.hbtcm.jwc.common.dao.BaseDao;
import cn.edu.hbtcm.jwc.model.Doctor;

public interface DoctorDao extends BaseDao<Doctor>{
	/**
	 * 根据用户名和密码查询医生
	 * @param doc 包含指定用户名、密码的医生
	 * @return 符合指定用户名和密码的医生
	 */
	List<Doctor> findByIDAndPass(Doctor doc);
	/**
	 * 根据id
	 * @param id 医生id
	 * @return 医生
	 */
	Doctor findByID(int id);

	/**
	 * 根据用户名查找医生
	 * @param name 医生的名字
	 * @return 对应的医生
	 */
	List<Doctor> findByName(String name);
	/**
	 * 根据用户名查找医生
	 * @return 所有的医生
	 */
	List<Doctor> find();

}
