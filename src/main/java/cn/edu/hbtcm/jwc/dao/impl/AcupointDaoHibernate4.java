package cn.edu.hbtcm.jwc.dao.impl;

import java.util.List;

import cn.edu.hbtcm.jwc.common.dao.impl.BaseDaoHibernate4;
import cn.edu.hbtcm.jwc.dao.AcupointDao;
import cn.edu.hbtcm.jwc.model.Acupoint;

public class AcupointDaoHibernate4 extends BaseDaoHibernate4<Acupoint>
implements AcupointDao{
	/**
	 * 根据穴位名查询
	 * @param name 指定的穴位名
	 * @return Acupoint对象
	 */
	public Acupoint findByName(String name){
		List<Acupoint> apts = find("from Acupoint a where a.acupointName = ?0"
				, name);
			if (apts!= null && apts.size() >= 1)
			{
				for (Acupoint acupoint : apts)
				{
					if (acupoint.getAcupointName() == name )
					{
						return acupoint;
					}
				}
			}
			return null;
		}
	/**
	 * 根据穴位名模糊查询
	 * @param name 指定的穴位名
	 * @return List<Acupoint>对象按照py顺序递增
	 */
	public List<Acupoint> findByNameL(String name){
		String name1="%"+name+"%";
		return find("from Acupoint a where a.acupointName like ?0 order by a.py asc"
				, name1);
		
	}
		
	/**
	 * 根据py查询
	 * @param py 指定的穴位名拼音
	 * @return Acupoint对象
	 */
	public List<Acupoint> findByPy(String Py){
		List<Acupoint> apts = find("select a from Acupoint a where a.py = ?0"
				+ " order by a.py"
				, Py);
		return apts;
		}
	/**
	 * 根据py模糊查询
	 * @param py 指定的穴位名拼音
	 * @return LIST<Acupoint>对象按照py顺序递增
	 */
	public List<Acupoint> findByPyL(String Py){
		String Py1="%"+Py+"%";
		return find("select a from Acupoint a where a.py like ?0 order by a.py asc"
				, Py1);
		
	}
	/**
	 * 根据穴位id模糊查询
	 * @param id 指定的穴位ID
	 * @return List<Acupoint>对象按照id顺序递增
	 */
	public List<Acupoint> findByIDL(int id){
		String id1="%"+id+"%";
		return find("from Acupoint a where a.acupointId like ?0 order by a.acupointId asc"
				, id1);
		
	}
	/**
	 * 根据穴位名查询
	 * @param id 指定的穴位ID
	 * @return Acupoint对象
	 */
	public Acupoint findByID(int id){
		List<Acupoint> apts = find("from Acupoint a where a.acupointId = ?0"
				, id);
			if (apts!= null && apts.size() >= 1)
			{
				for (Acupoint acupoint : apts)
				{
					if (acupoint.getAcupointId() == id )
					{
						return acupoint;
					}
				}
			}
			return null;
		}
	/**
	 * 根据id查询
	 * @param id 指定的经络ID
	 * @return List<Acupoint>对象,并且按照pk顺序递增
	 */
	public List<Acupoint> findByMid(int id){
		return find("from Acupoint as a   inner join a.meridians m where m.meridianId=?0 order by a.py asc" , id);
	}
	/**
	 * 根据id模糊查询
	 * @param id 指定的经络ID
	 * @return List<Acupoint>对象,并且按照pk顺序递增
	 */
	public List<Acupoint> findByMidL(int id){
		String id1="%"+id+"%";
		return find("from Acupoint as a   inner join a.meridians m where m.meridianId like ?0 order by a.py asc" , id1);
		
	}
	
}
