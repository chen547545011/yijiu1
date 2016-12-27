package cn.edu.hbtcm.jwc.dao.impl;

import java.util.List;

import cn.edu.hbtcm.jwc.common.dao.impl.BaseDaoHibernate4;
import cn.edu.hbtcm.jwc.dao.AcupointDao;
import cn.edu.hbtcm.jwc.dao.TcmdiseaseDao;
import cn.edu.hbtcm.jwc.model.Acupoint;
import cn.edu.hbtcm.jwc.model.Meridian;
import cn.edu.hbtcm.jwc.model.Tcmdisease;

public class TcmdiseaseDaoHibernate4 extends BaseDaoHibernate4<Tcmdisease>
implements TcmdiseaseDao{
	/**
	 * 根据bid查询
	 * @param bid 指定的部位ID
	 * @return 该部位对应的疾病列表
	 */
	public List<Tcmdisease> findByBid (int bid){
		return find("from Tcmdisease as a where a.bodypart.bid=?0 "
				+ "order by a.tcmdiseaseId asc",bid);
	}
	/**
	 * 根据bid模糊查询
	 * @param bid 指定的部位ID
	 * @return 该部位对应的疾病列表
	 */
	public List<Tcmdisease> findByBidL (int bid){
		String bid1="%"+bid+"%";
		return find("from Tcmdisease as a where a.bodypart.bid like ?0  "
				+ "order by a.tcmdiseaseId asc",bid1);
	}
	/**
	 * 根据bid查询
	 * @param bid 指定的部位名
	 * @return 该部位对应的疾病对象
	 */
	public Tcmdisease tcmdiseaseFindByBid (String bid){
		List<Tcmdisease> tcm = find("select a from Tcmdisease a where a.bodypart.bid = ?0"
				, bid);
			if (tcm!= null && tcm.size() >= 1)
			{
				for (Tcmdisease tcmdisease : tcm)
				{
					if (tcmdisease.getBodypart().equals(bid))
					{
						return tcmdisease;
					}
				}
			}
			return null;
	}
	/**
	 * 根据name查询
	 * @param name 指定的疾病名
	 * @return 该部位对应的疾病列表 按照疾病名进行排序
	 */
	public List<Tcmdisease> findByName (String name){
		return find("from Tcmdisease as a where a.tcmdiseaseName=?0 "
				+ "order by a.tcmdiseaseName asc",name);
	}
	/**
	 * 根据name模糊查询
	 * @param name 指定的疾病名
	 * @return 该部位对应的疾病列表 按照疾病id进行排序
	 */
	public List<Tcmdisease> findByNameL (String name){
		String name1="%"+name+"%";
		return find("from Tcmdisease as a where a.tcmdiseaseName like ?0 "
				+ "order by a.tcmdiseaseId asc",name1);
	}
	/**
	 * 根据name查询
	 * @param name 指定的部位名
	 * @return 该部位对应的疾病列表 按照疾病id进行排序
	 */
	public List<Tcmdisease> findByBody (String name){
		return find("from Tcmdisease as a where a.bodypart.part=?0  "
				+ "order by a.tcmdiseaseId asc",name);
	}
	/**
	 * 根据name模糊查询
	 * @param name 指定的部位名
	 * @return 该部位对应的疾病列表 按照疾病id进行排序
	 */
	public List<Tcmdisease> findByBodyL (String name){
		String name1="%"+name+"%";
		return find("from Tcmdisease as a where a.bodypart.part like ?0 "
				+ "order by a.tcmdiseaseId asc",name1);
		
	}

}
