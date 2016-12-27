package cn.edu.hbtcm.jwc.dao;

import java.util.List;

import cn.edu.hbtcm.jwc.common.dao.BaseDao;
import cn.edu.hbtcm.jwc.model.Record;

public interface RecordDao extends BaseDao<Record>{
	/**
	 * 根据医生id查询
	 * @param id 指定的病人id
	 * @return 病历对象列表 按照时间排序 递减
	 */
	List<Record> findByDocID(int id);
	/**
	 * 根据病人id查询
	 * @param id 指定的病人id
	 * @return 病历对象列表 按照时间排序 递减
	 */
	List<Record> findByPatID(int id);
	/**
	 * 根据病人name查询
	 * @param name 指定的病人name
	 * @return 病历对象列表
	 */
	List<Record> findByPatName(String name);
	/**
	 * 根据病人name模糊查询
	 * @param name 指定的病人name
	 * @return 病历对象列表
	 */
	List<Record> findByPatNameL(String name);
	/**
	 * 根据病人name和医生ID查询
	 * @param name 指定的病人name
	 * @return 病历对象
	 */
	List<Record> findByPatNameAndDocID(String name, int docid);
	/**
	 * 根据病人name和医生ID查询
	 * @param name 指定的病人name
	 * @return 病历对象
	 */
	List<Record> findByPatIDAndDocID(int patid, int docid);
	/**
	 * 增加病例对象
	 * @return int
	 *//*
	int addRecord(Record record);
	*//**
	 * 修改病例对象
	 * @return int
	 *//*
	int updateRecord(Record record);*/

}
