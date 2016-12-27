package cn.edu.hbtcm.jwc.dao;

import java.util.List;

import cn.edu.hbtcm.jwc.common.dao.BaseDao;
import cn.edu.hbtcm.jwc.model.Bodypart;

public interface BodypartDao extends BaseDao<Bodypart>{
	/**
	 * 根据部门查询管理员
	 * @param part 指定的部门的名称
	 * @return 符合指定的部门的编号和部门名称
	 */
	Bodypart findByPart(String part);
	

}
