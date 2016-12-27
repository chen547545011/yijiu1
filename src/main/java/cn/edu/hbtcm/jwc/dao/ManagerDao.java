package cn.edu.hbtcm.jwc.dao;

import java.util.List;

import cn.edu.hbtcm.jwc.common.dao.BaseDao;
import cn.edu.hbtcm.jwc.model.Manager;

public interface ManagerDao extends BaseDao<Manager>{
	/**
	 * 根据用户名和密码查询管理员
	 * @param emp 包含指定用户名、密码的管理员
	 * @return 符合指定用户名和密码的管理员
	 */
	List<Manager> findByIDAndPass(Manager mgr);

	/**
	 * 根据用户id查找管理员
	 * @param id 管理员的名字
	 * @return 对应的管理员
	 */
	Manager findByID(int id);

}
