package cn.edu.hbtcm.jwc.dao;

import java.util.List;

import cn.edu.hbtcm.jwc.common.dao.BaseDao;
import cn.edu.hbtcm.jwc.model.Meridian;

public interface MeridianDao extends BaseDao<Meridian> {
	/**
	 * 根据经络name查询
	 * @param name 指定的经络名称
	 * @return 该部位对应的经络
	 */
	List<Meridian> findByName (String name);
	/**
	 * 根据经络name查询
	 * @param name 指定的经络名称
	 * @return 该部位对应的经络detail
	 */
	String DetailFindByName (String name);
	/**
	 * 根据经络id查询
	 * @param id 指定的经络id
	 * @return 该部位对应的经络对象
	 */
	Meridian meridianFindById (int id);
	/**
	 * 根据经络id模糊查询
	 * @param id 指定的经络id
	 * @return 该部位对应的经络对象list
	 */
	List<Meridian> meridianFindByIdL (int id);
	/**
	 * 根据经络name查询
	 * @param name 指定的经络名称
	 * @return 该部位对应的经络对象
	 */
	Meridian meridianFindByName (String name);
	/**
	 * 根据经络name模糊查询
	 * @param name 指定的经络名称
	 * @return 该部位对应的经络对象List按照py顺序递增
	 */
	List<Meridian> meridianFindByNameL (String name);
	/**
	 * 根据经络py查询
	 * @param py 指定的经络名称
	 * @return 该部位对应的经络对象按照py顺序递增
	 */
	List<Meridian> meridianFindByPY (String py);
	/**
	 * 根据经络py模糊查询
	 * @param py 指定的经络名称
	 * @return 该部位对应的经络对象按照py顺序递增
	 */
	List<Meridian> meridianFindByPYL (String py);

}
