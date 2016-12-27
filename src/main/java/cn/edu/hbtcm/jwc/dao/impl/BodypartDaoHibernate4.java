package cn.edu.hbtcm.jwc.dao.impl;

import java.util.List;

import cn.edu.hbtcm.jwc.common.dao.impl.BaseDaoHibernate4;
import cn.edu.hbtcm.jwc.dao.BodypartDao;
import cn.edu.hbtcm.jwc.model.Acupoint;
import cn.edu.hbtcm.jwc.model.Bodypart;

public class BodypartDaoHibernate4 extends BaseDaoHibernate4<Bodypart>
implements BodypartDao{
	/**
	 * 根据部门查询管理员
	 * @param part 指定的部门的名称
	 * @return 符合指定的部门的编号和部门名称
	 */
	public Bodypart findByPart(String part){
		List<Bodypart> bpt = find("select a from Bodypart a where a.part = ?0"
				, part);
			if (bpt!= null && bpt.size() >= 1)
			{
				for (Bodypart bodypart : bpt)
				{
					if (bodypart.getPart() == part )
					{
						return bodypart;
					}
				}
			}
			return null;
	}

}
