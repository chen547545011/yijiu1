package cn.edu.hbtcm.jwc.dao;

import java.util.List;

import cn.edu.hbtcm.jwc.common.dao.BaseDao;
import cn.edu.hbtcm.jwc.model.Tcmdisease;

public interface TcmdiseaseDao extends BaseDao<Tcmdisease>{
	/**
	 * 根据bid查询
	 * @param bid 指定的部位ID
	 * @return 该部位对应的疾病列表
	 */
	List<Tcmdisease> findByBid (int bid);
	/**
	 * 根据bid模糊查询
	 * @param bid 指定的部位ID
	 * @return 该部位对应的疾病列表
	 */
	List<Tcmdisease> findByBidL (int bid);
	/**
	 * 根据bid查询
	 * @param bid 指定的部位名
	 * @return 该部位对应的疾病对象
	 */
	Tcmdisease tcmdiseaseFindByBid (String bid);
	/**
	 * 根据name查询
	 * @param name 指定的疾病名
	 * @return 该部位对应的疾病列表 按照疾病名进行排序
	 */
	List<Tcmdisease> findByName (String name);
	/**
	 * 根据name模糊查询
	 * @param name 指定的疾病名
	 * @return 该部位对应的疾病列表 按照疾病名进行排序
	 */
	List<Tcmdisease> findByNameL (String name);
	/**
	 * 根据name查询
	 * @param name 指定的部位名
	 * @return 该部位对应的疾病列表 按照疾病名进行排序
	 */
	List<Tcmdisease> findByBody (String name);
	/**
	 * 根据name模糊查询
	 * @param name 指定的部位名
	 * @return 该部位对应的疾病列表 按照疾病名进行排序
	 */
	List<Tcmdisease> findByBodyL (String name);
}
