package cn.edu.hbtcm.jwc.dao.impl;

import java.util.List;

import cn.edu.hbtcm.jwc.common.dao.impl.BaseDaoHibernate4;
import cn.edu.hbtcm.jwc.dao.ManagerDao;
import cn.edu.hbtcm.jwc.model.Manager;

public class ManagerDaoHibernate4 extends BaseDaoHibernate4<Manager>
implements ManagerDao{
	/**
	 * 根据用户名和密码查询管理员
	 * @param emp 包含指定用户名、密码的管理员
	 * @return 符合指定用户名和密码的管理员
	 */
	public List<Manager> findByIDAndPass(Manager mgr){
		return find("from Manager as a where a.userId=?0 " ,mgr.getUserId());
	}

	/**
	 * 根据用户id查找管理员
	 * @param id 管理员的名字
	 * @return 对应的管理员
	 */
	public Manager findByID(int id){
		List<Manager> mgrs = find("select a from Manager a where a.userId = ?0"
				, id);
			if (mgrs!= null && mgrs.size() >= 1)
			{
				for (Manager manager : mgrs)
				{
					if (manager.getUserId()== id )
					{
						return manager;
					}
				}
			}
			return null;
	}

}
