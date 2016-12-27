package cn.edu.hbtcm.jwc.dao;

import java.util.List;

import cn.edu.hbtcm.jwc.common.dao.BaseDao;
import cn.edu.hbtcm.jwc.model.Acupoint;

public interface AcupointDao extends BaseDao<Acupoint>{
	/**
	 * 根据穴位名查询
	 * @param name 指定的穴位名
	 * @return Acupoint对象
	 */
	Acupoint findByName(String name);
	/**
	 * 根据穴位名模糊查询
	 * @param name 指定的穴位名
	 * @return List<Acupoint>对象
	 */
	List<Acupoint> findByNameL(String name);
	/**
	 * 根据穴位id查询
	 * @param id 指定的穴位ID
	 * @return Acupoint对象
	 */
	Acupoint findByID(int id);
	/**
	 * 根据穴位id模糊查询
	 * @param id 指定的穴位ID
	 * @return List<Acupoint>对象
	 */
	List<Acupoint> findByIDL(int id);
	/**
	 * 根据id查询
	 * @param id 指定的经络ID
	 * @return List<Acupoint>对象,并且按照pk顺序递增
	 */
	List<Acupoint> findByMid(int id);
	/**
	 * 根据id模糊查询
	 * @param id 指定的经络ID
	 * @return List<Acupoint>对象,并且按照pk顺序递增
	 */
	List<Acupoint> findByMidL(int id);
	/**
	 * 根据py查询
	 * @param py 指定的穴位名拼音
	 * @return List<Acupoint>对象
	 */
	List<Acupoint> findByPy(String Py);
	/**
	 * 根据py模糊查询
	 * @param py 指定的穴位名拼音
	 * @return LIST<Acupoint>对象
	 */
	List<Acupoint> findByPyL(String Py);
	

}
