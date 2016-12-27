package cn.edu.hbtcm.jwc.dao.impl;

import java.util.List;

import cn.edu.hbtcm.jwc.common.dao.impl.BaseDaoHibernate4;
import cn.edu.hbtcm.jwc.dao.AcupointDao;
import cn.edu.hbtcm.jwc.dao.MeridianDao;
import cn.edu.hbtcm.jwc.model.Acupoint;
import cn.edu.hbtcm.jwc.model.Manager;
import cn.edu.hbtcm.jwc.model.Meridian;

public class MeridianDaoHibernate4 extends BaseDaoHibernate4<Meridian>
implements MeridianDao{
	/**
	 * 根据经络name查询
	 * @param name 指定的经络名称
	 * @return 该部位对应的经络 
	 */
	public List<Meridian> findByName (String name){
		return find("from Meridian as a where a.meridianName=?0",name);
	}
	/**
	 * 根据经络name查询
	 * @param name 指定的经络名称
	 * @return 该部位对应的经络detail
	 */
	public String DetailFindByName (String name){
		List<Meridian> mds = find("select a from Meridian a where a.meridianName = ?0"
				, name);
			if (mds!= null && mds.size() >= 1)
			{
				for (Meridian meridian : mds)
				{
					if (meridian.getMeridianName() == name )
					{
						return meridian.getMeridianDetail();
					}
				}
			}
			return null;
	}
	/**
	 * 根据经络name查询
	 * @param name 指定的经络名称
	 * @return 该部位对应的经络对象
	 */
	public Meridian meridianFindByName (String name){
		List<Meridian> mds = find("select a from Meridian a where a.meridianName= ?0"
				, name);
			if (mds!= null && mds.size() >= 1)
			{
				for (Meridian meridian : mds)
				{
					if (meridian.getMeridianName() == name )
					{
						return meridian;
					}
				}
			}
			return null;
	}
	/**
	 * 根据经络name模糊查询
	 * @param name 指定的经络名称
	 * @return 该部位对应的经络对象List 按照py顺序递增
	 */
	public List<Meridian> meridianFindByNameL (String name){
		String name1="%"+name+"%";
		return find("select a from Meridian a where a.meridianName like ?0 order by a.py"
				, name1);
	}
	/**
	 * 根据经络py查询
	 * @param py 指定的经络名称
	 * @return 该部位对应的经络对象按照py顺序递增
	 */
	public List<Meridian> meridianFindByPY (String py){
		return find("from Meridian as a where a.py=?0 order by a.py",py);
	}
	/**
	 * 根据经络py模糊查询
	 * @param py 指定的经络名称
	 * @return 该部位对应的经络对象按照py顺序递增
	 */
	public List<Meridian> meridianFindByPYL (String py){
		String py1="%"+py+"%";
		return find("from Meridian as a where a.py like ?0 order by a.py",py1);
	}
	/**
	 * 根据经络id查询
	 * @param id 指定的经络id
	 * @return 该部位对应的经络对象
	 */
	public Meridian meridianFindById (int id){
		List<Meridian> mds = find("select a from Meridian a where a.meridianId= ?0"
				, id);
			if (mds!= null && mds.size() >= 1)
			{
				for (Meridian meridian : mds)
				{
					if (meridian.getMeridianId() == id )
					{
						return meridian;
					}
				}
			}
			return null;
		
	}
	/**
	 * 根据经络id模糊查询
	 * @param id 指定的经络id
	 * @return 该部位对应的经络对象list
	 */
	public List<Meridian> meridianFindByIdL (int id){
		String id1="%"+id+"%";
		return find("select a from Meridian a where a.meridianId like ?0"
				, id1);
		
	}

}
